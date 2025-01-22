package com.gmail.rohzek.simpleoregen.blocks.oretypes;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class EndOre extends GenericOre
{
	public EndOre(String name, float destroyTime, float resistance) 
	{
		super(name, destroyTime, resistance);
	}

	@Override
	public MapColor defaultMapColor() 
	{
		return MapColor.NONE;
	}
	
	@Override
	public SoundType getSoundType(BlockState state, LevelReader level, BlockPos pos, @Nullable Entity entity) 
	{
		return SoundType.NETHER_GOLD_ORE;
	}
}
