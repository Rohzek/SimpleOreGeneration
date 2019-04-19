package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import futurepack.common.FPConfig;

public class FuturepackCompat 
{	
	public static void load() 
	{	
		fixConfig();
		loadOre();
		LogHelper.log("Futurepack Compatibility loaded");
	}
	
	public static void fixConfig()
	{
		if(ConfigurationManager.supportFuturepack)
		{
			try 
			{
				Class.forName("futurepack.common.FPConfig");
				
				FPConfig.bauxiteOre = 0;
				FPConfig.copperOre = 0;
				FPConfig.tinOre = 0;
				
				FPConfig.magnetiteOre = 0;
				FPConfig.zincOre = 0;
			}
			catch( ClassNotFoundException e ) 
			{
				 LogHelper.log("FuturePack not found, but FuturePack compat is loaded?");
			}
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportFuturepack)
		{
			ModdedConstants.enabledOres.add(new ModOre("aluminumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
			
			ModdedConstants.enabledOres.add(new ModOre("magnetiteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("zincOre", true));
		}
	}
}
