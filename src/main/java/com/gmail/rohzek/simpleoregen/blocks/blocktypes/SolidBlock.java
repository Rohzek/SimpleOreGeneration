package com.gmail.rohzek.simpleoregen.blocks.blocktypes;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class SolidBlock extends Block
{

	public SolidBlock(String name, float destroyTime, float resistance) 
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(destroyTime, resistance).sound(SoundType.METAL));
	}
}
