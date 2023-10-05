package fr.xenohart.xeno.entities;

import fr.xenohart.xeno.entities.ai.MoveToMushroom;
import fr.xenohart.xeno.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IShearable;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class CluckShroomEntity extends ChickenEntity implements IShearable, IForgeShearable {
    private static final DataParameter<String> CLUCKSHROOM_TYPE = EntityDataManager.createKey(CluckShroomEntity.class, DataSerializers.STRING);

    private UUID lightningUUID;

    public CluckShroomEntity(EntityType<? extends CluckShroomEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new FleeSunGoal(this, 1.45D));
        this.goalSelector.addGoal(2, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(3, new MoveToMushroom(this, 1.1D));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));

    }

    protected void registerData() {
        super.registerData();
        this.dataManager.register(CLUCKSHROOM_TYPE, CluckShroomEntity.Type.RED.name);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return ChickenEntity.func_234187_eI_();
    }

    public ItemEntity entityDropItem(IItemProvider itemProvider) {

        if (itemProvider == Items.EGG) {
            itemProvider = ModItems.SMELLY_EGG.get();
        }
        return this.entityDropItem(itemProvider, 0);
    }

    @Override
    public boolean canBreed() {
        return false;
    }

    protected void updateAITasks() {
        super.updateAITasks();

        if (this.world.rand.nextInt(300) == 0 && this.world.getLightSubtracted(this.getPosition(), 0) < 12 && !this.isChild()) {
            if (this.onGround) {
                Block mushroomBlock = this.getCluckShroomType().getState().getBlock();
                BlockPos blockpos = this.getPosition().down();

                if (mushroomBlock.isValidPosition(mushroomBlock.getDefaultState(), world, blockpos) && this.world.isAirBlock(this.getPosition())) {
                    this.world.setBlockState(this.getPosition(), mushroomBlock.getDefaultState());
                }
            }
        }
    }

    private void setCluckShroomType(CluckShroomEntity.Type typeIn) {
        this.dataManager.set(CLUCKSHROOM_TYPE, typeIn.name);
    }

    public CluckShroomEntity.Type getCluckShroomType() {
        return CluckShroomEntity.Type.getTypeByName(this.dataManager.get(CLUCKSHROOM_TYPE));
    }

    public CluckShroomEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity ageable) {
        CluckShroomEntity cluckshroomentity = ModEntityTypes.CLUCKSHROOM.get().create(this.world);
        cluckshroomentity.setCluckShroomType(this.func_213445_a((CluckShroomEntity) ageable));
        return cluckshroomentity;
    }

    private CluckShroomEntity.Type func_213445_a(CluckShroomEntity p_213445_1_) {
        CluckShroomEntity.Type cluckshroomentity$type = this.getCluckShroomType();
        CluckShroomEntity.Type cluckshroomentity$type1 = p_213445_1_.getCluckShroomType();
        CluckShroomEntity.Type cluckshroomentity$type2;
        if (cluckshroomentity$type == cluckshroomentity$type1 && this.rand.nextInt(1024) == 0) {
            cluckshroomentity$type2 = cluckshroomentity$type == CluckShroomEntity.Type.BROWN ? CluckShroomEntity.Type.RED : CluckShroomEntity.Type.BROWN;
        } else {
            cluckshroomentity$type2 = this.rand.nextBoolean() ? cluckshroomentity$type : cluckshroomentity$type1;
        }

        return cluckshroomentity$type2;
    }

    @Override
    protected ResourceLocation getLootTable() {
        return EntityType.CHICKEN.getLootTable();
    }

    public static boolean spawnHandler(EntityType<? extends CluckShroomEntity> entity, IWorld world, SpawnReason p_223325_2_, BlockPos p_223325_3_, Random p_223325_4_) {
        return world.getBlockState(p_223325_3_.down()).getBlock() == Blocks.MYCELIUM && world.getLightSubtracted(p_223325_3_, 0) > 8;
    }

    public float getBlockPathWeight(BlockPos pos, IWorldReader worldIn) {
        return worldIn.getBlockState(pos.down()).isIn(Blocks.MYCELIUM) ? 10.0F : worldIn.getBrightness(pos) - 0.5F;
    }

    public void onStruckByLightning(LightningBoltEntity lightningBolt) {
        UUID uuid = lightningBolt.getUniqueID();
        if (!uuid.equals(this.lightningUUID)) {
            this.setCluckShroomType(this.getCluckShroomType() == CluckShroomEntity.Type.RED ? CluckShroomEntity.Type.BROWN : CluckShroomEntity.Type.RED);
            this.lightningUUID = uuid;
            this.playSound(SoundEvents.ENTITY_MOOSHROOM_CONVERT, 2.0F, 1.0F);
        }

    }

    @Override
    public void shear(SoundCategory category) {
        world.playMovingSound(null, this, SoundEvents.ENTITY_SHEEP_SHEAR, category, 1.0F, 1.0F);
        this.world.addParticle(ParticleTypes.EXPLOSION, this.getPosX(), this.getPosY() + (double) (this.getHeight() / 2.0F), this.getPosZ(), 0.0D, 0.0D, 0.0D);
        if (!this.world.isRemote) {

            this.entityDropItem(new ItemStack(Item.getItemFromBlock(this.getCluckShroomType().getState().getBlock()), 2));

            ChickenEntity cluckShroomEntity = EntityType.CHICKEN.create(this.world);
            cluckShroomEntity.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
            cluckShroomEntity.setNoAI(this.isAIDisabled());
            if (this.hasCustomName()) {
                cluckShroomEntity.setCustomName(this.getCustomName());
                cluckShroomEntity.setCustomNameVisible(this.isCustomNameVisible());
            }

            if (this.isChild()) {
                cluckShroomEntity.setGrowingAge(this.getGrowingAge());
            }

            this.world.addEntity(cluckShroomEntity);

            this.remove();
        }
    }

    @Override
    public boolean isShearable() {
        return true;
    }

    @Override
    public boolean isShearable(ItemStack item, World world, BlockPos pos) {
        return true;
    }

    @Override
    public List<ItemStack> onSheared(PlayerEntity player, ItemStack item, World world, BlockPos pos, int fortune) {
        world.playMovingSound(null, this, SoundEvents.ENTITY_SHEEP_SHEAR, player == null ? SoundCategory.BLOCKS : SoundCategory.PLAYERS, 1.0F, 1.0F);
        this.world.addParticle(ParticleTypes.EXPLOSION, this.getPosX(), this.getPosY() + (double) (this.getHeight() / 2.0F), this.getPosZ(), 0.0D, 0.0D, 0.0D);
        java.util.List<ItemStack> ret = new java.util.ArrayList<>();
        if (!this.world.isRemote) {

            ret.add(new ItemStack(Item.getItemFromBlock(this.getCluckShroomType().getState().getBlock()), 2));

            ChickenEntity cluckShroomEntity = EntityType.CHICKEN.create(this.world);
            cluckShroomEntity.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
            cluckShroomEntity.setNoAI(this.isAIDisabled());
            if (this.hasCustomName()) {
                cluckShroomEntity.setCustomName(this.getCustomName());
                cluckShroomEntity.setCustomNameVisible(this.isCustomNameVisible());
            }

            if (this.isChild()) {
                cluckShroomEntity.setGrowingAge(this.getGrowingAge());
            }

            this.world.addEntity(cluckShroomEntity);

            this.remove();
        }
        return ret;
    }

    public static enum Type {
        RED("red", Blocks.RED_MUSHROOM.getDefaultState()),
        BROWN("brown", Blocks.BROWN_MUSHROOM.getDefaultState());

        private final String name;
        private final BlockState renderState;

        private Type(String nameIn, BlockState renderStateIn) {
            this.name = nameIn;
            this.renderState = renderStateIn;
        }

        /**
         * A block state that is rendered on the back of the cluckshroom.
         */
        public BlockState getState() {
            return this.renderState;
        }

        private static CluckShroomEntity.Type getTypeByName(String nameIn) {
            for (CluckShroomEntity.Type cluckshroomentity$type : values()) {
                if (cluckshroomentity$type.name.equals(nameIn)) {
                    return cluckshroomentity$type;
                }
            }

            return RED;
        }
    }
}
