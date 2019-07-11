package com.gmail.rohzek.simpleoregeneration.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import appeng.api.features.IWorldGen.WorldGenType;
import appeng.core.AEConfig;
import appeng.core.AppEng;
import appeng.core.features.registries.WorldGenRegistry;

public class AECompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		LogHelper.log("Applied Energestics Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportAE)
		{
			try 
			{
				Class.forName("appeng.core.features.registries.WorldGenRegistry");
				
				WorldGenRegistry.INSTANCE.disableWorldGenForDimension(WorldGenType.CERTUS_QUARTZ, 0);
				WorldGenRegistry.INSTANCE.disableWorldGenForDimension(WorldGenType.CHARGED_CERTUS_QUARTZ, 0);
			}
			catch( ClassNotFoundException e ) 
			{
				 LogHelper.log("AE2 not found, but AE2 compat is loaded?");
			}
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportAE)
		{
			ModdedConstants.enabledOres.add(new ModOre("certusQuartzOre", true));
			ModdedConstants.enabledOres.add(new ModOre("chargedCertusQuartzOre", true));
		}
	}
}
