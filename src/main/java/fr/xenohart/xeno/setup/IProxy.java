package fr.xenohart.xeno.setup;

import net.minecraft.world.World;

public interface IProxy {
    void init();

    World getClientWorld();
}
