package fr.xenohart.xeno.world.biome.surfacebuiler;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

public class ModConfiguredSurfaceBuilders {
    public static RegistryKey<ConfiguredSurfaceBuilder<?>> CHERRY_BLOSSOM_SURFACE = RegistryKey.getOrCreateKey(Registry.CONFIGURED_SURFACE_BUILDER_KEY, new ResourceLocation(XenoMod.MODID, "cherry_blossom_surface"));
    public static RegistryKey<ConfiguredSurfaceBuilder<?>> AUTUMNAL_SURFACE = RegistryKey.getOrCreateKey(Registry.CONFIGURED_SURFACE_BUILDER_KEY, new ResourceLocation(XenoMod.MODID, "autumnal_surface"));
    public static RegistryKey<ConfiguredSurfaceBuilder<?>> RED_DESERT_SURFACE = RegistryKey.getOrCreateKey(Registry.CONFIGURED_SURFACE_BUILDER_KEY, new ResourceLocation(XenoMod.MODID, "red_desert_surface"));

}
