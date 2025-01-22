package com.gmail.rohzek.simpleoregen.data;

import java.util.Set;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class ModBlockLootTableProvider extends BlockLootSubProvider
{
	
	protected ModBlockLootTableProvider(HolderLookup.Provider registries) 
	{
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
	}

	@Override
	protected void generate() 
	{
		dropSelf(WorldGenBlocks.CHESHIRE_ROSE_FLOWER.get());
		add(WorldGenBlocks.CHESHIRE_ROSE_FLOWER_POTTED.get(), block -> createPotFlowerItemTable(WorldGenBlocks.CHESHIRE_ROSE_FLOWER.get()));
		
		dropSelf(WorldGenBlocks.ROSE_FLOWER.get());
		add(WorldGenBlocks.ROSE_FLOWER_POTTED.get(), block -> createPotFlowerItemTable(WorldGenBlocks.ROSE_FLOWER.get()));
		
		dropSelf(WorldGenBlocks.ROSE_CYAN_FLOWER.get());
		add(WorldGenBlocks.CYAN_ROSE_FLOWER_POTTED.get(), block -> createPotFlowerItemTable(WorldGenBlocks.ROSE_CYAN_FLOWER.get()));
		
		dropSelf(OreGenBlocks.BAUXITE_BLOCK.get());
		dropSelf(OreGenBlocks.BRONZE_BLOCK.get());
		dropSelf(OreGenBlocks.COBALT_BLOCK.get());
		dropSelf(OreGenBlocks.IRIDIUM_BLOCK.get());
		dropSelf(OreGenBlocks.LEAD_BLOCK.get());
		dropSelf(OreGenBlocks.NICKEL_BLOCK.get());
		dropSelf(OreGenBlocks.PLATINUM_BLOCK.get());
		dropSelf(OreGenBlocks.RUBY_BLOCK.get());
		dropSelf(OreGenBlocks.SAPPHIRE_BLOCK.get());
		dropSelf(OreGenBlocks.SILVER_BLOCK.get());
		dropSelf(OreGenBlocks.STEEL_BLOCK.get());
		dropSelf(OreGenBlocks.TIN_BLOCK.get());
		dropSelf(OreGenBlocks.TUNGSTEN_BLOCK.get());
		dropSelf(OreGenBlocks.URANIUM_BLOCK.get());
		dropSelf(OreGenBlocks.ZINC_BLOCK.get());
		
		dropSelf(OreGenBlocks.RAW_BAUXITE_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_COBALT_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_IRIDIUM_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_LEAD_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_NICKEL_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_PLATINUM_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_SILVER_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_TIN_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_TUNGSTEN_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_URANIUM_BLOCK.get());
		dropSelf(OreGenBlocks.RAW_ZINC_BLOCK.get());

		// Stone
		add(OreGenBlocks.SURFACE_COAL_ORE.get(), block -> createOreDrop(Blocks.COAL_ORE, Items.COAL));
		add(OreGenBlocks.SURFACE_COPPER_ORE.get(), block -> createOreDrop(Blocks.COPPER_ORE, Items.RAW_COPPER));
		add(OreGenBlocks.SURFACE_DIAMOND_ORE.get(), block -> createOreDrop(Blocks.DIAMOND_ORE, Items.DIAMOND));
		add(OreGenBlocks.SURFACE_EMERALD_ORE.get(), block -> createOreDrop(Blocks.EMERALD_ORE, Items.EMERALD));
		add(OreGenBlocks.SURFACE_GOLD_ORE.get(), block -> createOreDrop(Blocks.GOLD_ORE, Items.RAW_GOLD));
		add(OreGenBlocks.SURFACE_IRON_ORE.get(), block -> createOreDrop(Blocks.IRON_ORE, Items.RAW_IRON));
		add(OreGenBlocks.SURFACE_REDSTONE_ORE.get(), block -> createMultipleOreDrops(Blocks.REDSTONE_ORE, Items.REDSTONE, 3, 5));
		add(OreGenBlocks.SURFACE_LAPIS_ORE.get(), block -> createOreDrop(Blocks.LAPIS_ORE, Items.LAPIS_LAZULI));
		add(OreGenBlocks.SURFACE_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.SURFACE_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.SURFACE_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.SURFACE_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.SURFACE_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.SURFACE_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.SURFACE_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.SURFACE_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.SURFACE_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.SURFACE_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.SURFACE_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.SURFACE_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.SURFACE_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.SURFACE_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		add(OreGenBlocks.SURFACE_COPPER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_COPPER_NUGGET_ORE.get(), OreGenItems.COPPER_NUGGET.get()));
		add(OreGenBlocks.SURFACE_GOLD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_GOLD_NUGGET_ORE.get(), Items.GOLD_NUGGET));
		add(OreGenBlocks.SURFACE_IRON_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_IRON_NUGGET_ORE.get(), Items.IRON_NUGGET));
		/*
		add(OreGenBlocks.SURFACE_BAUXITE_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_BAUXITE_NUGGET_ORE.get(), OreGenItems.BAUXITE_NUGGET.get()));
		add(OreGenBlocks.SURFACE_COBALT_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_COBALT_NUGGET_ORE.get(), OreGenItems.COBALT_NUGGET.get()));
		add(OreGenBlocks.SURFACE_IRIDIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_IRIDIUM_NUGGET_ORE.get(), OreGenItems.IRIDIUM_NUGGET.get()));
		add(OreGenBlocks.SURFACE_LEAD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_LEAD_NUGGET_ORE.get(), OreGenItems.LEAD_NUGGET.get()));
		add(OreGenBlocks.SURFACE_NICKEL_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_NICKEL_NUGGET_ORE.get(), OreGenItems.NICKEL_NUGGET.get()));
		add(OreGenBlocks.SURFACE_PLATINUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_PLATINUM_NUGGET_ORE.get(), OreGenItems.PLATINUM_NUGGET.get()));
		add(OreGenBlocks.SURFACE_SILVER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_SILVER_NUGGET_ORE.get(), OreGenItems.SILVER_NUGGET.get()));
		add(OreGenBlocks.SURFACE_TIN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_TIN_NUGGET_ORE.get(), OreGenItems.TIN_NUGGET.get()));
		add(OreGenBlocks.SURFACE_TUNGSTEN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_TUNGSTEN_NUGGET_ORE.get(), OreGenItems.TUNGSTEN_NUGGET.get()));
		add(OreGenBlocks.SURFACE_URANIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_URANIUM_NUGGET_ORE.get(), OreGenItems.URANIUM_NUGGET.get()));
		add(OreGenBlocks.SURFACE_ZINC_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_ZINC_NUGGET_ORE.get(), OreGenItems.ZINC_NUGGET.get()));
		*/
		// Deepslate
		add(OreGenBlocks.DEEPSLATE_COAL_ORE.get(), block -> createOreDrop(Blocks.DEEPSLATE_COAL_ORE, Items.COAL));
		add(OreGenBlocks.DEEPSLATE_COPPER_ORE.get(), block -> createOreDrop(Blocks.DEEPSLATE_COPPER_ORE, Items.RAW_COPPER));
		add(OreGenBlocks.DEEPSLATE_DIAMOND_ORE.get(), block -> createOreDrop(Blocks.DEEPSLATE_DIAMOND_ORE, Items.DIAMOND));
		add(OreGenBlocks.DEEPSLATE_EMERALD_ORE.get(), block -> createOreDrop(Blocks.DEEPSLATE_EMERALD_ORE, Items.EMERALD));
		add(OreGenBlocks.DEEPSLATE_GOLD_ORE.get(), block -> createOreDrop(Blocks.DEEPSLATE_GOLD_ORE, Items.RAW_GOLD));
		add(OreGenBlocks.DEEPSLATE_IRON_ORE.get(), block -> createOreDrop(Blocks.DEEPSLATE_IRON_ORE, Items.RAW_IRON));
		add(OreGenBlocks.DEEPSLATE_REDSTONE_ORE.get(), block -> createMultipleOreDrops(Blocks.DEEPSLATE_REDSTONE_ORE, Items.REDSTONE, 3, 5));
		add(OreGenBlocks.DEEPSLATE_LAPIS_ORE.get(), block -> createOreDrop(Blocks.DEEPSLATE_LAPIS_ORE, Items.LAPIS_LAZULI));
		add(OreGenBlocks.DEEPSLATE_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.DEEPSLATE_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.DEEPSLATE_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.DEEPSLATE_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.DEEPSLATE_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.DEEPSLATE_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.DEEPSLATE_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.DEEPSLATE_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.DEEPSLATE_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.DEEPSLATE_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.DEEPSLATE_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.DEEPSLATE_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		add(OreGenBlocks.DEEPSLATE_COPPER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_COPPER_NUGGET_ORE.get(), OreGenItems.COPPER_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_GOLD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_GOLD_NUGGET_ORE.get(), Items.GOLD_NUGGET));
		add(OreGenBlocks.DEEPSLATE_IRON_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_IRON_NUGGET_ORE.get(), Items.IRON_NUGGET));
		/*
		add(OreGenBlocks.DEEPSLATE_BAUXITE_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_BAUXITE_NUGGET_ORE.get(), OreGenItems.BAUXITE_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_COBALT_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_COBALT_NUGGET_ORE.get(), OreGenItems.COBALT_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_IRIDIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_IRIDIUM_NUGGET_ORE.get(), OreGenItems.IRIDIUM_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_LEAD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_LEAD_NUGGET_ORE.get(), OreGenItems.LEAD_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_NICKEL_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_NICKEL_NUGGET_ORE.get(), OreGenItems.NICKEL_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_PLATINUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_PLATINUM_NUGGET_ORE.get(), OreGenItems.PLATINUM_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_SILVER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_SILVER_NUGGET_ORE.get(), OreGenItems.SILVER_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_TIN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_TIN_NUGGET_ORE.get(), OreGenItems.TIN_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_TUNGSTEN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_TUNGSTEN_NUGGET_ORE.get(), OreGenItems.TUNGSTEN_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_URANIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_URANIUM_NUGGET_ORE.get(), OreGenItems.URANIUM_NUGGET.get()));
		add(OreGenBlocks.DEEPSLATE_ZINC_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DEEPSLATE_ZINC_NUGGET_ORE.get(), OreGenItems.ZINC_NUGGET.get()));
		*/
		// Andesite
		add(OreGenBlocks.ANDESITE_COAL_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_COAL_ORE.get(), Items.COAL));
		add(OreGenBlocks.ANDESITE_COPPER_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_COPPER_ORE.get(), Items.RAW_COPPER));
		add(OreGenBlocks.ANDESITE_DIAMOND_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_DIAMOND_ORE.get(), Items.DIAMOND));
		add(OreGenBlocks.ANDESITE_EMERALD_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_EMERALD_ORE.get(), Items.EMERALD));
		add(OreGenBlocks.ANDESITE_GOLD_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_GOLD_ORE.get(), Items.RAW_GOLD));
		add(OreGenBlocks.ANDESITE_IRON_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_IRON_ORE.get(), Items.RAW_IRON));
		add(OreGenBlocks.ANDESITE_REDSTONE_ORE.get(), block -> createMultipleOreDrops(OreGenBlocks.ANDESITE_REDSTONE_ORE.get(), Items.REDSTONE, 3, 5));
		add(OreGenBlocks.ANDESITE_LAPIS_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
		add(OreGenBlocks.ANDESITE_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.ANDESITE_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.ANDESITE_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.ANDESITE_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.ANDESITE_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.ANDESITE_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.ANDESITE_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.ANDESITE_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.ANDESITE_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.ANDESITE_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.ANDESITE_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.ANDESITE_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.ANDESITE_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.ANDESITE_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		add(OreGenBlocks.ANDESITE_COPPER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_COPPER_NUGGET_ORE.get(), OreGenItems.COPPER_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_GOLD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_GOLD_NUGGET_ORE.get(), Items.GOLD_NUGGET));
		add(OreGenBlocks.ANDESITE_IRON_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_IRON_NUGGET_ORE.get(), Items.IRON_NUGGET));
		/*
		add(OreGenBlocks.ANDESITE_BAUXITE_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_BAUXITE_NUGGET_ORE.get(), OreGenItems.BAUXITE_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_COBALT_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_COBALT_NUGGET_ORE.get(), OreGenItems.COBALT_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_IRIDIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_IRIDIUM_NUGGET_ORE.get(), OreGenItems.IRIDIUM_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_LEAD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_LEAD_NUGGET_ORE.get(), OreGenItems.LEAD_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_NICKEL_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_NICKEL_NUGGET_ORE.get(), OreGenItems.NICKEL_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_PLATINUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_PLATINUM_NUGGET_ORE.get(), OreGenItems.PLATINUM_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_SILVER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_SILVER_NUGGET_ORE.get(), OreGenItems.SILVER_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_TIN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_TIN_NUGGET_ORE.get(), OreGenItems.TIN_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_TUNGSTEN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_TUNGSTEN_NUGGET_ORE.get(), OreGenItems.TUNGSTEN_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_URANIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_URANIUM_NUGGET_ORE.get(), OreGenItems.URANIUM_NUGGET.get()));
		add(OreGenBlocks.ANDESITE_ZINC_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.ANDESITE_ZINC_NUGGET_ORE.get(), OreGenItems.ZINC_NUGGET.get()));
		*/
		// Diorite
		add(OreGenBlocks.DIORITE_COAL_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_COAL_ORE.get(), Items.COAL));
		add(OreGenBlocks.DIORITE_COPPER_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_COPPER_ORE.get(), Items.RAW_COPPER));
		add(OreGenBlocks.DIORITE_DIAMOND_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_DIAMOND_ORE.get(), Items.DIAMOND));
		add(OreGenBlocks.DIORITE_EMERALD_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_EMERALD_ORE.get(), Items.EMERALD));
		add(OreGenBlocks.DIORITE_GOLD_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_GOLD_ORE.get(), Items.RAW_GOLD));
		add(OreGenBlocks.DIORITE_IRON_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_IRON_ORE.get(), Items.RAW_IRON));
		add(OreGenBlocks.DIORITE_REDSTONE_ORE.get(), block -> createMultipleOreDrops(OreGenBlocks.DIORITE_REDSTONE_ORE.get(), Items.REDSTONE, 3, 5));
		add(OreGenBlocks.DIORITE_LAPIS_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
		add(OreGenBlocks.DIORITE_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.DIORITE_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.DIORITE_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.DIORITE_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.DIORITE_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.DIORITE_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.DIORITE_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.DIORITE_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.DIORITE_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.DIORITE_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.DIORITE_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.DIORITE_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.DIORITE_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.DIORITE_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		add(OreGenBlocks.DIORITE_COPPER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_COPPER_NUGGET_ORE.get(), OreGenItems.COPPER_NUGGET.get()));
		add(OreGenBlocks.DIORITE_GOLD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_GOLD_NUGGET_ORE.get(), Items.GOLD_NUGGET));
		add(OreGenBlocks.DIORITE_IRON_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_IRON_NUGGET_ORE.get(), Items.IRON_NUGGET));
		/*
		add(OreGenBlocks.DIORITE_BAUXITE_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_BAUXITE_NUGGET_ORE.get(), OreGenItems.BAUXITE_NUGGET.get()));
		add(OreGenBlocks.DIORITE_COBALT_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_COBALT_NUGGET_ORE.get(), OreGenItems.COBALT_NUGGET.get()));
		add(OreGenBlocks.DIORITE_IRIDIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_IRIDIUM_NUGGET_ORE.get(), OreGenItems.IRIDIUM_NUGGET.get()));
		add(OreGenBlocks.DIORITE_LEAD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_LEAD_NUGGET_ORE.get(), OreGenItems.LEAD_NUGGET.get()));
		add(OreGenBlocks.DIORITE_NICKEL_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_NICKEL_NUGGET_ORE.get(), OreGenItems.NICKEL_NUGGET.get()));
		add(OreGenBlocks.DIORITE_PLATINUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_PLATINUM_NUGGET_ORE.get(), OreGenItems.PLATINUM_NUGGET.get()));
		add(OreGenBlocks.DIORITE_SILVER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_SILVER_NUGGET_ORE.get(), OreGenItems.SILVER_NUGGET.get()));
		add(OreGenBlocks.DIORITE_TIN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_TIN_NUGGET_ORE.get(), OreGenItems.TIN_NUGGET.get()));
		add(OreGenBlocks.DIORITE_TUNGSTEN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_TUNGSTEN_NUGGET_ORE.get(), OreGenItems.TUNGSTEN_NUGGET.get()));
		add(OreGenBlocks.DIORITE_URANIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_URANIUM_NUGGET_ORE.get(), OreGenItems.URANIUM_NUGGET.get()));
		add(OreGenBlocks.DIORITE_ZINC_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.DIORITE_ZINC_NUGGET_ORE.get(), OreGenItems.ZINC_NUGGET.get()));
		*/
		// Granite
		add(OreGenBlocks.GRANITE_COAL_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_COAL_ORE.get(), Items.COAL));
		add(OreGenBlocks.GRANITE_COPPER_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_COPPER_ORE.get(), Items.RAW_COPPER));
		add(OreGenBlocks.GRANITE_DIAMOND_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_DIAMOND_ORE.get(), Items.DIAMOND));
		add(OreGenBlocks.GRANITE_EMERALD_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_EMERALD_ORE.get(), Items.EMERALD));
		add(OreGenBlocks.GRANITE_GOLD_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_GOLD_ORE.get(), Items.RAW_GOLD));
		add(OreGenBlocks.GRANITE_IRON_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_IRON_ORE.get(), Items.RAW_IRON));
		add(OreGenBlocks.GRANITE_REDSTONE_ORE.get(), block -> createMultipleOreDrops(OreGenBlocks.GRANITE_REDSTONE_ORE.get(), Items.REDSTONE, 3, 5));
		add(OreGenBlocks.GRANITE_LAPIS_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
		add(OreGenBlocks.GRANITE_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.GRANITE_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.GRANITE_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.GRANITE_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.GRANITE_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.GRANITE_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.GRANITE_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.GRANITE_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.GRANITE_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.GRANITE_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.GRANITE_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.GRANITE_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.GRANITE_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.GRANITE_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		add(OreGenBlocks.GRANITE_COPPER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_COPPER_NUGGET_ORE.get(), OreGenItems.COPPER_NUGGET.get()));
		add(OreGenBlocks.GRANITE_GOLD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_GOLD_NUGGET_ORE.get(), Items.GOLD_NUGGET));
		add(OreGenBlocks.GRANITE_IRON_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_IRON_NUGGET_ORE.get(), Items.IRON_NUGGET));
		/*
		add(OreGenBlocks.GRANITE_BAUXITE_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_BAUXITE_NUGGET_ORE.get(), OreGenItems.BAUXITE_NUGGET.get()));
		add(OreGenBlocks.GRANITE_COBALT_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_COBALT_NUGGET_ORE.get(), OreGenItems.COBALT_NUGGET.get()));
		add(OreGenBlocks.GRANITE_IRIDIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_IRIDIUM_NUGGET_ORE.get(), OreGenItems.IRIDIUM_NUGGET.get()));
		add(OreGenBlocks.GRANITE_LEAD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_LEAD_NUGGET_ORE.get(), OreGenItems.LEAD_NUGGET.get()));
		add(OreGenBlocks.GRANITE_NICKEL_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_NICKEL_NUGGET_ORE.get(), OreGenItems.NICKEL_NUGGET.get()));
		add(OreGenBlocks.GRANITE_PLATINUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_PLATINUM_NUGGET_ORE.get(), OreGenItems.PLATINUM_NUGGET.get()));
		add(OreGenBlocks.GRANITE_SILVER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_SILVER_NUGGET_ORE.get(), OreGenItems.SILVER_NUGGET.get()));
		add(OreGenBlocks.GRANITE_TIN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_TIN_NUGGET_ORE.get(), OreGenItems.TIN_NUGGET.get()));
		add(OreGenBlocks.GRANITE_TUNGSTEN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_TUNGSTEN_NUGGET_ORE.get(), OreGenItems.TUNGSTEN_NUGGET.get()));
		add(OreGenBlocks.GRANITE_URANIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_URANIUM_NUGGET_ORE.get(), OreGenItems.URANIUM_NUGGET.get()));
		add(OreGenBlocks.GRANITE_ZINC_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRANITE_ZINC_NUGGET_ORE.get(), OreGenItems.ZINC_NUGGET.get()));
		*/
		// Sand
		add(OreGenBlocks.SAND_COAL_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_COAL_ORE.get(), Items.COAL));
		add(OreGenBlocks.SAND_COPPER_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_COPPER_ORE.get(), Items.RAW_COPPER));
		add(OreGenBlocks.SAND_DIAMOND_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_DIAMOND_ORE.get(), Items.DIAMOND));
		add(OreGenBlocks.SAND_EMERALD_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_EMERALD_ORE.get(), Items.EMERALD));
		add(OreGenBlocks.SAND_GOLD_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_GOLD_ORE.get(), Items.RAW_GOLD));
		add(OreGenBlocks.SAND_IRON_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_IRON_ORE.get(), Items.RAW_IRON));
		add(OreGenBlocks.SAND_REDSTONE_ORE.get(), block -> createMultipleOreDrops(OreGenBlocks.SAND_REDSTONE_ORE.get(), Items.REDSTONE, 3, 5));
		add(OreGenBlocks.SAND_LAPIS_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
		add(OreGenBlocks.SAND_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.SAND_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.SAND_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.SAND_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.SAND_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.SAND_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.SAND_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.SAND_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.SAND_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.SAND_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.SAND_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.SAND_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.SAND_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.SAND_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		add(OreGenBlocks.SAND_COPPER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_COPPER_NUGGET_ORE.get(), OreGenItems.COPPER_NUGGET.get()));
		add(OreGenBlocks.SAND_GOLD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_GOLD_NUGGET_ORE.get(), Items.GOLD_NUGGET));
		add(OreGenBlocks.SAND_IRON_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_IRON_NUGGET_ORE.get(), Items.IRON_NUGGET));
		/*
		add(OreGenBlocks.SAND_BAUXITE_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_BAUXITE_NUGGET_ORE.get(), OreGenItems.BAUXITE_NUGGET.get()));
		add(OreGenBlocks.SAND_COBALT_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_COBALT_NUGGET_ORE.get(), OreGenItems.COBALT_NUGGET.get()));
		add(OreGenBlocks.SAND_IRIDIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_IRIDIUM_NUGGET_ORE.get(), OreGenItems.IRIDIUM_NUGGET.get()));
		add(OreGenBlocks.SAND_LEAD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_LEAD_NUGGET_ORE.get(), OreGenItems.LEAD_NUGGET.get()));
		add(OreGenBlocks.SAND_NICKEL_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_NICKEL_NUGGET_ORE.get(), OreGenItems.NICKEL_NUGGET.get()));
		add(OreGenBlocks.SAND_PLATINUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_PLATINUM_NUGGET_ORE.get(), OreGenItems.PLATINUM_NUGGET.get()));
		add(OreGenBlocks.SAND_SILVER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_SILVER_NUGGET_ORE.get(), OreGenItems.SILVER_NUGGET.get()));
		add(OreGenBlocks.SAND_TIN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_TIN_NUGGET_ORE.get(), OreGenItems.TIN_NUGGET.get()));
		add(OreGenBlocks.SAND_TUNGSTEN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_TUNGSTEN_NUGGET_ORE.get(), OreGenItems.TUNGSTEN_NUGGET.get()));
		add(OreGenBlocks.SAND_URANIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_URANIUM_NUGGET_ORE.get(), OreGenItems.URANIUM_NUGGET.get()));
		add(OreGenBlocks.SAND_ZINC_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SAND_ZINC_NUGGET_ORE.get(), OreGenItems.ZINC_NUGGET.get()));
		*/
		// Sandstone
		add(OreGenBlocks.SANDSTONE_COAL_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_COAL_ORE.get(), Items.COAL));
		add(OreGenBlocks.SANDSTONE_COPPER_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_COPPER_ORE.get(), Items.RAW_COPPER));
		add(OreGenBlocks.SANDSTONE_DIAMOND_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_DIAMOND_ORE.get(), Items.DIAMOND));
		add(OreGenBlocks.SANDSTONE_EMERALD_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_EMERALD_ORE.get(), Items.EMERALD));
		add(OreGenBlocks.SANDSTONE_GOLD_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_GOLD_ORE.get(), Items.RAW_GOLD));
		add(OreGenBlocks.SANDSTONE_IRON_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_IRON_ORE.get(), Items.RAW_IRON));
		add(OreGenBlocks.SANDSTONE_REDSTONE_ORE.get(), block -> createMultipleOreDrops(OreGenBlocks.SANDSTONE_REDSTONE_ORE.get(), Items.REDSTONE, 3, 5));
		add(OreGenBlocks.SANDSTONE_LAPIS_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
		add(OreGenBlocks.SANDSTONE_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.SANDSTONE_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.SANDSTONE_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.SANDSTONE_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.SANDSTONE_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.SANDSTONE_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.SANDSTONE_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.SANDSTONE_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.SANDSTONE_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.SANDSTONE_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.SANDSTONE_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.SANDSTONE_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.SANDSTONE_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.SANDSTONE_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		add(OreGenBlocks.SANDSTONE_COPPER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_COPPER_NUGGET_ORE.get(), OreGenItems.COPPER_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_GOLD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_GOLD_NUGGET_ORE.get(), Items.GOLD_NUGGET));
		add(OreGenBlocks.SANDSTONE_IRON_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_IRON_NUGGET_ORE.get(), Items.IRON_NUGGET));
		/*
		add(OreGenBlocks.SANDSTONE_BAUXITE_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_BAUXITE_NUGGET_ORE.get(), OreGenItems.BAUXITE_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_COBALT_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_COBALT_NUGGET_ORE.get(), OreGenItems.COBALT_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_IRIDIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_IRIDIUM_NUGGET_ORE.get(), OreGenItems.IRIDIUM_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_LEAD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_LEAD_NUGGET_ORE.get(), OreGenItems.LEAD_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_NICKEL_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_NICKEL_NUGGET_ORE.get(), OreGenItems.NICKEL_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_PLATINUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_PLATINUM_NUGGET_ORE.get(), OreGenItems.PLATINUM_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_SILVER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_SILVER_NUGGET_ORE.get(), OreGenItems.SILVER_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_TIN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_TIN_NUGGET_ORE.get(), OreGenItems.TIN_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_TUNGSTEN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_TUNGSTEN_NUGGET_ORE.get(), OreGenItems.TUNGSTEN_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_URANIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_URANIUM_NUGGET_ORE.get(), OreGenItems.URANIUM_NUGGET.get()));
		add(OreGenBlocks.SANDSTONE_ZINC_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.SANDSTONE_ZINC_NUGGET_ORE.get(), OreGenItems.ZINC_NUGGET.get()));
		*/
		// Gravel
		add(OreGenBlocks.GRAVEL_COAL_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_COAL_ORE.get(), Items.COAL));
		add(OreGenBlocks.GRAVEL_COPPER_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_COPPER_ORE.get(), Items.RAW_COPPER));
		add(OreGenBlocks.GRAVEL_DIAMOND_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_DIAMOND_ORE.get(), Items.DIAMOND));
		add(OreGenBlocks.GRAVEL_EMERALD_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_EMERALD_ORE.get(), Items.EMERALD));
		add(OreGenBlocks.GRAVEL_GOLD_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_GOLD_ORE.get(), Items.RAW_GOLD));
		add(OreGenBlocks.GRAVEL_IRON_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_IRON_ORE.get(), Items.RAW_IRON));
		add(OreGenBlocks.GRAVEL_REDSTONE_ORE.get(), block -> createMultipleOreDrops(OreGenBlocks.GRAVEL_REDSTONE_ORE.get(), Items.REDSTONE, 3, 5));
		add(OreGenBlocks.GRAVEL_LAPIS_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
		add(OreGenBlocks.GRAVEL_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.GRAVEL_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.GRAVEL_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.GRAVEL_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.GRAVEL_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.GRAVEL_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.GRAVEL_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.GRAVEL_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.GRAVEL_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.GRAVEL_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.GRAVEL_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.GRAVEL_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.GRAVEL_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.GRAVEL_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		add(OreGenBlocks.GRAVEL_COPPER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_COPPER_NUGGET_ORE.get(), OreGenItems.COPPER_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_GOLD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_GOLD_NUGGET_ORE.get(), Items.GOLD_NUGGET));
		add(OreGenBlocks.GRAVEL_IRON_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_IRON_NUGGET_ORE.get(), Items.IRON_NUGGET));
		/*
		add(OreGenBlocks.GRAVEL_BAUXITE_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_BAUXITE_NUGGET_ORE.get(), OreGenItems.BAUXITE_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_COBALT_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_COBALT_NUGGET_ORE.get(), OreGenItems.COBALT_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_IRIDIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_IRIDIUM_NUGGET_ORE.get(), OreGenItems.IRIDIUM_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_LEAD_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_LEAD_NUGGET_ORE.get(), OreGenItems.LEAD_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_NICKEL_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_NICKEL_NUGGET_ORE.get(), OreGenItems.NICKEL_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_PLATINUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_PLATINUM_NUGGET_ORE.get(), OreGenItems.PLATINUM_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_SILVER_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_SILVER_NUGGET_ORE.get(), OreGenItems.SILVER_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_TIN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_TIN_NUGGET_ORE.get(), OreGenItems.TIN_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_TUNGSTEN_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_TUNGSTEN_NUGGET_ORE.get(), OreGenItems.TUNGSTEN_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_URANIUM_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_URANIUM_NUGGET_ORE.get(), OreGenItems.URANIUM_NUGGET.get()));
		add(OreGenBlocks.GRAVEL_ZINC_NUGGET_ORE.get(), block -> createOreDrop(OreGenBlocks.GRAVEL_ZINC_NUGGET_ORE.get(), OreGenItems.ZINC_NUGGET.get()));
		*/
		// Nether
		add(OreGenBlocks.NETHER_COAL_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_COAL_ORE.get(), Items.COAL));
		add(OreGenBlocks.NETHER_COPPER_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_COPPER_ORE.get(), Items.RAW_COPPER));
		add(OreGenBlocks.NETHER_DIAMOND_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_DIAMOND_ORE.get(), Items.DIAMOND));
		add(OreGenBlocks.NETHER_EMERALD_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_EMERALD_ORE.get(), Items.EMERALD));
		add(OreGenBlocks.NETHER_GOLD_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_GOLD_ORE.get(), Items.RAW_GOLD));
		add(OreGenBlocks.NETHER_IRON_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_IRON_ORE.get(), Items.RAW_IRON));
		add(OreGenBlocks.NETHER_REDSTONE_ORE.get(), block -> createMultipleOreDrops(OreGenBlocks.NETHER_REDSTONE_ORE.get(), Items.REDSTONE, 3, 5));
		add(OreGenBlocks.NETHER_LAPIS_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
		
		add(OreGenBlocks.NETHER_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.NETHER_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.NETHER_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.NETHER_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.NETHER_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.NETHER_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.NETHER_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.NETHER_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.NETHER_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.NETHER_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.NETHER_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.NETHER_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.NETHER_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		// Nether
		add(OreGenBlocks.END_COAL_ORE.get(), block -> createOreDrop(OreGenBlocks.END_COAL_ORE.get(), Items.COAL));
		add(OreGenBlocks.END_COPPER_ORE.get(), block -> createOreDrop(OreGenBlocks.END_COPPER_ORE.get(), Items.RAW_COPPER));
		add(OreGenBlocks.END_DIAMOND_ORE.get(), block -> createOreDrop(OreGenBlocks.END_DIAMOND_ORE.get(), Items.DIAMOND));
		add(OreGenBlocks.END_EMERALD_ORE.get(), block -> createOreDrop(OreGenBlocks.END_EMERALD_ORE.get(), Items.EMERALD));
		add(OreGenBlocks.END_GOLD_ORE.get(), block -> createOreDrop(OreGenBlocks.END_GOLD_ORE.get(), Items.RAW_GOLD));
		add(OreGenBlocks.END_IRON_ORE.get(), block -> createOreDrop(OreGenBlocks.END_IRON_ORE.get(), Items.RAW_IRON));
		add(OreGenBlocks.END_REDSTONE_ORE.get(), block -> createMultipleOreDrops(OreGenBlocks.END_REDSTONE_ORE.get(), Items.REDSTONE, 3, 5));
		add(OreGenBlocks.END_LAPIS_ORE.get(), block -> createOreDrop(OreGenBlocks.END_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
		add(OreGenBlocks.END_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.END_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.END_BAUXITE_ORE.get(), block -> createOreDrop(OreGenBlocks.END_BAUXITE_ORE.get(), OreGenItems.RAW_BAUXITE.get()));
		add(OreGenBlocks.END_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.END_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.END_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.END_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.END_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.END_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.END_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.END_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.END_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.END_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.END_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.END_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.END_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.END_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.END_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.END_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.END_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.END_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.END_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.END_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.END_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.END_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.END_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.END_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
	}
	
	// Copied and Changed from the Copper drops
	protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) 
	{
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                   .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                   .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }
	
	
	@Override
	protected Iterable<Block> getKnownBlocks() 
	{
		return DeferredRegistration.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
	}
}
