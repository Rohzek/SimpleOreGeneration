package com.gmail.rohzek.simpleoregen.enchantments;

import java.util.function.Supplier;

import com.gmail.rohzek.simpleoregen.enchantments.custom.MadnessEnchantment;
import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;
import com.mojang.serialization.MapCodec;

import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;

public class ModEnchantmentEffects 
{
	public static final Supplier<MapCodec<? extends EnchantmentEntityEffect>> MADNESS = 
			DeferredRegistration.ENTITY_ENCHANTMENT_EFFECT.register("madness_enchantment_effect", () -> MadnessEnchantment.CODEC);
	
	public static void register() {}
}
