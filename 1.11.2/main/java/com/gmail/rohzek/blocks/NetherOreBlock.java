package com.gmail.rohzek.blocks;

import java.util.List;
import java.util.Random;

import com.gmail.rohzek.items.SGItems;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

/**
 * Allows you to change things about ALL of the Nether ores specifically
 * @author Rohzek
 *
 */
public class NetherOreBlock extends GenericBlock
{
	private static int aggroRange;
	
	public NetherOreBlock(String unlocalizedName)
	{
		super(unlocalizedName, Material.ROCK, 3f, 15f);
		this.setRegistryName(unlocalizedName);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		this.aggroRange = ConfigurationManager.aggroRange;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == SGOres.NETHER_COAL_ORE ? Items.COAL :
        	   this == SGOres.NETHER_DIAMOND_ORE ? Items.DIAMOND :
        	   this == SGOres.NETHER_EMERALD_ORE ? Items.EMERALD :
        	   this == SGOres.NETHER_LAPIS_ORE ? Items.DYE : 
        	   this == SGOres.NETHER_QUARTZ_ORE ? SGItems.QUARTZ :
        	   this == SGOres.NETHER_REDSTONE_ORE ? Items.REDSTONE :
        	   Item.getItemFromBlock(this);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
		return  this == SGOres.NETHER_COAL_ORE     ? 1 + random.nextInt(2) :
     	   		this == SGOres.NETHER_DIAMOND_ORE  ? 1 + random.nextInt(8) : 
     	   		this == SGOres.NETHER_EMERALD_ORE  ? 1 + random.nextInt(3) :
     	   		this == SGOres.NETHER_LAPIS_ORE    ? 1 + random.nextInt(5) :
     	   		this == SGOres.NETHER_QUARTZ_ORE   ? 1 + random.nextInt(2) :
     	   		this == SGOres.NETHER_REDSTONE_ORE ? 1 + random.nextInt(5) :
     	   		1;
    }
	
	@Override
	public int damageDropped(IBlockState state)
    {
        return this == SGOres.NETHER_LAPIS_ORE ? EnumDyeColor.BLUE.getDyeDamage() : 0;
    }
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		if(this == SGOres.NETHER_LAPIS_ORE)
		{
			return new ItemStack(Item.getItemFromBlock(SGOres.NETHER_LAPIS_ORE));
		}
		else
		{
			return super.getPickBlock(state, target, world, pos, player);
		}
	}
	
	@Override
    public boolean isFireSource(World world, BlockPos blockPos, EnumFacing facing) {
        return facing == EnumFacing.UP;
    }
	
	@Override
	public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te, ItemStack stack) 
	{
		super.harvestBlock(world, player, pos, state, te, stack);
		
		if(ConfigurationManager.zombiePigsAttack)
		{
			angerPigmen(player, world, pos);
		}
	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
	
	@Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int i = 0;

            if (this == SGOres.NETHER_COAL_ORE)
            {
                i = MathHelper.getInt(rand, 0, 2);
            }
            else if (this == SGOres.NETHER_DIAMOND_ORE)
            {
                i = MathHelper.getInt(rand, 3, 7);
            }
            else if (this == SGOres.NETHER_EMERALD_ORE)
            {
                i = MathHelper.getInt(rand, 3, 7);
            }
            else if (this == SGOres.NETHER_LAPIS_ORE)
            {
                i = MathHelper.getInt(rand, 2, 5);
            }
            else if (this == SGOres.NETHER_QUARTZ_ORE)
            {
                i = MathHelper.getInt(rand, 2, 5);
            }

            return i;
        }
        return 0;
    }
	
	public int getAggroRange()
	{
		return aggroRange;
	}
	
	private void angerPigmen(EntityPlayer player, World world, BlockPos pos)
	{
		int x = pos.getX(), y = pos.getY(), z = pos.getZ();
		
		List<?> list = world.getEntitiesWithinAABB(EntityPigZombie.class, new AxisAlignedBB(x - aggroRange, y - aggroRange, z - aggroRange, x + aggroRange, y + aggroRange, z + aggroRange));
		
		for(int i = 0; i < list.size(); i++)
		{
			Entity entity = (Entity)list.get(i);
			if(entity instanceof EntityPigZombie)
			{
				EntityPigZombie zombiePig = (EntityPigZombie)entity;
				zombiePig.setRevengeTarget(player);
				LogHelper.log("Zombie pigs aggro applied to: " + player.getDisplayNameString());
			}
		}
	}
}
