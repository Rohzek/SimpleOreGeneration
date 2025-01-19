package com.gmail.rohzek.simpleoregen.enchantments;

import com.gmail.rohzek.simpleoregen.enchantments.custom.MadnessEnchantment;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentTarget;

public class ModEnchantments 
{
	public static final ResourceKey<Enchantment> MADNESS = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(Reference.MODID, "madness_enchantment"));

    public static void bootstrap(BootstrapContext<Enchantment> context) 
    {
        var enchantments = context.lookup(Registries.ENCHANTMENT);
        var items = context.lookup(Registries.ITEM);
        //Enchantments.MENDING

        register(context, MADNESS, Enchantment.enchantment(Enchantment.definition(
                items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
                1,
                2,
                Enchantment.dynamicCost(50, 7),
                Enchantment.dynamicCost(75, 7),
                2,
                EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER, EnchantmentTarget.VICTIM, new MadnessEnchantment())
                );
        
        /*
         * .withEffect(
                    EnchantmentEffectComponents.ATTRIBUTES,
                    new EnchantmentAttributeEffect(
                        ResourceLocation.withDefaultNamespace("enchantment.efficiency"),
                        Attributes.MINING_EFFICIENCY,
                        new LevelBasedValue.LevelsSquared(1.0F),
                        AttributeModifier.Operation.ADD_VALUE
                    )
                )
         */
        
        /** Luck of the sea
         * .withEffect(EnchantmentEffectComponents.FISHING_TIME_REDUCTION, new AddValue(LevelBasedValue.perLevel(5.0F)))
         */
    }

    private static void register(BootstrapContext<Enchantment> registry, ResourceKey<Enchantment> key,
                                 Enchantment.Builder builder) {
        registry.register(key, builder.build(key.location()));
    }
}
