package com.gmail.rohzek.simpleoregen.data;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.gmail.rohzek.simpleoregen.lib.Reference;
import com.gmail.rohzek.simpleoregen.world.ModBiomeModifiers;
import com.gmail.rohzek.simpleoregen.world.ModConfiguredFeatures;
import com.gmail.rohzek.simpleoregen.world.ModPlacedFeatures;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider 
{
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);

    public ModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) 
    {
        super(output, registries, BUILDER, Set.of(Reference.MODID));
    }
}
