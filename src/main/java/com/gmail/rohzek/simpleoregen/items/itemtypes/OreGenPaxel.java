package com.gmail.rohzek.simpleoregen.items.itemtypes;

import com.gmail.rohzek.simpleoregen.data.OreGenTags;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.context.UseOnContext;

public class OreGenPaxel extends TieredItem
{
	Tier tool_tier;
	
	public OreGenPaxel(Tier tool_tier, String name) 
	{
		super(tool_tier, new Item.Properties().stacksTo(1).durability(tool_tier.getUses())
				.component(DataComponents.TOOL, tool_tier.createToolProperties(OreGenTags.Blocks.PAXEL_MINEABLE)));
		this.tool_tier = tool_tier;
	}
	
	@Override
	public Tier getTier() 
	{
		return tool_tier;
	}
	
	public static ItemAttributeModifiers createAttributes(Tier tier, float attackDamage, float attackSpeed) 
	{
        return ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, (double)(attackDamage + tier.getAttackDamageBonus()), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, (double)attackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
    }
	
	@Override
	public InteractionResult useOn(UseOnContext context) 
	{
		return super.useOn(context);
	}
}
