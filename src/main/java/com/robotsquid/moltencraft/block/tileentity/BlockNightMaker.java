package com.robotsquid.moltencraft.block.tileentity;

import com.robotsquid.moltencraft.block.BlockTileEntityMC;
import com.robotsquid.moltencraft.reference.Reference;
import com.robotsquid.moltencraft.tileentity.TileNightMaker;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockNightMaker extends BlockTileEntityMC
{
    private IIcon[] icons = new IIcon[6];

    public BlockNightMaker()
    {
        super(Material.iron, "nightMaker", 1.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileNightMaker();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        ((TileNightMaker)world.getTileEntity(x, y, z)).setUsed(player);

        if (!world.isRemote && world.getTileEntity(x,y,z) != null && world.getTileEntity(x,y,z) instanceof TileNightMaker)
        {
            world.setWorldTime(13000);
            for (int i = 0; i < 4; i++)
            {
                world.addWeatherEffect(new EntityLightningBolt(world, x, y, z));
            }

            if (!player.capabilities.isCreativeMode)
            {
                player.setHealth(10.0F);
                player.addPotionEffect(new PotionEffect(Potion.blindness.id, 200, 0));
                player.addPotionEffect(new PotionEffect(Potion.wither.id, 200, 0));
            }

            String playerName = ((TileNightMaker) world.getTileEntity(x, y, z)).getUsed().getDisplayName();
            String message = String.format("%s %s", playerName, "changed the world to night");
            MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(message));
        }

        return true;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < 6; i++)
        {
            switch (i)
            {
                case 0:
                case 1:
                    icons[i] = iconRegister.registerIcon(String.format("%s:nightMakerTop", Reference.MOD_ID.toLowerCase()));
                    break;
                default:
                    icons[i] = iconRegister.registerIcon(String.format("%s:nightMakerSide", Reference.MOD_ID.toLowerCase()));
                    break;
            }
        }
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        return icons[side];
    }
}
