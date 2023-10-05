package fr.xenohart.xeno.entities.render;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.PenguinEntity;
import fr.xenohart.xeno.entities.model.PenguinModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PenguinRenderer extends MobRenderer<PenguinEntity, PenguinModel<PenguinEntity>> {

    public PenguinRenderer(EntityRendererManager renderManager) {
        super(renderManager, new PenguinModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(PenguinEntity entity) {
        return new ResourceLocation(XenoMod.MODID, "textures/entity/penguin.png");
    }
}