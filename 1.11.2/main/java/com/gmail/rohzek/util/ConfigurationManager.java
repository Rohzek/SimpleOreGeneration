package com.gmail.rohzek.util;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import com.gmail.rohzek.compatibility.CheckForMods;
import com.gmail.rohzek.lib.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigurationManager
{
	public static File optionsLoc;
	public static File allowedModsLoc;
	
	public static boolean isDebug;
	public static boolean straight2Ingots;
	public static boolean zombiePigsAttack;
	public static int aggroRange = 16;
	public static boolean gfFlowerDisable;
	
	public static boolean supportNewDims;
	//private HashSet<String> testingArrayIn;
	
	public static boolean changeVanilla;
	public static boolean supportForestry;
	public static boolean supportIC;
	public static boolean supportIE;
	public static boolean supportWaila;
	
	public static String genCategory = "general";
	public static String debugCategory = "debug";
	public static String modCategory = "compatibility";
	
	public ConfigurationManager(FMLPreInitializationEvent event)
	{
		optionsLoc = new File(Reference.LOCATION + "/options.cfg");
		
		Configuration optionsConfig = new Configuration(optionsLoc);
		options(optionsConfig);
	}
	
	private void options(Configuration config)
	{
		config.load();
		
		this.isDebug = config.get(debugCategory, "debugMode", false, "Enables more printouts to the chat. WARNING: Will spam the log file. Good for bug reports. Not recommended for regular play.").getBoolean(false);
		this.straight2Ingots = config.get(genCategory, "smeltToIngots", true, "Makes new ores be smelted straight to their ingot form, instead of turning into vanilla ores first.").getBoolean(true);
		this.zombiePigsAttack = config.get(genCategory, "zombiePigmenAggro", true, "Zombie Pigmen will attack players who mine nether ores. Set to false to disable").getBoolean(true);
		this.aggroRange = config.get(genCategory, "aggroRange", 16, "Range at which Zombie Pigmen will aggro, in blocks.", 8, Integer.MAX_VALUE).getInt();
		this.gfFlowerDisable = config.get(genCategory, "gfFlowerDisable", false, "True will disable spawn of the CheshireRose flower.").getBoolean(false);
		
		this.supportNewDims = config.get(modCategory, "customDimensions", true, "Allows custom generation in modded dimensions. Only supports dimensions with Stone as the main block (like the overworld)").getBoolean(true);
		this.changeVanilla = config.get(modCategory, "changeVanillaOreSpawn", true, "Should this mod change the vanilla ore gen?").getBoolean(true);
		this.supportForestry = config.get(modCategory, "supportForestry", true, "Support for Forestry ores").getBoolean(true);
		this.supportIC = config.get(modCategory, "supportIndustrialCraft", true, "Support for IC2 ores").getBoolean(true);
		this.supportIE = config.get(modCategory, "supportImmersiveEngineering", true, "Support for Immersive Engineering").getBoolean(true);
		this.supportWaila = config.get(modCategory, "supportWaila", true, "Support for Waila").getBoolean(true);
		
		//testingArrayIn = new HashSet<>(Arrays.asList(config.get(Configuration.CATEGORY_GENERAL, "customOreList", new String[]{"forestry:copper", "forestry:tin", "forestry:apatite"}, "Testing...").getStringList()));
		
		config.save();
	}
}
