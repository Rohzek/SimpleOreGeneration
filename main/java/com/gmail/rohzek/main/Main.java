package com.gmail.rohzek.main;

import java.io.File;

import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.events.OreSpawnBlockEvent;
import com.gmail.rohzek.lib.Reference;
import com.gmail.rohzek.proxys.CommonProxy;
import com.gmail.rohzek.smelting.SmeltingRecipes;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.JsonLoader;
import com.gmail.rohzek.util.JsonParser;
import com.gmail.rohzek.util.LoadModData;
import com.gmail.rohzek.util.LogHelper;
import com.gmail.rohzek.world.SGWorldGen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
/**
 * Main mod file, we register things that it doesn't matter if it's on both sides or not here,
 * as well as tie all the files together.
 * @author Rohzek
 *
 */
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance(Reference.MODID)
	public static Main simpleoregen;
	
	@SidedProxy(clientSide = Reference.CLIENTSIDEPROXY, serverSide = Reference.SERVERSIDEPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent preEvent)
	{
		LogHelper.log("Beginning Pre-Initialization");
		
		Reference.LOCATION = new File(preEvent.getModConfigurationDirectory().getAbsolutePath() + "/" + Reference.MODID);
		JsonLoader.loadData();
		
		LogHelper.log("Loading MCMOD replacement info");
		// This has to load first! This is a replacement for our MCMOD.Info
		LoadModData.load(preEvent);
		
		// Configuration file loader
		ConfigurationManager manager = new ConfigurationManager(preEvent);
		
		// Ore Generation
		LogHelper.log("Registering ore generation information");
		SGOres.mainRegistry();
		
		LogHelper.log("Blocking vanilla ore spawns");
		MinecraftForge.ORE_GEN_BUS.register(new OreSpawnBlockEvent());
		
		LogHelper.log("Replacing vanilla ore spawns");
		GameRegistry.registerWorldGenerator(new SGWorldGen(), 0);
		
		LogHelper.log("Finished ore generation information");
		
		LogHelper.log("Adding smelting recipes");
		SmeltingRecipes.mainRegistry();
		
		LogHelper.log("Pre-Initialization Complete");
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event)
	{
		LogHelper.log("Beginning Initialization");
		
		LogHelper.log("Registering Proxy Renders");
		proxy.registerRenders();
		
		LogHelper.log("Initialization Complete");
	}
	
	// What is this even used for?
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent postEvent){}
}
