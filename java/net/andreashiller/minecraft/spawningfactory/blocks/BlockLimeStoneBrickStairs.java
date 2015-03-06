package net.andreashiller.minecraft.spawningfactory.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockLimeStoneBrickStairs extends BlockStairs {

	Block block;
	
	public BlockLimeStoneBrickStairs(Block block) {
		super(block, 0);
		this.block = block;
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setBlockName("BlockLimeStoneBrickStairs");
		setHarvestLevel("pickaxe", 1);
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(Block.soundTypeStone);
		useNeighborBrightness=true;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {
		this.blockIcon = iconregister.registerIcon(SpawningFactory.MODID+":"+"limestonebrick");
	}

}
