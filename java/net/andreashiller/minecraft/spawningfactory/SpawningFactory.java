package net.andreashiller.minecraft.spawningfactory;

import net.andreashiller.minecraft.spawningfactory.blocks.BlockLimeStone;
import net.andreashiller.minecraft.spawningfactory.handlers.CraftingHandler;
import net.andreashiller.minecraft.spawningfactory.handlers.DropHandler;
import net.andreashiller.minecraft.spawningfactory.handlers.WorldGen;
import net.andreashiller.minecraft.spawningfactory.items.ItemBlankEgg;
import net.andreashiller.minecraft.spawningfactory.items.ItemDrops;
import net.andreashiller.minecraft.spawningfactory.items.ItemHammer;
import net.andreashiller.minecraft.spawningfactory.items.ItemLimestoneDust;
import net.andreashiller.minecraft.spawningfactory.misc.TabSpawningFactory;
import net.andreashiller.minecraft.spawningfactory.proxies.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=SpawningFactory.MODID, name=SpawningFactory.NAME, version=SpawningFactory.VERSION)
public class SpawningFactory {
	
	// MODDATA
	public static final String MODID = "spawningfactory";
	public static final String NAME = "SpawningFactory Mod";
	public static final String VERSION = "1.0.2";
	
	// MODINSTANCE
	@Instance(value=SpawningFactory.MODID)
	public static SpawningFactory instance;
	
	// DECLARATION ITEMS
	public static Item itemLimestoneDust;
	public static Item itemHammer;
	
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
	
	// DECLARATION BLOCKS
	public static Block blockLimeStone;
	
	// DECLARATION PROXIES
	@SidedProxy(clientSide = "net.andreashiller.minecraft.spawningfactory.proxies.ClientProxy", serverSide = "net.andreashiller.minecraft.spawningfactory.proxies.ServerProxy")
	public static ServerProxy proxy;
	
	// DECLARE CREATIVETAB
	public static CreativeTabs tabSpawningFactory = new TabSpawningFactory(CreativeTabs.getNextID(),"TabSpawningFactory");
	
	// WORLDGENERATOR
	public static WorldGen WorldGen = new WorldGen();	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		createNewBlocks();
		createNewItems();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		GameRegistry.registerWorldGenerator(WorldGen, 1);
		MinecraftForge.EVENT_BUS.register(new DropHandler());
		registerNewBlocks();
		registerNewItems();
		registerSmeltingRecipes();
		registerShapedRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	// CREATE NEW BLOCKS
	public void createNewBlocks() {
		blockLimeStone = new BlockLimeStone(Material.rock);
	}
	
	// REGISTER NEW BLOCKS
	public void registerNewBlocks() {
		GameRegistry.registerBlock(blockLimeStone, "BlockLimeStone");
	}
	
	// CREATE NEW ITEMS
	public void createNewItems() {
		itemLimestoneDust = new ItemLimestoneDust();
		itemHammer = new ItemHammer();
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
	public void registerNewItems() {
		GameRegistry.registerItem(itemLimestoneDust, "ItemLimestoneDust");
		GameRegistry.registerItem(itemHammer, "ItemHammer");
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
	
	// REGISTER SMELTING RECIPES
	public void registerSmeltingRecipes() {
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemPigEgg), new ItemStack(Items.spawn_egg, 1, 90), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemCowEgg), new ItemStack(Items.spawn_egg, 1, 92), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemHorseEgg), new ItemStack(Items.spawn_egg, 1, 100), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemChickenEgg), new ItemStack(Items.spawn_egg, 1, 93), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemSquidEgg), new ItemStack(Items.spawn_egg, 1, 94), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemOcelotEgg), new ItemStack(Items.spawn_egg, 1, 98), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemVillagerEgg), new ItemStack(Items.spawn_egg, 1, 120), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemBatEgg), new ItemStack(Items.spawn_egg, 1, 65), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemSheepEgg), new ItemStack(Items.spawn_egg, 1, 91), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemCreeperEgg), new ItemStack(Items.spawn_egg, 1, 50), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemSkeletonEgg), new ItemStack(Items.spawn_egg, 1, 51), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemSpiderEgg), new ItemStack(Items.spawn_egg, 1, 52), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemZombieEgg), new ItemStack(Items.spawn_egg, 1, 54), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemSlimeEgg), new ItemStack(Items.spawn_egg, 1, 55), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemEndermanEgg), new ItemStack(Items.spawn_egg, 1, 58), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemCavespiderEgg), new ItemStack(Items.spawn_egg, 1, 59), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemSilverfishEgg), new ItemStack(Items.spawn_egg, 1, 60), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemWitchEgg), new ItemStack(Items.spawn_egg, 1, 66), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemWolfEgg), new ItemStack(Items.spawn_egg, 1, 95), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemGhastEgg), new ItemStack(Items.spawn_egg, 1, 56), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemZombiePigmanEgg), new ItemStack(Items.spawn_egg, 1, 57), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemBlazeEgg), new ItemStack(Items.spawn_egg, 1, 61), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemMagmacubeEgg), new ItemStack(Items.spawn_egg, 1, 62), 0F);
		GameRegistry.addSmelting(new ItemStack(SpawningFactory.itemMooshroomEgg), new ItemStack(Items.spawn_egg, 1, 96), 0F);
	}
	
	public void registerShapedRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemHammer, 1), new Object[] {" XX","XXX"," # ",'X',Items.iron_ingot,'#',Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemLimestoneDust, 4), new Object[] {"X#",'X',blockLimeStone,'#',new ItemStack(itemHammer, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemBlankEgg, 1), new Object[] {"XXX","X#X","XXX",'X',SpawningFactory.itemLimestoneDust,'#',Items.egg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemPigEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemPigDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemCowEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemCowDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemHorseEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemHorseDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemChickenEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemChickenDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemSquidEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemSquidDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemOcelotEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemOcelotDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemVillagerEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemVillagerDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemBatEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemBatDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemSheepEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemSheepDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemCreeperEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemCreeperDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemSkeletonEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemSkeletonDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemSpiderEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemSpiderDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemZombieEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemZombieDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemSlimeEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemSlimeDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemEndermanEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemEndermanDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemCavespiderEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemCavespiderDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemSilverfishEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemSilverfishDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemWitchEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemWitchDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemWolfEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemWolfDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemGhastEgg, 1), new Object[] {"X#",'#',Items.ghast_tear,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemZombiePigmanEgg, 1), new Object[] {"X#","Y ",'#',SpawningFactory.itemPigDrop,'X',SpawningFactory.itemBlankEgg,'Y',SpawningFactory.itemZombieDrop});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemBlazeEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemBlazeDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemMagmacubeEgg, 1), new Object[] {"X#",'#',SpawningFactory.itemMagmacubeDrop,'X',SpawningFactory.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(SpawningFactory.itemMooshroomEgg, 1), new Object[] {"X#","Y ",'#',SpawningFactory.itemCowDrop,'X',SpawningFactory.itemBlankEgg,'Y',Blocks.red_mushroom});
	}
	
}
