package com.gmail.rohzek.world;

import java.util.Random;

import com.gmail.rohzek.json.OreData;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;

public class SGWorldGenMineableEmerald extends SGWorldGenMineable
{

	public SGWorldGenMineableEmerald(IBlockState state, int blockCount, OreData data) 
	{
		super(state, blockCount, data);
	}
	
	public SGWorldGenMineableEmerald(IBlockState state, int blockCount, Predicate<IBlockState> predicate, OreData data)
    {
		super(state, blockCount, predicate, data);
    }
	
	@Override
    public boolean generate(World worldIn, Random rand, BlockPos pos)
    {
        int count = 3 + rand.nextInt(6);
        for (int i = 0; i < count; i++)
        {
            int offset = ForgeModContainer.fixVanillaCascading ? 8 : 0;
            BlockPos blockpos = pos.add(rand.nextInt(16) + offset, rand.nextInt(28) + 4, rand.nextInt(16) + offset);

            IBlockState state = worldIn.getBlockState(blockpos);
            if (state.getBlock().isReplaceableOreGen(state, worldIn, blockpos, BlockMatcher.forBlock(Block.getBlockFromName(data.spawnBlock))))
            {
                worldIn.setBlockState(blockpos, oreBlock, 16 | 2);
            }
        }
        return true;
    }
}
