package net.andreashiller.minecraft.spawningfactory.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.andreashiller.minecraft.spawningfactory.blocks.BlockLimeStone;
import net.andreashiller.minecraft.spawningfactory.blocks.BlockLimeStoneBrick;
import net.andreashiller.minecraft.spawningfactory.blocks.BlockLimeStoneBrickHalfSlab;
import net.andreashiller.minecraft.spawningfactory.blocks.BlockLimeStoneBrickStairs;
import net.andreashiller.minecraft.spawningfactory.items.ItemLimeStoneBrickSlab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHandler {
	// DECLARATION BLOCKS
	public static Block blockLimeStone;
	public static Block blockLimeStoneBrick;
	public static Block blockLimeStoneBrickStairs;
	public static Block blockLimeStoneBrickHalfSlab;
	public static Block blockLimeStoneBrickDoubleSlab;
	
	// CREATE NEW BLOCKS
	public static void createNewBlocks() {
		blockLimeStone = new BlockLimeStone(Material.rock);
		blockLimeStoneBrick = new BlockLimeStoneBrick(Material.rock);
		blockLimeStoneBrickStairs = new BlockLimeStoneBrickStairs(BlockHandler.blockLimeStoneBrick);
		blockLimeStoneBrickHalfSlab = new BlockLimeStoneBrickHalfSlab(false, Material.rock);
		blockLimeStoneBrickDoubleSlab = new BlockLimeStoneBrickHalfSlab(true, Material.rock);
	}
	
	// REGISTER NEW BLOCKS
	public static void registerNewBlocks() {
		GameRegistry.registerBlock(blockLimeStone, "BlockLimeStone");
		GameRegistry.registerBlock(blockLimeStoneBrick, "BlockLimeStoneBrick");
		GameRegistry.registerBlock(blockLimeStoneBrickStairs, "BlockLimeStoneBrickStairs");
		GameRegistry.registerBlock(blockLimeStoneBrickHalfSlab, ItemLimeStoneBrickSlab.class, "BlockBloodDiamondHalfSlab");
		GameRegistry.registerBlock(blockLimeStoneBrickDoubleSlab, ItemLimeStoneBrickSlab.class, "BlockBloodDiamondDoubleSlab");
	}
}
