package com.sownathlete.pswg.block;


import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockCustomPressurePlate extends BlockPressurePlate {
    private final Block baseBlock;

    public BlockCustomPressurePlate(String name, Block baseBlock, float hardness, String toolType, int harvestLevel, SoundType stepSound, boolean isMultiSided) {
        super(name, Material.wood, BlockPressurePlate.Sensitivity.everything);
        // Custom properties and behavior for the pressure plate, similar to BlockCustomSolid
        this.baseBlock = baseBlock;
        this.setBlockName(name);
        this.setHardness(hardness);
        this.setHarvestLevel(toolType, harvestLevel);
        this.setStepSound(stepSound);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return this.baseBlock.getIcon(side, meta);
    }
}
