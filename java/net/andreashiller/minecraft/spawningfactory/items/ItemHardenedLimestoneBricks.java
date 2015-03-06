package net.andreashiller.minecraft.spawningfactory.items;

import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.minecraft.item.Item;

public class ItemHardenedLimestoneBricks extends Item {
	public ItemHardenedLimestoneBricks() {
		this.setCreativeTab(SpawningFactory.tabSpawningFactory);
		this.setUnlocalizedName("ItemHardenedLimestoneBricks");
		this.setMaxStackSize(64);
		this.setTextureName(SpawningFactory.MODID+":"+"hardenedlimestonebricks");
	}
}
