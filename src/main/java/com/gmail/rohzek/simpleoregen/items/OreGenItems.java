package com.gmail.rohzek.simpleoregen.items;

import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class OreGenItems 
{
	// Raws
	public static final DeferredItem<Item> RAW_ALUMINIUM = DeferredRegistration.ITEMS.register("raw_aluminium", () -> new OreGenRawOre("raw_aluminium"));
	public static final DeferredItem<Item> RAW_COBALT = DeferredRegistration.ITEMS.register("raw_cobalt", () -> new OreGenRawOre("raw_cobalt"));
	public static final DeferredItem<Item> RAW_IRIDIUM = DeferredRegistration.ITEMS.register("raw_iridium", () -> new OreGenRawOre("raw_iridium"));
	public static final DeferredItem<Item> RAW_LEAD = DeferredRegistration.ITEMS.register("raw_lead", () -> new OreGenRawOre("raw_lead"));
	public static final DeferredItem<Item> RAW_NICKEL = DeferredRegistration.ITEMS.register("raw_nickel", () -> new OreGenRawOre("raw_nickel"));
	public static final DeferredItem<Item> RAW_PLATINUM = DeferredRegistration.ITEMS.register("raw_platinum", () -> new OreGenRawOre("raw_platinum"));
	public static final DeferredItem<Item> RAW_SILVER = DeferredRegistration.ITEMS.register("raw_silver", () -> new OreGenRawOre("raw_silver"));
	public static final DeferredItem<Item> RAW_TIN = DeferredRegistration.ITEMS.register("raw_tin", () -> new OreGenRawOre("raw_tin"));
	public static final DeferredItem<Item> RAW_TUNGSTEN = DeferredRegistration.ITEMS.register("raw_tungsten", () -> new OreGenRawOre("raw_tungsten"));
	public static final DeferredItem<Item> RAW_URANIUM = DeferredRegistration.ITEMS.register("raw_uranium", () -> new OreGenRawOre("raw_uranium"));
	public static final DeferredItem<Item> RAW_ZINC = DeferredRegistration.ITEMS.register("raw_zinc", () -> new OreGenRawOre("raw_zinc"));
	
	public static final DeferredItem<Item> RUBY = DeferredRegistration.ITEMS.register("ruby", () -> new OreGenGem("ruby"));
	public static final DeferredItem<Item> SAPPHIRE = DeferredRegistration.ITEMS.register("sapphire", () -> new OreGenGem("sapphire"));
	public static final DeferredItem<Item> HEART_DIAMOND = DeferredRegistration.ITEMS.register("heart_diamond", () -> new OreGenGem("heart_diamond"));
	
	// Ingots
	public static final DeferredItem<Item> ALUMINIUM_INGOT = DeferredRegistration.ITEMS.register("aluminium_ingot", () -> new OreGenIngot("aluminium_ingot"));
	public static final DeferredItem<Item> COBALT_INGOT = DeferredRegistration.ITEMS.register("cobalt_ingot", () -> new OreGenIngot("cobalt_ingot"));
	public static final DeferredItem<Item> IRIDIUM_INGOT = DeferredRegistration.ITEMS.register("iridium_ingot", () -> new OreGenIngot("iridium_ingot"));
	public static final DeferredItem<Item> LEAD_INGOT = DeferredRegistration.ITEMS.register("lead_ingot", () -> new OreGenIngot("lead_ingot"));
	public static final DeferredItem<Item> NICKEL_INGOT = DeferredRegistration.ITEMS.register("nickel_ingot", () -> new OreGenIngot("nickel_ingot"));
	public static final DeferredItem<Item> PLATINUM_INGOT = DeferredRegistration.ITEMS.register("platinum_ingot", () -> new OreGenIngot("platinum_ingot"));
	public static final DeferredItem<Item> SILVER_INGOT = DeferredRegistration.ITEMS.register("silver_ingot", () -> new OreGenIngot("silver_ingot"));
	public static final DeferredItem<Item> TIN_INGOT = DeferredRegistration.ITEMS.register("tin_ingot", () -> new OreGenIngot("tin_ingot"));
	public static final DeferredItem<Item> TUNGSTEN_INGOT = DeferredRegistration.ITEMS.register("tungsten_ingot", () -> new OreGenIngot("tungsten_ingot"));
	public static final DeferredItem<Item> URANIUM_INGOT = DeferredRegistration.ITEMS.register("uranium_ingot", () -> new OreGenIngot("uranium_ingot"));
	public static final DeferredItem<Item> ZINC_INGOT = DeferredRegistration.ITEMS.register("zinc_ingot", () -> new OreGenIngot("zinc_ingot"));
	
	public static final DeferredItem<Item> BRONZE_INGOT = DeferredRegistration.ITEMS.register("bronze_ingot", () -> new OreGenIngot("bronze_ingot"));
	
	// Nuggets
	public static final DeferredItem<Item> ALUMINIUM_NUGGET = DeferredRegistration.ITEMS.register("aluminium_nugget", () -> new OreGenIngot("aluminium_nugget"));
	public static final DeferredItem<Item> COBALT_NUGGET = DeferredRegistration.ITEMS.register("cobalt_nugget", () -> new OreGenIngot("cobalt_nugget"));
	public static final DeferredItem<Item> IRIDIUM_NUGGET = DeferredRegistration.ITEMS.register("iridium_nugget", () -> new OreGenIngot("iridium_nugget"));
	public static final DeferredItem<Item> LEAD_NUGGET = DeferredRegistration.ITEMS.register("lead_nugget", () -> new OreGenIngot("lead_nugget"));
	public static final DeferredItem<Item> NICKEL_NUGGET = DeferredRegistration.ITEMS.register("nickel_nugget", () -> new OreGenIngot("nickel_nugget"));
	public static final DeferredItem<Item> PLATINUM_NUGGET = DeferredRegistration.ITEMS.register("platinum_nugget", () -> new OreGenIngot("platinum_nugget"));
	public static final DeferredItem<Item> SILVER_NUGGET = DeferredRegistration.ITEMS.register("silver_nugget", () -> new OreGenIngot("silver_nugget"));
	public static final DeferredItem<Item> TIN_NUGGET = DeferredRegistration.ITEMS.register("tin_nugget", () -> new OreGenIngot("tin_nugget"));
	public static final DeferredItem<Item> TUNGSTEN_NUGGET = DeferredRegistration.ITEMS.register("tungsten_nugget", () -> new OreGenIngot("tungsten_nugget"));
	public static final DeferredItem<Item> URANIUM_NUGGET = DeferredRegistration.ITEMS.register("uranium_nugget", () -> new OreGenIngot("uranium_nugget"));
	public static final DeferredItem<Item> ZINC_NUGGET = DeferredRegistration.ITEMS.register("zinc_nugget", () -> new OreGenIngot("zinc_nugget"));
	
	public static final DeferredItem<Item> BRONZE_NUGGET = DeferredRegistration.ITEMS.register("bronze_nugget", () -> new OreGenIngot("bronze_nugget"));
    
    public static void register() {}
}
