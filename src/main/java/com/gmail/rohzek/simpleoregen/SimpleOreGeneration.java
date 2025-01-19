package com.gmail.rohzek.simpleoregen;

import org.slf4j.Logger;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.enchantments.ModEnchantmentEffects;
import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.lib.ConfigurationManager;
import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;
import com.gmail.rohzek.simpleoregen.lib.Reference;
import com.mojang.logging.LogUtils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(Reference.MODID)
public class SimpleOreGeneration 
{
	public final static Logger LOGGER = LogUtils.getLogger();
	
	public SimpleOreGeneration(IEventBus modEventBus, ModContainer modContainer)
	{
		// Register the mod
		//modEventBus.register(this);
	
		modEventBus.addListener(this::commonSetup);
		
		NeoForge.EVENT_BUS.register(this);
		
		if (FMLEnvironment.dist == Dist.CLIENT) 
		{
			//modEventBus.addListener(AirCounter.INSTANCE::onRegisterOverlays);
        }
		
		// Register items
		DeferredRegistration.register(modEventBus);
		OreGenItems.register();
		OreGenBlocks.register();
		WorldGenBlocks.register();
		ModEnchantmentEffects.register();

		// Register configuration file
		//final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		modContainer.registerConfig(ModConfig.Type.COMMON, ConfigurationManager.spec);
	}
	
	private void commonSetup(FMLCommonSetupEvent event) 
	{
		event.enqueueWork(() -> 
		{
			((FlowerPotBlock) Blocks.FLOWER_POT)
			.addPlant(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "cheshirerose"), WorldGenBlocks.CHESHIRE_ROSE_FLOWER_POTTED);
			
			((FlowerPotBlock) Blocks.FLOWER_POT)
			.addPlant(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "rose"), WorldGenBlocks.ROSE_FLOWER_POTTED);
			
			((FlowerPotBlock) Blocks.FLOWER_POT)
			.addPlant(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "rose_cyan"), WorldGenBlocks.CYAN_ROSE_FLOWER_POTTED);
		});
	}
	
	// You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
    
 // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = Reference.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents 
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
