package com.gmail.rohzek.simpleoregen.data;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.world.level.biome.Biomes;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBiomeTagProvider extends BiomeTagsProvider
{

	public ModBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) 
    {
        super(output, lookupProvider, Reference.MODID, existingFileHelper);
    }
	
	@Override
	protected void addTags(Provider provider) 
	{
		tag(OreGenTags.Biomes.CHESHIREROSE_BIOMES)
    	.add(Biomes.BIRCH_FOREST)
    	.add(Biomes.BAMBOO_JUNGLE)
    	.add(Biomes.CHERRY_GROVE)
    	.add(Biomes.FLOWER_FOREST)
    	.add(Biomes.FOREST)
    	.add(Biomes.JUNGLE)
    	.add(Biomes.MEADOW)
    	.add(Biomes.MUSHROOM_FIELDS)
    	.add(Biomes.PLAINS)
    	.add(Biomes.OLD_GROWTH_BIRCH_FOREST)
    	.add(Biomes.OLD_GROWTH_PINE_TAIGA)
    	.add(Biomes.OLD_GROWTH_SPRUCE_TAIGA)
    	.add(Biomes.SAVANNA)
    	.add(Biomes.SAVANNA_PLATEAU)
    	.add(Biomes.SPARSE_JUNGLE)
    	.add(Biomes.WINDSWEPT_FOREST)
    	.add(Biomes.WINDSWEPT_GRAVELLY_HILLS)
    	.add(Biomes.WINDSWEPT_HILLS)
    	.add(Biomes.WINDSWEPT_SAVANNA);
		
		tag(OreGenTags.Biomes.ROSE_BIOMES)
    	.add(Biomes.BIRCH_FOREST)
    	.add(Biomes.BAMBOO_JUNGLE)
    	.add(Biomes.FLOWER_FOREST)
    	.add(Biomes.FOREST)
    	.add(Biomes.JUNGLE)
    	.add(Biomes.MEADOW)
    	.add(Biomes.PLAINS)
    	.add(Biomes.OLD_GROWTH_BIRCH_FOREST)
    	.add(Biomes.SAVANNA)
    	.add(Biomes.SAVANNA_PLATEAU)
    	.add(Biomes.SPARSE_JUNGLE)
    	.add(Biomes.WINDSWEPT_FOREST)
    	.add(Biomes.WINDSWEPT_GRAVELLY_HILLS)
    	.add(Biomes.WINDSWEPT_HILLS)
    	.add(Biomes.WINDSWEPT_SAVANNA);
	}
}
