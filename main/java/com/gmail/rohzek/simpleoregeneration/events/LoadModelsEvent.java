package com.gmail.rohzek.simpleoregeneration.events;

import com.gmail.rohzek.blocks.SGBlocks;
import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.items.SGItems;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class LoadModelsEvent 
{
	@SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent event)
	{
		SGOres.registerRenders();
		SGBlocks.registerRenders();
		SGItems.registerRenders();
    }
}
