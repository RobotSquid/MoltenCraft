package com.robotsquid.moltencraft.tool;

import com.robotsquid.moltencraft.entity.EntityLaserBeam;
import com.robotsquid.moltencraft.item.ItemMC;
import com.robotsquid.moltencraft.utility.NBTHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import java.util.List;

public class ToolLaserGun extends ItemMC
{
    public ToolLaserGun()
    {
        super("gunLaser", 1);
        this.isFull3D();
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            float damage = NBTHelper.getFloat(stack, "damage");
            float explosionRadius = NBTHelper.getFloat(stack, "explosionRadius");
            world.spawnEntityInWorld(new EntityLaserBeam(world, player, damage, explosionRadius));
        }

        return stack;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        if (NBTHelper.hasTag(stack, "displayName")) {
            list.add(EnumChatFormatting.RED + String.format("Focus: %s", NBTHelper.getString(stack, "displayName")));
        }
        else
        {
            list.add(EnumChatFormatting.RED + "Focus: None");
        }
    }
}
