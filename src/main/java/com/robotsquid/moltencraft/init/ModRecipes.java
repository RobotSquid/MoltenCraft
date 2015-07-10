package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.crafting.LaserFocusRecipe;
import com.robotsquid.moltencraft.crafting.LaserGunRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.RecipeSorter;

public class ModRecipes
{
    public static void init()
    {
        RecipeSorter.register("moltencraft:laserGun", LaserGunRecipe.class, RecipeSorter.Category.SHAPED, "after:minecraft:shaped");
        RecipeSorter.register("moltencraft:laserFocus", LaserFocusRecipe.class, RecipeSorter.Category.SHAPED, "after:minecraft:shaped");

        GameRegistry.addRecipe(new LaserGunRecipe(new ItemStack(ModTools.gunLaser), " tt", "c f", "t  ", 't', new ItemStack(ModItems.ingotTitanium), 'c', new ItemStack(ModItems.crystalLaser), 'f', new ItemStack(ModItems.focusLaser)));

        GameRegistry.addRecipe(new LaserFocusRecipe(new ItemStack(ModItems.focusLaser), "Damage", " t", "sp", " t", 't', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.iron_sword), 'p', new ItemStack(Blocks.glass_pane)));
        GameRegistry.addRecipe(new LaserFocusRecipe(new ItemStack(ModItems.focusLaser), "Explosion", " t", "gp", " t", 't', new ItemStack(ModItems.ingotTitanium), 'g', new ItemStack(Items.gunpowder), 'p', new ItemStack(Blocks.glass_pane)));
        GameRegistry.addRecipe(new LaserFocusRecipe(new ItemStack(ModItems.focusLaser), "Lightning", " t", "lp", " t", 't', new ItemStack(ModItems.ingotTitanium), 'l', new ItemStack(Items.emerald), 'p', new ItemStack(Blocks.glass_pane)));

        GameRegistry.addSmelting(ModBlocks.oreTitanium, new ItemStack(ModItems.ingotTitanium), 0.0F);
        GameRegistry.addSmelting(ModItems.blendBlazium, new ItemStack(ModItems.ingotBlazium), 10.0F);
        GameRegistry.addSmelting(ModItems.blendWitherium, new ItemStack(ModItems.ingotWitherium), 20.0F);
        GameRegistry.addSmelting(ModItems.dustTitanium, new ItemStack(ModItems.ingotTitanium), 0.0F);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotTitanium, 9), new ItemStack(ModBlocks.blockTitanium));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotBlazium, 9), new ItemStack(ModBlocks.blockBlazium));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotWitherium, 9), new ItemStack(ModBlocks.blockWitherium));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustWither, 2), new ItemStack(Items.skull, 1, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blendWitherium, 2), new ItemStack(ModItems.ingotTitanium), new ItemStack(ModItems.dustWither), new ItemStack(ModItems.dustWither));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blendBlazium, 2), new ItemStack(ModItems.ingotTitanium), new ItemStack(Items.blaze_powder), new ItemStack(Items.blaze_powder));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockBlazium), "bbb", "bbb", "bbb", 'b', new ItemStack(ModItems.ingotBlazium));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockTitanium), "ttt", "ttt", "ttt", 't', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockWitherium), "www", "www", "www", 'w', new ItemStack(ModItems.ingotWitherium));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockNightMaker), "oeo", "epe", "oeo", 'o', new ItemStack(Blocks.obsidian), 'e', new ItemStack(Items.ender_pearl), 'p', new ItemStack(ModItems.witherPearl));

        GameRegistry.addShapedRecipe(new ItemStack(ModTools.swordTitanium), "t", "t", "s", 't', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModTools.pickaxeTitanium), "ttt", " s ", " s ", 't', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModTools.axeTitanium), "tt", "ts", " s", 't', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModTools.shovelTitanium), "t", "s", "s", 't', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModTools.hoeTitanium), "tt", " s", " s", 't', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));

        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.bootsTitanium), "t t", "t t", 't', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.leggingsTitanium), "ttt", "t t", "t t", 't', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.chestplateTitanium), "t t", "ttt", "ttt", 't', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.helmetTitanium), "ttt", "t t", 't', new ItemStack(ModItems.ingotTitanium));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.appleTitanium), "ttt", "tat", "ttt", 't', new ItemStack(ModBlocks.blockTitanium), 'a', new ItemStack(Items.apple));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.witherPearl), " w ", "wpw", " w ", 'w', new ItemStack(ModItems.dustWither), 'p', new ItemStack(Items.ender_pearl));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.crystalLaser), "tr ", "rdp", "tr ", 't', new ItemStack(ModItems.ingotTitanium), 'r', new ItemStack(Items.redstone), 'd', new ItemStack(Items.nether_star), 'p', new ItemStack(Blocks.glass_pane));

        GameRegistry.addShapedRecipe(new ItemStack(ModTools.witherStick), "w", "w", "s", 'w', new ItemStack(ModItems.ingotWitherium), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModTools.fireStick), "b", "b", "r", 'b', new ItemStack(ModItems.ingotBlazium), 'r', new ItemStack(Items.blaze_rod));

        GameRegistry.addShapedRecipe(new ItemStack(ModTools.fluidWrench), "t t", " i ", " t ", 't', new ItemStack(ModItems.ingotTitanium), 'i', new ItemStack(Items.iron_ingot));
    }
}