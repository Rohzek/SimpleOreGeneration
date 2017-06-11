package com.gmail.rohzek.world;

import java.util.Random;

import com.gmail.rohzek.blocks.CheshireRose;
import com.gmail.rohzek.blocks.SGBlocks;
import com.gmail.rohzek.util.ConfigurationManager;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class SGWorldGenSurface implements IWorldGenerator
{
	WorldGenerator cheshireRose = new SGWorldGenCheshireRose((CheshireRose)SGBlocks.CHESHIREROSE);

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if(!ConfigurationManager.gfFlowerDisable)
		{
			for(int i = 0; i < 4; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(256);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				BlockPos pos = new BlockPos(randPosX, randPosY, randPosZ);
				
				
					cheshireRose.generate(world, random, pos);
			}
		}
	}

}
