package com.gmail.rohzek.simpleoregen.data;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.CatVariant;

public record ModCatVariant(ResourceLocation texture) 
{/*
    //public static final StreamCodec<RegistryFriendlyByteBuf, Holder<CatVariant>> STREAM_CODEC = ByteBufCodecs.holderRegistry(Registries.CAT_VARIANT);
    //public static final ResourceKey<CatVariant> CHESHIRE = createKey("cheshire");

    private static ResourceKey<CatVariant> createKey(String name) 
    {
        //return ResourceKey.create(Registries.CAT_VARIANT, ResourceLocation.withDefaultNamespace(name));
    }

    public static void bootstrap(BootstrapContext<CatVariant> context)
    {
        //return register(context, CHESHIRE);
    }

    
    private static CatVariant register(BootstrapContext<CatVariant> registry, ResourceKey<CatVariant> key, String texture) 
    {
        return Registry.register(registry, key, new CatVariant(ResourceLocation.fromNamespaceAndPath(Reference.MODID, texture)));
    }
    
    
    private static void register(BootstrapContext<CatVariant> registry, ResourceKey<CatVariant> variant) 
    {
    	//registry.register(variant, variant.);
    }*/
}
