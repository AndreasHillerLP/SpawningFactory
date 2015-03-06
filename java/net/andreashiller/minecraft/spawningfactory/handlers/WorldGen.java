package net.andreashiller.minecraft.spawningfactory.handlers;

import java.util.Random;

import net.andreashiller.minecraft.spawningfactory.SpawningFactory;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId) {
		case -1:
			generateInNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateInOverworld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateInEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
		
	}

	private void generateInEnd(World world, Random random, int x, int z) {
		
	}

	private void generateInOverworld(World world, Random random, int x, int z) {
		// Generate BlockLimeStone
		for (int i=0; i<15; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(BlockHandler.blockLimeStone, 10)).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}
	
	private void generateInNether(World world, Random random, int x, int z) {
		
	}
	
}
