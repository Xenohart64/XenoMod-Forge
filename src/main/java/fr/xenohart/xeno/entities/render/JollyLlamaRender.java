package fr.xenohart.xeno.entities.render;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.entities.JollyLlamaEntity;
import fr.xenohart.xeno.entities.model.JollyLlamaModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class JollyLlamaRender extends MobRenderer<JollyLlamaEntity, JollyLlamaModel<JollyLlamaEntity>> {
    private static final ResourceLocation TAMED_TEXTURES = new ResourceLocation(XenoMod.MODID, "textures/entity/jolly_llama_tamed.png");
    private static final ResourceLocation TEXTURES = new ResourceLocation(XenoMod.MODID, "textures/entity/jolly_llama.png");


    public JollyLlamaRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new JollyLlamaModel<>(), 0.5F);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(JollyLlamaEntity entity) {
        if (entity.isTame()) {
            return TAMED_TEXTURES;
        }

        return TEXTURES;
    }
}
