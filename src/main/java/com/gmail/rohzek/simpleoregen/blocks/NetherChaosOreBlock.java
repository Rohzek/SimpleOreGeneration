package com.gmail.rohzek.simpleoregen.blocks;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class NetherChaosOreBlock extends DropExperienceBlock
{
static Properties properties = BlockBehaviour.Properties.of().requiresCorrectToolForDrops().noLootTable();
	
	public NetherChaosOreBlock(String name, float destroyTime, float resistance) 
	{
		super(UniformInt.of(0, 2), properties.strength(destroyTime, resistance));
	}
	
	@Override
	public MapColor defaultMapColor() 
	{
		return MapColor.NETHER;
	}
	
	@Override
	public SoundType getSoundType(BlockState state, LevelReader level, BlockPos pos, @Nullable Entity entity) 
	{
		return SoundType.NETHER_GOLD_ORE;
	}
}
