package com.gmail.rohzek.simpleoregen.items.itemtypes;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class OreGenPickaxe extends PickaxeItem
{
	Tier tool_tier;
	
	public OreGenPickaxe(Tier tool_tier, String name) 
	{
		super(tool_tier, new Item.Properties().stacksTo(1).durability(tool_tier.getUses()));
		this.tool_tier = tool_tier;
	}
	
	@Override
	public Tier getTier() 
	{
		return tool_tier;
	}
}
