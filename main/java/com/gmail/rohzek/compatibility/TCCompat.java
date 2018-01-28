package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import slimeknights.tconstruct.common.config.Config;

public class TCCompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		LogHelper.log("Tinker's Construct Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportTC)
		{
			Config.genCobalt = false;
			Config.genArdite = false;
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportTC)
		{
			ModdedConstants.enabledOres.add(new ModOre("cobaltOre", true));
			ModdedConstants.enabledOres.add(new ModOre("arditeOre", true));
		}
	}
}
