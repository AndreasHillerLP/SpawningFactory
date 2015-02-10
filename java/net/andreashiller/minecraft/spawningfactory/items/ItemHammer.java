package net.andreashiller.minecraft.spawningfactory.items;

import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.minecraft.item.Item;

public class ItemHammer extends Item {
	public ItemHammer() {
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setUnlocalizedName("ItemHammer");
		setMaxStackSize(1);
		setMaxDamage(511);
		setTextureName(SpawningFactory.MODID+":"+"hammer");
	}
}
