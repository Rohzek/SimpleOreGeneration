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
	
	public OreSpawnBlockEvent() 
	{
		populateOreType();
	}
	
	@SubscribeEvent
	public void oreSpawnBlock(OreGenEvent.GenerateMinable event)
	{
		int dimID = event.getWorld().provider.getDimension();
		
		if(ConfigurationManager.changeVanilla)
		{
			blockOres(event);
		}
		if(!ConfigurationManager.useVanillaNetherQuartz)
		{
			blockNetherOres(event);
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
		}
	}
	
	/**
	 * Allows us to remove any ore types added into the "remove" array.
	 * We call this in the constructor so we don't have to call it every
	 * time an ore gets generated (as it would be in this class)
	 */
	public static void populateOreType()
	{
		LogHelper.debug("We're populating our blocked ore list now");
		
		EventType[] types = EventType.values(); // A list of all the types
		// The types to remove from the above list
		EventType[] remove = 
			{
				EventType.ANDESITE, 
				EventType.DIORITE, 
				EventType.DIRT,
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
	
	private void blockNetherOres(OreGenEvent.GenerateMinable event)
	{
		if(event.getType() == EventType.QUARTZ)
		{
			LogHelper.debug("Blocked ore of type: " + event.getType() + " From spawning.");
			
			event.setResult(Result.DENY);
		}
	}
}
