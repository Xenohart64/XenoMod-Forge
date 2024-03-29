package fr.xenohart.xeno.world.gen;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.ModEntityTypes;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;

@Mod.EventBusSubscriber(modid = XenoMod.MODID)
public class ModEntitySpawn {

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        List<MobSpawnInfo.Spawners> base = event.getSpawns().getSpawner(EntityClassification.CREATURE);

        if (types.contains(BiomeDictionary.Type.FOREST)) {
            base.add(new MobSpawnInfo.Spawners(ModEntityTypes.BOAR.get(), 30, 2, 5));
            base.add(new MobSpawnInfo.Spawners(ModEntityTypes.BEAR.get(), 30, 2, 5));
        }
        if (types.contains(BiomeDictionary.Type.RIVER)) {
            base.add(new MobSpawnInfo.Spawners(ModEntityTypes.DUCK.get(), 30, 2, 5));
        }
        if (types.contains(BiomeDictionary.Type.COLD)){
            base.add(new MobSpawnInfo.Spawners(ModEntityTypes.PENGUIN.get(), 30, 2, 5));
        }
    }
}
