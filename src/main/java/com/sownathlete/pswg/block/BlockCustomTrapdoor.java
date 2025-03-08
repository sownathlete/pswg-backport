package com.sownathlete.pswg.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockCustomTrapdoor extends BlockTrapDoor {

    private Block baseBlock;
    private IIcon icon;

    public BlockCustomTrapdoor(String name, Block baseBlock, float hardness, String toolType, int harvestLevel, SoundType stepSound, boolean isMultiSided) {
        super(Material.rock); // replace Material.iron with the appropriate Material for your block
        this.baseBlock = baseBlock;
        // Custom properties and behavior for the trapdoor, similar to BlockCustomSolid
        this.setBlockName(name);
        this.setHardness(hardness);
        this.setHarvestLevel(toolType, harvestLevel);
        this.setStepSound(stepSound);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        // No need to register the icon as it will be derived from the base block
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        // Here we return the icon of the base block
        return this.baseBlock.getIcon(side, meta);
    }
}
