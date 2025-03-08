package com.sownathlete.pswg.block;


import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockCustomButton extends BlockButton {
    private final Block baseBlock;

    public BlockCustomButton(String name, Block baseBlock, float hardness, String toolType, int harvestLevel, SoundType stepSound, boolean isMultiSided) {
        super(false); // This creates a wooden button. Use true for stone buttons.
        // Custom properties and behavior for the button, similar to BlockCustomSolid
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
