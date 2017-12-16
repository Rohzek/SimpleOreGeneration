package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import mekanism.common.config.MekanismConfig;

public class MKCompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		LogHelper.log("Mekanism Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportMK)
		{
			MekanismConfig.general.copperPerChunk = 0;
			MekanismConfig.general.osmiumPerChunk = 0;
			MekanismConfig.general.tinPerChunk = 0;
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportMK)
		{
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("osmiumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
		}
	}
}
