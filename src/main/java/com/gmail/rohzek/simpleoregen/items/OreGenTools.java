package com.gmail.rohzek.simpleoregen.items;

import com.gmail.rohzek.simpleoregen.items.itemtypes.ModToolTiers;
import com.gmail.rohzek.simpleoregen.items.itemtypes.OreGenAxe;
import com.gmail.rohzek.simpleoregen.items.itemtypes.OreGenHoe;
import com.gmail.rohzek.simpleoregen.items.itemtypes.OreGenPaxel;
import com.gmail.rohzek.simpleoregen.items.itemtypes.OreGenPickaxe;
import com.gmail.rohzek.simpleoregen.items.itemtypes.OreGenShovel;
import com.gmail.rohzek.simpleoregen.items.itemtypes.OreGenSword;
import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;

public class OreGenTools 
{
	//Pickaxes
	public static final DeferredItem<Item> AMETHYST_PICKAXE = DeferredRegistration.ITEMS.register("amethyst_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.AMETHYST, "amethyst_pickaxe"));
	public static final DeferredItem<Item> BAUXITE_PICKAXE = DeferredRegistration.ITEMS.register("bauxite_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.BAUXITE, "bauxite_pickaxe"));
	public static final DeferredItem<Item> BRONZE_PICKAXE = DeferredRegistration.ITEMS.register("bronze_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.BRONZE, "bronze_pickaxe"));
	public static final DeferredItem<Item> COBALT_PICKAXE = DeferredRegistration.ITEMS.register("cobalt_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.COBALT, "cobalt_pickaxe"));
	public static final DeferredItem<Item> COPPER_PICKAXE = DeferredRegistration.ITEMS.register("copper_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.COPPER, "copper_pickaxe"));
	public static final DeferredItem<Item> EMERALD_PICKAXE = DeferredRegistration.ITEMS.register("emerald_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.EMERALD, "emerald_pickaxe"));
	public static final DeferredItem<Item> IRIDIUM_PICKAXE = DeferredRegistration.ITEMS.register("iridium_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.IRIDIUM, "iridium_pickaxe"));
	public static final DeferredItem<Item> LEAD_PICKAXE = DeferredRegistration.ITEMS.register("lead_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.LEAD, "lead_pickaxe"));
	public static final DeferredItem<Item> NICKEL_PICKAXE = DeferredRegistration.ITEMS.register("nickel_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.NICKEL, "nickel_pickaxe"));
	public static final DeferredItem<Item> PLATINUM_PICKAXE = DeferredRegistration.ITEMS.register("platinum_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.PLATINUM, "platinum_pickaxe"));
	public static final DeferredItem<Item> RUBY_PICKAXE = DeferredRegistration.ITEMS.register("ruby_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.RUBY, "ruby_pickaxe"));
	public static final DeferredItem<Item> SAPPHIRE_PICKAXE = DeferredRegistration.ITEMS.register("sapphire_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.SAPPHIRE, "sapphire_pickaxe"));
	public static final DeferredItem<Item> SILVER_PICKAXE = DeferredRegistration.ITEMS.register("silver_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.SILVER, "silver_pickaxe"));
	public static final DeferredItem<Item> STEEL_PICKAXE = DeferredRegistration.ITEMS.register("steel_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.STEEL, "steel_pickaxe"));
	public static final DeferredItem<Item> TIN_PICKAXE = DeferredRegistration.ITEMS.register("tin_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.TIN, "tin_pickaxe"));
	public static final DeferredItem<Item> TUNGSTEN_PICKAXE = DeferredRegistration.ITEMS.register("tungsten_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.TUNGSTEN, "tungsten_pickaxe"));
	public static final DeferredItem<Item> URANIUM_PICKAXE = DeferredRegistration.ITEMS.register("uranium_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.URANIUM, "uranium_pickaxe"));
	public static final DeferredItem<Item> ZINC_PICKAXE = DeferredRegistration.ITEMS.register("zinc_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.ZINC, "zinc_pickaxe"));
	public static final DeferredItem<Item> QUARTZ_PICKAXE = DeferredRegistration.ITEMS.register("quartz_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.QUARTZ, "quartz_pickaxe"));
	public static final DeferredItem<Item> OBSIDIAN_PICKAXE = DeferredRegistration.ITEMS.register("obsidian_pickaxe", 
			() -> new OreGenPickaxe(ModToolTiers.OBSIDIAN, "obsidian_pickaxe"));
	
	// Axes
	public static final DeferredItem<Item> AMETHYST_AXE = DeferredRegistration.ITEMS.register("amethyst_axe", 
			() -> new OreGenAxe(ModToolTiers.AMETHYST, "amethyst_axe"));
	public static final DeferredItem<Item> BAUXITE_AXE = DeferredRegistration.ITEMS.register("bauxite_axe", 
			() -> new OreGenAxe(ModToolTiers.BAUXITE, "bauxite_axe"));
	public static final DeferredItem<Item> BRONZE_AXE = DeferredRegistration.ITEMS.register("bronze_axe", 
			() -> new OreGenAxe(ModToolTiers.BRONZE, "bronze_axe"));
	public static final DeferredItem<Item> COBALT_AXE = DeferredRegistration.ITEMS.register("cobalt_axe", 
			() -> new OreGenAxe(ModToolTiers.COBALT, "cobalt_axe"));
	public static final DeferredItem<Item> COPPER_AXE = DeferredRegistration.ITEMS.register("copper_axe", 
			() -> new OreGenAxe(ModToolTiers.COPPER, "copper_axe"));
	public static final DeferredItem<Item> EMERALD_AXE = DeferredRegistration.ITEMS.register("emerald_axe", 
			() -> new OreGenAxe(ModToolTiers.EMERALD, "emerald_axe"));
	public static final DeferredItem<Item> IRIDIUM_AXE = DeferredRegistration.ITEMS.register("iridium_axe", 
			() -> new OreGenAxe(ModToolTiers.IRIDIUM, "iridium_axe"));
	public static final DeferredItem<Item> LEAD_AXE = DeferredRegistration.ITEMS.register("lead_axe", 
			() -> new OreGenAxe(ModToolTiers.LEAD, "lead_axe"));
	public static final DeferredItem<Item> NICKEL_AXE = DeferredRegistration.ITEMS.register("nickel_axe", 
			() -> new OreGenAxe(ModToolTiers.NICKEL, "nickel_axe"));
	public static final DeferredItem<Item> PLATINUM_AXE = DeferredRegistration.ITEMS.register("platinum_axe", 
			() -> new OreGenAxe(ModToolTiers.PLATINUM, "platinum_axe"));
	public static final DeferredItem<Item> RUBY_AXE = DeferredRegistration.ITEMS.register("ruby_axe", 
			() -> new OreGenAxe(ModToolTiers.RUBY, "ruby_axe"));
	public static final DeferredItem<Item> SAPPHIRE_AXE = DeferredRegistration.ITEMS.register("sapphire_axe", 
			() -> new OreGenAxe(ModToolTiers.SAPPHIRE, "sapphire_axe"));
	public static final DeferredItem<Item> SILVER_AXE = DeferredRegistration.ITEMS.register("silver_axe", 
			() -> new OreGenAxe(ModToolTiers.SILVER, "silver_axe"));
	public static final DeferredItem<Item> STEEL_AXE = DeferredRegistration.ITEMS.register("steel_axe", 
			() -> new OreGenAxe(ModToolTiers.STEEL, "steel_axe"));
	public static final DeferredItem<Item> TIN_AXE = DeferredRegistration.ITEMS.register("tin_axe", 
			() -> new OreGenAxe(ModToolTiers.TIN, "tin_axe"));
	public static final DeferredItem<Item> TUNGSTEN_AXE = DeferredRegistration.ITEMS.register("tungsten_axe", 
			() -> new OreGenAxe(ModToolTiers.TUNGSTEN, "tungsten_axe"));
	public static final DeferredItem<Item> URANIUM_AXE = DeferredRegistration.ITEMS.register("uranium_axe", 
			() -> new OreGenAxe(ModToolTiers.URANIUM, "uranium_axe"));
	public static final DeferredItem<Item> ZINC_AXE = DeferredRegistration.ITEMS.register("zinc_axe", 
			() -> new OreGenAxe(ModToolTiers.ZINC, "zinc_axe"));
	public static final DeferredItem<Item> QUARTZ_AXE = DeferredRegistration.ITEMS.register("quartz_axe", 
			() -> new OreGenAxe(ModToolTiers.QUARTZ, "quartz_axe"));
	public static final DeferredItem<Item> OBSIDIAN_AXE = DeferredRegistration.ITEMS.register("obsidian_axe", 
			() -> new OreGenAxe(ModToolTiers.OBSIDIAN, "obsidian_axe"));
	
	// Shovels
	public static final DeferredItem<Item> AMETHYST_SHOVEL = DeferredRegistration.ITEMS.register("amethyst_shovel", 
			() -> new OreGenShovel(ModToolTiers.AMETHYST, "amethyst_shovel"));
	public static final DeferredItem<Item> BAUXITE_SHOVEL = DeferredRegistration.ITEMS.register("bauxite_shovel", 
			() -> new OreGenShovel(ModToolTiers.BAUXITE, "bauxite_shovel"));
	public static final DeferredItem<Item> BRONZE_SHOVEL = DeferredRegistration.ITEMS.register("bronze_shovel", 
			() -> new OreGenShovel(ModToolTiers.BRONZE, "bronze_shovel"));
	public static final DeferredItem<Item> COBALT_SHOVEL = DeferredRegistration.ITEMS.register("cobalt_shovel", 
			() -> new OreGenShovel(ModToolTiers.COBALT, "cobalt_shovel"));
	public static final DeferredItem<Item> COPPER_SHOVEL = DeferredRegistration.ITEMS.register("copper_shovel", 
			() -> new OreGenShovel(ModToolTiers.COPPER, "copper_shovel"));
	public static final DeferredItem<Item> EMERALD_SHOVEL = DeferredRegistration.ITEMS.register("emerald_shovel", 
			() -> new OreGenShovel(ModToolTiers.EMERALD, "emerald_shovel"));
	public static final DeferredItem<Item> IRIDIUM_SHOVEL = DeferredRegistration.ITEMS.register("iridium_shovel", 
			() -> new OreGenShovel(ModToolTiers.IRIDIUM, "iridium_shovel"));
	public static final DeferredItem<Item> LEAD_SHOVEL = DeferredRegistration.ITEMS.register("lead_shovel", 
			() -> new OreGenShovel(ModToolTiers.LEAD, "lead_shovel"));
	public static final DeferredItem<Item> NICKEL_SHOVEL = DeferredRegistration.ITEMS.register("nickel_shovel", 
			() -> new OreGenShovel(ModToolTiers.NICKEL, "nickel_shovel"));
	public static final DeferredItem<Item> PLATINUM_SHOVEL = DeferredRegistration.ITEMS.register("platinum_shovel", 
			() -> new OreGenShovel(ModToolTiers.PLATINUM, "platinum_shovel"));
	public static final DeferredItem<Item> RUBY_SHOVEL = DeferredRegistration.ITEMS.register("ruby_shovel", 
			() -> new OreGenShovel(ModToolTiers.RUBY, "ruby_shovel"));
	public static final DeferredItem<Item> SAPPHIRE_SHOVEL = DeferredRegistration.ITEMS.register("sapphire_shovel", 
			() -> new OreGenShovel(ModToolTiers.SAPPHIRE, "sapphire_shovel"));
	public static final DeferredItem<Item> SILVER_SHOVEL = DeferredRegistration.ITEMS.register("silver_shovel", 
			() -> new OreGenShovel(ModToolTiers.SILVER, "silver_shovel"));
	public static final DeferredItem<Item> STEEL_SHOVEL = DeferredRegistration.ITEMS.register("steel_shovel", 
			() -> new OreGenShovel(ModToolTiers.STEEL, "steel_shovel"));
	public static final DeferredItem<Item> TIN_SHOVEL = DeferredRegistration.ITEMS.register("tin_shovel", 
			() -> new OreGenShovel(ModToolTiers.TIN, "tin_shovel"));
	public static final DeferredItem<Item> TUNGSTEN_SHOVEL = DeferredRegistration.ITEMS.register("tungsten_shovel", 
			() -> new OreGenShovel(ModToolTiers.TUNGSTEN, "tungsten_shovel"));
	public static final DeferredItem<Item> URANIUM_SHOVEL = DeferredRegistration.ITEMS.register("uranium_shovel", 
			() -> new OreGenShovel(ModToolTiers.URANIUM, "uranium_shovel"));
	public static final DeferredItem<Item> ZINC_SHOVEL = DeferredRegistration.ITEMS.register("zinc_shovel", 
			() -> new OreGenShovel(ModToolTiers.ZINC, "zinc_shovel"));
	public static final DeferredItem<Item> QUARTZ_SHOVEL = DeferredRegistration.ITEMS.register("quartz_shovel", 
			() -> new OreGenShovel(ModToolTiers.QUARTZ, "quartz_shovel"));
	public static final DeferredItem<Item> OBSIDIAN_SHOVEL = DeferredRegistration.ITEMS.register("obsidian_shovel", 
			() -> new OreGenShovel(ModToolTiers.OBSIDIAN, "obsidian_shovel"));
	
	// Hoe
	public static final DeferredItem<Item> AMETHYST_HOE = DeferredRegistration.ITEMS.register("amethyst_hoe", 
			() -> new OreGenHoe(ModToolTiers.AMETHYST, "amethyst_hoe"));
	public static final DeferredItem<Item> BAUXITE_HOE = DeferredRegistration.ITEMS.register("bauxite_hoe", 
			() -> new OreGenHoe(ModToolTiers.BAUXITE, "bauxite_hoe"));
	public static final DeferredItem<Item> BRONZE_HOE = DeferredRegistration.ITEMS.register("bronze_hoe", 
			() -> new OreGenHoe(ModToolTiers.BRONZE, "bronze_hoe"));
	public static final DeferredItem<Item> COBALT_HOE = DeferredRegistration.ITEMS.register("cobalt_hoe", 
			() -> new OreGenHoe(ModToolTiers.COBALT, "cobalt_hoe"));
	public static final DeferredItem<Item> COPPER_HOE = DeferredRegistration.ITEMS.register("copper_hoe", 
			() -> new OreGenHoe(ModToolTiers.COPPER, "copper_hoe"));
	public static final DeferredItem<Item> EMERALD_HOE = DeferredRegistration.ITEMS.register("emerald_hoe", 
			() -> new OreGenHoe(ModToolTiers.EMERALD, "emerald_hoe"));
	public static final DeferredItem<Item> IRIDIUM_HOE = DeferredRegistration.ITEMS.register("iridium_hoe", 
			() -> new OreGenHoe(ModToolTiers.IRIDIUM, "iridium_hoe"));
	public static final DeferredItem<Item> LEAD_HOE = DeferredRegistration.ITEMS.register("lead_hoe", 
			() -> new OreGenHoe(ModToolTiers.LEAD, "lead_hoe"));
	public static final DeferredItem<Item> NICKEL_HOE = DeferredRegistration.ITEMS.register("nickel_hoe", 
			() -> new OreGenHoe(ModToolTiers.NICKEL, "nickel_hoe"));
	public static final DeferredItem<Item> PLATINUM_HOE = DeferredRegistration.ITEMS.register("platinum_hoe", 
			() -> new OreGenHoe(ModToolTiers.PLATINUM, "platinum_hoe"));
	public static final DeferredItem<Item> RUBY_HOE = DeferredRegistration.ITEMS.register("ruby_hoe", 
			() -> new OreGenHoe(ModToolTiers.RUBY, "ruby_hoe"));
	public static final DeferredItem<Item> SAPPHIRE_HOE = DeferredRegistration.ITEMS.register("sapphire_hoe", 
			() -> new OreGenHoe(ModToolTiers.SAPPHIRE, "sapphire_hoe"));
	public static final DeferredItem<Item> SILVER_HOE = DeferredRegistration.ITEMS.register("silver_hoe", 
			() -> new OreGenHoe(ModToolTiers.SILVER, "silver_hoe"));
	public static final DeferredItem<Item> STEEL_HOE = DeferredRegistration.ITEMS.register("steel_hoe", 
			() -> new OreGenHoe(ModToolTiers.STEEL, "steel_hoe"));
	public static final DeferredItem<Item> TIN_HOE = DeferredRegistration.ITEMS.register("tin_hoe", 
			() -> new OreGenHoe(ModToolTiers.TIN, "tin_hoe"));
	public static final DeferredItem<Item> TUNGSTEN_HOE = DeferredRegistration.ITEMS.register("tungsten_hoe", 
			() -> new OreGenHoe(ModToolTiers.TUNGSTEN, "tungsten_hoe"));
	public static final DeferredItem<Item> URANIUM_HOE = DeferredRegistration.ITEMS.register("uranium_hoe", 
			() -> new OreGenHoe(ModToolTiers.URANIUM, "uranium_hoe"));
	public static final DeferredItem<Item> ZINC_HOE = DeferredRegistration.ITEMS.register("zinc_hoe", 
			() -> new OreGenHoe(ModToolTiers.ZINC, "zinc_hoe"));
	public static final DeferredItem<Item> QUARTZ_HOE = DeferredRegistration.ITEMS.register("quartz_hoe", 
			() -> new OreGenHoe(ModToolTiers.QUARTZ, "quartz_hoe"));
	public static final DeferredItem<Item> OBSIDIAN_HOE = DeferredRegistration.ITEMS.register("obsidian_hoe", 
			() -> new OreGenHoe(ModToolTiers.OBSIDIAN, "obsidian_hoe"));
	
	// Paxels
	public static final DeferredItem<Item> WOOD_PAXEL = DeferredRegistration.ITEMS.register("wooden_paxel", 
			() -> new OreGenPaxel(Tiers.WOOD, "wooden_paxel"));
	public static final DeferredItem<Item> STONE_PAXEL = DeferredRegistration.ITEMS.register("stone_paxel", 
			() -> new OreGenPaxel(Tiers.STONE, "stone_paxel"));
	public static final DeferredItem<Item> IRON_PAXEL = DeferredRegistration.ITEMS.register("iron_paxel", 
			() -> new OreGenPaxel(Tiers.IRON, "iron_paxel"));
	public static final DeferredItem<Item> GOLD_PAXEL = DeferredRegistration.ITEMS.register("gold_paxel", 
			() -> new OreGenPaxel(Tiers.GOLD, "gold_paxel"));
	public static final DeferredItem<Item> DIAMOND_PAXEL = DeferredRegistration.ITEMS.register("diamond_paxel", 
			() -> new OreGenPaxel(Tiers.DIAMOND, "diamond_paxel"));
	public static final DeferredItem<Item> NETHERITE_PAXEL = DeferredRegistration.ITEMS.register("netherite_paxel", 
			() -> new OreGenPaxel(Tiers.NETHERITE, "netherite_paxel"));
	
	public static final DeferredItem<Item> AMETHYST_PAXEL = DeferredRegistration.ITEMS.register("amethyst_paxel", 
			() -> new OreGenPaxel(ModToolTiers.AMETHYST, "amethyst_paxel"));
	public static final DeferredItem<Item> BAUXITE_PAXEL = DeferredRegistration.ITEMS.register("bauxite_paxel", 
			() -> new OreGenPaxel(ModToolTiers.BAUXITE, "bauxite_paxel"));
	public static final DeferredItem<Item> BRONZE_PAXEL = DeferredRegistration.ITEMS.register("bronze_paxel", 
			() -> new OreGenPaxel(ModToolTiers.BRONZE, "bronze_paxel"));
	public static final DeferredItem<Item> COBALT_PAXEL = DeferredRegistration.ITEMS.register("cobalt_paxel", 
			() -> new OreGenPaxel(ModToolTiers.COBALT, "cobalt_paxel"));
	public static final DeferredItem<Item> COPPER_PAXEL = DeferredRegistration.ITEMS.register("copper_paxel", 
			() -> new OreGenPaxel(ModToolTiers.COPPER, "copper_paxel"));
	public static final DeferredItem<Item> EMERALD_PAXEL = DeferredRegistration.ITEMS.register("emerald_paxel", 
			() -> new OreGenPaxel(ModToolTiers.EMERALD, "emerald_paxel"));
	public static final DeferredItem<Item> IRIDIUM_PAXEL = DeferredRegistration.ITEMS.register("iridium_paxel", 
			() -> new OreGenPaxel(ModToolTiers.IRIDIUM, "iridium_paxel"));
	public static final DeferredItem<Item> LEAD_PAXEL = DeferredRegistration.ITEMS.register("lead_paxel", 
			() -> new OreGenPaxel(ModToolTiers.LEAD, "lead_paxel"));
	public static final DeferredItem<Item> NICKEL_PAXEL = DeferredRegistration.ITEMS.register("nickel_paxel", 
			() -> new OreGenPaxel(ModToolTiers.NICKEL, "nickel_paxel"));
	public static final DeferredItem<Item> PLATINUM_PAXEL = DeferredRegistration.ITEMS.register("platinum_paxel", 
			() -> new OreGenPaxel(ModToolTiers.PLATINUM, "platinum_paxel"));
	public static final DeferredItem<Item> RUBY_PAXEL = DeferredRegistration.ITEMS.register("ruby_paxel", 
			() -> new OreGenPaxel(ModToolTiers.RUBY, "ruby_paxel"));
	public static final DeferredItem<Item> SAPPHIRE_PAXEL = DeferredRegistration.ITEMS.register("sapphire_paxel", 
			() -> new OreGenPaxel(ModToolTiers.SAPPHIRE, "sapphire_paxel"));
	public static final DeferredItem<Item> SILVER_PAXEL = DeferredRegistration.ITEMS.register("silver_paxel", 
			() -> new OreGenPaxel(ModToolTiers.SILVER, "silver_paxel"));
	public static final DeferredItem<Item> STEEL_PAXEL = DeferredRegistration.ITEMS.register("steel_paxel", 
			() -> new OreGenPaxel(ModToolTiers.STEEL, "steel_paxel"));
	public static final DeferredItem<Item> TIN_PAXEL = DeferredRegistration.ITEMS.register("tin_paxel", 
			() -> new OreGenPaxel(ModToolTiers.TIN, "tin_paxel"));
	public static final DeferredItem<Item> TUNGSTEN_PAXEL = DeferredRegistration.ITEMS.register("tungsten_paxel", 
			() -> new OreGenPaxel(ModToolTiers.TUNGSTEN, "tungsten_paxel"));
	public static final DeferredItem<Item> URANIUM_PAXEL = DeferredRegistration.ITEMS.register("uranium_paxel", 
			() -> new OreGenPaxel(ModToolTiers.URANIUM, "uranium_paxel"));
	public static final DeferredItem<Item> ZINC_PAXEL = DeferredRegistration.ITEMS.register("zinc_paxel", 
			() -> new OreGenPaxel(ModToolTiers.ZINC, "zinc_paxel"));
	public static final DeferredItem<Item> QUARTZ_PAXEL = DeferredRegistration.ITEMS.register("quartz_paxel", 
			() -> new OreGenPaxel(ModToolTiers.QUARTZ, "quartz_paxel"));
	public static final DeferredItem<Item> OBSIDIAN_PAXEL = DeferredRegistration.ITEMS.register("obsidian_paxel", 
			() -> new OreGenPaxel(ModToolTiers.OBSIDIAN, "obsidian_paxel"));
	
	// Sword
	public static final DeferredItem<Item> AMETHYST_SWORD = DeferredRegistration.ITEMS.register("amethyst_sword", 
			() -> new OreGenSword(ModToolTiers.AMETHYST, "amethyst_sword"));
	public static final DeferredItem<Item> BAUXITE_SWORD = DeferredRegistration.ITEMS.register("bauxite_sword", 
			() -> new OreGenSword(ModToolTiers.BAUXITE, "bauxite_sword"));
	public static final DeferredItem<Item> BRONZE_SWORD = DeferredRegistration.ITEMS.register("bronze_sword", 
			() -> new OreGenSword(ModToolTiers.BRONZE, "bronze_sword"));
	public static final DeferredItem<Item> COBALT_SWORD = DeferredRegistration.ITEMS.register("cobalt_sword", 
			() -> new OreGenSword(ModToolTiers.COBALT, "cobalt_sword"));
	public static final DeferredItem<Item> COPPER_SWORD = DeferredRegistration.ITEMS.register("copper_sword", 
			() -> new OreGenSword(ModToolTiers.COPPER, "copper_sword"));
	public static final DeferredItem<Item> EMERALD_SWORD = DeferredRegistration.ITEMS.register("emerald_sword", 
			() -> new OreGenSword(ModToolTiers.EMERALD, "emerald_sword"));
	public static final DeferredItem<Item> IRIDIUM_SWORD = DeferredRegistration.ITEMS.register("iridium_sword", 
			() -> new OreGenSword(ModToolTiers.IRIDIUM, "iridium_sword"));
	public static final DeferredItem<Item> LEAD_SWORD = DeferredRegistration.ITEMS.register("lead_sword", 
			() -> new OreGenSword(ModToolTiers.LEAD, "lead_sword"));
	public static final DeferredItem<Item> NICKEL_SWORD = DeferredRegistration.ITEMS.register("nickel_sword", 
			() -> new OreGenSword(ModToolTiers.NICKEL, "nickel_sword"));
	public static final DeferredItem<Item> PLATINUM_SWORD = DeferredRegistration.ITEMS.register("platinum_sword", 
			() -> new OreGenSword(ModToolTiers.PLATINUM, "platinum_sword"));
	public static final DeferredItem<Item> RUBY_SWORD = DeferredRegistration.ITEMS.register("ruby_sword", 
			() -> new OreGenSword(ModToolTiers.RUBY, "ruby_sword"));
	public static final DeferredItem<Item> SAPPHIRE_SWORD = DeferredRegistration.ITEMS.register("sapphire_sword", 
			() -> new OreGenSword(ModToolTiers.SAPPHIRE, "sapphire_sword"));
	public static final DeferredItem<Item> SILVER_SWORD = DeferredRegistration.ITEMS.register("silver_sword", 
			() -> new OreGenSword(ModToolTiers.SILVER, "silver_sword"));
	public static final DeferredItem<Item> STEEL_SWORD = DeferredRegistration.ITEMS.register("steel_sword", 
			() -> new OreGenSword(ModToolTiers.STEEL, "steel_sword"));
	public static final DeferredItem<Item> TIN_SWORD = DeferredRegistration.ITEMS.register("tin_sword", 
			() -> new OreGenSword(ModToolTiers.TIN, "tin_sword"));
	public static final DeferredItem<Item> TUNGSTEN_SWORD = DeferredRegistration.ITEMS.register("tungsten_sword", 
			() -> new OreGenSword(ModToolTiers.TUNGSTEN, "tungsten_sword"));
	public static final DeferredItem<Item> URANIUM_SWORD = DeferredRegistration.ITEMS.register("uranium_sword", 
			() -> new OreGenSword(ModToolTiers.URANIUM, "uranium_sword"));
	public static final DeferredItem<Item> ZINC_SWORD = DeferredRegistration.ITEMS.register("zinc_sword", 
			() -> new OreGenSword(ModToolTiers.ZINC, "zinc_sword"));
	public static final DeferredItem<Item> QUARTZ_SWORD = DeferredRegistration.ITEMS.register("quartz_sword", 
			() -> new OreGenSword(ModToolTiers.QUARTZ, "quartz_sword"));
	public static final DeferredItem<Item> OBSIDIAN_SWORD = DeferredRegistration.ITEMS.register("obsidian_sword", 
			() -> new OreGenSword(ModToolTiers.OBSIDIAN, "obsidian_sword"));
	
	public static void register() {}
}
