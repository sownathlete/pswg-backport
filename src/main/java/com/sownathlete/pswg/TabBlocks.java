package com.sownathlete.pswg;

import java.util.List;

import com.sownathlete.pswg.container.SwgBlocks;

import java.util.ArrayList;
import java.util.Collections;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.ArrayList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabBlocks extends CreativeTabs {

    public TabBlocks(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(SwgBlocks.getRegisteredBlock("gray_imperial_light_1"));
    }

    public void displayAllReleventItems(List items) {
        // This will be the order in which items appear in the tab.
        
        // 1. Normal blocks:
        items.addAll(getAllNormalBlocks());

        // 2. Slabs:
        items.addAll(getAllSlabs());

        // 3. Stairs:
        items.addAll(getAllStairs());

        // 4. Walls:
        items.addAll(getAllWalls());

        // ... add other categories as needed.

        // If you want, you can sort items within these categories as well.
    }

    private List<ItemStack> getAllNormalBlocks() {
        List<ItemStack> normalBlockStacks = new ArrayList<>();
        for(Block block : SwgBlocks.solidBlocks) {
            normalBlockStacks.add(new ItemStack(block));
        }
        return normalBlockStacks;
    }

    private List<ItemStack> getAllSlabs() {
        List<ItemStack> slabBlockStacks = new ArrayList<>();
        for(Block block : SwgBlocks.slabBlocks) {
            slabBlockStacks.add(new ItemStack(block));
        }
        return slabBlockStacks;
    }

    private List<ItemStack> getAllStairs() {
        List<ItemStack> stairsBlockStacks = new ArrayList<>();
        for(Block block : SwgBlocks.stairsBlocks) {
            stairsBlockStacks.add(new ItemStack(block));
        }
        return stairsBlockStacks;
    }

    private List<ItemStack> getAllWalls() {
        List<ItemStack> wallBlockStacks = new ArrayList<>();
        for(Block block : SwgBlocks.wallBlocks) {
            wallBlockStacks.add(new ItemStack(block));
        }
        return wallBlockStacks;
    }
}
