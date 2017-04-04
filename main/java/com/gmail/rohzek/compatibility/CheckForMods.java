package com.gmail.rohzek.compatibility;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Optional;

public class CheckForMods 
{
	public static boolean check(String modid)
	{
		return Loader.isModLoaded(modid);
	}
	
	@Optional.Method(modid = "examplemod")
	public static void test(){}
}
