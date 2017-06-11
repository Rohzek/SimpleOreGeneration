package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Optional;

public class CheckForMods 
{
	public static boolean check(String modid)
	{
		return Loader.isModLoaded(modid);
	}
	
	@Optional.Method(modid = "forestry")
	public static void checkForForestry()
	{
		if(ConfigurationManager.supportForestry)
		{
			ForestryCompat.load();
		}
	}
	
	@Optional.Method(modid = "ic2")
	public static void checkForIC()
	{
		if(ConfigurationManager.supportIC)
		{
			ICCompat.load();
		}
	}
}
