package fr.xenohart.xeno.entities.render;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.RainbowSheepEntity;
import fr.xenohart.xeno.entities.layer.RainbowSheepWoolLayer;
import fr.xenohart.xeno.entities.model.RainbowSheepModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class RainbowSheepRender extends MobRenderer<RainbowSheepEntity, RainbowSheepModel<RainbowSheepEntity>> {
    private static final ResourceLocation TEXTURES = new ResourceLocation(XenoMod.MODID, "textures/entity/rainbow_sheep.png");

    public RainbowSheepRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RainbowSheepModel<>(), 0.5F);
        this.addLayer(new RainbowSheepWoolLayer(this));
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(RainbowSheepEntity entity) {
        return TEXTURES;
    }
}
