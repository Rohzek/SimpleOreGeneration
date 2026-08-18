package com.gmail.rohzek.simpleoregen.data;

import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.CatVariant;

public class ModCatVariant 
{
    public static final ResourceKey<CatVariant> CHESHIRE_CAT = ResourceKey.create
    (
        Registries.CAT_VARIANT, 
        ResourceLocation.fromNamespaceAndPath(Reference.MODID, "cheshire_cat_variant")
    );

    public static void bootstrap(BootstrapContext<CatVariant> context)
    {
        context.register(CHESHIRE_CAT, new CatVariant
        (
            ResourceLocation.fromNamespaceAndPath(Reference.MODID, "cheshire_cat_variant")
        ));
    }
}