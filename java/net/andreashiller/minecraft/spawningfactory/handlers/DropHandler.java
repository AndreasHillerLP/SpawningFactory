package net.andreashiller.minecraft.spawningfactory.handlers;

import java.util.Random;

import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
	
	public static int rand;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		
		rand = new Random().nextInt(2);
		
		if(event.entityLiving instanceof EntityPig) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemPigDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityCow) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemCowDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityHorse) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemHorseDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityChicken) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemChickenDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySquid) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemSquidDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityOcelot) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemOcelotDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityVillager) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemVillagerDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityBat) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemBatDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySheep) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemSheepDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityCreeper) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemCreeperDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySkeleton) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemSkeletonDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySpider) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemSpiderDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityZombie) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemZombieDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySlime) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemSlimeDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityEnderman) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemEndermanDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityCaveSpider) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemCavespiderDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySilverfish) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemSilverfishDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityWitch) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemWitchDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityWolf) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemWolfDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityGhast) {
			event.entityLiving.entityDropItem(new ItemStack(Items.ghast_tear, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityBlaze) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemBlazeDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityMagmaCube) {
			event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemMagmacubeDrop, rand), 2F);
		}
	}
	
}