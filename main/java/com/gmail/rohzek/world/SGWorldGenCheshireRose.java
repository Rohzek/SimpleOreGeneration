package com.gmail.rohzek.world;

import java.util.Random;

import com.gmail.rohzek.blocks.CheshireRose;
import com.gmail.rohzek.util.LogHelper;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class SGWorldGenCheshireRose extends WorldGenerator
{

	private final CheshireRose block;

    public SGWorldGenCheshireRose(CheshireRose block)
    {
        this.block = block;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        for (int i = 0; i < 21; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.hasSkyLight() || blockpos.getY() < worldIn.getHeight() - 1) && this.block.canBlockStay(worldIn, blockpos, this.block.getDefaultState()))
            {
                worldIn.setBlockState(blockpos, this.block.getDefaultState(), 2);
                LogHelper.debug("Generating a flower at: " + blockpos);
            }
        }

        return true;
    }
}
