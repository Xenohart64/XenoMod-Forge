package fr.xenohart.xeno.world.biome;

import fr.xenohart.xeno.world.feature.ModConfiguredFeatures;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;

import java.util.function.Supplier;

public class AutumnalBiome {
    private static int getSkyColorWithTemperatureModifier(float temperature) {
        float lvt_1_1_ = temperature / 3.0F;
        lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
        return MathHelper.hsvToRGB(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
    }

    public static Biome makeAutumnalBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale){
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.withPassiveMobs(mobspawninfo$builder);
        DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);
        BiomeGenerationSettings.Builder biomegenerationsettings$builder = (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);
        DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL);
        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withAllForestFlowerGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withDisks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withDefaultFlowers(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withForestGrass(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSugarCaneAndPumpkins(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withFrozenTopLayer(biomegenerationsettings$builder);

        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.RED_AUTUMNAL_TREES);
        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.ORANGE_AUTUMNAL_TREES);
        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.YELLOW_AUTUMNAL_TREES);
        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.BROWN_AUTUMNAL_TREES);
        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, ModConfiguredFeatures.MUD_LAKE);

        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST).depth(depth).scale(scale).temperature(0.6F).downfall(0.6F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204).setWaterFogColor(329011).setFogColor(12638463).withSkyColor(getSkyColorWithTemperatureModifier(0.6F)).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).withMobSpawnSettings(mobspawninfo$builder.copy()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
    }
}
