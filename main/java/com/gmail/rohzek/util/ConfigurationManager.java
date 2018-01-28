package com.gmail.rohzek.util;

import java.io.File;

import com.gmail.rohzek.lib.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigurationManager
{
	public static File optionsLoc;
	public static File allowedModsLoc;
	
	public static boolean isDebug;
	public static boolean straight2Ingots;
	public static boolean zombiePigsAttack;
	public static int aggroRangePigmen = 16;
	public static boolean endermenAttack;
	public static int aggroRangeEndermen = 16;
	public static boolean gfFlowerDisable;
	
	public static boolean supportNewDims;
	public static boolean changeVanilla;
	public static boolean useVanillaNetherQuartz;
	public static boolean emeraldSpawnAnywhere;
	
	public static boolean supportForestry;
	public static boolean supportIC;
	public static boolean supportIE;
	public static boolean supportMK;
	public static boolean supportTF;
	public static boolean supportTR;
	public static boolean supportTC;
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
		this.aggroRangePigmen = config.get(genCategory, "aggroRangePigmen", 16, "Range at which Zombie Pigmen will aggro, in blocks.", 8, Integer.MAX_VALUE).getInt();
		this.endermenAttack = config.get(genCategory, "endermenAggro", true, "Endermen will attack players who mine end ores. Set to false to disable").getBoolean(true);
		this.aggroRangeEndermen = config.get(genCategory, "aggroRangeEndermen", 16, "Range at which Endermen will aggro, in blocks.", 8, Integer.MAX_VALUE).getInt();
		this.gfFlowerDisable = config.get(genCategory, "gfFlowerDisable", false, "True will disable spawn of the CheshireRose flower.").getBoolean(false);
		
		this.supportNewDims = config.get(modCategory, "customDimensions", true, "Allows custom generation in modded dimensions. Only supports dimensions with Stone as the main block (like the overworld)").getBoolean(true);
		this.changeVanilla = config.get(modCategory, "changeVanillaOreSpawn", true, "Should this mod change the vanilla ore gen?").getBoolean(true);
		this.useVanillaNetherQuartz = config.get(modCategory, "useVanillaNetherQuartz", false, "Should the mod not override Nether Quartz?").getBoolean(false);
		this.emeraldSpawnAnywhere = config.get(modCategory, "easyEmeralds", true, "Should emeralds spawn anywhere? Set false to make emeralds only spawn in Extreme Hills biomes").getBoolean(true);
		
		this.supportForestry = config.get(modCategory, "supportForestry", true, "Support for Forestry ores").getBoolean(true);
		this.supportIC = config.get(modCategory, "supportIndustrialCraft", true, "Support for IC2 ores").getBoolean(true);
		this.supportIE = config.get(modCategory, "supportImmersiveEngineering", true, "Support for Immersive Engineering").getBoolean(true);
		this.supportMK = config.get(modCategory, "supportMekanism", true, "Support for Mekanism").getBoolean(true);
		this.supportTF = config.get(modCategory, "supportThermalFoundation", true, "Support for Thermal Foundation").getBoolean(true);
		this.supportTR = config.get(modCategory, "supportTechReborn", true, "Support for Tech Reborn").getBoolean(true);
		this.supportTC = config.get(modCategory, "supportTinkersConstruct", true, "Support for Tinker's Construct").getBoolean(true);
		this.supportWaila = config.get(modCategory, "supportWaila", true, "Support for Waila").getBoolean(true);
		
		config.save();
	}
}
