package net.andreashiller.minecraft.spawningfactory.items;

import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.minecraft.item.Item;

public class ItemBlankEgg extends Item {
	public ItemBlankEgg() {
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setMaxStackSize(16);
	}
}