package fr.xenohart.xeno.setup;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = XenoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.DEDICATED_SERVER)
public class ServerProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public Level getClientWorld() {
        throw new IllegalStateException("Cannot be run on a Server");
    }
}
