package com.gmail.rohzek.simpleoregen.events;

import com.gmail.rohzek.simpleoregen.entity.CheshireCat;
import com.gmail.rohzek.simpleoregen.entity.ModEntities;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.client.renderer.entity.CatRenderer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

// Runs on IModBusEvent
@EventBusSubscriber(modid = Reference.MODID, bus = EventBusSubscriber.Bus.MOD)
public class OnRegisterAttributes 
{	
	@SubscribeEvent
	public static void registerRenderers(RegisterRenderers event) 
	{
		event.registerEntityRenderer(ModEntities.CHESHIRE_CAT.get(), CatRenderer::new);
	}
	
	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) 
	{
		event.put(ModEntities.CHESHIRE_CAT.get(), CheshireCat.createAttributes().build());
	}
}
