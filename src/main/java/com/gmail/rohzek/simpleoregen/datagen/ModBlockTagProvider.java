package com.gmail.rohzek.simpleoregen.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider 
{
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) 
    {
        super(output, lookupProvider, Reference.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) 
    {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
        // Surface
                .add(OreGenBlocks.SURFACE_QUARTZ_ORE.get())
                .add(OreGenBlocks.SURFACE_ALUMINUM_ORE.get())
                .add(OreGenBlocks.SURFACE_COBALT_ORE.get())
                .add(OreGenBlocks.SURFACE_IRIDIUM_ORE.get())
                .add(OreGenBlocks.SURFACE_LEAD_ORE.get())
                .add(OreGenBlocks.SURFACE_NICKEL_ORE.get())
                .add(OreGenBlocks.SURFACE_PLATINUM_ORE.get())
                .add(OreGenBlocks.SURFACE_RUBY_ORE.get())
                .add(OreGenBlocks.SURFACE_SAPPHIRE_ORE.get())
                .add(OreGenBlocks.SURFACE_SILVER_ORE.get())
                .add(OreGenBlocks.SURFACE_TIN_ORE.get())
                .add(OreGenBlocks.SURFACE_TUNGSTEN_ORE.get())
                .add(OreGenBlocks.SURFACE_URANIUM_ORE.get())
                .add(OreGenBlocks.SURFACE_ZINC_ORE.get())
        // Deepslate
                .add(OreGenBlocks.SURFACE_DEEPSLATE_QUARTZ_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_ALUMINUM_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_COBALT_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_IRIDIUM_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_LEAD_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_NICKEL_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_PLATINUM_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_RUBY_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_SAPPHIRE_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_SILVER_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_TIN_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_TUNGSTEN_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_URANIUM_ORE.get())
                .add(OreGenBlocks.SURFACE_DEEPSLATE_ZINC_ORE.get())
        // Nether
                .add(OreGenBlocks.NETHER_COAL_ORE.get())
        		.add(OreGenBlocks.NETHER_COPPER_ORE.get())
        		.add(OreGenBlocks.NETHER_DIAMOND_ORE.get())
        		.add(OreGenBlocks.NETHER_EMERALD_ORE.get())
        		.add(OreGenBlocks.NETHER_GOLD_ORE.get())
        		.add(OreGenBlocks.NETHER_IRON_ORE.get())
        		.add(OreGenBlocks.NETHER_REDSTONE_ORE.get())
        		.add(OreGenBlocks.NETHER_LAPIS_ORE.get())
        
        		.add(OreGenBlocks.NETHER_ALUMINUM_ORE.get())
        		.add(OreGenBlocks.NETHER_COBALT_ORE.get())
        		.add(OreGenBlocks.NETHER_IRIDIUM_ORE.get())
        		.add(OreGenBlocks.NETHER_LEAD_ORE.get())
        		.add(OreGenBlocks.NETHER_NICKEL_ORE.get())
        		.add(OreGenBlocks.NETHER_PLATINUM_ORE.get())
        		.add(OreGenBlocks.NETHER_RUBY_ORE.get())
        		.add(OreGenBlocks.NETHER_SAPPHIRE_ORE.get())
        		.add(OreGenBlocks.NETHER_SILVER_ORE.get())
        		.add(OreGenBlocks.NETHER_TIN_ORE.get())
        		.add(OreGenBlocks.NETHER_TUNGSTEN_ORE.get())
        		.add(OreGenBlocks.NETHER_URANIUM_ORE.get())
        		.add(OreGenBlocks.NETHER_ZINC_ORE.get())
        // End
        		.add(OreGenBlocks.END_COAL_ORE.get())
        		.add(OreGenBlocks.END_COPPER_ORE.get())
        		.add(OreGenBlocks.END_DIAMOND_ORE.get())
        		.add(OreGenBlocks.END_EMERALD_ORE.get())
        		.add(OreGenBlocks.END_GOLD_ORE.get())
        		.add(OreGenBlocks.END_IRON_ORE.get())
        		.add(OreGenBlocks.END_REDSTONE_ORE.get())
        		.add(OreGenBlocks.END_LAPIS_ORE.get())
        		.add(OreGenBlocks.END_QUARTZ_ORE.get())
        
        		.add(OreGenBlocks.END_ALUMINUM_ORE.get())
        		.add(OreGenBlocks.END_COBALT_ORE.get())
        		.add(OreGenBlocks.END_IRIDIUM_ORE.get())
        		.add(OreGenBlocks.END_LEAD_ORE.get())
        		.add(OreGenBlocks.END_NICKEL_ORE.get())
        		.add(OreGenBlocks.END_PLATINUM_ORE.get())
        		.add(OreGenBlocks.END_RUBY_ORE.get())
        		.add(OreGenBlocks.END_SAPPHIRE_ORE.get())
        		.add(OreGenBlocks.END_SILVER_ORE.get())
        		.add(OreGenBlocks.END_TIN_ORE.get())
        		.add(OreGenBlocks.END_TUNGSTEN_ORE.get())
        		.add(OreGenBlocks.END_URANIUM_ORE.get())
        		.add(OreGenBlocks.END_ZINC_ORE.get())
        // Solid Blocks
        		.add(OreGenBlocks.ALUMINUM_BLOCK.get())
        		.add(OreGenBlocks.BRONZE_BLOCK.get())
        		.add(OreGenBlocks.COBALT_BLOCK.get())
        		.add(OreGenBlocks.IRIDIUM_BLOCK.get())
        		.add(OreGenBlocks.LEAD_BLOCK.get())
        		.add(OreGenBlocks.NICKEL_BLOCK.get())
        		.add(OreGenBlocks.PLATINUM_BLOCK.get())
        		.add(OreGenBlocks.RUBY_BLOCK.get())
        		.add(OreGenBlocks.SAPPHIRE_BLOCK.get())
        		.add(OreGenBlocks.SILVER_BLOCK.get())
        		.add(OreGenBlocks.TIN_BLOCK.get())
        		.add(OreGenBlocks.TUNGSTEN_BLOCK.get())
        		.add(OreGenBlocks.URANIUM_BLOCK.get())
        		.add(OreGenBlocks.ZINC_BLOCK.get())
        
        		.add(OreGenBlocks.RAW_ALUMINUM_BLOCK.get())
        		.add(OreGenBlocks.RAW_COBALT_BLOCK.get())
        		.add(OreGenBlocks.RAW_IRIDIUM_BLOCK.get())
        		.add(OreGenBlocks.RAW_LEAD_BLOCK.get())
        		.add(OreGenBlocks.RAW_NICKEL_BLOCK.get())
        		.add(OreGenBlocks.RAW_PLATINUM_BLOCK.get())
        		.add(OreGenBlocks.RAW_SILVER_BLOCK.get())
        		.add(OreGenBlocks.RAW_TIN_BLOCK.get())
        		.add(OreGenBlocks.RAW_TUNGSTEN_BLOCK.get())
        		.add(OreGenBlocks.RAW_URANIUM_BLOCK.get())
        		.add(OreGenBlocks.RAW_ZINC_BLOCK.get());
        
        //tag(BlockTags.NEEDS_IRON_TOOL)
        		//.add(ModBlocks.BISMUTH_DEEPSLATE_ORE.get());
        
        tag(BlockTags.COAL_ORES)
    		.add(OreGenBlocks.NETHER_COAL_ORE.get())
    		.add(OreGenBlocks.END_COAL_ORE.get());
        
        tag(BlockTags.COPPER_ORES)
			.add(OreGenBlocks.NETHER_COPPER_ORE.get())
			.add(OreGenBlocks.END_COPPER_ORE.get());
        
        tag(BlockTags.DIAMOND_ORES)
    		.add(OreGenBlocks.NETHER_DIAMOND_ORE.get())
    		.add(OreGenBlocks.END_DIAMOND_ORE.get());
        
        tag(BlockTags.EMERALD_ORES)
			.add(OreGenBlocks.NETHER_EMERALD_ORE.get())
			.add(OreGenBlocks.END_EMERALD_ORE.get());
        
        tag(BlockTags.GOLD_ORES)
			.add(OreGenBlocks.NETHER_GOLD_ORE.get())
			.add(OreGenBlocks.END_GOLD_ORE.get());
        
        tag(BlockTags.IRON_ORES)
			.add(OreGenBlocks.NETHER_IRON_ORE.get())
			.add(OreGenBlocks.END_IRON_ORE.get());
        
        tag(BlockTags.LAPIS_ORES)
    		.add(OreGenBlocks.NETHER_LAPIS_ORE.get())
    		.add(OreGenBlocks.END_LAPIS_ORE.get());
        
        tag(BlockTags.REDSTONE_ORES)
    		.add(OreGenBlocks.NETHER_REDSTONE_ORE.get())
    		.add(OreGenBlocks.END_REDSTONE_ORE.get());
        
        tag(BlockTags.GUARDED_BY_PIGLINS)
        	.add(OreGenBlocks.NETHER_COAL_ORE.get())
        	.add(OreGenBlocks.NETHER_COPPER_ORE.get())
        	.add(OreGenBlocks.NETHER_DIAMOND_ORE.get())
        	.add(OreGenBlocks.NETHER_EMERALD_ORE.get())
        	.add(OreGenBlocks.NETHER_GOLD_ORE.get())
        	.add(OreGenBlocks.NETHER_IRON_ORE.get())
        	.add(OreGenBlocks.NETHER_REDSTONE_ORE.get())
        	.add(OreGenBlocks.NETHER_LAPIS_ORE.get())

        	.add(OreGenBlocks.NETHER_ALUMINUM_ORE.get())
        	.add(OreGenBlocks.NETHER_COBALT_ORE.get())
        	.add(OreGenBlocks.NETHER_IRIDIUM_ORE.get())
        	.add(OreGenBlocks.NETHER_LEAD_ORE.get())
        	.add(OreGenBlocks.NETHER_NICKEL_ORE.get())
        	.add(OreGenBlocks.NETHER_PLATINUM_ORE.get())
        	.add(OreGenBlocks.NETHER_RUBY_ORE.get())
        	.add(OreGenBlocks.NETHER_SAPPHIRE_ORE.get())
        	.add(OreGenBlocks.NETHER_SILVER_ORE.get())
        	.add(OreGenBlocks.NETHER_TIN_ORE.get())
        	.add(OreGenBlocks.NETHER_TUNGSTEN_ORE.get())
        	.add(OreGenBlocks.NETHER_URANIUM_ORE.get())
        	.add(OreGenBlocks.NETHER_ZINC_ORE.get());
        
        tag(BlockTags.FLOWERS)
        		.add(WorldGenBlocks.CHESHIRE_ROSE_FLOWER.get())
        		.add(WorldGenBlocks.ROSE_FLOWER.get())
        		.add(WorldGenBlocks.ROSE_CYAN_FLOWER.get());
        
        tag(BlockTags.SMALL_FLOWERS)
			.add(WorldGenBlocks.CHESHIRE_ROSE_FLOWER.get())
			.add(WorldGenBlocks.ROSE_FLOWER.get())
			.add(WorldGenBlocks.ROSE_CYAN_FLOWER.get());
        
        //tag(BlockTags.FLOWER_POTS);
    }
}
