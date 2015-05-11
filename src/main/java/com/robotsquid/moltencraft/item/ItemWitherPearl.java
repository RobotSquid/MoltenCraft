package com.robotsquid.moltencraft.item;

import com.robotsquid.moltencraft.entity.EntityWitherPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWitherPearl extends ItemMC
{
    public ItemWitherPearl()
    {
        super("witherPearl", 16);
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }

        if (!world.isRemote)
        {
            world.spawnEntityInWorld(new EntityWitherPearl(world, player));
        }

        return stack;
    }
}
