//package fr.xenohart.xeno.setup;
//
//import fr.xenohart.xeno.XenoMod;
//import fr.xenohart.xeno.blocks.ModBlocks;
//import fr.xenohart.xeno.entities.ModEntityTypes;
//import fr.xenohart.xeno.entities.render.*;
//import fr.xenohart.xeno.items.ModSpawnEggItem;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.RenderType;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.fml.common.Mod;
//
//@Mod.EventBusSubscriber(modid = XenoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
//public class ClientProxy implements IProxy {
//    public void init(){
//        //RenderTypeLookup.setRenderLayer(ModBlocks.PALM_TREE_SAPLING.get(), RenderType.getCutout());
//        RenderTypeLookup.setRenderLayer(ModBlocks.CHERRY_BLOSSOM_SAPLING.get(), RenderType.getCutout());
//        RenderTypeLookup.setRenderLayer(ModBlocks.RED_AUTUMNAL_SAPLING.get(), RenderType.getCutout());
//        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_AUTUMNAL_SAPLING.get(), RenderType.getCutout());
//        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_AUTUMNAL_SAPLING.get(), RenderType.getCutout());
//        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_AUTUMNAL_SAPLING.get(), RenderType.getCutout());
//        RenderTypeLookup.setRenderLayer(ModBlocks.BUTTERCUP.get(), RenderType.getCutout());
//
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BOAR.get(), BoarRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DUCK.get(), DuckRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MOOBLOOM.get(), MooBloomRender::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BONE_SPIDER.get(), BoneSpiderRender::new);
//        //RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BOULDERING_ZOMBIE.get(), BoulderingZombieRender::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CLUCKSHROOM.get(), CluckShroomRender::new);
//        //RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.HORNED_SHEEP.get(), HornedSheepRender::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JOLLY_LLAMA.get(), JollyLlamaRender::new);
//       // RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LOBBER_ZOMBIE.get(), LobberZombieRender::new);
//        //RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MUDDY_PIG.get(), MuddyPigRender::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RAINBOW_SHEEP.get(), RainbowSheepRender::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.VILER_WITCH.get(), VilerWitchRender::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.WOOLY_COW.get(), WoolyCowRender::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BEAR.get(), BearRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.PENGUIN.get(), PenguinRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BLUE_SLIME.get(), BlueSlimeRenderer::new);
//
//
//        ModSpawnEggItem.initSpawnEggs();
//    }
//
//    public World getClientWorld(){
//        return Minecraft.getInstance().world;
//    }
//}
