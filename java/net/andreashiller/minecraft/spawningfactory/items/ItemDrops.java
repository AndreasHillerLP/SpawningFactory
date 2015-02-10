package net.andreashiller.minecraft.spawningfactory.items;

import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.minecraft.item.Item;

public class ItemDrops extends Item {
	public ItemDrops() {
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setMaxStackSize(64);
	}
}
