package net.andreashiller.minecraft.spawningfactory;

import net.andreashiller.minecraft.spawningfactory.handlers.BlockHandler;
import net.andreashiller.minecraft.spawningfactory.handlers.DropHandler;
import net.andreashiller.minecraft.spawningfactory.handlers.ItemHandler;
import net.andreashiller.minecraft.spawningfactory.handlers.RecipeHandler;
import net.andreashiller.minecraft.spawningfactory.handlers.WorldGen;
import net.andreashiller.minecraft.spawningfactory.misc.CBEventListener;
import net.andreashiller.minecraft.spawningfactory.misc.TabSpawningFactory;
import net.andreashiller.minecraft.spawningfactory.misc.Version;
import net.andreashiller.minecraft.spawningfactory.proxies.ServerProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
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
	public static final String VERSION = "1.0.4";
	
	// MODINSTANCE
	@Instance(value=SpawningFactory.MODID)
	public static SpawningFactory instance;
	
	// DECLARATION PROXIES
	@SidedProxy(clientSide = "net.andreashiller.minecraft.spawningfactory.proxies.ClientProxy", serverSide = "net.andreashiller.minecraft.spawningfactory.proxies.ServerProxy")
	public static ServerProxy proxy;
	
	// DECLARE CREATIVETAB
	public static CreativeTabs tabSpawningFactory = new TabSpawningFactory(CreativeTabs.getNextID(),"TabSpawningFactory");
	
	// WORLDGENERATOR
	public static WorldGen WorldGen = new WorldGen();	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BlockHandler.createNewBlocks();
		ItemHandler.createNewItems();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(WorldGen, 1);
		MinecraftForge.EVENT_BUS.register(new DropHandler());
		CBEventListener eventListener = new CBEventListener();
		FMLCommonHandler.instance().bus().register(eventListener);
		BlockHandler.registerNewBlocks();
		ItemHandler.registerNewItems();
		RecipeHandler.registerSmeltingRecipes();
		RecipeHandler.registerShapedRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		new Version();
	}
	
}
