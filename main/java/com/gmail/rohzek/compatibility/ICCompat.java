package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.lib.Reference;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import ic2.core.init.MainConfig;
import ic2.core.ref.BlockName;
import ic2.core.util.Config;
import ic2.core.util.ConfigUtil;

public class ICCompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		LogHelper.log("IC2 Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportIC)
		{
			Config config = MainConfig.get();
			
			config.set("worldgen/copperOre", false);
			config.set("worldgen/tinOre", false);
			config.set("worldgen/uraniumOre", false);
			config.set("worldgen/leadOre", false);
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportIC)
		{
			ModdedConstants.copperOre = true;
			ModdedConstants.tinOre = true;
			ModdedConstants.leadOre = true;
			ModdedConstants.uraniumOre = true;
		}
	}
}
