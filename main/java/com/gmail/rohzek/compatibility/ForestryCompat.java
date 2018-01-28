package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import forestry.core.config.Config;

public class ForestryCompat 
{	
	public static void load() 
	{	
		fixConfig();
		loadOre();
		LogHelper.log("Forestry Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportForestry)
		{
			Config.generateApatiteOre = false;
			Config.generateCopperOre = false;
			Config.generateTinOre = false;
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportForestry)
		{
			ModdedConstants.enabledOres.add(new ModOre("apatiteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
		}
	}
}
