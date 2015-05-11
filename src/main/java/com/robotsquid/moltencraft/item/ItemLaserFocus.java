package com.robotsquid.moltencraft.item;

import com.robotsquid.moltencraft.utility.NBTHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class ItemLaserFocus extends ItemMC
{
    public ItemLaserFocus()
    {
        super("focusLaser", 1);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        if (NBTHelper.hasTag(stack, "displayName")) {
            list.add(EnumChatFormatting.RED + String.format("%s Focus", NBTHelper.getString(stack, "displayName")));
        }
        else
        {
            list.add(EnumChatFormatting.RED + "Generic Focus [WIP]");
        }
    }
}
