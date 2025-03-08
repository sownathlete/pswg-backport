package com.sownathlete.pswg.item;

import java.util.HashMap;
import java.util.Map;

import com.sownathlete.pswg.Galaxies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBucket;
import net.minecraftforge.fluids.BlockFluidClassic;

public class ItemCustomBucket extends ItemBucket {
    private static Map<String, ItemCustomBucket> buckets = new HashMap<>();

    public static ItemCustomBucket getBucketForFluid(String fluidName) {
        return buckets.get(fluidName);
    }

    public ItemCustomBucket(Block fluidBlock) {
        super(fluidBlock);
        this.setCreativeTab(Galaxies.TabItems);
        buckets.put(((BlockFluidClassic)fluidBlock).getFluid().getName(), this);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("pswg:" + this.getUnlocalizedName().substring(5));
    }
}
