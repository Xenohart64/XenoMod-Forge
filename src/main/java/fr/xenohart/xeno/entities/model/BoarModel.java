package fr.xenohart.xeno.entities.model;

import fr.xenohart.xeno.entities.BoarEntity;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;

public class BoarModel<T extends BoarEntity> extends QuadrupedModel<T> {
    public BoarModel() {
        this(0.0F);
    }

    public BoarModel(float scale) {
        super(6, scale, false, 4.0F, 4.0F, 2.0F, 2.0F, 24);
        this.headModel.setTextureOffset(16, 16).addBox(-2.0F, 0.0F, -9.0F, 4.0F, 3.0F, 1.0F, scale);
    }
}
