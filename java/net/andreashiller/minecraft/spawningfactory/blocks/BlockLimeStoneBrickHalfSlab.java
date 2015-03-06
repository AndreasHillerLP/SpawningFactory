package net.andreashiller.minecraft.spawningfactory.blocks;

import java.util.Random;

import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.andreashiller.minecraft.spawningfactory.handlers.BlockHandler;
import net.andreashiller.minecraft.spawningfactory.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLimeStoneBrickHalfSlab extends BlockSlab {
	
	@SideOnly(Side.CLIENT)
	private IIcon SlabTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon SlabSide;

	public BlockLimeStoneBrickHalfSlab(boolean fullblock, Material material) {
		super(fullblock, material);
		this.setBlockName("BlockLimeStoneBrickHalfSlab");
		if (!fullblock)
		{
			setCreativeTab(SpawningFactory.tabSpawningFactory);
			setHarvestLevel("pickaxe", 1);
			setHardness(3.0F);
			setResistance(5.0F);
			setStepSound(Block.soundTypeStone);
			
		}
		else
		{
			setHarvestLevel("pickaxe", 1);
			setHardness(3.0F);
			setResistance(5.0F);
			setStepSound(Block.soundTypeStone);
		}
		
		this.setLightOpacity(0);
	}
	
	public IIcon getIcon(int side, int metadata) {
		return side == 1 ? this.SlabTop : side == 0 ? this.SlabTop : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(SpawningFactory.MODID+":limestonebrick");
		this.SlabTop = iconRegister.registerIcon(SpawningFactory.MODID+":limestonebrick");
		this.SlabSide = iconRegister.registerIcon(SpawningFactory.MODID+":limestonebrick");
	}
	
	@Override
	public Item getItemDropped(int meta, Random rand, int fortune) {
	        return Item.getItemFromBlock(BlockHandler.blockLimeStoneBrickHalfSlab);
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	        return this.field_150004_a ? 2 : 1;
	}

	@Override
	public String func_150002_b(int var1) {
		return super.getUnlocalizedName();
	}

}
