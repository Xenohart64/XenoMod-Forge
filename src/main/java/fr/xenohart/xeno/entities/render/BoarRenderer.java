package fr.xenohart.xeno.entities.render;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.BoarEntity;
import fr.xenohart.xeno.entities.model.BoarModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BoarRenderer extends MobRenderer<BoarEntity, BoarModel<BoarEntity>>
{
    public BoarRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BoarModel<>(), 0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(BoarEntity entity) {
        return new ResourceLocation(XenoMod.MODID, "textures/entity/boar.png");
    }
}
