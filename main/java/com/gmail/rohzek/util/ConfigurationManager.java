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
	public static boolean gfFlowerSmeltingDisable;
	
	public static boolean supportNewDims;
	public static boolean changeVanilla;
	public static boolean forceSpawnModdedOres;
	public static boolean useVanillaNetherQuartz;
	public static boolean dropVanillaQuartz;
	public static boolean emeraldSpawnAnywhere;
	public static boolean emeraldEmulateVanilla;
	public static boolean netherOres;
	public static boolean endOres;
	
	public static boolean supportAE;
	public static boolean supportEmbers;
	public static boolean supportForestry;
	public static boolean supportFuturepack;
	public static boolean supportIC;
	public static boolean supportIceAndFire;
	public static boolean supportIE;
	public static boolean supportAdvRok;
	public static boolean supportProjE;
	public static boolean supportMK;
	public static boolean supportTF;
	public static boolean supportTR;
	public static boolean supportTC;
	public static boolean supportThaumcraft;
	public static boolean supportWaila;
	
	public static String genCategory = "general";
	public static String debugCategory = "debug";
	public static String modCategory = "compatibility";
	public static String ovrCategory = "overrides";
	
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
		this.gfFlowerSmeltingDisable = config.get(genCategory, "gfFlowerSmeltingDisable", false, "True will disable smelting CheshireRose flower into a heart diamond.").getBoolean(false);
		
		
		this.supportNewDims = config.get(ovrCategory, "customDimensions", true, "Allows custom generation in modded dimensions. Only supports dimensions with Stone as the main block (like the overworld)").getBoolean(true);
		this.changeVanilla = config.get(ovrCategory, "changeVanillaOreSpawn", true, "Should this mod change the vanilla ore gen?").getBoolean(true);
		this.forceSpawnModdedOres = config.get(ovrCategory, "forceSpawnModdedOres", false, "Should this mod spawn modded ores, even if no supported mod is installed?").getBoolean(false);
		this.useVanillaNetherQuartz = config.get(ovrCategory, "useVanillaNetherQuartz", false, "Should the mod not override Nether Quartz?").getBoolean(false);
		this.dropVanillaQuartz = config.get(modCategory, "dropVanillaQuartz", false, "Should the Quartz Blocks drop vanilla Nether Quartz (item) instead?").getBoolean(false);
		this.emeraldSpawnAnywhere = config.get(ovrCategory, "easyEmeralds", true, "Should emeralds spawn like vanilla? Set false to make emeralds only spawn in Extreme Hills biomes").getBoolean(true);
		this.emeraldEmulateVanilla = config.get(ovrCategory, "emeraldVanillaEmulation", false, "Should emeralds spawn like vanilla? Set true to make emeralds as single blocks instead of veins. OVERRIDES OREGEN.JSON NUMBERS **COULD BE BUGGY, NEEDS MORE TESTING").getBoolean(false);
		this.netherOres = config.get(ovrCategory, "netherOreSpawn", true, "Should nether ores be spawned?").getBoolean(true);
		this.endOres = config.get(ovrCategory, "endOreSpawn", true, "Should end ores be spawned?").getBoolean(true);
		
		
		this.supportAE = config.get(modCategory, "supportAppliedEnergestics2", true, "Support for Applied Energestics 2 quartz").getBoolean(true);
		this.supportEmbers = config.get(modCategory, "supportEmbers", true, "Support for Embers ores").getBoolean(true);
		this.supportForestry = config.get(modCategory, "supportForestry", true, "Support for Forestry ores").getBoolean(true);
		this.supportFuturepack = config.get(modCategory, "supportFuturepack", true, "Support for Futurepack ores").getBoolean(true);
		this.supportIC = config.get(modCategory, "supportIndustrialCraft", true, "Support for IC2 ores").getBoolean(true);
		this.supportIceAndFire = config.get(modCategory, "supportIceAndFire", true, "Support for Ice and Fire ores").getBoolean(true);
		this.supportIE = config.get(modCategory, "supportImmersiveEngineering", true, "Support for Immersive Engineering ores").getBoolean(true);
		this.supportAdvRok = config.get(modCategory, "supportAdvancedRocketry", true, "Support for Advanced Rocketry/Lib Vulpes ores").getBoolean(true);
		this.supportMK = config.get(modCategory, "supportMekanism", true, "Support for Mekanism ores").getBoolean(true);
		this.supportProjE = config.get(modCategory, "supportProjectE", true, "Support for Project E's EMC values, for Simple Ore Gen blocks and items").getBoolean(true);
		this.supportTF = config.get(modCategory, "supportThermalFoundation", true, "Enables my ores spawning, when Thermal Foudnation is active. To remove the original ores, you must go to config/cofh/thermalfoundation and edit common.cfg, and change GenerateDefaultFiles on line 541 to false and go to config/cofh/world and rename or delete '00_minecraft.json', and '01_thermalfoundation_ores.json' This was previously done for you, but that feature has been removed at the request of the author. It may be coming back in the future, if the author adds the option.").getBoolean(true);
		this.supportTR = config.get(modCategory, "supportTechReborn", true, "Support for Tech Reborn ores").getBoolean(true);
		this.supportTC = config.get(modCategory, "supportTinkersConstruct", true, "Support for Tinker's Construct ores").getBoolean(true);
		this.supportThaumcraft = config.get(modCategory, "supportThaumcraft", true, "Support for Thaumcraft ores and aspects").getBoolean(true);
		this.supportWaila = config.get(modCategory, "supportWaila", true, "Support for Waila overlay on End and Nether blocks").getBoolean(true);
		
		config.save();
	}
}
