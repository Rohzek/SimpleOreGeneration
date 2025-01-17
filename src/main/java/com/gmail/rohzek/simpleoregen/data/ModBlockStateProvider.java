package com.gmail.rohzek.simpleoregen.data;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.lib.Reference;

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
    	
    	// Deepslate
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_BAUXITE_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_COBALT_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_IRIDIUM_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_LEAD_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_NICKEL_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_PLATINUM_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_RUBY_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_SAPPHIRE_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_SILVER_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_TIN_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_TUNGSTEN_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_URANIUM_ORE);
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_ZINC_ORE);
    	
    	// Andesite
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
    	
    	// Diorite
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
    	
    	// Granite
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
    	
    	// Sandstone
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
    	
    	// Sand
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
    	
    	// Gravel
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
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    
    private void makeFlower(Block block, String name) 
    {
    	simpleBlockWithItem(block, models().cross(name, ResourceLocation.fromNamespaceAndPath(Reference.MODID, "item/" + name)).renderType("cutout"));;
    }
    
    private void makeFlowerPotted(Block block, String name) 
    {
    	simpleBlockWithItem(block, models().singleTexture(name + "_potted", ResourceLocation.fromNamespaceAndPath("minecraft", "flower_pot_cross"),
    			"plant", ResourceLocation.fromNamespaceAndPath(Reference.MODID, "item/" + name)).renderType("cutout"));;
    }
}
