package com.gmail.rohzek.simpleoregen.entity;

import java.util.function.Supplier;

import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities 
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Reference.MODID);

    public static final Supplier<EntityType<CheshireCat>> CHESHIRE_CAT =
            ENTITY_TYPES.register("cheshire_cat", () -> EntityType.Builder.of(CheshireCat::new, MobCategory.CREATURE)
                    .sized(0.6F, 0.7F).eyeHeight(0.35F).passengerAttachments(0.5125F).clientTrackingRange(8).build("cheshire_cat"));

    public static void register(IEventBus eventBus) 
    {
        //ENTITY_TYPES.register(eventBus);
    }
}
