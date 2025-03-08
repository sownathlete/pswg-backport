package com.sownathlete.pswg.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class CustomBlockCrops extends BlockCrops {
    private Item customSeed;
    private Item customFood;
    private static final int NUMBER_OF_STAGES = 8; // Change this to the number of stages I want
    private IIcon[] icons;
    private String name;

    public CustomBlockCrops(String name) {
        super();
        this.name = name;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.icons = new IIcon[NUMBER_OF_STAGES];
        for (int i = 0; i < this.icons.length; ++i) {
            this.icons[i] = reg.registerIcon("pswg:" + this.name + "_stage_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta < 0 || meta >= this.icons.length) {
            meta = this.icons.length - 1;
        }

        return this.icons[meta];
    }

    public void setCustomDrops(Item customSeed, Item customFood) {
        this.customSeed = customSeed;
        this.customFood = customFood;
    }

    @Override
    public Item getItem(World world, int x, int y, int z) {
        return this.customSeed;
    }

    @Override
    public void dropBlockAsItemWithChance(World world, int x, int y, int z, int metadata, float chance, int fortune) {
        if (!world.isRemote && world.getGameRules().getGameRuleBooleanValue("doTileDrops")) {
            if (metadata >= 7) { // Fully grown
                int count = 3 + fortune;
                for (int i = 0; i < count; i++) {
                    if (world.rand.nextInt(15) <= metadata) {
                        this.dropBlockAsItem(world, x, y, z, new ItemStack(this.customSeed, 1, 0));
                    }
                }
                this.dropBlockAsItem(world, x, y, z, new ItemStack(this.customFood, 1, 0));
            }
        }
    }

}