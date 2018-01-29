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
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

/**
 * Lets you change things about ALL of the End blocks specifically.
 * @author Rohzek
 *
 */
public class EndOreBlock extends GenericBlock
{
	private static int aggroRange, coalDrop, diamondDrop, emeraldDrop, lapisDrop, quartzDrop, redstoneDrop, rubyDrop, sapphireDrop;
	
	public EndOreBlock(String unlocalizedName)
	{
		super(unlocalizedName, Material.ROCK, 3f, 15f);
		
		this.setRegistryName(unlocalizedName);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		this.aggroRange = ConfigurationManager.aggroRangeEndermen;
	}
	
	public static void setDropRates()
	{
		if(ConfigurationManager.zombiePigsAttack)
		{
			coalDrop = 3;
			diamondDrop = 3;
			emeraldDrop = 3;
			lapisDrop = 6;
			quartzDrop = 3;
			redstoneDrop = 4;
			
			rubyDrop = 3;
			sapphireDrop = 3;
		}
		else
		{
			coalDrop = 1;
			diamondDrop = 1;
			emeraldDrop = 1;
			lapisDrop = 4;
			quartzDrop = 1;
			redstoneDrop = 1;
			
			rubyDrop = 1;
			sapphireDrop = 1;
		}
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == SGOres.getBlockEnd("coal")    ? Items.COAL :
        	   this == SGOres.getBlockEnd("diamond")   ? Items.DIAMOND :
        	   this == SGOres.getBlockEnd("emerald")   ? Items.EMERALD :
        	   this == SGOres.getBlockEnd("lapis")    ? Items.DYE :
        	   this == SGOres.getBlockEnd("quartz")   ? SGItems.QUARTZ :
        	   this == SGOres.getBlockEnd("redstone") ? Items.REDSTONE :
        	   this == SGOres.getBlockEnd("ruby") ? SGItems.RUBY :
        	   this == SGOres.getBlockEnd("sapphire") ? SGItems.SAPPHIRE :
        	   Item.getItemFromBlock(this);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
		return  this == SGOres.getBlockEnd("coal")     ? 1 + random.nextInt(coalDrop) :
     	   		this == SGOres.getBlockEnd("diamond")  ? 1 + random.nextInt(diamondDrop) : 
     	   		this == SGOres.getBlockEnd("emerald")  ? 1 + random.nextInt(emeraldDrop) :
     	   		this == SGOres.getBlockEnd("lapis")    ? 4 + random.nextInt(lapisDrop) :
     	   		this == SGOres.getBlockEnd("quartz")   ? 1 + random.nextInt(quartzDrop) :
     	   		this == SGOres.getBlockEnd("redstone") ? 4 + random.nextInt(redstoneDrop) :
     	   		this == SGOres.getBlockEnd("ruby")  ? 1 + random.nextInt(rubyDrop) :
     	   		this == SGOres.getBlockEnd("sapphire")  ? 1 + random.nextInt(sapphireDrop) :
     	   		1;
    }
	
	@Override
	public int damageDropped(IBlockState state)
    {
        return this == SGOres.getBlockEnd("lapis") ? EnumDyeColor.BLUE.getDyeDamage() : 0;
    }
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		if(this == SGOres.getBlockEnd("lapis"))
		{
			return new ItemStack(Item.getItemFromBlock(SGOres.getBlockEnd("lapis")));
		}
		else
		{
			return super.getPickBlock(state, target, world, pos, player);
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

            if (this == SGOres.getBlockEnd("coal"))
            {
                i = MathHelper.getRandomIntegerInRange(rand, 0, 2);
            }
            
            else if (this == SGOres.getBlockEnd("diamond"))
            {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            
            else if (this == SGOres.getBlockEnd("emerald"))
            {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            
            else if (this == SGOres.getBlockEnd("lapis"))
            {
                i = MathHelper.getRandomIntegerInRange(rand, 2, 5);
            }
            
            else if (this == SGOres.getBlockEnd("quartz"))
            {
                i = MathHelper.getRandomIntegerInRange(rand, 2, 5);
            }
            
            else if (this == SGOres.getBlockEnd("ruby"))
            {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            
            else if (this == SGOres.getBlockEnd("sapphire"))
            {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }

            return i;
        }
        return 0;
    }
	
	@Override
	public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te, ItemStack stack) 
	{
		super.harvestBlock(world, player, pos, state, te, stack);
		
		if(ConfigurationManager.endermenAttack)
		{
			angerEndermen(player, world, pos);
		}
	}
	
	public int getAggroRange()
	{
		return aggroRange;
	}
	
	private void angerEndermen(EntityPlayer player, World world, BlockPos pos)
	{
		int x = pos.getX(), y = pos.getY(), z = pos.getZ();
		
		List<?> list = world.getEntitiesWithinAABB(EntityEnderman.class, new AxisAlignedBB(x - aggroRange, y - aggroRange, z - aggroRange, x + aggroRange, y + aggroRange, z + aggroRange));
		
		for(int i = 0; i < list.size(); i++)
		{
			Entity entity = (Entity)list.get(i);
			if(entity instanceof EntityEnderman)
			{
				EntityEnderman enderman = (EntityEnderman)entity;
				enderman.setRevengeTarget(player);
				LogHelper.debug("Endermen aggro applied to: " + player.getDisplayNameString());
			}
		}
	}
}
