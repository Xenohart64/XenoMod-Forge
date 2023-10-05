package fr.xenohart.xeno.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.world.World;

public class JollyLlamaEntity extends LlamaEntity {
    public JollyLlamaEntity(EntityType<? extends JollyLlamaEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return func_234234_eJ_().createMutableAttribute(Attributes.FOLLOW_RANGE, 40.0D);
    }

    protected LlamaEntity createChild() {
        return ModEntityTypes.JOLLY_LLAMA.get().create(this.world);
    }
}
