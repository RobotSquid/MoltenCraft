package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.block.BlockCompressedMC;
import com.robotsquid.moltencraft.block.BlockOreMC;
import com.robotsquid.moltencraft.block.compressed.BlockBlazium;
import com.robotsquid.moltencraft.block.compressed.BlockWitherium;
import com.robotsquid.moltencraft.block.tileentity.BlockNightMaker;
import com.robotsquid.moltencraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCompressedMC blockTitanium = new BlockCompressedMC("blockTitanium", 5.0F, 2);
    public static final BlockOreMC oreTitanium = new BlockOreMC("oreTitanium", 3.0F, 2);
    public static final BlockBlazium blockBlazium = new BlockBlazium();
    public static final BlockWitherium blockWitherium = new BlockWitherium();

    public static final BlockNightMaker blockNightMaker = new BlockNightMaker();

    public static void init()
    {
        GameRegistry.registerBlock(blockTitanium, "blockTitanium");
        GameRegistry.registerBlock(oreTitanium, "oreTitanium");
        GameRegistry.registerBlock(blockBlazium, "blockBlazium");
        GameRegistry.registerBlock(blockWitherium, "blockWitherium");

        GameRegistry.registerBlock(blockNightMaker, "blockNightMaker");
    }
}
