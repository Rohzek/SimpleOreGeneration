package com.gmail.rohzek.simpleoregen.data;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Reference.MODID,bus = EventBusSubscriber.Bus.MOD)
public class DataGenetators 
{
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) 
	{
		DataGenerator dataGenerator = event.getGenerator();
		PackOutput packOutput = dataGenerator.getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		// Recipes
		dataGenerator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
		
		// Loot Tables
		dataGenerator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(), 
				List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
		
		// Items
		dataGenerator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
		
		// Blocks
		dataGenerator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
		
		// Tags
		BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
		dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
		dataGenerator.addProvider(event.includeServer(), new ModItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
		dataGenerator.addProvider(event.includeServer(), new ModBiomeTagProvider(packOutput, lookupProvider, existingFileHelper));
		
		dataGenerator.addProvider(event.includeServer(), new ModDatapackProvider(packOutput, lookupProvider));
	}
}
