package com.gmail.rohzek.simpleoregen.data;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider 
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) 
    {
        super(output, Reference.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() 
    {
    	makeFlower(WorldGenBlocks.CHESHIRE_ROSE_FLOWER.get(), "cheshirerose");
    	makeFlowerPotted(WorldGenBlocks.CHESHIRE_ROSE_FLOWER_POTTED.get(),"cheshirerose");
    	
    	makeFlower(WorldGenBlocks.ROSE_FLOWER.get(), "rose");
    	makeFlowerPotted(WorldGenBlocks.ROSE_FLOWER_POTTED.get(),"rose");
    	
    	makeFlower(WorldGenBlocks.ROSE_CYAN_FLOWER.get(), "rose_cyan");
    	makeFlowerPotted(WorldGenBlocks.CYAN_ROSE_FLOWER_POTTED.get(), "rose_cyan");
    	
    	// Stone
    	blockWithItem(OreGenBlocks.SURFACE_COAL_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_COPPER_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_GOLD_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_IRON_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_LAPIS_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.SURFACE_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_COBALT_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_LEAD_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_RUBY_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_SILVER_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_TIN_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_ZINC_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_CHAOS_ORE);
    	
    	blockWithItem(OreGenBlocks.SURFACE_COPPER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_GOLD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_IRON_NUGGET_ORE);
    	/*
    	blockWithItem(OreGenBlocks.SURFACE_BAUXITE_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_COBALT_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_IRIDIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_LEAD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_NICKEL_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_PLATINUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_SILVER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_TIN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_TUNGSTEN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_URANIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_ZINC_NUGGET_ORE);
    	*/
    	// Deepslate
    	blockWithItem(OreGenBlocks.DEEPSLATE_COAL_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_COPPER_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_GOLD_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_IRON_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_LAPIS_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.DEEPSLATE_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_COBALT_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_LEAD_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_RUBY_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_SILVER_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_TIN_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_ZINC_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_CHAOS_ORE);
    	
    	blockWithItem(OreGenBlocks.DEEPSLATE_COPPER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_GOLD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_IRON_NUGGET_ORE);
    	/*
    	blockWithItem(OreGenBlocks.DEEPSLATE_BAUXITE_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_COBALT_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_IRIDIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_LEAD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_NICKEL_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_PLATINUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_SILVER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_TIN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_TUNGSTEN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_URANIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DEEPSLATE_ZINC_NUGGET_ORE);
    	*/
    	// Andesite
    	blockWithItem(OreGenBlocks.ANDESITE_COAL_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_COPPER_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_GOLD_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_IRON_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_LAPIS_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.ANDESITE_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_COBALT_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_LEAD_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_RUBY_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_SILVER_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_TIN_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_ZINC_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_CHAOS_ORE);
    	
    	blockWithItem(OreGenBlocks.ANDESITE_COPPER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_GOLD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_IRON_NUGGET_ORE);
    	/*
    	blockWithItem(OreGenBlocks.ANDESITE_BAUXITE_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_COBALT_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_IRIDIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_LEAD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_NICKEL_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_PLATINUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_SILVER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_TIN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_TUNGSTEN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_URANIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.ANDESITE_ZINC_NUGGET_ORE);
    	*/
    	// Diorite
    	blockWithItem(OreGenBlocks.DIORITE_COAL_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_COPPER_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_GOLD_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_IRON_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_LAPIS_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.DIORITE_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_COBALT_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_LEAD_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_RUBY_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_SILVER_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_TIN_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_ZINC_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_CHAOS_ORE);
    	
    	blockWithItem(OreGenBlocks.DIORITE_COPPER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_GOLD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_IRON_NUGGET_ORE);
    	/*
    	blockWithItem(OreGenBlocks.DIORITE_BAUXITE_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_COBALT_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_IRIDIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_LEAD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_NICKEL_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_PLATINUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_SILVER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_TIN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_TUNGSTEN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_URANIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.DIORITE_ZINC_NUGGET_ORE);
    	*/
    	// Granite
    	blockWithItem(OreGenBlocks.GRANITE_COAL_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_COPPER_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_GOLD_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_IRON_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_LAPIS_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.GRANITE_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_COBALT_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_LEAD_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_RUBY_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_SILVER_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_TIN_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_ZINC_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_CHAOS_ORE);
    	
    	blockWithItem(OreGenBlocks.GRANITE_COPPER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_GOLD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_IRON_NUGGET_ORE);
    	/*
    	blockWithItem(OreGenBlocks.GRANITE_BAUXITE_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_COBALT_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_IRIDIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_LEAD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_NICKEL_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_PLATINUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_SILVER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_TIN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_TUNGSTEN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_URANIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRANITE_ZINC_NUGGET_ORE);
    	*/
    	
    	// Sandstone
    	blockWithItem(OreGenBlocks.SANDSTONE_COAL_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_COPPER_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_GOLD_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_IRON_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_LAPIS_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.SANDSTONE_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_COBALT_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_LEAD_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_RUBY_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_SILVER_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_TIN_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_ZINC_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_CHAOS_ORE);
    	
    	blockWithItem(OreGenBlocks.SANDSTONE_COPPER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_GOLD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_IRON_NUGGET_ORE);
    	/*
    	blockWithItem(OreGenBlocks.SANDSTONE_BAUXITE_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_COBALT_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_IRIDIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_LEAD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_NICKEL_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_PLATINUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_SILVER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_TIN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_TUNGSTEN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_URANIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SANDSTONE_ZINC_NUGGET_ORE);
    	*/
    	// Sand
    	blockWithItem(OreGenBlocks.SAND_COAL_ORE);
    	blockWithItem(OreGenBlocks.SAND_COPPER_ORE);
    	blockWithItem(OreGenBlocks.SAND_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.SAND_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.SAND_GOLD_ORE);
    	blockWithItem(OreGenBlocks.SAND_IRON_ORE);
    	blockWithItem(OreGenBlocks.SAND_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.SAND_LAPIS_ORE);
    	blockWithItem(OreGenBlocks.SAND_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.SAND_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.SAND_COBALT_ORE);
    	blockWithItem(OreGenBlocks.SAND_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.SAND_LEAD_ORE);
    	blockWithItem(OreGenBlocks.SAND_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.SAND_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.SAND_RUBY_ORE);
    	blockWithItem(OreGenBlocks.SAND_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.SAND_SILVER_ORE);
    	blockWithItem(OreGenBlocks.SAND_TIN_ORE);
    	blockWithItem(OreGenBlocks.SAND_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.SAND_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.SAND_ZINC_ORE);
    	blockWithItem(OreGenBlocks.SAND_CHAOS_ORE);
    	
    	blockWithItem(OreGenBlocks.SAND_COPPER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_GOLD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_IRON_NUGGET_ORE);
    	/*
    	blockWithItem(OreGenBlocks.SAND_BAUXITE_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_COBALT_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_IRIDIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_LEAD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_NICKEL_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_PLATINUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_SILVER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_TIN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_TUNGSTEN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_URANIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.SAND_ZINC_NUGGET_ORE);
    	*/
    	// Gravel
    	blockWithItem(OreGenBlocks.GRAVEL_COAL_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_COPPER_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_GOLD_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_IRON_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_LAPIS_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.GRAVEL_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_COBALT_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_LEAD_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_RUBY_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_SILVER_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_TIN_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_ZINC_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_CHAOS_ORE);
    	
    	blockWithItem(OreGenBlocks.GRAVEL_COPPER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_GOLD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_IRON_NUGGET_ORE);
    	/*
    	blockWithItem(OreGenBlocks.GRAVEL_BAUXITE_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_COBALT_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_IRIDIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_LEAD_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_NICKEL_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_PLATINUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_SILVER_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_TIN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_TUNGSTEN_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_URANIUM_NUGGET_ORE);
    	blockWithItem(OreGenBlocks.GRAVEL_ZINC_NUGGET_ORE);
    	*/
    	// Nether
    	blockWithItem(OreGenBlocks.NETHER_COAL_ORE);
    	blockWithItem(OreGenBlocks.NETHER_COPPER_ORE);
    	blockWithItem(OreGenBlocks.NETHER_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.NETHER_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.NETHER_GOLD_ORE);
    	blockWithItem(OreGenBlocks.NETHER_IRON_ORE);
    	blockWithItem(OreGenBlocks.NETHER_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.NETHER_LAPIS_ORE);
    	
    	blockWithItem(OreGenBlocks.NETHER_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.NETHER_COBALT_ORE);
    	blockWithItem(OreGenBlocks.NETHER_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.NETHER_LEAD_ORE);
    	blockWithItem(OreGenBlocks.NETHER_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.NETHER_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.NETHER_RUBY_ORE);
    	blockWithItem(OreGenBlocks.NETHER_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.NETHER_SILVER_ORE);
    	blockWithItem(OreGenBlocks.NETHER_TIN_ORE);
    	blockWithItem(OreGenBlocks.NETHER_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.NETHER_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.NETHER_ZINC_ORE);
    	blockWithItem(OreGenBlocks.NETHER_CHAOS_ORE);
    	
    	
    	// End
    	blockWithItem(OreGenBlocks.END_COAL_ORE);
    	blockWithItem(OreGenBlocks.END_COPPER_ORE);
    	blockWithItem(OreGenBlocks.END_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.END_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.END_GOLD_ORE);
    	blockWithItem(OreGenBlocks.END_IRON_ORE);
    	blockWithItem(OreGenBlocks.END_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.END_LAPIS_ORE);
    	blockWithItem(OreGenBlocks.END_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.END_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.END_COBALT_ORE);
    	blockWithItem(OreGenBlocks.END_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.END_LEAD_ORE);
    	blockWithItem(OreGenBlocks.END_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.END_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.END_RUBY_ORE);
    	blockWithItem(OreGenBlocks.END_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.END_SILVER_ORE);
    	blockWithItem(OreGenBlocks.END_TIN_ORE);
    	blockWithItem(OreGenBlocks.END_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.END_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.END_ZINC_ORE);
    	blockWithItem(OreGenBlocks.END_CHAOS_ORE);
    	
    	
    	// Solid Blocks
    	blockWithItem(OreGenBlocks.BAUXITE_BLOCK);
    	blockWithItem(OreGenBlocks.BRONZE_BLOCK);
    	blockWithItem(OreGenBlocks.COBALT_BLOCK);
    	blockWithItem(OreGenBlocks.IRIDIUM_BLOCK);
    	blockWithItem(OreGenBlocks.LEAD_BLOCK);
    	blockWithItem(OreGenBlocks.NICKEL_BLOCK);
    	blockWithItem(OreGenBlocks.PLATINUM_BLOCK);
    	blockWithItem(OreGenBlocks.RUBY_BLOCK);
    	blockWithItem(OreGenBlocks.SAPPHIRE_BLOCK);
    	blockWithItem(OreGenBlocks.SILVER_BLOCK);
    	blockWithItem(OreGenBlocks.TIN_BLOCK);
    	blockWithItem(OreGenBlocks.TUNGSTEN_BLOCK);
    	blockWithItem(OreGenBlocks.URANIUM_BLOCK);
    	blockWithItem(OreGenBlocks.ZINC_BLOCK);
    	
    	blockWithItem(OreGenBlocks.RAW_BAUXITE_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_COBALT_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_IRIDIUM_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_LEAD_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_NICKEL_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_PLATINUM_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_SILVER_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_TIN_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_TUNGSTEN_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_URANIUM_BLOCK);
    	blockWithItem(OreGenBlocks.RAW_ZINC_BLOCK);
    }
	
	private void blockWithItem(DeferredBlock<?> deferredBlock) 
    {
		String location = "block/", blockName = name(deferredBlock.get());
		
		if(blockName.contains("ore")) 
		{
			location += "ore/";
			
			if(blockName.contains("andesite")) 
			{
				location += "andesite/";
			}
			else if(blockName.contains("deepslate")) 
			{
				location += "deepslate/";
			}
			else if(blockName.contains("diorite")) 
			{
				location += "diorite/";
			}
			else if(blockName.contains("end")) 
			{
				location += "end/";
			}
			else if(blockName.contains("granite")) 
			{
				location += "granite/";
			}
			else if(blockName.contains("gravel")) 
			{
				location += "gravel/";
			}
			else if(blockName.contains("nether")) 
			{
				location += "nether/";
			}
			else if(blockName.contains("sand")) 
			{
				if(blockName.contains("sandstone")) 
				{
					location += "sandstone/";
				}
				else 
				{
					location += "sand/";
				}
			}
		}
		else if(blockName.contains("raw")) 
		{
			location += "raw/";
		}
		
        simpleBlockWithItem(deferredBlock.get(), models().cubeAll(name(deferredBlock.get()),
        		ResourceLocation.fromNamespaceAndPath(Reference.MODID, location + name(deferredBlock.get()))));
    }
	
	private String name(Block block) 
	{
        return key(block).getPath();
    }
	
	private ResourceLocation key(Block block) 
	{
        return BuiltInRegistries.BLOCK.getKey(block);
    }
    
    private void makeFlower(Block block, String name) 
    {
    	simpleBlockWithItem(block, models().cross(name, ResourceLocation.fromNamespaceAndPath(Reference.MODID, "item/" + name)).renderType("cutout"));
    }
    
    private void makeFlowerPotted(Block block, String name) 
    {
    	simpleBlockWithItem(block, models().singleTexture(name + "_potted", ResourceLocation.fromNamespaceAndPath("minecraft", "flower_pot_cross"),
    			"plant", ResourceLocation.fromNamespaceAndPath(Reference.MODID, "item/" + name)).renderType("cutout"));;
    }
}
