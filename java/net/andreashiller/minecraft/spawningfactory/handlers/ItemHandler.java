package net.andreashiller.minecraft.spawningfactory.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.andreashiller.minecraft.spawningfactory.items.ItemBlankEgg;
import net.andreashiller.minecraft.spawningfactory.items.ItemDrops;
import net.andreashiller.minecraft.spawningfactory.items.ItemHammer;
import net.andreashiller.minecraft.spawningfactory.items.ItemHardenedLimestoneBricks;
import net.andreashiller.minecraft.spawningfactory.items.ItemLimestoneDust;
import net.minecraft.item.Item;

public class ItemHandler {
	// DECLARATION ITEMS
	public static Item itemLimestoneDust;
	public static Item itemHardenedLimestoneBricks;
	
	// EGGS
	public static Item itemBlankEgg;
	public static Item itemPigEgg;
	public static Item itemCowEgg;
	public static Item itemHorseEgg;
	public static Item itemChickenEgg;
	public static Item itemSquidEgg;
	public static Item itemOcelotEgg;
	public static Item itemVillagerEgg;
	public static Item itemBatEgg;
	public static Item itemSheepEgg;
	public static Item itemCreeperEgg;
	public static Item itemSkeletonEgg;
	public static Item itemSpiderEgg;
	public static Item itemZombieEgg;
	public static Item itemSlimeEgg;
	public static Item itemEndermanEgg;
	public static Item itemCavespiderEgg;
	public static Item itemSilverfishEgg;
	public static Item itemWitchEgg;
	public static Item itemWolfEgg;
	public static Item itemGhastEgg;
	public static Item itemZombiePigmanEgg;
	public static Item itemBlazeEgg;
	public static Item itemMagmacubeEgg;
	public static Item itemMooshroomEgg;
		
	// DROPS
	public static Item itemPigDrop;
	public static Item itemCowDrop;
	public static Item itemHorseDrop;
	public static Item itemChickenDrop;
	public static Item itemSquidDrop;
	public static Item itemOcelotDrop;
	public static Item itemVillagerDrop;
	public static Item itemBatDrop;
	public static Item itemSheepDrop;
	public static Item itemCreeperDrop;
	public static Item itemSkeletonDrop;
	public static Item itemSpiderDrop;
	public static Item itemZombieDrop;
	public static Item itemSlimeDrop;
	public static Item itemEndermanDrop;
	public static Item itemCavespiderDrop;
	public static Item itemSilverfishDrop;
	public static Item itemWitchDrop;
	public static Item itemWolfDrop;
	public static Item itemBlazeDrop;
	public static Item itemMagmacubeDrop;
	
