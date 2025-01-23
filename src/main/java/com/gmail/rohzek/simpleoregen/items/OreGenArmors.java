package com.gmail.rohzek.simpleoregen.items;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import com.gmail.rohzek.simpleoregen.items.itemtypes.OreGenArmor;
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
import net.minecraft.world.item.crafting.Ingredient;

public class OreGenArmors 
{
	/**
	 * Materials
	 */
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_BAUXITE = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_bauxite", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 1);
				map.put(Type.LEGGINGS, 4);
				map.put(Type.CHESTPLATE, 5);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 4);
			}),
			12,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.BAUXITE_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "bauxite"))
			),
			0f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_BRONZE = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_bronze", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 3);
				map.put(Type.LEGGINGS, 6);
				map.put(Type.CHESTPLATE, 7);
				map.put(Type.HELMET, 3);
				map.put(Type.BODY, 5);
			}),
			11,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.BRONZE_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "bronze"))
			),
			3f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_COBALT = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_cobalt", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 2);
				map.put(Type.LEGGINGS, 5);
				map.put(Type.CHESTPLATE, 6);
				map.put(Type.HELMET, 3);
				map.put(Type.BODY, 5);
			}),
			12,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.COBALT_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "cobalt"))
			),
			1f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_IRIDIUM = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_iridium", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 3);
				map.put(Type.LEGGINGS, 5);
				map.put(Type.CHESTPLATE, 5);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 4);
			}),
			25,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.IRIDIUM_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "iridium"))
			),
			1f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_LEAD = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_lead", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 3);
				map.put(Type.LEGGINGS, 6);
				map.put(Type.CHESTPLATE, 8);
				map.put(Type.HELMET, 3);
				map.put(Type.BODY, 10);
			}),
			12,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.LEAD_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "lead"))
			),
			2f,
			0.2f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_NICKEL = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_nickel", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 3);
				map.put(Type.LEGGINGS, 5);
				map.put(Type.CHESTPLATE, 5);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 6);
			}),
			9,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.NICKEL_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "nickel"))
			),
			0f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_PLATINUM = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_platinum", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 1);
				map.put(Type.LEGGINGS, 3);
				map.put(Type.CHESTPLATE, 5);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 7);
			}),
			25,
			SoundEvents.ARMOR_EQUIP_GOLD,
			() -> Ingredient.of(OreGenItems.PLATINUM_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "platinum"))
			),
			1f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_RUBY = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_ruby", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 1);
				map.put(Type.LEGGINGS, 4);
				map.put(Type.CHESTPLATE, 5);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 7);
			}),
			25,
			SoundEvents.ARMOR_EQUIP_GOLD,
			() -> Ingredient.of(OreGenItems.RUBY),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "ruby"))
			),
			0f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_SAPPHIRE = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_sapphire", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 1);
				map.put(Type.LEGGINGS, 4);
				map.put(Type.CHESTPLATE, 5);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 7);
			}),
			25,
			SoundEvents.ARMOR_EQUIP_GOLD,
			() -> Ingredient.of(OreGenItems.SAPPHIRE),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "sapphire"))
			),
			0f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_SILVER = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_silver", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 1);
				map.put(Type.LEGGINGS, 4);
				map.put(Type.CHESTPLATE, 5);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 7);
			}),
			25,
			SoundEvents.ARMOR_EQUIP_GOLD,
			() -> Ingredient.of(OreGenItems.SILVER_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "silver"))
			),
			0f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_STEEL = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_steel", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 3);
				map.put(Type.LEGGINGS, 6);
				map.put(Type.CHESTPLATE, 7);
				map.put(Type.HELMET, 3);
				map.put(Type.BODY, 10);
			}),
			12,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.STEEL_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "steel"))
			),
			2f,
			0.2f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_TIN = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_tin", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 1);
				map.put(Type.LEGGINGS, 4);
				map.put(Type.CHESTPLATE, 5);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 4);
			}),
			19,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.TIN_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "tin"))
			),
			0f,
			0f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_TUNGSTEN = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_tungsten", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 3);
				map.put(Type.LEGGINGS, 5);
				map.put(Type.CHESTPLATE, 6);
				map.put(Type.HELMET, 3);
				map.put(Type.BODY, 5);
			}),
			11,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.TUNGSTEN_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "tungsten"))
			),
			2f,
			0.2f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_URANIUM = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_uranium", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 3);
				map.put(Type.LEGGINGS, 6);
				map.put(Type.CHESTPLATE, 8);
				map.put(Type.HELMET, 3);
				map.put(Type.BODY, 6);
			}),
			21,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.URANIUM_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "uranium"))
			),
			2f,
			0.1f
	));
	
	public static final Holder<ArmorMaterial> ARMOR_MATERIAL_ZINC = DeferredRegistration.ARMOR_MATERIALS.register("armor_material_zinc", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> 
			{
				map.put(Type.BOOTS, 2);
				map.put(Type.LEGGINGS, 5);
				map.put(Type.CHESTPLATE, 6);
				map.put(Type.HELMET, 3);
				map.put(Type.BODY, 5);
			}),
			11,
			SoundEvents.ARMOR_EQUIP_IRON,
			() -> Ingredient.of(OreGenItems.ZINC_INGOT),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "zinc"))
			),
			0f,
			0f
	));
	
	/**
	 * Armors
	 */
	
	public static final Supplier<ArmorItem> BAUXITE_HELMET = DeferredRegistration.ITEMS.register("bauxite_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_BAUXITE, Type.HELMET, 5));
	public static final Supplier<ArmorItem> BRONZE_HELMET = DeferredRegistration.ITEMS.register("bronze_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_BRONZE, Type.HELMET, 15));
	public static final Supplier<ArmorItem> COBALT_HELMET = DeferredRegistration.ITEMS.register("cobalt_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_COBALT, Type.HELMET, 16));
	public static final Supplier<ArmorItem> IRIDIUM_HELMET = DeferredRegistration.ITEMS.register("iridium_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_IRIDIUM, Type.HELMET, 13));
	public static final Supplier<ArmorItem> LEAD_HELMET = DeferredRegistration.ITEMS.register("lead_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_LEAD, Type.HELMET, 15));
	public static final Supplier<ArmorItem> NICKEL_HELMET = DeferredRegistration.ITEMS.register("nickel_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_NICKEL, Type.HELMET, 13));
	public static final Supplier<ArmorItem> PLATINUM_HELMET = DeferredRegistration.ITEMS.register("platinum_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_PLATINUM, Type.HELMET, 11));
	public static final Supplier<ArmorItem> RUBY_HELMET = DeferredRegistration.ITEMS.register("sapphire_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_RUBY, Type.HELMET, 11));
	public static final Supplier<ArmorItem> SAPPHIRE_HELMET = DeferredRegistration.ITEMS.register("ruby_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_SAPPHIRE, Type.HELMET, 11));
	public static final Supplier<ArmorItem> SILVER_HELMET = DeferredRegistration.ITEMS.register("silver_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_SILVER, Type.HELMET, 11));
	public static final Supplier<ArmorItem> STEEL_HELMET = DeferredRegistration.ITEMS.register("steel_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_STEEL, Type.HELMET, 18));
	public static final Supplier<ArmorItem> TIN_HELMET = DeferredRegistration.ITEMS.register("tin_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_TIN, Type.HELMET, 8));
	public static final Supplier<ArmorItem> TUNGSTEN_HELMET = DeferredRegistration.ITEMS.register("tungsten_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_TUNGSTEN, Type.HELMET, 17));
	public static final Supplier<ArmorItem> URANIUM_HELMET = DeferredRegistration.ITEMS.register("uranium_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_URANIUM, Type.HELMET, 155));
	public static final Supplier<ArmorItem> ZINC_HELMET = DeferredRegistration.ITEMS.register("zinc_helmet", () -> new OreGenArmor(ARMOR_MATERIAL_ZINC, Type.HELMET, 13));
	
	public static final Supplier<ArmorItem> BAUXITE_CHESTPLATE = DeferredRegistration.ITEMS.register("bauxite_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_BAUXITE, Type.CHESTPLATE, 5));
	public static final Supplier<ArmorItem> BRONZE_CHESTPLATE = DeferredRegistration.ITEMS.register("bronze_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_BRONZE, Type.CHESTPLATE, 15));
	public static final Supplier<ArmorItem> COBALT_CHESTPLATE = DeferredRegistration.ITEMS.register("cobalt_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_COBALT, Type.CHESTPLATE, 16));
	public static final Supplier<ArmorItem> IRIDIUM_CHESTPLATE = DeferredRegistration.ITEMS.register("iridium_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_IRIDIUM, Type.CHESTPLATE, 13));
	public static final Supplier<ArmorItem> LEAD_CHESTPLATE = DeferredRegistration.ITEMS.register("lead_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_LEAD, Type.CHESTPLATE, 15));
	public static final Supplier<ArmorItem> NICKEL_CHESTPLATE = DeferredRegistration.ITEMS.register("nickel_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_NICKEL, Type.CHESTPLATE, 13));
	public static final Supplier<ArmorItem> PLATINUM_CHESTPLATE = DeferredRegistration.ITEMS.register("platinum_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_PLATINUM, Type.CHESTPLATE, 11));
	public static final Supplier<ArmorItem> RUBY_CHESTPLATE = DeferredRegistration.ITEMS.register("sapphire_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_RUBY, Type.CHESTPLATE, 11));
	public static final Supplier<ArmorItem> SAPPHIRE_CHESTPLATE = DeferredRegistration.ITEMS.register("ruby_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_SAPPHIRE, Type.CHESTPLATE, 11));
	public static final Supplier<ArmorItem> SILVER_CHESTPLATE = DeferredRegistration.ITEMS.register("silver_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_SILVER, Type.CHESTPLATE, 11));
	public static final Supplier<ArmorItem> STEEL_CHESTPLATE = DeferredRegistration.ITEMS.register("steel_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_STEEL, Type.CHESTPLATE, 18));
	public static final Supplier<ArmorItem> TIN_CHESTPLATE = DeferredRegistration.ITEMS.register("tin_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_TIN, Type.CHESTPLATE, 8));
	public static final Supplier<ArmorItem> TUNGSTEN_CHESTPLATE = DeferredRegistration.ITEMS.register("tungsten_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_TUNGSTEN, Type.CHESTPLATE, 17));
	public static final Supplier<ArmorItem> URANIUM_CHESTPLATE = DeferredRegistration.ITEMS.register("uranium_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_URANIUM, Type.CHESTPLATE, 155));
	public static final Supplier<ArmorItem> ZINC_CHESTPLATE = DeferredRegistration.ITEMS.register("zinc_chestplate", () -> new OreGenArmor(ARMOR_MATERIAL_ZINC, Type.CHESTPLATE, 13));
	
	public static final Supplier<ArmorItem> BAUXITE_LEGGINGS = DeferredRegistration.ITEMS.register("bauxite_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_BAUXITE, Type.LEGGINGS, 5));
	public static final Supplier<ArmorItem> BRONZE_LEGGINGS = DeferredRegistration.ITEMS.register("bronze_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_BRONZE, Type.LEGGINGS, 15));
	public static final Supplier<ArmorItem> COBALT_LEGGINGS = DeferredRegistration.ITEMS.register("cobalt_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_COBALT, Type.LEGGINGS, 16));
	public static final Supplier<ArmorItem> IRIDIUM_LEGGINGS = DeferredRegistration.ITEMS.register("iridium_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_IRIDIUM, Type.LEGGINGS, 13));
	public static final Supplier<ArmorItem> LEAD_LEGGINGS = DeferredRegistration.ITEMS.register("lead_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_LEAD, Type.LEGGINGS, 15));
	public static final Supplier<ArmorItem> NICKEL_LEGGINGS = DeferredRegistration.ITEMS.register("nickel_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_NICKEL, Type.LEGGINGS, 13));
	public static final Supplier<ArmorItem> PLATINUM_LEGGINGS = DeferredRegistration.ITEMS.register("platinum_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_PLATINUM, Type.LEGGINGS, 11));
	public static final Supplier<ArmorItem> RUBY_LEGGINGS = DeferredRegistration.ITEMS.register("sapphire_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_RUBY, Type.LEGGINGS, 11));
	public static final Supplier<ArmorItem> SAPPHIRE_LEGGINGS = DeferredRegistration.ITEMS.register("ruby_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_SAPPHIRE, Type.LEGGINGS, 11));
	public static final Supplier<ArmorItem> SILVER_LEGGINGS = DeferredRegistration.ITEMS.register("silver_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_SILVER, Type.LEGGINGS, 11));
	public static final Supplier<ArmorItem> STEEL_LEGGINGS = DeferredRegistration.ITEMS.register("steel_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_STEEL, Type.LEGGINGS, 18));
	public static final Supplier<ArmorItem> TIN_LEGGINGS = DeferredRegistration.ITEMS.register("tin_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_TIN, Type.LEGGINGS, 8));
	public static final Supplier<ArmorItem> TUNGSTEN_LEGGINGS = DeferredRegistration.ITEMS.register("tungsten_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_TUNGSTEN, Type.LEGGINGS, 17));
	public static final Supplier<ArmorItem> URANIUM_LEGGINGS = DeferredRegistration.ITEMS.register("uranium_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_URANIUM, Type.LEGGINGS, 155));
	public static final Supplier<ArmorItem> ZINC_LEGGINGS = DeferredRegistration.ITEMS.register("zinc_leggings", () -> new OreGenArmor(ARMOR_MATERIAL_ZINC, Type.LEGGINGS, 13));
	
	public static final Supplier<ArmorItem> BAUXITE_BOOTS = DeferredRegistration.ITEMS.register("bauxite_boots", () -> new OreGenArmor(ARMOR_MATERIAL_BAUXITE, Type.BOOTS, 5));
	public static final Supplier<ArmorItem> BRONZE_BOOTS = DeferredRegistration.ITEMS.register("bronze_boots", () -> new OreGenArmor(ARMOR_MATERIAL_BRONZE, Type.BOOTS, 15));
	public static final Supplier<ArmorItem> COBALT_BOOTS = DeferredRegistration.ITEMS.register("cobalt_boots", () -> new OreGenArmor(ARMOR_MATERIAL_COBALT, Type.BOOTS, 16));
	public static final Supplier<ArmorItem> IRIDIUM_BOOTS = DeferredRegistration.ITEMS.register("iridium_boots", () -> new OreGenArmor(ARMOR_MATERIAL_IRIDIUM, Type.BOOTS, 13));
	public static final Supplier<ArmorItem> LEAD_BOOTS = DeferredRegistration.ITEMS.register("lead_boots", () -> new OreGenArmor(ARMOR_MATERIAL_LEAD, Type.BOOTS, 15));
	public static final Supplier<ArmorItem> NICKEL_BOOTS = DeferredRegistration.ITEMS.register("nickel_boots", () -> new OreGenArmor(ARMOR_MATERIAL_NICKEL, Type.BOOTS, 13));
	public static final Supplier<ArmorItem> PLATINUM_BOOTS = DeferredRegistration.ITEMS.register("platinum_boots", () -> new OreGenArmor(ARMOR_MATERIAL_PLATINUM, Type.BOOTS, 11));
	public static final Supplier<ArmorItem> RUBY_BOOTS = DeferredRegistration.ITEMS.register("sapphire_boots", () -> new OreGenArmor(ARMOR_MATERIAL_RUBY, Type.BOOTS, 11));
	public static final Supplier<ArmorItem> SAPPHIRE_BOOTS = DeferredRegistration.ITEMS.register("ruby_boots", () -> new OreGenArmor(ARMOR_MATERIAL_SAPPHIRE, Type.BOOTS, 11));
	public static final Supplier<ArmorItem> SILVER_BOOTS = DeferredRegistration.ITEMS.register("silver_boots", () -> new OreGenArmor(ARMOR_MATERIAL_SILVER, Type.BOOTS, 11));
	public static final Supplier<ArmorItem> STEEL_BOOTS = DeferredRegistration.ITEMS.register("steel_boots", () -> new OreGenArmor(ARMOR_MATERIAL_STEEL, Type.BOOTS, 18));
	public static final Supplier<ArmorItem> TIN_BOOTS = DeferredRegistration.ITEMS.register("tin_boots", () -> new OreGenArmor(ARMOR_MATERIAL_TIN, Type.BOOTS, 8));
	public static final Supplier<ArmorItem> TUNGSTEN_BOOTS = DeferredRegistration.ITEMS.register("tungsten_boots", () -> new OreGenArmor(ARMOR_MATERIAL_TUNGSTEN, Type.BOOTS, 17));
	public static final Supplier<ArmorItem> URANIUM_BOOTS = DeferredRegistration.ITEMS.register("uranium_boots", () -> new OreGenArmor(ARMOR_MATERIAL_URANIUM, Type.BOOTS, 155));
	public static final Supplier<ArmorItem> ZINC_BOOTS = DeferredRegistration.ITEMS.register("zinc_boots", () -> new OreGenArmor(ARMOR_MATERIAL_ZINC, Type.BOOTS, 13));
	
	
	public static final Supplier<AnimalArmorItem> BAUXITE_HORSE_ARMOR = DeferredRegistration.ITEMS.register("bauxite_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_BAUXITE, "bauxite"));
	public static final Supplier<AnimalArmorItem> BRONZE_HORSE_ARMOR = DeferredRegistration.ITEMS.register("bronze_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_BRONZE, "bronze"));
	public static final Supplier<AnimalArmorItem> COBALT_HORSE_ARMOR = DeferredRegistration.ITEMS.register("cobalt_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_COBALT, "cobalt"));
	public static final Supplier<AnimalArmorItem> IRIDIUM_HORSE_ARMOR = DeferredRegistration.ITEMS.register("iridium_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_IRIDIUM, "iridium"));
	public static final Supplier<AnimalArmorItem> LEAD_HORSE_ARMOR = DeferredRegistration.ITEMS.register("lead_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_LEAD, "lead"));
	public static final Supplier<AnimalArmorItem> NICKEL_HORSE_ARMOR = DeferredRegistration.ITEMS.register("nickel_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_NICKEL, "nickel"));
	public static final Supplier<AnimalArmorItem> PLATINUM_HORSE_ARMOR = DeferredRegistration.ITEMS.register("platinum_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_PLATINUM, "platinum"));
	public static final Supplier<AnimalArmorItem> RUBY_HORSE_ARMOR = DeferredRegistration.ITEMS.register("ruby_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_RUBY, "ruby"));
	public static final Supplier<AnimalArmorItem> SAPPHIRE_HORSE_ARMOR = DeferredRegistration.ITEMS.register("sapphire_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_SAPPHIRE, "sapphire"));
	public static final Supplier<AnimalArmorItem> SILVER_HORSE_ARMOR = DeferredRegistration.ITEMS.register("silver_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_SILVER, "silver"));
	public static final Supplier<AnimalArmorItem> STEEL_HORSE_ARMOR = DeferredRegistration.ITEMS.register("steel_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_STEEL, "steel"));
	public static final Supplier<AnimalArmorItem> TIN_HORSE_ARMOR = DeferredRegistration.ITEMS.register("tin_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_TIN, "tin"));
	public static final Supplier<AnimalArmorItem> TUNGSTEN_HORSE_ARMOR = DeferredRegistration.ITEMS.register("tungsten_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_TUNGSTEN, "tungsten"));
	public static final Supplier<AnimalArmorItem> URANIUM_HORSE_ARMOR = DeferredRegistration.ITEMS.register("uranium_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_URANIUM, "uranium"));
	public static final Supplier<AnimalArmorItem> ZINC_HORSE_ARMOR = DeferredRegistration.ITEMS.register("zinc_horse_armor", () -> new OreGenHorseArmor(ARMOR_MATERIAL_ZINC, "zinc"));
	
	public static void register() {}
}
