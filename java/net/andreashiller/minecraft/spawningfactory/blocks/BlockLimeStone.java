package net.andreashiller.minecraft.spawningfactory.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

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

}