	// CREATE NEW ITEMS
	public static void createNewItems() {
		itemLimestoneDust = new ItemLimestoneDust();
		itemHardenedLimestoneBricks = new ItemHardenedLimestoneBricks();
		itemBlankEgg = new ItemBlankEgg().setUnlocalizedName("ItemBlankEgg").setTextureName("spawn_egg");
		itemPigEgg = new ItemBlankEgg().setUnlocalizedName("ItemPigEgg").setTextureName(SpawningFactory.MODID+":"+"pigegg");
		itemCowEgg = new ItemBlankEgg().setUnlocalizedName("ItemCowEgg").setTextureName(SpawningFactory.MODID+":"+"cowegg");
		itemHorseEgg = new ItemBlankEgg().setUnlocalizedName("ItemHorseEgg").setTextureName(SpawningFactory.MODID+":"+"horseegg");
		itemChickenEgg = new ItemBlankEgg().setUnlocalizedName("ItemChickenEgg").setTextureName(SpawningFactory.MODID+":"+"chickenegg");
		itemSquidEgg = new ItemBlankEgg().setUnlocalizedName("ItemSquidEgg").setTextureName(SpawningFactory.MODID+":"+"squidegg");
		itemOcelotEgg = new ItemBlankEgg().setUnlocalizedName("ItemOcelotEgg").setTextureName(SpawningFactory.MODID+":"+"ocelotegg");
		itemVillagerEgg = new ItemBlankEgg().setUnlocalizedName("ItemVillagerEgg").setTextureName(SpawningFactory.MODID+":"+"villageregg");
		itemBatEgg = new ItemBlankEgg().setUnlocalizedName("ItemBatEgg").setTextureName(SpawningFactory.MODID+":"+"bategg");
		itemSheepEgg = new ItemBlankEgg().setUnlocalizedName("ItemSheepEgg").setTextureName(SpawningFactory.MODID+":"+"sheepegg");
		itemCreeperEgg = new ItemBlankEgg().setUnlocalizedName("ItemCreeperEgg").setTextureName(SpawningFactory.MODID+":"+"creeperegg");
		itemSkeletonEgg = new ItemBlankEgg().setUnlocalizedName("ItemSkeletonEgg").setTextureName(SpawningFactory.MODID+":"+"skeletonegg");
		itemSpiderEgg = new ItemBlankEgg().setUnlocalizedName("ItemSpiderEgg").setTextureName(SpawningFactory.MODID+":"+"spideregg");
		itemZombieEgg = new ItemBlankEgg().setUnlocalizedName("ItemZombieEgg").setTextureName(SpawningFactory.MODID+":"+"zombieegg");
		itemSlimeEgg = new ItemBlankEgg().setUnlocalizedName("ItemSlimeEgg").setTextureName(SpawningFactory.MODID+":"+"slimeegg");
		itemEndermanEgg = new ItemBlankEgg().setUnlocalizedName("ItemEndermanEgg").setTextureName(SpawningFactory.MODID+":"+"endermanegg");
		itemCavespiderEgg = new ItemBlankEgg().setUnlocalizedName("ItemCavespiderEgg").setTextureName(SpawningFactory.MODID+":"+"cavespideregg");
		itemSilverfishEgg = new ItemBlankEgg().setUnlocalizedName("ItemSilverfishEgg").setTextureName(SpawningFactory.MODID+":"+"silverfishegg");
		itemWitchEgg = new ItemBlankEgg().setUnlocalizedName("ItemWitchEgg").setTextureName(SpawningFactory.MODID+":"+"witchegg");
		itemWolfEgg = new ItemBlankEgg().setUnlocalizedName("ItemWolfEgg").setTextureName(SpawningFactory.MODID+":"+"wolfegg");
		itemGhastEgg = new ItemBlankEgg().setUnlocalizedName("ItemGhastEgg").setTextureName(SpawningFactory.MODID+":"+"ghastegg");
		itemZombiePigmanEgg = new ItemBlankEgg().setUnlocalizedName("ItemZombiePigmanEgg").setTextureName(SpawningFactory.MODID+":"+"zombiepigmanegg");
		itemBlazeEgg = new ItemBlankEgg().setUnlocalizedName("ItemBlazeEgg").setTextureName(SpawningFactory.MODID+":"+"blazeegg");
		itemMagmacubeEgg = new ItemBlankEgg().setUnlocalizedName("ItemMagmacubeEgg").setTextureName(SpawningFactory.MODID+":"+"magmacubeegg");
		itemMooshroomEgg = new ItemBlankEgg().setUnlocalizedName("ItemMooshroomEgg").setTextureName(SpawningFactory.MODID+":"+"mooshroomegg");
		itemPigDrop = new ItemDrops().setUnlocalizedName("ItemPigDrop").setTextureName(SpawningFactory.MODID+":"+"pigdrop");
		itemCowDrop = new ItemDrops().setUnlocalizedName("ItemCowDrop").setTextureName(SpawningFactory.MODID+":"+"cowdrop");
		itemHorseDrop = new ItemDrops().setUnlocalizedName("ItemHorseDrop").setTextureName(SpawningFactory.MODID+":"+"horsedrop");
		itemChickenDrop = new ItemDrops().setUnlocalizedName("ItemChickenDrop").setTextureName(SpawningFactory.MODID+":"+"chickendrop");
		itemSquidDrop = new ItemDrops().setUnlocalizedName("ItemSquidDrop").setTextureName(SpawningFactory.MODID+":"+"squiddrop");
		itemOcelotDrop = new ItemDrops().setUnlocalizedName("ItemOcelotDrop").setTextureName(SpawningFactory.MODID+":"+"ocelotdrop");
		itemVillagerDrop = new ItemDrops().setUnlocalizedName("ItemVillagerDrop").setTextureName(SpawningFactory.MODID+":"+"villagerdrop");
		itemBatDrop = new ItemDrops().setUnlocalizedName("ItemBatDrop").setTextureName(SpawningFactory.MODID+":"+"batdrop");
		itemSheepDrop = new ItemDrops().setUnlocalizedName("ItemSheepDrop").setTextureName(SpawningFactory.MODID+":"+"sheepdrop");
		itemCreeperDrop = new ItemDrops().setUnlocalizedName("ItemCreeperDrop").setTextureName(SpawningFactory.MODID+":"+"creeperdrop");
		itemSkeletonDrop = new ItemDrops().setUnlocalizedName("ItemSkeletonDrop").setTextureName(SpawningFactory.MODID+":"+"skeletondrop");
		itemSpiderDrop = new ItemDrops().setUnlocalizedName("ItemSpiderDrop").setTextureName(SpawningFactory.MODID+":"+"spiderdrop");
		itemZombieDrop = new ItemDrops().setUnlocalizedName("ItemZombieDrop").setTextureName(SpawningFactory.MODID+":"+"zombiedrop");
		itemSlimeDrop = new ItemDrops().setUnlocalizedName("ItemSlimeDrop").setTextureName(SpawningFactory.MODID+":"+"slimedrop");
		itemEndermanDrop = new ItemDrops().setUnlocalizedName("ItemEndermanDrop").setTextureName(SpawningFactory.MODID+":"+"endermandrop");
		itemCavespiderDrop = new ItemDrops().setUnlocalizedName("ItemCavespiderDrop").setTextureName(SpawningFactory.MODID+":"+"cavespiderdrop");
		itemSilverfishDrop = new ItemDrops().setUnlocalizedName("ItemSilverfishDrop").setTextureName(SpawningFactory.MODID+":"+"silverfishdrop");
		itemWitchDrop = new ItemDrops().setUnlocalizedName("ItemWitchDrop").setTextureName(SpawningFactory.MODID+":"+"witchdrop");
		itemWolfDrop = new ItemDrops().setUnlocalizedName("ItemWolfDrop").setTextureName(SpawningFactory.MODID+":"+"wolfdrop");
		itemBlazeDrop = new ItemDrops().setUnlocalizedName("ItemBlazeDrop").setTextureName(SpawningFactory.MODID+":"+"blazedrop");
		itemMagmacubeDrop = new ItemDrops().setUnlocalizedName("ItemMagmacubeDrop").setTextureName(SpawningFactory.MODID+":"+"magmacubedrop");
	}
	
