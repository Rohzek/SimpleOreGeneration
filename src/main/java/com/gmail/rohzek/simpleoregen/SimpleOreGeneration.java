package com.gmail.rohzek.simpleoregen;

import org.slf4j.Logger;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.lib.ConfigurationManager;
import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;
import com.gmail.rohzek.simpleoregen.lib.Reference;
import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(Reference.MODID)
public class SimpleOreGeneration 
{
	public final static Logger LOGGER = LogUtils.getLogger();
	
	public SimpleOreGeneration(IEventBus modEventBus, ModContainer modContainer)
	{
		// Register the mod
		//modEventBus.register(this);
		
		if (FMLEnvironment.dist == Dist.CLIENT) 
		{
			//modEventBus.addListener(AirCounter.INSTANCE::onRegisterOverlays);
        }
		
		// Register items
		DeferredRegistration.register(modEventBus);
		OreGenItems.register();
		OreGenBlocks.register();
		WorldGenBlocks.register();

		// Register configuration file
		//final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		modContainer.registerConfig(ModConfig.Type.COMMON, ConfigurationManager.spec);
	}
}
