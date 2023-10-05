package fr.xenohart.xeno;

import fr.xenohart.xeno.blocks.ModBlocks;
//import fr.xenohart.xeno.enchantment.ModEnchantments;
//import fr.xenohart.xeno.fluid.ModFluids;
import fr.xenohart.xeno.items.ModItems;
import fr.xenohart.xeno.setup.ClientProxy;
import fr.xenohart.xeno.setup.IProxy;
import fr.xenohart.xeno.setup.ServerProxy;
import fr.xenohart.xeno.util.Config;
import fr.xenohart.xeno.util.Registration;
//import fr.xenohart.xeno.world.biome.ModBiomes;
//import fr.xenohart.xeno.world.biome.surfacebuiler.ModSurfaceBuilders;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(XenoMod.MODID)
public class XenoMod {
    public static final String MODID = "xeno";

    public static IProxy proxy;

    public XenoMod(){
        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        registerModAdditions();

        MinecraftForge.EVENT_BUS.register(this);
    }

    public void setup(final FMLCommonSetupEvent e){
        registerConfigs();

        proxy.init();

//        DeferredWorkQueue.runLater(() ->{
//            GlobalEntityTypeAttributes.put(ModEntityTypes.BOAR.get(), BoarEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.DUCK.get(), DuckEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.MOOBLOOM.get(), MooBloomEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.BONE_SPIDER.get(), BoneSpiderEntity.setCustomAttributes().create());
//            //GlobalEntityTypeAttributes.put(ModEntityTypes.BOULDERING_ZOMBIE.get(), BoulderingZombieEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.CLUCKSHROOM.get(), CluckShroomEntity.setCustomAttributes().create());
//            //GlobalEntityTypeAttributes.put(ModEntityTypes.HORNED_SHEEP.get(), HornedSheepEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.JOLLY_LLAMA.get(), JollyLlamaEntity.setCustomAttributes().create());
////            GlobalEntityTypeAttributes.put(ModEntityTypes.LOBBER_ZOMBIE.get(), LobberZombieEntity.setCustomAttributes().create());
////            GlobalEntityTypeAttributes.put(ModEntityTypes.MUDDY_PIG.get(), MuddyPigEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.RAINBOW_SHEEP.get(), RainbowSheepEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.VILER_WITCH.get(), VilerWitchEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.WOOLY_COW.get(), WoolyCowEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.BEAR.get(), BearEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.PENGUIN.get(), BearEntity.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(ModEntityTypes.BLUE_SLIME.get(), BlueSlimeEntity.setCustomAttributes().create());
//
//        });

        loadConfigs();
    }
    private void registerConfigs(){
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);
    }

    private void loadConfigs(){
        Config.loadConfigFile(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("xenomod-client.toml").toString());
        Config.loadConfigFile(Config.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("xenomod-server.toml").toString());
    }

    private void registerModAdditions(){
        Registration.init();

        ModItems.register();
        ModBlocks.register();
        //ModEntityTypes.register();
        //ModFluids.register();
        //ModEnchantments.register();
        //ModSurfaceBuilders.register();
        //ModBiomes.register();
    }


    public static final CreativeModeTab XENO_BLOCK = new CreativeModeTab("xeno_block"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModBlocks.QUICKSAND.get());
        }
    };

    public static final CreativeModeTab XENO_DECORATION = new CreativeModeTab("xeno_decoration"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModBlocks.QUICKSAND.get());
        } //Buttercup
    };

    public static final CreativeModeTab XENO_REDSTONE = new CreativeModeTab("xeno_redstone"){
        @Override
        public ItemStack makeIcon(){ return new ItemStack(ModBlocks.REDSTONE_DUST_BLUE.get()); }
    };

    public static final CreativeModeTab XENO_MISCELLANEOUS = new CreativeModeTab("xeno_miscellaneous"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.RUBY.get());
        }
    };

    public static final CreativeModeTab XENO_FOOD = new CreativeModeTab("xeno_food"){
        @Override
        public ItemStack makeIcon(){ return new ItemStack(ModItems.DIAMOND_APPLE.get()); }
    };

    public static final CreativeModeTab XENO_TOOLS = new CreativeModeTab("xeno_tools"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.SAPHIR_AXE.get());
        }
    };

    public static final CreativeModeTab XENO_COMBAT = new CreativeModeTab("xeno_combat"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.EMERALD_SWORD.get());
        }
    };
}
