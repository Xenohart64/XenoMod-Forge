package fr.xenohart.xeno.world.biome;

import fr.xenohart.xeno.util.Registration;
import fr.xenohart.xeno.world.biome.surfacebuiler.ModConfiguredSurfaceBuilders;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.*;
import net.minecraftforge.fml.RegistryObject;

public class ModBiomes {
    public static final RegistryObject<Biome> CHERRY_BLOSSOM_BIOME = Registration.BIOMES.register("cherry_blossom_biome", () -> CherryBlossomBiome.makeCherryBlossomBiome(() -> WorldGenRegistries.CONFIGURED_SURFACE_BUILDER.getOrThrow(ModConfiguredSurfaceBuilders.CHERRY_BLOSSOM_SURFACE), 0.125f, 0.05f));
    public static final RegistryObject<Biome> AUTUMNAL_BIOME = Registration.BIOMES.register("autumnal_biome", () -> AutumnalBiome.makeAutumnalBiome(() -> WorldGenRegistries.CONFIGURED_SURFACE_BUILDER.getOrThrow(ModConfiguredSurfaceBuilders.AUTUMNAL_SURFACE), 0.2f, 0.05f));
    public static final RegistryObject<Biome> RED_DESERT_BIOME = Registration.BIOMES.register("red_desert_biome", () -> RedDesertBiome.makeRedDesertBiome(() -> WorldGenRegistries.CONFIGURED_SURFACE_BUILDER.getOrThrow(ModConfiguredSurfaceBuilders.RED_DESERT_SURFACE), 0.2f, 0.05f, true));


    public static void register(){}
}
