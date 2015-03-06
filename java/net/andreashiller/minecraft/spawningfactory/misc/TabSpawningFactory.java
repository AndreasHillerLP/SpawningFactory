package net.andreashiller.minecraft.spawningfactory.misc;

import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.andreashiller.minecraft.spawningfactory.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class TabSpawningFactory extends CreativeTabs {

	public TabSpawningFactory(int id, String name) {
		super(id, name);
	}
	
	@Override
	public Item getTabIconItem() {
		return ItemHandler.itemBlankEgg;
	}

}
