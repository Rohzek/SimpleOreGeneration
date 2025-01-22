package com.gmail.rohzek.simpleoregen.items.itemtypes;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class OreGenShovel extends ShovelItem
{
	Tier tool_tier;
	
	public OreGenShovel(Tier tool_tier, String name) 
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
