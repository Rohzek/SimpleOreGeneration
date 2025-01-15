package com.gmail.rohzek.simpleoregeneration.compatibility;

import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import forestry.core.config.Config;
import net.minecraft.block.Block;
import teamroots.embers.ConfigManager;

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
			try 
			{
				Class.forName("forestry.core.config.Config");
				
				Config.generateApatiteOre = false;
				Config.generateCopperOre = false;
				Config.generateTinOre = false;
			}
			catch( ClassNotFoundException e ) 
			{
				 LogHelper.log("Forestry not found, but Forestry compat is loaded?");
			}
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
