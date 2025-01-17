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
		
		tag(OreGenTags.Biomes.ALL_BIOMES)
    	.add(Biomes.BADLANDS)
    	.add(Biomes.BAMBOO_JUNGLE)
    	.add(Biomes.BASALT_DELTAS)
    	.add(Biomes.BEACH)
    	.add(Biomes.BIRCH_FOREST)
    	.add(Biomes.CHERRY_GROVE)
    	.add(Biomes.COLD_OCEAN)
    	.add(Biomes.CRIMSON_FOREST)
    	.add(Biomes.DARK_FOREST)
    	.add(Biomes.DEEP_COLD_OCEAN)
    	.add(Biomes.DEEP_DARK)
    	.add(Biomes.DEEP_FROZEN_OCEAN)
    	.add(Biomes.DEEP_LUKEWARM_OCEAN)
    	.add(Biomes.DEEP_OCEAN)
    	.add(Biomes.DESERT)
    	.add(Biomes.DRIPSTONE_CAVES)
    	.add(Biomes.END_BARRENS)
    	.add(Biomes.END_HIGHLANDS)
    	.add(Biomes.END_MIDLANDS)
    	.add(Biomes.ERODED_BADLANDS)
    	.add(Biomes.FLOWER_FOREST)
    	.add(Biomes.FOREST)
    	.add(Biomes.FROZEN_OCEAN)
    	.add(Biomes.FROZEN_PEAKS)
    	.add(Biomes.FROZEN_RIVER)
    	.add(Biomes.GROVE)
    	.add(Biomes.ICE_SPIKES)
    	.add(Biomes.JAGGED_PEAKS)
    	.add(Biomes.JUNGLE)
    	.add(Biomes.LUKEWARM_OCEAN)
    	.add(Biomes.LUSH_CAVES)
    	.add(Biomes.MANGROVE_SWAMP)
    	.add(Biomes.MEADOW)
    	.add(Biomes.MUSHROOM_FIELDS)
    	.add(Biomes.NETHER_WASTES)
    	.add(Biomes.OCEAN)
    	.add(Biomes.OLD_GROWTH_BIRCH_FOREST)
    	.add(Biomes.OLD_GROWTH_PINE_TAIGA)
    	.add(Biomes.OLD_GROWTH_SPRUCE_TAIGA)
    	.add(Biomes.PLAINS)
    	.add(Biomes.RIVER)
    	.add(Biomes.SAVANNA)
    	.add(Biomes.SAVANNA_PLATEAU)
    	.add(Biomes.SMALL_END_ISLANDS)
    	.add(Biomes.SNOWY_BEACH)
    	.add(Biomes.SNOWY_PLAINS)
    	.add(Biomes.SNOWY_SLOPES)
    	.add(Biomes.SNOWY_TAIGA)
    	.add(Biomes.SOUL_SAND_VALLEY)
    	.add(Biomes.SPARSE_JUNGLE)
    	.add(Biomes.STONY_PEAKS)
    	.add(Biomes.STONY_SHORE)
    	.add(Biomes.SUNFLOWER_PLAINS)
    	.add(Biomes.SWAMP)
    	.add(Biomes.TAIGA)
    	.add(Biomes.THE_END)
    	.add(Biomes.THE_VOID)
    	.add(Biomes.WARM_OCEAN)
    	.add(Biomes.WARPED_FOREST)
    	.add(Biomes.WINDSWEPT_FOREST)
    	.add(Biomes.WINDSWEPT_GRAVELLY_HILLS)
    	.add(Biomes.WINDSWEPT_HILLS)
    	.add(Biomes.WINDSWEPT_SAVANNA)
    	.add(Biomes.WOODED_BADLANDS);
	}
}
