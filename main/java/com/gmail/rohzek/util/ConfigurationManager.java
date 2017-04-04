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
	public static boolean supportNewDims;
	public static boolean supportNewOres;
	
	public ConfigurationManager(FMLPreInitializationEvent event)
	{
		optionsLoc = new File(Reference.LOCATION + "/options.cfg");
		allowedModsLoc = new File(Reference.LOCATION + "/AllowedMods.cfg");
		
		Configuration optionsConfig = new Configuration(optionsLoc);
		options(optionsConfig);
		
		Configuration modsConfig = new Configuration(optionsLoc);
		ores(modsConfig);
	}
	
	private void options(Configuration config)
	{
		config.load();
		
		this.isDebug = config.get(Configuration.CATEGORY_GENERAL, "debug", false, "Enables more printouts to the chat. WARNING: Will spam the log file. Good for bug reports. Not recommended for regular play.").getBoolean(false);
		this.straight2Ingots = config.get(Configuration.CATEGORY_GENERAL, "smeltToIngots", true, "Makes new ores be smelted straight to their ingot form, instead of turning into vanilla ores first.").getBoolean(true);
		this.zombiePigsAttack = config.get(Configuration.CATEGORY_GENERAL, "zombiePigmenAggro", true, "Zombie Pigmen will attack players who mine nether ores. Set to false to disable").getBoolean(true);
		
		this.supportNewDims = config.get(Configuration.CATEGORY_GENERAL, "customDimensions", true, "Allows custom generation in modded dimensions. Only supports dimensions Stone with Stone as main block (like overworld)").getBoolean(true);
		this.supportNewOres = config.get(Configuration.CATEGORY_GENERAL, "customOres", true, "Allows custom generation of modded ores. Toggle which mod's ores are covered in AllowedMods.cfg").getBoolean(true);
		
		config.save();
	}
	
	private void ores(Configuration config)
	{
		config.load();
		
		// Support mods
		
		config.save();
	}
}
