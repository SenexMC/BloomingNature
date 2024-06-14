package satisfy.bloomingnature.registry.boat;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import satisfy.bloomingnature.registry.EntityRegistry;
import satisfy.bloomingnature.registry.ObjectRegistry;

import java.util.function.IntFunction;

public class ModBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(ModBoatEntity.class, EntityDataSerializers.INT);

    public ModBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ModBoatEntity(Level level, double pX, double pY, double pZ) {
        this(EntityRegistry.MOD_BOAT.get(), level);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public @NotNull Item getDropItem() {
        return switch (getModVariant()) {
            case ASPEN -> BoatRegistry.ASPEN_BOAT.get();
            case LARCH -> BoatRegistry.LARCH_BOAT.get();
            case SWAMP_OAK -> BoatRegistry.SWAMP_OAK_BOAT.get();
            case BAOBAB -> BoatRegistry.BAOBAB_BOAT.get();
            case FAN_PALM -> BoatRegistry.FAN_PALM_BOAT.get();
            case FIR -> BoatRegistry.FIR_BOAT.get();
            case SWAMP_CYPRESS -> BoatRegistry.SWAMP_CYPRESS_BOAT.get();
            case CHESTNUT -> BoatRegistry.CHESTNUT_BOAT.get();
            case EBONY -> BoatRegistry.EBONY_BOAT.get();
        };
    }

    public void setVariant(Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    public Type getModVariant() {
        return Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, Type.ASPEN.ordinal());
    }

    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(Type.byName(pCompound.getString("Type")));
        }
    }

    public enum Type implements StringRepresentable {

        ASPEN((ObjectRegistry.ASPEN_PLANKS.get()), "aspen"),
        LARCH(ObjectRegistry.LARCH_PLANKS.get(), "larch"),
        SWAMP_OAK(ObjectRegistry.SWAMP_CYPRESS_PLANKS.get(), "birch"),
        BAOBAB(ObjectRegistry.BAOBAB_PLANKS.get(), "baobab"),
        FAN_PALM(ObjectRegistry.FAN_PALM_PLANKS.get(), "fan_palm"),
        FIR(ObjectRegistry.FIR_PLANKS.get(), "fir"),
        SWAMP_CYPRESS(ObjectRegistry.SWAMP_CYPRESS_PLANKS.get(), "swamp_cypress"),
        CHESTNUT(ObjectRegistry.CHESTNUT_PLANKS.get(), "chestnut"),
        EBONY(ObjectRegistry.EBONY_PLANKS.get(), "ebony");

        private final String name;
        private final Block planks;

        @SuppressWarnings("deprecation")
        public static final EnumCodec<Type> CODEC = StringRepresentable.fromEnum(Type::values);
        private static final IntFunction<Type> BY_ID = ByIdMap.continuous(Enum::ordinal, values(), ByIdMap.OutOfBoundsStrategy.ZERO);

        Type(Block pPlanks, String pName) {
            this.name = pName;
            this.planks = pPlanks;
        }

        public @NotNull String getSerializedName() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

        public Block getPlanks() {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        /**
         * Get a boat type by its enum ordinal
         */
        public static Type byId(int pId) {
            return BY_ID.apply(pId);
        }

        public static Type byName(String pName) {
            return CODEC.byName(pName, ASPEN);
        }
    }
}
