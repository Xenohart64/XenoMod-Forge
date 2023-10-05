package fr.xenohart.xeno.entities.render;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.DuckEntity;
import fr.xenohart.xeno.entities.model.DuckModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class DuckRenderer extends MobRenderer<DuckEntity, DuckModel<DuckEntity>> {

    public DuckRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DuckModel<>(), 0.3F);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(ChickenEntity livingBase, float partialTicks) {
        float f = MathHelper.lerp(partialTicks, livingBase.oFlap, livingBase.wingRotation);
        float f1 = MathHelper.lerp(partialTicks, livingBase.oFlapSpeed, livingBase.destPos);
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
    @Override
    public ResourceLocation getEntityTexture(DuckEntity entity) {
        return new ResourceLocation(XenoMod.MODID, "textures/entity/duck.png");
    }
}
