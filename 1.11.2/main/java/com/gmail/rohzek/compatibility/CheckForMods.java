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
	
	@Optional.Method(modid = "immersiveengineering")
	public static void checkForIE()
	{
		if(ConfigurationManager.supportIE)
		{
			IECompat.load();
		}
	}
	
	@Optional.Method(modid = "mekanism")
	public static void checkForMK()
	{
		if(ConfigurationManager.supportMK)
		{
			MKCompat.load();
		}
	}
	
	@Optional.Method(modid = "techreborn")
	public static void checkForTR()
	{
		if(ConfigurationManager.supportTR)
		{
			TRCompat.load();
		}
	}
	
	@Optional.Method(modid = "thermalfoundation")
	public static void checkForTF()
	{
		if(ConfigurationManager.supportTF)
		{
			TFCompat.load();
		}
	}
	
	@Optional.Method(modid = "tconstruct")
	public static void checkForTC()
	{
		if(ConfigurationManager.supportTC)
		{
			TCCompat.load();
		}
	}
}
