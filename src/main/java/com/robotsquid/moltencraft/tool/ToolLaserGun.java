package com.robotsquid.moltencraft.tool;

import com.robotsquid.moltencraft.entity.EntityLaserBeam;
import com.robotsquid.moltencraft.item.ItemMC;
import com.robotsquid.moltencraft.utility.NBTHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import java.util.List;

public class ToolLaserGun extends ItemMC
{
    private int mode = 0;
    private String[] modes = new String[]{"damage", "explosion", "lightning"};

    public ToolLaserGun()
    {
        super("gunLaser", 1);
        this.isFull3D();
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            if (player.isSneaking() && NBTHelper.getBoolean(stack, "isMulti"))
            {
                changeMode(stack, world);
            }
            else
            {
                float damage = NBTHelper.getFloat(stack, "damage");
                float explosionRadius = NBTHelper.getFloat(stack, "explosionRadius");
                String special = NBTHelper.getString(stack, "special");
                world.spawnEntityInWorld(new EntityLaserBeam(world, player, damage, explosionRadius, special));
            }
        }

        return stack;
    }

    private void changeMode(ItemStack stack, World world)
    {
        mode = (mode + 1 >= modes.length) ? 0 : mode + 1;

        switch (mode)
        {
            case 0:
                NBTHelper.setFloat(stack, "damage", 20.0F);
                NBTHelper.setFloat(stack, "explosionRadius", 1.0F);
                NBTHelper.setString(stack, "special", "none");
                break;
            case 1:
                NBTHelper.setFloat(stack, "damage", 2.0F);
                NBTHelper.setFloat(stack, "explosionRadius", 4.0F);
                NBTHelper.setString(stack, "special", "none");
                break;
            case 2:
                NBTHelper.setFloat(stack, "damage", 4.0F);
                NBTHelper.setFloat(stack, "explosionRadius", 1.0F);
                NBTHelper.setString(stack, "special", "lightning");
                break;
        }

        if (!world.isRemote)
        {
            String message = String.format("Mode changed to %s", modes[mode]);
            MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(message));
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        if (NBTHelper.hasTag(stack, "displayName")) {
            list.add(EnumChatFormatting.RED + String.format("Focus: %s", NBTHelper.getString(stack, "displayName")));
        }
        else
        {
            list.add(EnumChatFormatting.BLUE + "Focus: None");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack)
    {
        if (NBTHelper.hasTag(stack, "displayName"))
        {
            if (NBTHelper.getString(stack, "displayName").equalsIgnoreCase("multi")){
                return EnumRarity.epic;
            }
            else
            {
                return EnumRarity.rare;
            }
        }
        else
        {
            return EnumRarity.common;
        }
    }

    @Override
    public boolean hasEffect(ItemStack stack, int pass)
    {
        return (NBTHelper.hasTag(stack, "displayName") && NBTHelper.getString(stack, "displayName").equalsIgnoreCase("multi"));
    }
}
