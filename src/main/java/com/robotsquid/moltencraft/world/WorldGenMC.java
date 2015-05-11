package com.robotsquid.moltencraft.world;

import com.robotsquid.moltencraft.init.ModBlocks;
import com.robotsquid.moltencraft.reference.ConfigurationReference;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGenMC implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case 0: generateOverworld(world, random, chunkX, chunkZ); break;
            case 1: break;
            case -1: break;
            default: generateOverworld(world, random, chunkX, chunkZ);
        }
    }

    private void generateOverworld(World world, Random random, int chunkX, int chunkZ)
    {
        generateOres(ModBlocks.oreTitanium, Blocks.stone, world, random, chunkX * 16, chunkZ * 16, ConfigurationReference.veinsInChunkTitanium, ConfigurationReference.minVeinSizeTitanium, ConfigurationReference.maxVeinSizeTitanium, ConfigurationReference.minHeightTitanium, ConfigurationReference.maxHeightTitanium);
    }

    /**
     *
     * @param block The block to generate
     * @param replace The block to replace
     * @param world The world to generate in
     * @param random Random
     * @param chunkBlockX The X coords of the first block in the chunk
     * @param chunkBlockZ The Z coords of the first block in the chunk
     * @param veinsInChunk Amount of veins to generate in a chunk
     * @param minVeinSize Min vein size
     * @param maxVeinSize Max vein size
     * @param minHeight Min Y level
     * @param maxHeight Max Y level
     */

    public void generateOres(Block block, Block replace, World world, Random random, int chunkBlockX, int chunkBlockZ, int veinsInChunk, int minVeinSize, int maxVeinSize, int minHeight, int maxHeight)
    {
        WorldGenMinable minable = new WorldGenMinable(block, minVeinSize + random.nextInt(maxVeinSize - minVeinSize), replace);
        for (int i = 0; i < veinsInChunk; i++)
        {
            int posX = chunkBlockX + random.nextInt(15);
            int posZ = chunkBlockZ + random.nextInt(15);
            int posY = minHeight + random.nextInt(maxHeight - minHeight);
            minable.generate(world, random, posX, posY, posZ);
        }
    }
}
