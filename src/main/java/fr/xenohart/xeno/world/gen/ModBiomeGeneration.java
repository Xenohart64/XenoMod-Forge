package fr.xenohart.xeno.world.gen;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.world.biome.ModBiomes;
import fr.xenohart.xeno.world.biome.surfacebuiler.ModConfiguredSurfaceBuilders;
import fr.xenohart.xeno.world.biome.surfacebuiler.ModSurfaceBuilders;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

import static net.minecraftforge.common.BiomeDictionary.Type.*;

@Mod.EventBusSubscriber(modid = XenoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomeGeneration {

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void register(final RegistryEvent.Register<SurfaceBuilder<?>> event){
        registerBiome(ModConfiguredSurfaceBuilders.CHERRY_BLOSSOM_SURFACE.getLocation(), Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState());
        registerBiome(ModConfiguredSurfaceBuilders.AUTUMNAL_SURFACE.getLocation(), Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState());
        registerBiome(ModConfiguredSurfaceBuilders.RED_DESERT_SURFACE.getLocation(), Blocks.RED_SAND.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState(), Blocks.STONE.getDefaultState());

    }

    public static void setupBiome(final FMLCommonSetupEvent event){
        event.enqueueWork(() -> {
            addBiome(ModBiomes.CHERRY_BLOSSOM_BIOME.get(), BiomeManager.BiomeType.COOL, 100, FOREST);
            addBiome(ModBiomes.AUTUMNAL_BIOME.get(), BiomeManager.BiomeType.COOL, 100, FOREST);
            addBiome(ModBiomes.RED_DESERT_BIOME.get(), BiomeManager.BiomeType.DESERT, 100, DRY);

        });
    }

    private static void registerBiome(ResourceLocation biomeRL, BlockState topBlock, BlockState fillerBlock, BlockState underwaterBlock){
        Registry.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, biomeRL, ModSurfaceBuilders.LOGGING_DEFAULT.get().func_242929_a(new SurfaceBuilderConfig(topBlock, fillerBlock, underwaterBlock)));
    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types){
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES, Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));
        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }
}
