package net.andreashiller.minecraft.spawningfactory.items;

import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.minecraft.item.Item;

public class ItemLimestoneDust extends Item {
	public ItemLimestoneDust() {
		this.setCreativeTab(SpawningFactory.tabSpawningFactory);
		this.setUnlocalizedName("ItemLimestoneDust");
		this.setMaxStackSize(64);
		this.setTextureName(SpawningFactory.MODID+":"+"limestonedust");
	}
}
