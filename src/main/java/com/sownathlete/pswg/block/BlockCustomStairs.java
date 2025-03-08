package com.sownathlete.pswg.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCustomStairs extends BlockStairs {

    public BlockCustomStairs(Block mainBlock) {
        super(mainBlock, 0); // Set metadata to 0, which is the default metadata for the main block
        String name = mainBlock.getUnlocalizedName().substring(5); // Assuming the unlocalized name has "pswg." prefix
        this.setBlockName(name + "_stairs");
        this.setBlockTextureName("pswg:" + name);
        this.setHardness(mainBlock.getBlockHardness(null, 0, 0, 0));
        this.setStepSound(mainBlock.stepSound);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}