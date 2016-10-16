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
		if(event.getType() == EventType.COAL || event.getType() == EventType.DIAMOND || event.getType() == EventType.GOLD || 
		   event.getType() == EventType.IRON || event.getType() == EventType.LAPIS || event.getType() == EventType.QUARTZ || 
		   event.getType() == EventType.REDSTONE)
			{
				LogHelper.debug("Blocked ore of type: " + event.getType() + " From spawning.");
				
				event.setResult(Result.DENY);
			}
	}
}
