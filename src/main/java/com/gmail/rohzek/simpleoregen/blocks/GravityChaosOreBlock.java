package com.gmail.rohzek.simpleoregen.blocks;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class GravityChaosOreBlock extends ColoredFallingBlock
{

	public GravityChaosOreBlock(String name, ColorRGBA dustColor, Properties properties) 
	{
		super(dustColor, properties);
	}
	
	@Override
	public MapColor defaultMapColor() 
	{
		return MapColor.NONE;
	}
	
	@Override
	public SoundType getSoundType(BlockState state, LevelReader level, BlockPos pos, @Nullable Entity entity) 
	{
		return SoundType.SUSPICIOUS_SAND;
	}
}
