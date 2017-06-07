package com.gmail.rohzek.events;

import java.util.ArrayList;

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
	public static ArrayList<EventType> ores = new ArrayList<EventType>();
	
	@SubscribeEvent
	public void oreSpawnBlock(OreGenEvent.GenerateMinable event)
	{
		int dimID = event.getWorld().provider.getDimension();
		
		if(ConfigurationManager.changeVanilla)
		{
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
	}
	
	private void blockOres(OreGenEvent.GenerateMinable event)
	{
		
		
		// We want to skip Silverfish and Custom blocks when searching, so remove the last 2
		for(int i = 0; i < (ores.size() - 2); i++)
		{
			if(event.getType() == ores.get(i))
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
	
	/**
	 * Allows us to remove any ore types added into the "remove" array.
	 * We call this from the main, so we don't have to call it every
	 * time an ore gets generated (as it would be in this class)
	 */
	public static void populateOreType()
	{
		EventType[] types = EventType.values(); // A list of all the types
		// The types to remove from the above list
		EventType[] remove = 
			{
				EventType.ANDESITE, 
				EventType.DIORITE, 
				EventType.GRANITE,
				EventType.GRAVEL,
				EventType.SILVERFISH, 
				EventType.CUSTOM
			};
		
		// Adds all of the EventTypes to the ores array
		for(int i = 0; i < types.length; i++)
		{
			ores.add(types[i]);
		}
		
		// Removes the ones we don't want to touch, using the remove array as a guide
		for(int i = 0; i < remove.length; i++)
		{
			if(ores.contains(remove[i]))
			{
				ores.remove(remove[i]);
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