	// REGISTER NEW ITEMS
	public static void registerNewItems() {
		GameRegistry.registerItem(itemLimestoneDust, "ItemLimestoneDust");
		GameRegistry.registerItem(itemHardenedLimestoneBricks, "ItemHardenedLimestoneBricks");
		GameRegistry.registerItem(itemBlankEgg, "ItemBlankEgg");
		GameRegistry.registerItem(itemPigEgg, "ItemPigEgg");
		GameRegistry.registerItem(itemCowEgg, "ItemCowEgg");
		GameRegistry.registerItem(itemHorseEgg, "ItemHorseEgg");
		GameRegistry.registerItem(itemChickenEgg, "ItemChickenEgg");
		GameRegistry.registerItem(itemSquidEgg, "ItemSquidEgg");
		GameRegistry.registerItem(itemOcelotEgg, "ItemOcelotEgg");
		GameRegistry.registerItem(itemVillagerEgg, "ItemVillagerEgg");
		GameRegistry.registerItem(itemBatEgg, "ItemBatEgg");
		GameRegistry.registerItem(itemSheepEgg, "ItemSheepEgg");
		GameRegistry.registerItem(itemCreeperEgg, "ItemCreeperEgg");
		GameRegistry.registerItem(itemSkeletonEgg, "ItemSkeletonEgg");
		GameRegistry.registerItem(itemSpiderEgg, "ItemSpiderEgg");
		GameRegistry.registerItem(itemZombieEgg, "ItemZombieEgg");
		GameRegistry.registerItem(itemSlimeEgg, "ItemSlimeEgg");
		GameRegistry.registerItem(itemEndermanEgg, "ItemEndermanEgg");
		GameRegistry.registerItem(itemCavespiderEgg, "ItemCavespiderEgg");
		GameRegistry.registerItem(itemSilverfishEgg, "ItemSilverfishEgg");
		GameRegistry.registerItem(itemWitchEgg, "ItemWitchEgg");
		GameRegistry.registerItem(itemWolfEgg, "ItemWolfEgg");
		GameRegistry.registerItem(itemGhastEgg, "ItemGhastEgg");
		GameRegistry.registerItem(itemZombiePigmanEgg, "ItemZombiePigmanEgg");
		GameRegistry.registerItem(itemBlazeEgg, "ItemBlazeEgg");
		GameRegistry.registerItem(itemMagmacubeEgg, "ItemMagmacubeEgg");
		GameRegistry.registerItem(itemMooshroomEgg, "ItemMooshroomEgg");
		GameRegistry.registerItem(itemPigDrop, "ItemPigDrop");
		GameRegistry.registerItem(itemCowDrop, "ItemCowDrop");
		GameRegistry.registerItem(itemHorseDrop, "ItemHorseDrop");
		GameRegistry.registerItem(itemChickenDrop, "ItemChickenDrop");
		GameRegistry.registerItem(itemSquidDrop, "ItemSquidDrop");
		GameRegistry.registerItem(itemOcelotDrop, "ItemOcelotDrop");
		GameRegistry.registerItem(itemVillagerDrop, "ItemVillagerDrop");
		GameRegistry.registerItem(itemBatDrop, "ItemBatDrop");
		GameRegistry.registerItem(itemSheepDrop, "ItemSheepDrop");
		GameRegistry.registerItem(itemCreeperDrop, "ItemCreeperDrop");
		GameRegistry.registerItem(itemSkeletonDrop, "ItemSkeletonDrop");
		GameRegistry.registerItem(itemSpiderDrop, "ItemSpiderDrop");
		GameRegistry.registerItem(itemZombieDrop, "ItemZombieDrop");
		GameRegistry.registerItem(itemSlimeDrop, "ItemSlimeDrop");
		GameRegistry.registerItem(itemEndermanDrop, "ItemEndermanDrop");
		GameRegistry.registerItem(itemCavespiderDrop, "ItemCavespiderDrop");
		GameRegistry.registerItem(itemSilverfishDrop, "ItemSilverfishDrop");
		GameRegistry.registerItem(itemWitchDrop, "ItemWitchDrop");
		GameRegistry.registerItem(itemWolfDrop, "ItemWolfDrop");
		GameRegistry.registerItem(itemBlazeDrop, "ItemBlazeDrop");
		GameRegistry.registerItem(itemMagmacubeDrop, "ItemMagmacubeDrop");
	}
}