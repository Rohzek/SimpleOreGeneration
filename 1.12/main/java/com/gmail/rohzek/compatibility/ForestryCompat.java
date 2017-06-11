package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

//import forestry.core.config.Config;
import net.minecraft.block.Block;

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
			/*
			Config.generateApatiteOre = false;
			Config.generateCopperOre = false;
			Config.generateTinOre = false;
			*/
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportForestry)
		{
			ModdedConstants.apatiteOre = true;
			ModdedConstants.copperOre = true;
			ModdedConstants.tinOre = true;
		}
	}
}
