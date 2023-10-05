package fr.xenohart.xeno.setup;

import net.minecraft.world.level.Level;

public interface IProxy {
    void init();

    Level getClientWorld();
}
