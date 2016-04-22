package com.gmail.rohzek.events;

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
		if(event.type == EventType.COAL || event.type == EventType.DIAMOND || event.type == EventType.GOLD || event.type == EventType.IRON ||
		   event.type == EventType.LAPIS || event.type == EventType.QUARTZ || event.type == EventType.REDSTONE)
			{
				LogHelper.debug("Blocked ore of type: " + event.type + " From spawning.");
				
				event.setResult(Result.DENY);
			}
	}
}
