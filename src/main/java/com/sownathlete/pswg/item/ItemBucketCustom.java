package com.sownathlete.pswg.item;

import net.minecraft.item.ItemBucket;

import com.sownathlete.pswg.Galaxies;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;

public class ItemBucketCustom extends ItemBucket {

    public ItemBucketCustom(Block fluidBlock) {
        super(fluidBlock);
        this.setContainerItem(Items.bucket);
        this.setCreativeTab(Galaxies.TabItems); // Set the creative tab to pswg.ItemsTab
    }

    // Additional methods for behavior, etc. can be added here
}
