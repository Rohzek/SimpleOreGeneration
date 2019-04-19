package com.gmail.rohzek.compatibility;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.gmail.rohzek.smelting.SmeltingRecipes;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import ic2.core.IC2;

import ic2.core.platform.config.IC2Config;
import ic2.core.util.events.IC2WorldGenerator;
import net.minecraftforge.common.config.Configuration;

import ic2.core.init.MainConfig;
import ic2.core.util.Config;

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
			boolean isIC2Classic = true;
			
			try 
			{
				Class.forName("ic2.core.Ic2Player");
				
				isIC2Classic = false;
			}
			catch( ClassNotFoundException e ) 
			{
				 LogHelper.log("IC2 Experimental not found, but IC2 compat is loaded?");
			}
			
			if(!isIC2Classic) 
			{
				Config config = MainConfig.get();
				
				config.set("worldgen/copperOre", false);
				config.set("worldgen/tinOre", false);
				config.set("worldgen/uraniumOre", false);
				config.set("worldgen/leadOre", false);
			}
			
			else 
			{
				try 
				{
				    Field[] fields = Class.forName("ic2.core.util.events.IC2WorldGenerator").getDeclaredFields();

				    for(Field f : fields) 
				    {
				    	ic2ClassicChangeField(f);
				    }
				} 
				catch (ClassNotFoundException e) {} 

				ModdedConstants.enabledOres.add(new ModOre("silverOre", true));
			}
		}
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportIC)
		{	
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
			ModdedConstants.enabledOres.add(new ModOre("leadOre", true));
			ModdedConstants.enabledOres.add(new ModOre("uraniumOre", true));
		}
	}
	
	static void ic2ClassicChangeField(Field field) 
	{
		LogHelper.log("Found field in IC2: " + field.getName());
		IC2WorldGenerator gen = IC2WorldGenerator.instance;
		
		try {
			if(!field.getName().equals("instance")) 
			{
				field.setAccessible(true);
				
				if(field.getName().equals("configLoaded")) 
				{
					LogHelper.debug("Setting " + field.getName() + " to true");
					field.setBoolean(gen, true);
				}
				else if(field.getName().equals("oreDensity")) 
				{
					LogHelper.debug("Setting " + field.getName() + " to 0.0f");
					field.setFloat(gen, 0.0f);
				}
				else
				{
					LogHelper.debug("Setting " + field.getName() + " to false");
					field.setBoolean(gen, false);
				}
			}
		}
		catch (IllegalArgumentException e) 
		{
			LogHelper.debug("Failed to set " + field.getName() + " due to IllegalArgumentException");
		} 
		catch (IllegalAccessException e) 
		{
			LogHelper.debug("Failed to set " + field.getName() + " due to IllegalAccessException");
		}
	}
}
