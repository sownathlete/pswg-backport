package com.sownathlete.pswg.block;

import com.sownathlete.pswg.Galaxies;

import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCustomBush extends BlockBush {
    public BlockCustomBush(String name) {
        super(Material.vine); // Use vine material for plant-like behavior
        this.setBlockName(name);
        this.setBlockTextureName("pswg:" + name);
        this.setCreativeTab(Galaxies.TabBlocks); // Set the creative tab
        this.setHardness(0.0F);
        this.setStepSound(soundTypeGrass);
    }
}
