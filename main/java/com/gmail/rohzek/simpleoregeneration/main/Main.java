package com.gmail.rohzek.simpleoregeneration.main;

import com.gmail.rohzek.simpleoregeneration.events.OreSpawnBlockEvent;
import com.gmail.rohzek.simpleoregeneration.json.Ores;
import com.gmail.rohzek.simpleoregeneration.lib.Reference;
import com.gmail.rohzek.simpleoregeneration.util.LogHelper;
import com.gmail.rohzek.simpleoregeneration.util.TimeOutput;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

//@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES)
@Mod(Reference.MODID)
public class Main 
{
	public Main() 
	{
		// Register the setup method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::preLoad);
        // Register the enqueueIMC method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
	}
	
	private void preLoad(final FMLCommonSetupEvent event) 
	{
LogHelper.log("Hello Minecraft, how are you? Did you know that Tony loves Amy? " + TimeOutput.getTimeTogether());
		
		LogHelper.debug("Beginning Pre-Initialization");
		//Reference.LOCATION = new File(preEvent.getModConfigurationDirectory().getAbsolutePath() + "/" + Reference.MODID);
		
		LogHelper.debug("Loading MCMOD replacement info");
		//LoadModData.load(preEvent);
		
		// Configuration file loader
		//ConfigurationManager manager = new ConfigurationManager(preEvent);
		
		LogHelper.debug("Registering ore generation information");
		Ores.init();
		
		LogHelper.debug("Blocking vanilla ore spawns");
		//MinecraftForge.ORE_GEN_BUS.register(new OreSpawnBlockEvent());
		OreSpawnBlockEvent.populateOreType();
		
		LogHelper.debug("Replacing vanilla ore spawns");
		//GameRegistry.registerWorldGenerator(new SGWorldGen(), 0);
		//GameRegistry.registerWorldGenerator(new SGWorldGenSurface(), 0);
		
		LogHelper.debug("Finished ore generation information");
		
		LogHelper.debug("Pre-Initialization Complete");
	}
	
	// A place to do client-side only stuff
	private void doClientStuff(final FMLClientSetupEvent event) 
	{
        
        LogHelper.log("Loading client side only information");
    }
	
	// A place to load stuff only on the dedicated server
	@SuppressWarnings("unused")
	private void doDedicatedServerStuff(final FMLDedicatedServerSetupEvent event) {}
	
	// A place to dispatch information to other mods
	private void enqueueIMC(final InterModEnqueueEvent event)
    {
        //InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
		//LogHelper.debug("Registering Waila module");
		//InterModComms.sendMessage("waila", "register", "com.gmail.rohzek.compatibility.waila.WailaNether.callbackRegister");
		//InterModComms.sendMessage("waila", "register", "com.gmail.rohzek.compatibility.waila.WailaEnd.callbackRegister");
    }
	
	// A place to receive information from other mods
	private void processIMC(final InterModProcessEvent event)
    {
        //LOGGER.info("Got IMC {}", event.getIMCStream().map(m->m.getMessageSupplier().get()).collect(Collectors.toList()));
    }
	
	// A place to do stuff when the server gets loaded?
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LogHelper.debug("The server is starting, if we need to do anything here");
    }
}
