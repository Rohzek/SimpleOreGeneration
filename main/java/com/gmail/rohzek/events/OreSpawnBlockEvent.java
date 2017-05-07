package com.gmail.rohzek.events;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Removed the vanilla ore generation by type so that we can add it back later.
 * @author Rohzek
 *
 */
public class OreSpawnBlockEvent 
{
	@SubscribeEvent
	public void oreSpawnBlock(OreGenEvent.GenerateMinable event)
	{
		int dimID = event.getWorld().provider.getDimension();
		
		if(ConfigurationManager.supportNewDims)
		{
			blockOres(event);
		}
		else // If support for custom ores is turned off
		{
			if(dimID == -1 || dimID == 0) // Only block ore spawns in the nether and overworld
			{
				blockOres(event);
			}
		}
	}
	
	private void blockOres(OreGenEvent.GenerateMinable event)
	{
		EventType[] ores = EventType.values();
		
		// We want to skip Silverfish and Custom blocks when searching, so remove the last 2
		for(int i = 0; i < (ores.length - 2); i++)
		{
			if(event.getType() == ores[i])
			{
				LogHelper.debug("Blocked ore of type: " + event.getType() + " From spawning.");
				
				event.setResult(Result.DENY);
			}
			else
			{
				blockCustomOres(event);
			}
		}
	}
	
	private void blockCustomOres(OreGenEvent.GenerateMinable event)
	{
		/*
		if(ConfigurationManager.supportNewOres)
		{
			if(event.getType() == EventType.CUSTOM)
			{
				LogHelper.debug("Blocked ore of type: " + event.getType() + " From spawning.");
				
				event.setResult(Result.DENY);
			}
		}
		*/
	}
}
