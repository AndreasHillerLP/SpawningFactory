package net.andreashiller.minecraft.spawningfactory.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.andreashiller.minecraft.spawningfactory.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockLimeStone extends Block {

	public BlockLimeStone(Material material) {
		super(material);
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setBlockName("BlockLimeStone");
		setHarvestLevel("pickaxe", 1);
		setHardness(3.0F);
		setResistance(5.0F);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {
		this.blockIcon = iconregister.registerIcon(SpawningFactory.MODID+":"+"limestone");
	}
	
	public int quantityDropped(Random random)
    {
        return 4;
    }

	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return ItemHandler.itemLimestoneDust;
	}
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 1);
	}

}
