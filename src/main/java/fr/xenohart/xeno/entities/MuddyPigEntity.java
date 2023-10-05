//package fr.xenohart.xeno.entities;
//
//import com.google.common.collect.Maps;
//import com.google.common.collect.Sets;
//import fr.xenohart.xeno.blocks.ModBlocks;
//import fr.xenohart.xeno.entities.ai.GoToMudGoal;
//import fr.xenohart.xeno.fluid.ModFluids;
//import fr.xenohart.xeno.tags.ModTags;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.Blocks;
//import net.minecraft.entity.*;
//import net.minecraft.entity.ai.attributes.AttributeModifierMap;
//import net.minecraft.entity.ai.attributes.Attributes;
//import net.minecraft.entity.ai.goal.*;
//import net.minecraft.entity.passive.AnimalEntity;
//import net.minecraft.entity.passive.PigEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.fluid.Fluids;
//import net.minecraft.item.*;
//import net.minecraft.item.crafting.Ingredient;
//import net.minecraft.nbt.CompoundNBT;
//import net.minecraft.network.datasync.DataParameter;
//import net.minecraft.network.datasync.DataSerializers;
//import net.minecraft.network.datasync.EntityDataManager;
//import net.minecraft.particles.ParticleTypes;
//import net.minecraft.pathfinding.*;
//import net.minecraft.util.*;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.util.math.vector.Vector3d;
//import net.minecraft.world.DifficultyInstance;
//import net.minecraft.world.IWorld;
//import net.minecraft.world.World;
//import net.minecraft.world.server.ServerWorld;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import net.minecraftforge.common.IForgeShearable;
//
//import javax.annotation.Nullable;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//import java.util.Set;
//
//public class MuddyPigEntity extends PigEntity implements IShearable, IForgeShearable {
//    private static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(Items.CARROT, Items.POTATO, Items.BEETROOT);
//    private static final DataParameter<Integer> FLOWER_COLOR = EntityDataManager.createKey(MuddyPigEntity.class, DataSerializers.VARINT);
//    private static final DataParameter<Boolean> HAS_FLOWER = EntityDataManager.createKey(MuddyPigEntity.class, DataSerializers.BOOLEAN);
//    private static final DataParameter<Boolean> DRY = EntityDataManager.createKey(MuddyPigEntity.class, DataSerializers.BOOLEAN);
//    private static final DataParameter<Boolean> RUNNING = EntityDataManager.createKey(MuddyPigEntity.class, DataSerializers.BOOLEAN);
//
//
//    private static final Map<DyeColor, IItemProvider> DYE_BY_COLOR = Util.make(Maps.newEnumMap(DyeColor.class), (p_203402_0_) -> {
//        p_203402_0_.put(DyeColor.WHITE, Items.WHITE_DYE);
//        p_203402_0_.put(DyeColor.ORANGE, Items.ORANGE_DYE);
//        p_203402_0_.put(DyeColor.MAGENTA, Items.MAGENTA_DYE);
//        p_203402_0_.put(DyeColor.LIGHT_BLUE, Items.LIGHT_BLUE_DYE);
//        p_203402_0_.put(DyeColor.YELLOW, Items.YELLOW_DYE);
//        p_203402_0_.put(DyeColor.LIME, Items.LIME_DYE);
//        p_203402_0_.put(DyeColor.PINK, Items.PINK_DYE);
//        p_203402_0_.put(DyeColor.GRAY, Items.GRAY_DYE);
//        p_203402_0_.put(DyeColor.LIGHT_GRAY, Items.LIGHT_GRAY_DYE);
//        p_203402_0_.put(DyeColor.CYAN, Items.CYAN_DYE);
//        p_203402_0_.put(DyeColor.PURPLE, Items.PURPLE_DYE);
//        p_203402_0_.put(DyeColor.BLUE, Items.BLUE_DYE);
//        p_203402_0_.put(DyeColor.BROWN, Items.BROWN_DYE);
//        p_203402_0_.put(DyeColor.GREEN, Items.GREEN_DYE);
//        p_203402_0_.put(DyeColor.RED, Items.RED_DYE);
//        p_203402_0_.put(DyeColor.BLACK, Items.BLACK_DYE);
//    });
//
//    private boolean isWet;
//    private boolean isShaking;
//    protected boolean inMud;
//    private float timeIsShaking;
//    private float prevTimeIsShaking;
//
//    private int dryTime;
//
//    public MuddyPigEntity(EntityType<MuddyPigEntity> type, World p_i48574_2_) {
//        super(type, p_i48574_2_);
//    }
//
//    @Override
//    protected void registerGoals() {
//        this.goalSelector.addGoal(0, new SwimGoal(this));
//        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
//        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D, PigEntity.class));
//        this.goalSelector.addGoal(3, new TemptGoal(this, 1.2D, Ingredient.fromItems(Items.CARROT_ON_A_STICK), false));
//        this.goalSelector.addGoal(3, new TemptGoal(this, 1.2D, false, TEMPTATION_ITEMS));
//        this.goalSelector.addGoal(4, new GoToMudGoal(this, 1.0D) {
//            @Override
//            public boolean shouldExecute() {
//                return isDry() && super.shouldExecute();
//            }
//        });
//        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1D));
//        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
//        this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
//        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
//    }
//
//
//    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
//        return PigEntity.func_234215_eI_().createMutableAttribute(Attributes.ARMOR, 1.0D);
//    }
//
//    protected void registerData() {
//        super.registerData();
//        this.dataManager.register(DRY, false);
//        this.dataManager.register(HAS_FLOWER, true);
//        this.dataManager.register(RUNNING, false);
//        this.dataManager.register(FLOWER_COLOR, DyeColor.RED.getId());
//    }
//
//    @Override
//    protected PathNavigator createNavigator(World worldIn) {
//        return new Navigator(this, worldIn);
//    }
//
//    @Override
//    protected SoundEvent getHurtSound(DamageSource source) {
//        return SoundEvents.ENTITY_PIG_HURT;
//    }
//
//    @Override
//    protected SoundEvent getDeathSound() {
//        return SoundEvents.ENTITY_PIG_DEATH;
//    }
//
//    @Override
//    protected SoundEvent getAmbientSound() {
//        return SoundEvents.ENTITY_PIG_AMBIENT;
//    }
//
//    @Override
//    protected void playStepSound(BlockPos pos, BlockState blockIn) {
//        this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15F, 1.0F);
//    }
//
//    @Override
//    protected ResourceLocation getLootTable() {
//        return EntityType.PIG.getLootTable();
//    }
//
//    @Override
//    public void writeAdditional(CompoundNBT compound) {
//        super.writeAdditional(compound);
//        compound.putBoolean("Dry", this.isDry());
//        compound.putBoolean("HasFlower", this.getHasFlower());
//        compound.putByte("FlowerColor", (byte) this.getFlowerColor().getId());
//    }
//
//    @Override
//    public void readAdditional(CompoundNBT compound) {
//        super.readAdditional(compound);
//        this.setDry(compound.getBoolean("Dry"));
//        this.setHasFlower(compound.getBoolean("HasFlower"));
//        this.setFlowerColor(DyeColor.byId(compound.getInt("FlowerColor")));
//    }
//
//    public DyeColor getFlowerColor() {
//        return DyeColor.byId(this.dataManager.get(FLOWER_COLOR));
//    }
//
//    public void setFlowerColor(DyeColor color) {
//        this.dataManager.set(FLOWER_COLOR, color.getId());
//    }
//
//
//    public boolean getHasFlower() {
//        return this.dataManager.get(HAS_FLOWER);
//    }
//
//    public void setHasFlower(boolean hasFlower) {
//        this.dataManager.set(HAS_FLOWER, hasFlower);
//    }
//
//    public boolean isDry() {
//        return this.dataManager.get(DRY);
//    }
//
//    public void setDry(boolean hasFlower) {
//        this.dataManager.set(DRY, hasFlower);
//    }
//
//    public boolean isRunning() {
//        return this.dataManager.get(RUNNING);
//    }
//
//    public void setRunning(boolean isRunnning) {
//        this.dataManager.set(RUNNING, isRunnning);
//    }
//
//
//    @Override
//    public ActionResultType applyPlayerInteraction(PlayerEntity player, Vector3d vec, Hand hand) {
//        ItemStack itemstack = player.getHeldItem(hand);
//        Item item = itemstack.getItem();
//
//        if (!itemstack.isEmpty()) {
//            if (item instanceof DyeItem) {
//                DyeColor dyecolor = ((DyeItem) item).getDyeColor();
//                if (this.getHasFlower() && dyecolor != this.getFlowerColor()) {
//                    this.setFlowerColor(dyecolor);
//                    if (!player.abilities.isCreativeMode) {
//                        itemstack.shrink(1);
//                    }
//
//                    return ActionResultType.CONSUME;
//                }
//            }
//        }
//        return super.applyPlayerInteraction(player, vec, hand);
//    }
//
//    @Override
//    public boolean isShearable() {
//        return this.getHasFlower() && !this.isDry();
//    }
//
//    @Override
//    public boolean isShearable(ItemStack item, World world, BlockPos pos) {
//        return this.getHasFlower() && !this.isDry();
//    }
//
//    @Override
//    public void shear(SoundCategory category) {
//        if (!this.world.isRemote) {
//            this.setHasFlower(false);
//            this.entityDropItem(new ItemStack(DYE_BY_COLOR.get(this.getFlowerColor())));
//        }
//        this.playSound(SoundEvents.ENTITY_SHEEP_SHEAR, 1.0F, 1.0F);
//    }
//
//    @Override
//    public List<ItemStack> onSheared(PlayerEntity player, ItemStack item, World world, BlockPos pos, int fortune) {
//        java.util.List<ItemStack> ret = new java.util.ArrayList<>();
//        if (!this.world.isRemote) {
//            this.setHasFlower(false);
//            ret.add(new ItemStack(DYE_BY_COLOR.get(this.getFlowerColor())));
//        }
//        this.playSound(SoundEvents.ENTITY_SHEEP_SHEAR, 1.0F, 1.0F);
//        return ret;
//    }
//
//    @Override
//    public void livingTick() {
//        super.livingTick();
//        if (!this.world.isRemote && this.isWet && !this.isShaking && !this.isDry()) {
//            this.isShaking = true;
//            this.timeIsShaking = 0.0F;
//            this.prevTimeIsShaking = 0.0F;
//            this.world.setEntityState(this, (byte) 8);
//        }
//    }
//
//    public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
//        this.setHasFlower(true);
//
//        this.setFlowerColor(DyeColor.byId(worldIn.getRandom().nextInt(DyeColor.values().length)));
//
//        return spawnDataIn;
//    }
//
//    public static boolean spawnHandler(EntityType<? extends AnimalEntity> p_223316_0_, IWorld p_223316_1_, SpawnReason p_223316_2_, BlockPos p_223316_3_, Random p_223316_4_) {
//        return p_223316_1_.getBlockState(p_223316_3_.down()).getBlock() == Blocks.GRASS_BLOCK && p_223316_1_.getLightSubtracted(p_223316_3_, 0) > 8;
//    }
//
//    @Override
//    public void tick() {
//        super.tick();
//        if (this.isAlive()) {
//
//            if (this.handleFluidAcceleration(ModTags.Fluids.MUD_WATER, 0.014D)) {
//                if (!this.inMud && !this.firstUpdate) {
//                    this.doWaterSplashEffect();
//                }
//
//                this.fallDistance = 0.0F;
//                this.inMud = true;
//                this.extinguish();
//            } else {
//                this.inMud = false;
//            }
//
//            if (this.isDry()) {
//                if (this.isInMud() && !isShaking) {
//                    dryTime = 0;
//                    this.isShaking = true;
//                    this.timeIsShaking = 0.0F;
//                    this.prevTimeIsShaking = 0.0F;
//                }
//
//                if (++dryTime >= 2400D) {
//                    this.makeMuddyPig();
//
//                }
//            } else {
//                if (this.isInMud()) {
//                    dryTime = 0;
//                } else {
//                    if (++dryTime >= 2400D && !isShaking) {
//                        dryTime = 0;
//                        this.isShaking = true;
//                        this.timeIsShaking = 0.0F;
//                        this.prevTimeIsShaking = 0.0F;
//                    }
//                }
//            }
//
//            if (!this.isDry() && this.isInWaterRainOrBubbleColumn() && !isShaking) {
//                this.isWet = true;
//                this.isShaking = true;
//                this.timeIsShaking = 0.0F;
//                this.prevTimeIsShaking = 0.0F;
//            }
//
//            if ((this.isWet || this.isShaking)) {
//                if (this.timeIsShaking == 0.0F) {
//                    this.playSound(SoundEvents.ENTITY_WOLF_SHAKE, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
//                }
//
//                this.prevTimeIsShaking = this.timeIsShaking;
//                this.timeIsShaking += 0.05F;
//                if (this.prevTimeIsShaking >= 2.0F) {
//                    if (!this.world.isRemote) {
//                        if (this.isWet && !this.isDry()) {
//                            this.setDry(true);
//                            this.setHasFlower(false);
//                        } else if (this.isWet && this.isDry()) {
//                            this.makeMuddyPig();
//                        } else if (!this.isWet && this.isDry()) {
//                            this.setDry(false);
//                            this.setHasFlower(true);
//                        } else if (!this.isWet && !this.isDry()) {
//                            this.setDry(true);
//                            this.setHasFlower(false);
//                        }
//                    }
//                    this.isWet = false;
//                    this.isShaking = false;
//                    this.prevTimeIsShaking = 0.0F;
//                    this.timeIsShaking = 0.0F;
//                }
//
//                if (this.timeIsShaking > 0.4F) {
//                    float f = (float) this.getBoundingBox().minY;
//                    int i = (int) (MathHelper.sin((this.timeIsShaking - 0.4F) * (float) Math.PI) * 7.0F);
//                    Vector3d vec3d = this.getMotion();
//
//                    for (int j = 0; j < i; ++j) {
//                        float f1 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.getWidth() * 0.6F;
//                        float f2 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.getWidth() * 0.6F;
//                        if (isWet) {
//                            this.world.addParticle(ParticleTypes.SPLASH, this.getPosX() + (double) f1, (double) (f + 0.85F), this.getPosZ() + (double) f2, vec3d.x, vec3d.y, vec3d.z);
//                        }
//                    }
//                }
//            }
//
//        }
//    }
//
//    private void makeMuddyPig() {
//        if (!this.world.isRemote) {
//            PigEntity pigEntity = EntityType.PIG.create(world);
//            pigEntity.setNoAI(this.isAIDisabled());
//            pigEntity.copyDataFromOld(this);
//            if (this.hasCustomName()) {
//                pigEntity.setCustomName(this.getCustomName());
//                pigEntity.setCustomNameVisible(this.isCustomNameVisible());
//            }
//
//            if (this.isHorseSaddled()) {
//                pigEntity.func_230264_L__();
//            }
//
//            if (this.isChild()) {
//                pigEntity.setGrowingAge(this.getGrowingAge());
//            }
//
//            this.world.getServer().getWorld(this.world.getDimensionKey()).removeEntityComplete(this, false);
//            this.world.getServer().getWorld(this.world.getDimensionKey()).addEntity(pigEntity);
//        }
//    }
//
//    public void travel(Vector3d vec) {
//        if (this.isAlive()) {
//            Entity entity = this.getPassengers().isEmpty() ? null : this.getPassengers().get(0);
//            if (this.isBeingRidden() && this.canBeSteered()) {
//                this.rotationYaw = entity.rotationYaw;
//                this.prevRotationYaw = this.rotationYaw;
//                this.rotationPitch = entity.rotationPitch * 0.5F;
//                this.setRotation(this.rotationYaw, this.rotationPitch);
//                this.renderYawOffset = this.rotationYaw;
//                this.rotationYawHead = this.rotationYaw;
//                this.stepHeight = 1.0F;
//                this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;
//
//                if (this.canPassengerSteer()) {
//                    Vector3d vec3d6 = this.getMotion();
//
//                    float d0 = 0.00F;
//
//                    if (isInWater() || isInMud()) {
//                        if (d0 < 0.35F) {
//                            d0 += 0.01F;
//                        } else {
//                            d0 = 0.3F;
//                        }
//                    } else {
//                        if (d0 > 0.0F) {
//                            d0 -= 0.01F;
//                        }
//                    }
//
//                    this.setMotion(vec3d6.x, d0 + vec3d6.y, vec3d6.z);
//
//                    super.travel(vec);
//                } else {
//                    this.setMotion(Vector3d.ZERO);
//                }
//
//                this.prevLimbSwingAmount = this.limbSwingAmount;
//                double d1 = this.getPosX() - this.prevPosX;
//                double d0 = this.getPosZ() - this.prevPosZ;
//                float f1 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;
//                if (f1 > 1.0F) {
//                    f1 = 1.0F;
//                }
//
//                this.limbSwingAmount += (f1 - this.limbSwingAmount) * 0.4F;
//                this.limbSwing += this.limbSwingAmount;
//            } else {
//                this.stepHeight = 0.5F;
//                this.jumpMovementFactor = 0.02F;
//                super.travel(vec);
//            }
//        }
//    }
//
//    @Override
//    protected float getWaterSlowDown() {
//        return isInMud() ? 0.9F : super.getWaterSlowDown();
//    }
//
//    public boolean isInWaterRainOrBubbleColumn() {
//        return !this.isInMud() && super.isInWaterRainOrBubbleColumn();
//    }
//
//    public boolean isInMud() {
//        return inMud;
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    @Override
//    public void handleStatusUpdate(byte id) {
//        if (id == 8) {
//            this.isShaking = true;
//            this.timeIsShaking = 0.0F;
//            this.prevTimeIsShaking = 0.0F;
//        } else {
//            super.handleStatusUpdate(id);
//        }
//
//    }
//
//    @Override
//    public void onDeath(DamageSource cause) {
//        this.isWet = false;
//        this.isShaking = false;
//        this.prevTimeIsShaking = 0.0F;
//        this.timeIsShaking = 0.0F;
//        super.onDeath(cause);
//    }
//
//
//    @OnlyIn(Dist.CLIENT)
//    public boolean isWet() {
//        return this.isWet;
//    }
//
//    /**
//     * Used when calculating the amount of shading to apply while the wolf is wet.
//     */
//    @OnlyIn(Dist.CLIENT)
//    public float getShadingWhileWet(float p_70915_1_) {
//        return 0.75F + MathHelper.lerp(p_70915_1_, this.prevTimeIsShaking, this.timeIsShaking) / 2.0F * 0.25F;
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public float getShakeAngle(float p_70923_1_, float p_70923_2_) {
//        float f = (MathHelper.lerp(p_70923_1_, this.prevTimeIsShaking, this.timeIsShaking) + p_70923_2_) / 1.8F;
//        if (f < 0.0F) {
//            f = 0.0F;
//        } else if (f > 1.0F) {
//            f = 1.0F;
//        }
//
//        return MathHelper.sin(f * (float) Math.PI) * MathHelper.sin(f * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
//    }
//
//    @Override
//    public CreatureAttribute getCreatureAttribute() {
//        return CreatureAttribute.UNDEFINED;
//    }
//
//
//    @Override
//    public MuddyPigEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity ageable) {
//        return ModEntityTypes.MUDDYPIG.get().create(this.world);
//    }
//
//    @Override
//    public boolean isBreedingItem(ItemStack stack) {
//        return TEMPTATION_ITEMS.test(stack);
//    }
//
//    @Override
//    public boolean canMateWith(AnimalEntity otherAnimal) {
//        if (otherAnimal == this) {
//            return false;
//        } else if (otherAnimal instanceof PigEntity) {
//            return this.isInLove() && otherAnimal.isInLove();
//        } else {
//            return false;
//        }
//    }
//
//    static class Navigator extends GroundPathNavigator {
//        public Navigator(MobEntity p_i50754_1_, World p_i50754_2_) {
//            super(p_i50754_1_, p_i50754_2_);
//        }
//
//        protected PathFinder getPathFinder(int p_179679_1_) {
//            this.nodeProcessor = new MuddyPigEntity.Processor();
//            return new PathFinder(this.nodeProcessor, p_179679_1_);
//        }
//
//        protected Vector3d getEntityPosition() {
//            return new Vector3d(this.entity.getPosX(), (double) this.getPathablePosY(), this.entity.getPosZ());
//        }
//
//        private int getPathablePosY() {
//            if (this.entity.isInWater() && this.getCanSwim()) {
//                int i = MathHelper.floor(this.entity.getBoundingBox().minY);
//                Block block = this.world.getBlockState(new BlockPos(this.entity.getPosX(), (double) i, this.entity.getPosZ())).getBlock();
//                int j = 0;
//
//                while (block == Blocks.WATER || block == ModFluids.MUD_BLOCK.get()) {
//                    ++i;
//                    block = this.world.getBlockState(new BlockPos(this.entity.getPosX(), (double) i, this.entity.getPosZ())).getBlock();
//                    ++j;
//                    if (j > 16) {
//                        return MathHelper.floor(this.entity.getBoundingBox().minY);
//                    }
//                }
//
//                return i;
//            } else {
//                return MathHelper.floor(this.entity.getBoundingBox().minY + 0.5D);
//            }
//        }
//    }
//
//    static class Processor extends WalkNodeProcessor {
//        private Processor() {
//        }
//
//        public PathPoint getStart() {
//            int i;
//            if (this.getCanSwim() && this.entity.isInWater()) {
//                i = MathHelper.floor(this.entity.getBoundingBox().minY);
//                BlockPos.Mutable blockpos$mutableblockpos = new BlockPos.Mutable(this.entity.getPosX(), (double) i, this.entity.getPosZ());
//
//                for (BlockState blockstate = this.blockaccess.getBlockState(blockpos$mutableblockpos); blockstate.getBlock() == Blocks.WATER || blockstate.getFluidState() == Fluids.WATER.getStillFluidState(false); blockstate = this.blockaccess.getBlockState(blockpos$mutableblockpos)) {
//                    ++i;
//                    blockpos$mutableblockpos.setPos(this.entity.getPosX(), (double) i, this.entity.getPosZ());
//                }
//
//                for (BlockState blockstate = this.blockaccess.getBlockState(blockpos$mutableblockpos); blockstate.getBlock() == ModFluids.MUD_BLOCK.get() || blockstate.getFluidState() == ModFluids.MUD_FLUID.get().getStillFluidState(false); blockstate = this.blockaccess.getBlockState(blockpos$mutableblockpos)) {
//                    ++i;
//                    blockpos$mutableblockpos.setPos(this.entity.getPosX(), (double) i, this.entity.getPosZ());
//                }
//
//                --i;
//            } else if (this.entity.isOnGround()) {
//                i = MathHelper.floor(this.entity.getBoundingBox().minY + 0.5D);
//            } else {
//                BlockPos blockpos;
//                for (blockpos = new BlockPos(this.entity.getPosition()); (this.blockaccess.getBlockState(blockpos).isAir() || this.blockaccess.getBlockState(blockpos).allowsMovement(this.blockaccess, blockpos, PathType.LAND)) && blockpos.getY() > 0; blockpos = blockpos.down()) {
//                    ;
//                }
//
//                i = blockpos.up().getY();
//            }
//
//            BlockPos blockpos2 = new BlockPos(this.entity.getPosition());
//            PathNodeType pathnodetype1 = this.getPathNodeType(this.entity, blockpos2.getX(), i, blockpos2.getZ());
//            if (this.entity.getPathPriority(pathnodetype1) < 0.0F) {
//                Set<BlockPos> set = Sets.newHashSet();
//                set.add(new BlockPos(this.entity.getBoundingBox().minX, (double) i, this.entity.getBoundingBox().minZ));
//                set.add(new BlockPos(this.entity.getBoundingBox().minX, (double) i, this.entity.getBoundingBox().maxZ));
//                set.add(new BlockPos(this.entity.getBoundingBox().maxX, (double) i, this.entity.getBoundingBox().minZ));
//                set.add(new BlockPos(this.entity.getBoundingBox().maxX, (double) i, this.entity.getBoundingBox().maxZ));
//
//                for (BlockPos blockpos1 : set) {
//                    PathNodeType pathnodetype = this.getPathNodeType(this.entity, blockpos1);
//                    if (this.entity.getPathPriority(pathnodetype) >= 0.0F) {
//                        return this.openPoint(blockpos1.getX(), blockpos1.getY(), blockpos1.getZ());
//                    }
//                }
//            }
//
//            return this.openPoint(blockpos2.getX(), i, blockpos2.getZ());
//        }
//
//        private PathNodeType getPathNodeType(MobEntity entitylivingIn, BlockPos pos) {
//            return this.getPathNodeType(entitylivingIn, pos.getX(), pos.getY(), pos.getZ());
//        }
//
//        private PathNodeType getPathNodeType(MobEntity entitylivingIn, int x, int y, int z) {
//            return this.getPathNodeType(this.blockaccess, x, y, z, entitylivingIn, this.entitySizeX, this.entitySizeY, this.entitySizeZ, this.getCanOpenDoors(), this.getCanEnterDoors());
//        }
//    }
//}
