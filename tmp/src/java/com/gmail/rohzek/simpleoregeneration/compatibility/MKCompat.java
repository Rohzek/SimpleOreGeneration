package com.gmail.rohzek.simpleoregeneration.compatibility;

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
			try 
			{
				Class.forName("mekanism.common.config.MekanismConfig");
				
				MekanismConfig config = MekanismConfig.local();
				
				config.general.copperPerChunk.set(0);
				config.general.osmiumPerChunk.set(0);
				config.general.tinPerChunk.set(0);
			}
			catch( ClassNotFoundException e ) 
			{
				 LogHelper.log("Mekanism not found, but Mekanism compat is loaded?");
			}
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
