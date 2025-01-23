package com.gmail.rohzek.simpleoregen.items;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import com.gmail.rohzek.simpleoregen.items.itemtypes.OreGenHorseArmor;
import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.AnimalArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredItem;

public class VanillaTypeArmors 
{
	public static final Holder<ArmorMaterial> COPPER_ARMOR_MATERIAL = DeferredRegistration.ARMOR_MATERIALS.register("copper", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(Type.BOOTS, 2);
				map.put(Type.LEGGINGS, 5);
				map.put(Type.CHESTPLATE, 6);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 4);
			}),
			9,
			SoundEvents.ARMOR_EQUIP_GENERIC,
			() -> Ingredient.of(Tags.Items.INGOTS_COPPER),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "copper"))
			),
			0f,
			0f
	));
	
	public static final Holder<ArmorMaterial> EMERALD_ARMOR_MATERIAL = DeferredRegistration.ARMOR_MATERIALS.register("emerald", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(Type.BOOTS, 2);
				map.put(Type.LEGGINGS, 5);
				map.put(Type.CHESTPLATE, 6);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 4);
			}),
			9,
			SoundEvents.ARMOR_EQUIP_GENERIC,
			() -> Ingredient.of(Tags.Items.GEMS_EMERALD),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "emerald"))
			),
			0f,
			0f
	));
	
	public static final Holder<ArmorMaterial> OBSIDIAN_ARMOR_MATERIAL = DeferredRegistration.ARMOR_MATERIALS.register("obsidian", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(Type.BOOTS, 2);
				map.put(Type.LEGGINGS, 7);
				map.put(Type.CHESTPLATE, 8);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 10);
			}),
			9,
			SoundEvents.ARMOR_EQUIP_GENERIC,
			() -> Ingredient.of(Tags.Items.OBSIDIANS),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "obsidian"))
			),
			4f,
			0.3f
	));
	public static final Supplier<ArmorItem> COPPER_HELMET = DeferredRegistration.ITEMS.register("copper_helmet", () -> new ArmorItem(COPPER_ARMOR_MATERIAL, Type.HELMET, new Item.Properties().durability(Type.HELMET.getDurability(15))));
	public static final Supplier<ArmorItem> COPPER_CHESTPLATE = DeferredRegistration.ITEMS.register("copper_chestplate", () -> new ArmorItem(COPPER_ARMOR_MATERIAL, Type.CHESTPLATE, new Item.Properties().durability(Type.CHESTPLATE.getDurability(15))));
	public static final Supplier<ArmorItem> COPPER_LEGGINGS = DeferredRegistration.ITEMS.register("copper_leggings", () -> new ArmorItem(COPPER_ARMOR_MATERIAL, Type.LEGGINGS, new Item.Properties().durability(Type.LEGGINGS.getDurability(15))));
	public static final Supplier<ArmorItem> COPPER_BOOTS = DeferredRegistration.ITEMS.register("copper_boots", () -> new ArmorItem(COPPER_ARMOR_MATERIAL, Type.BOOTS, new Item.Properties().durability(Type.BOOTS.getDurability(15))));

	public static final Supplier<AnimalArmorItem> COPPER_HORSE_ARMOR = DeferredRegistration.ITEMS.register("copper_horse_armor", () -> new OreGenHorseArmor(COPPER_ARMOR_MATERIAL, "copper"));
	
	public static final Supplier<ArmorItem> EMERALD_HELMET = DeferredRegistration.ITEMS.register("emerald_helmet", () -> new ArmorItem(EMERALD_ARMOR_MATERIAL, Type.HELMET, new Item.Properties().durability(Type.HELMET.getDurability(15))));
	public static final Supplier<ArmorItem> EMERALD_CHESTPLATE = DeferredRegistration.ITEMS.register("emerald_chestplate", () -> new ArmorItem(EMERALD_ARMOR_MATERIAL, Type.CHESTPLATE, new Item.Properties().durability(Type.CHESTPLATE.getDurability(15))));
	public static final Supplier<ArmorItem> EMERALD_LEGGINGS = DeferredRegistration.ITEMS.register("emerald_leggings", () -> new ArmorItem(EMERALD_ARMOR_MATERIAL, Type.LEGGINGS, new Item.Properties().durability(Type.LEGGINGS.getDurability(15))));
	public static final Supplier<ArmorItem> EMERALD_BOOTS = DeferredRegistration.ITEMS.register("emerald_boots", () -> new ArmorItem(EMERALD_ARMOR_MATERIAL, Type.BOOTS, new Item.Properties().durability(Type.BOOTS.getDurability(15))));

	public static final Supplier<AnimalArmorItem> EMERALD_HORSE_ARMOR = DeferredRegistration.ITEMS.register("emerald_horse_armor", () -> new OreGenHorseArmor(EMERALD_ARMOR_MATERIAL, "emerald"));
	
	public static final Supplier<ArmorItem> OBSIDIAN_HELMET = DeferredRegistration.ITEMS.register("obsidian_helmet", () -> new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, Type.HELMET, new Item.Properties().durability(Type.HELMET.getDurability(15))));
	public static final Supplier<ArmorItem> OBSIDIAN_CHESTPLATE = DeferredRegistration.ITEMS.register("obsidian_chestplate", () -> new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, Type.CHESTPLATE, new Item.Properties().durability(Type.CHESTPLATE.getDurability(15))));
	public static final Supplier<ArmorItem> OBSIDIAN_LEGGINGS = DeferredRegistration.ITEMS.register("obsidian_leggings", () -> new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, Type.LEGGINGS, new Item.Properties().durability(Type.LEGGINGS.getDurability(15))));
	public static final Supplier<ArmorItem> OBSIDIAN_BOOTS = DeferredRegistration.ITEMS.register("obsidian_boots", () -> new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, Type.BOOTS, new Item.Properties().durability(Type.BOOTS.getDurability(15))));

	public static final Supplier<AnimalArmorItem> OBSIDIAN_HORSE_ARMOR = DeferredRegistration.ITEMS.register("obsidian_horse_armor", () -> new OreGenHorseArmor(OBSIDIAN_ARMOR_MATERIAL, "obsidian"));
	
	
	public static final DeferredItem<AnimalArmorItem> NETHERITE_HORSE_ARMOR = DeferredRegistration.ITEMS.register("netherite_horse_armor", () -> new OreGenHorseArmor(ArmorMaterials.NETHERITE, "netherite"));
	
	public static void register() {}
}
