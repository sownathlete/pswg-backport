package com.sownathlete.pswg;

import java.util.Random;

import com.sownathlete.pswg.client.SwgCommonProxy;
import com.sownathlete.pswg.container.SwgBlocks;
import com.sownathlete.pswg.container.SwgEntities;
import com.sownathlete.pswg.container.SwgFluids;
import com.sownathlete.pswg.container.SwgItems;
import com.sownathlete.pswg.container.SwgRecipes;
import com.sownathlete.pswg.handler.BucketHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "pswg", version = "1.0.0", name = "Galaxies: Parzi's Star Wars Mod", acceptedMinecraftVersions = "[1.7.10]")
public class Galaxies {

    public static final String MODID = "pswg";
    public static final Random rngGeneral = new Random();

    @Mod.Instance(value = "pswg")
    public static Galaxies instance;

    @SidedProxy(clientSide = "com.sownathlete.pswg.client.SwgClientProxy", serverSide = "com.sownathlete.pswg.client.SwgCommonProxy")
    public static SwgCommonProxy proxy;

    public static SimpleNetworkWrapper network;
	public static CreativeTabs TabBlocks;
	public static CreativeTabs TabItems;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        
        proxy.doSidedThings();
        SwgEntities.register();
        SwgItems.register();
        SwgBlocks.register();
        SwgFluids.register();
        MinecraftForge.EVENT_BUS.register(new BucketHandler());
        SwgRecipes.registerAll();
        proxy.registerRendering();
    }

	static {
		TabBlocks = new TabBlocks("pswg.blocks");
		TabItems = new TabItems("pswg.items");
//		tabUtil = new TabUtil("pswgUtilTab");
//		tabFood = new TabFood("pswgFoodTab");
//		tabMaterials = new TabMaterials("pswgMaterialsTab");
//		tabMisc = new TabMisc("pswgMiscTab");
//		tabHyperdrives = new TabHyperdrives("pswgHyperdrivesTab");
//		tabTools = new TabTools("pswgToolsTab");
//		tabCombat = new TabWeapons("pswgCombatTab");
//		tabStory = new TabStory("pswgStoryTab");
//		tabSpawn = new TabSpawning("pswgSpawnTab");
	}
	
}
