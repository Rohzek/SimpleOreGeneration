package com.gmail.rohzek.simpleoregen.events;

import com.gmail.rohzek.simpleoregen.lib.ConfigurationManager;
import com.gmail.rohzek.simpleoregen.world.OrePlacements;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.config.ModConfigEvent;

public class OnLoad 
{
	@SubscribeEvent
	public static void onLoad(final ModConfigEvent.Loading event) 
	{
	    if (event.getConfig().getSpec() == ConfigurationManager.spec) 
	    {
	        for (OrePlacements ore : OrePlacements.values()) 
	        {
	            ore.overrideFromConfig();
	        }
	    }
	}
}
