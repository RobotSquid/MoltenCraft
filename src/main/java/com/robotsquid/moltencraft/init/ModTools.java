package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.reference.ConfigurationReference;
import com.robotsquid.moltencraft.reference.Reference;
import com.robotsquid.moltencraft.tool.ToolChestPlacer;
import com.robotsquid.moltencraft.tool.ToolFluidWrench;
import com.robotsquid.moltencraft.tool.ToolLaserGun;
import com.robotsquid.moltencraft.tool.ToolLightningHammer;
import com.robotsquid.moltencraft.tool.axe.AxeMC;
import com.robotsquid.moltencraft.tool.hoe.HoeMC;
import com.robotsquid.moltencraft.tool.pickaxe.PickaxeMC;
import com.robotsquid.moltencraft.tool.shovel.ShovelMC;
import com.robotsquid.moltencraft.tool.sword.SwordAdmin;
import com.robotsquid.moltencraft.tool.sword.SwordFire;
import com.robotsquid.moltencraft.tool.sword.SwordMC;
import com.robotsquid.moltencraft.tool.sword.SwordWither;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModTools
{
    public static final SwordFire fireStick = new SwordFire();
    public static final SwordWither witherStick = new SwordWither();
    public static final SwordAdmin adminSword = new SwordAdmin();
    public static final SwordMC swordTitanium = new SwordMC(ModMaterials.TITANIUM, "swordTitanium");

    public static final AxeMC axeTitanium = new AxeMC(ModMaterials.TITANIUM, "axeTitanium");

    public static final ShovelMC shovelTitanium = new ShovelMC(ModMaterials.TITANIUM, "shovelTitanium");

    public static final PickaxeMC pickaxeTitanium = new PickaxeMC(ModMaterials.TITANIUM, "pickaxeTitanium");

    public static final HoeMC hoeTitanium = new HoeMC(ModMaterials.TITANIUM, "hoeTitanium");

    public static final ToolFluidWrench fluidWrench = new ToolFluidWrench();
    public static final ToolLaserGun gunLaser = new ToolLaserGun();
    public static final ToolChestPlacer chestPlacer = new ToolChestPlacer();
    public static final ToolLightningHammer lightningHammer = new ToolLightningHammer();

    public static void init()
    {
        GameRegistry.registerItem(fluidWrench, "fluidWrench");
        GameRegistry.registerItem(lightningHammer, "lightningHammer");

        GameRegistry.registerItem(swordTitanium, "swordTitanium");

        GameRegistry.registerItem(axeTitanium, "axeTitanium");

        GameRegistry.registerItem(shovelTitanium, "shovelTitanium");

        GameRegistry.registerItem(pickaxeTitanium, "pickaxeTitanium");

        GameRegistry.registerItem(hoeTitanium, "hoeTitanium");

        GameRegistry.registerItem(chestPlacer, "chestPlacer");

        if (ConfigurationReference.enableOPTools)
        {
            GameRegistry.registerItem(fireStick, "fireStick");
            GameRegistry.registerItem(witherStick, "witherStick");
            GameRegistry.registerItem(adminSword, "adminSword");
            GameRegistry.registerItem(gunLaser, "gunLaser");
        }
    }
}
