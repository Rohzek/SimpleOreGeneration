package com.gmail.rohzek.simpleoregen.datagen;

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
		dropSelf(WorldGenBlocks.ROSE_FLOWER.get());
		dropSelf(WorldGenBlocks.ROSE_CYAN_FLOWER.get());
		
		dropSelf(OreGenBlocks.ALUMINUM_BLOCK.get());
		dropSelf(OreGenBlocks.BRONZE_BLOCK.get());
		dropSelf(OreGenBlocks.COBALT_BLOCK.get());
		dropSelf(OreGenBlocks.IRIDIUM_BLOCK.get());
		dropSelf(OreGenBlocks.LEAD_BLOCK.get());
		dropSelf(OreGenBlocks.NICKEL_BLOCK.get());
		dropSelf(OreGenBlocks.PLATINUM_BLOCK.get());
		dropSelf(OreGenBlocks.RUBY_BLOCK.get());
		dropSelf(OreGenBlocks.SAPPHIRE_BLOCK.get());
		dropSelf(OreGenBlocks.SILVER_BLOCK.get());
		dropSelf(OreGenBlocks.TIN_BLOCK.get());
		dropSelf(OreGenBlocks.TUNGSTEN_BLOCK.get());
		dropSelf(OreGenBlocks.URANIUM_BLOCK.get());
		dropSelf(OreGenBlocks.ZINC_BLOCK.get());
		
		dropSelf(OreGenBlocks.RAW_ALUMINUM_BLOCK.get());
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
		add(OreGenBlocks.SURFACE_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.SURFACE_ALUMINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_ALUMINUM_ORE.get(), OreGenItems.RAW_ALUMINIUM.get()));
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
		
		// Deepslate
		add(OreGenBlocks.SURFACE_DEEPSLATE_QUARTZ_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_QUARTZ_ORE.get(), Items.QUARTZ));
		
		add(OreGenBlocks.SURFACE_DEEPSLATE_ALUMINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_ALUMINUM_ORE.get(), OreGenItems.RAW_ALUMINIUM.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_COBALT_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_COBALT_ORE.get(), OreGenItems.RAW_COBALT.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_IRIDIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_IRIDIUM_ORE.get(), OreGenItems.RAW_IRIDIUM.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_LEAD_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_LEAD_ORE.get(), OreGenItems.RAW_LEAD.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_NICKEL_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_NICKEL_ORE.get(), OreGenItems.RAW_NICKEL.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_PLATINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_PLATINUM_ORE.get(), OreGenItems.RAW_PLATINUM.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_RUBY_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_RUBY_ORE.get(), OreGenItems.RUBY.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_SAPPHIRE_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_SAPPHIRE_ORE.get(), OreGenItems.SAPPHIRE.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_SILVER_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_SILVER_ORE.get(), OreGenItems.RAW_SILVER.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_TIN_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_TIN_ORE.get(), OreGenItems.RAW_TIN.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_TUNGSTEN_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_TUNGSTEN_ORE.get(), OreGenItems.RAW_TUNGSTEN.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_URANIUM_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_URANIUM_ORE.get(), OreGenItems.RAW_URANIUM.get()));
		add(OreGenBlocks.SURFACE_DEEPSLATE_ZINC_ORE.get(), block -> createOreDrop(OreGenBlocks.SURFACE_DEEPSLATE_ZINC_ORE.get(), OreGenItems.RAW_ZINC.get()));
		
		// Nether
		add(OreGenBlocks.NETHER_COAL_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_COAL_ORE.get(), Items.COAL));
		add(OreGenBlocks.NETHER_COPPER_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_COPPER_ORE.get(), Items.RAW_COPPER));
		add(OreGenBlocks.NETHER_DIAMOND_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_DIAMOND_ORE.get(), Items.DIAMOND));
		add(OreGenBlocks.NETHER_EMERALD_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_EMERALD_ORE.get(), Items.EMERALD));
		add(OreGenBlocks.NETHER_GOLD_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_GOLD_ORE.get(), Items.RAW_GOLD));
		add(OreGenBlocks.NETHER_IRON_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_IRON_ORE.get(), Items.RAW_IRON));
		add(OreGenBlocks.NETHER_REDSTONE_ORE.get(), block -> createMultipleOreDrops(OreGenBlocks.NETHER_REDSTONE_ORE.get(), Items.REDSTONE, 3, 5));
		add(OreGenBlocks.NETHER_LAPIS_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
		
		add(OreGenBlocks.NETHER_ALUMINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.NETHER_ALUMINUM_ORE.get(), OreGenItems.RAW_ALUMINIUM.get()));
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
		
		add(OreGenBlocks.END_ALUMINUM_ORE.get(), block -> createOreDrop(OreGenBlocks.END_ALUMINUM_ORE.get(), OreGenItems.RAW_ALUMINIUM.get()));
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
