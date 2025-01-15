package com.gmail.rohzek.simpleoregen.datagen;

import java.util.function.Function;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
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
    	makeFlower(WorldGenBlocks.CHESHIRE_ROSE_FLOWER.get(), "cheshirerose", "cheshirerose");
    	makeFlower(WorldGenBlocks.ROSE_FLOWER.get(), "rose", "rose");
    	makeFlower(WorldGenBlocks.ROSE_CYAN_FLOWER.get(), "rose_cyan", "rose_cyan");
    	
    	// Stone
    	blockWithItem(OreGenBlocks.SURFACE_QUARTZ_ORE);
    	
    	blockWithItem(OreGenBlocks.SURFACE_ALUMINUM_ORE);
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
    	
    	blockWithItem(OreGenBlocks.SURFACE_DEEPSLATE_ALUMINUM_ORE);
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
    	
    	// Nether
    	blockWithItem(OreGenBlocks.NETHER_COAL_ORE);
    	blockWithItem(OreGenBlocks.NETHER_COPPER_ORE);
    	blockWithItem(OreGenBlocks.NETHER_DIAMOND_ORE);
    	blockWithItem(OreGenBlocks.NETHER_EMERALD_ORE);
    	blockWithItem(OreGenBlocks.NETHER_GOLD_ORE);
    	blockWithItem(OreGenBlocks.NETHER_IRON_ORE);
    	blockWithItem(OreGenBlocks.NETHER_REDSTONE_ORE);
    	blockWithItem(OreGenBlocks.NETHER_LAPIS_ORE);
    	
    	blockWithItem(OreGenBlocks.NETHER_ALUMINUM_ORE);
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
    	
    	blockWithItem(OreGenBlocks.END_ALUMINUM_ORE);
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
    	blockWithItem(OreGenBlocks.ALUMINUM_BLOCK);
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
    	
    	blockWithItem(OreGenBlocks.RAW_ALUMINUM_BLOCK);
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
    
    private void makeFlower(Block block, String name, String texture) 
    {
    	Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, name, texture);

        getVariantBuilder(block).forAllStates(function);
    }
    
    private ConfiguredModel[] states(BlockState state, Block block, String modelName, String textureName) 
    {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName,
                ResourceLocation.fromNamespaceAndPath(Reference.MODID, "block/" + textureName)).renderType("cutout"));

        return models;
    }
}
