package com.gmail.rohzek.simpleoregen.items.itemtypes;

import java.util.List;
import java.util.function.Supplier;

import com.gmail.rohzek.simpleoregen.data.OreGenTags;
import com.google.common.base.Suppliers;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

public enum ModToolTiers implements Tier
{
	AMETHYST(BlockTags.INCORRECT_FOR_GOLD_TOOL, 350, 12f, 2.0f, 19, () -> Ingredient.of(Tags.Items.GEMS_AMETHYST)),
	BAUXITE(BlockTags.INCORRECT_FOR_STONE_TOOL, 165, 4.5f, 1.0f, 5, () -> Ingredient.of(OreGenTags.Items.BAUXITE_INGOTS)),
	BRONZE(BlockTags.INCORRECT_FOR_IRON_TOOL, 300, 6.5f, 2.5f, 15, () -> Ingredient.of(OreGenTags.Items.BRONZE_INGOTS)),
	COBALT(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 800, 9f, 3.5f, 15, () -> Ingredient.of(OreGenTags.Items.COBALT_INGOTS)),
	COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 240, 6f, 2.5f, 13, () -> Ingredient.of(Tags.Items.INGOTS_COPPER)),
	EMERALD(BlockTags.INCORRECT_FOR_GOLD_TOOL, 900, 12f, 2.5f, 23, () -> Ingredient.of(Tags.Items.GEMS_EMERALD)),
	IRIDIUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 900, 9f, 3.5f, 17, () -> Ingredient.of(OreGenTags.Items.IRIDIUM_INGOTS)),
	LEAD(BlockTags.INCORRECT_FOR_IRON_TOOL, 1350, 6f, 2.5f, 14, () -> Ingredient.of(OreGenTags.Items.LEAD_INGOTS)),
	NICKEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 5f, 1.5f, 12, () -> Ingredient.of(OreGenTags.Items.NICKEL_INGOTS)),
	PLATINUM(BlockTags.INCORRECT_FOR_GOLD_TOOL, 250, 12f, 2.5f, 23, () -> Ingredient.of(OreGenTags.Items.PLATINUM_INGOTS)),
	RUBY(BlockTags.INCORRECT_FOR_GOLD_TOOL, 900, 12f, 2.5f, 23, () -> Ingredient.of(OreGenTags.Items.RUBIES)),
	SAPPHIRE(BlockTags.INCORRECT_FOR_GOLD_TOOL, 900, 12f, 2.5f, 23, () -> Ingredient.of(OreGenTags.Items.SAPPHIRES)),
	SILVER(BlockTags.INCORRECT_FOR_GOLD_TOOL, 90, 12f, 3.5f, 20, () -> Ingredient.of(OreGenTags.Items.SILVER_INGOTS)),
	STEEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 1250, 6f, 3.5f, 12, () -> Ingredient.of(OreGenTags.Items.STEEL_INGOTS)),
	TIN(BlockTags.INCORRECT_FOR_STONE_TOOL, 185, 9f, 4.5f, 6, () -> Ingredient.of(OreGenTags.Items.TIN_INGOTS)),
	TUNGSTEN(BlockTags.INCORRECT_FOR_IRON_TOOL, 1551, 3.5f, 2.5f, 7, () -> Ingredient.of(OreGenTags.Items.TUNGSTEN_INGOTS)),
	URANIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 420, 6.5f, 3.5f, 25, () -> Ingredient.of(OreGenTags.Items.URANIUM_INGOTS)),
	ZINC(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 6f, 3.5f, 15, () -> Ingredient.of(OreGenTags.Items.ZINC_INGOTS)),
	QUARTZ(BlockTags.INCORRECT_FOR_GOLD_TOOL, 900, 12f, 2.5f, 19, () -> Ingredient.of(Tags.Items.GEMS_QUARTZ)),
	OBSIDIAN(BlockTags.INCORRECT_FOR_STONE_TOOL, 1738, 4f, 2.5f, 65, () -> Ingredient.of(Tags.Items.OBSIDIANS));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolTiers(TagKey<Block> incorrectBlockForDrops, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlockForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getUses() 
    {
        return this.uses;
    }

    @Override
    public float getSpeed() 
    {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() 
    {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() 
    {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() 
    {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() 
    {
        return this.repairIngredient.get();
    }
    
    @Override
    public Tool createToolProperties(TagKey<Block> block) 
    {
        return new Tool(List.of(Tool.Rule.deniesDrops(this.getIncorrectBlocksForDrops()), Tool.Rule.minesAndDrops(block, this.getSpeed())), 1.0F, 1);
    }
}
