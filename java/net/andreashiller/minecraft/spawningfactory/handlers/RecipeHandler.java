package net.andreashiller.minecraft.spawningfactory.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	// REGISTER SMELTING RECIPES
	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(ItemHandler.itemLimestoneDust, new ItemStack(ItemHandler.itemHardenedLimestoneBricks, 1), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemPigEgg), new ItemStack(Items.spawn_egg, 1, 90), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemCowEgg), new ItemStack(Items.spawn_egg, 1, 92), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemHorseEgg), new ItemStack(Items.spawn_egg, 1, 100), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemChickenEgg), new ItemStack(Items.spawn_egg, 1, 93), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemSquidEgg), new ItemStack(Items.spawn_egg, 1, 94), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemOcelotEgg), new ItemStack(Items.spawn_egg, 1, 98), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemVillagerEgg), new ItemStack(Items.spawn_egg, 1, 120), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemBatEgg), new ItemStack(Items.spawn_egg, 1, 65), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemSheepEgg), new ItemStack(Items.spawn_egg, 1, 91), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemCreeperEgg), new ItemStack(Items.spawn_egg, 1, 50), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemSkeletonEgg), new ItemStack(Items.spawn_egg, 1, 51), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemSpiderEgg), new ItemStack(Items.spawn_egg, 1, 52), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemZombieEgg), new ItemStack(Items.spawn_egg, 1, 54), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemSlimeEgg), new ItemStack(Items.spawn_egg, 1, 55), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemEndermanEgg), new ItemStack(Items.spawn_egg, 1, 58), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemCavespiderEgg), new ItemStack(Items.spawn_egg, 1, 59), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemSilverfishEgg), new ItemStack(Items.spawn_egg, 1, 60), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemWitchEgg), new ItemStack(Items.spawn_egg, 1, 66), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemWolfEgg), new ItemStack(Items.spawn_egg, 1, 95), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemGhastEgg), new ItemStack(Items.spawn_egg, 1, 56), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemZombiePigmanEgg), new ItemStack(Items.spawn_egg, 1, 57), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemBlazeEgg), new ItemStack(Items.spawn_egg, 1, 61), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemMagmacubeEgg), new ItemStack(Items.spawn_egg, 1, 62), 0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.itemMooshroomEgg), new ItemStack(Items.spawn_egg, 1, 96), 0F);
	}
	
	public static void registerShapedRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBlankEgg, 1), new Object[] {"XXX","X#X","XXX",'X',ItemHandler.itemLimestoneDust,'#',Items.egg});
		GameRegistry.addShapedRecipe(new ItemStack(BlockHandler.blockLimeStoneBrick, 1), new Object[] {"XX","XX",'X',ItemHandler.itemHardenedLimestoneBricks});
		GameRegistry.addShapedRecipe(new ItemStack(BlockHandler.blockLimeStoneBrickStairs, 4), new Object[] {"X  ","XX ","XXX",'X',BlockHandler.blockLimeStoneBrick});
		GameRegistry.addShapedRecipe(new ItemStack(BlockHandler.blockLimeStoneBrickHalfSlab, 6), new Object[] {"XXX",'X',BlockHandler.blockLimeStoneBrick});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemPigEgg, 1), new Object[] {"X#",'#',ItemHandler.itemPigDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemCowEgg, 1), new Object[] {"X#",'#',ItemHandler.itemCowDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemHorseEgg, 1), new Object[] {"X#",'#',ItemHandler.itemHorseDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemChickenEgg, 1), new Object[] {"X#",'#',ItemHandler.itemChickenDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemSquidEgg, 1), new Object[] {"X#",'#',ItemHandler.itemSquidDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemOcelotEgg, 1), new Object[] {"X#",'#',ItemHandler.itemOcelotDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemVillagerEgg, 1), new Object[] {"X#",'#',ItemHandler.itemVillagerDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBatEgg, 1), new Object[] {"X#",'#',ItemHandler.itemBatDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemSheepEgg, 1), new Object[] {"X#",'#',ItemHandler.itemSheepDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemCreeperEgg, 1), new Object[] {"X#",'#',ItemHandler.itemCreeperDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemSkeletonEgg, 1), new Object[] {"X#",'#',ItemHandler.itemSkeletonDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemSpiderEgg, 1), new Object[] {"X#",'#',ItemHandler.itemSpiderDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemZombieEgg, 1), new Object[] {"X#",'#',ItemHandler.itemZombieDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemSlimeEgg, 1), new Object[] {"X#",'#',ItemHandler.itemSlimeDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemEndermanEgg, 1), new Object[] {"X#",'#',ItemHandler.itemEndermanDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemCavespiderEgg, 1), new Object[] {"X#",'#',ItemHandler.itemCavespiderDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemSilverfishEgg, 1), new Object[] {"X#",'#',ItemHandler.itemSilverfishDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemWitchEgg, 1), new Object[] {"X#",'#',ItemHandler.itemWitchDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemWolfEgg, 1), new Object[] {"X#",'#',ItemHandler.itemWolfDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemGhastEgg, 1), new Object[] {"X#",'#',Items.ghast_tear,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemZombiePigmanEgg, 1), new Object[] {"X#","Y ",'#',ItemHandler.itemPigDrop,'X',ItemHandler.itemBlankEgg,'Y',ItemHandler.itemZombieDrop});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBlazeEgg, 1), new Object[] {"X#",'#',ItemHandler.itemBlazeDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemMagmacubeEgg, 1), new Object[] {"X#",'#',ItemHandler.itemMagmacubeDrop,'X',ItemHandler.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemMooshroomEgg, 1), new Object[] {"X#","Y ",'#',ItemHandler.itemCowDrop,'X',ItemHandler.itemBlankEgg,'Y',Blocks.red_mushroom});
	}
}