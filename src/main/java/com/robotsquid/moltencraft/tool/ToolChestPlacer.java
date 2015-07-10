package com.robotsquid.moltencraft.tool;

import com.robotsquid.moltencraft.item.ItemMC;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;

import java.util.Random;

import static net.minecraftforge.common.ChestGenHooks.DUNGEON_CHEST;

public class ToolChestPlacer extends ItemMC
{
    public ToolChestPlacer()
    {
        super("chestPlacer", 1);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz)
    {
        world.setBlock(x, y, z, Blocks.chest, 0, 2);
        TileEntityChest tileentitychest = (TileEntityChest)world.getTileEntity(x, y , z);

        if (tileentitychest != null)
        {
            Random random = new Random();
            WeightedRandomChestContent.generateChestContents(random, ChestGenHooks.getItems(DUNGEON_CHEST, random), tileentitychest, ChestGenHooks.getCount(DUNGEON_CHEST, random));
        }

        return true;
    }
}
