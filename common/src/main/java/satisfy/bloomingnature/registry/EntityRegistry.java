package satisfy.bloomingnature.registry;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import satisfy.bloomingnature.BloomingNature;
import satisfy.bloomingnature.entity.TermiteEntity;
import satisfy.bloomingnature.entity.WanderingGardenerEntity;
import satisfy.bloomingnature.registry.boat.ModBoatEntity;
import satisfy.bloomingnature.registry.boat.ModChestBoatEntity;
import satisfy.bloomingnature.util.BloomingNatureIdentifier;

import java.util.function.Supplier;

public class EntityRegistry {
    private static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BloomingNature.MOD_ID, Registries.ENTITY_TYPE);


    public static final RegistrySupplier<EntityType<WanderingGardenerEntity>> WANDERING_GARDENER = create("wandering_gardener",
            () -> EntityType.Builder.of(WanderingGardenerEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 1.95f)
                    .clientTrackingRange(10)
                    .build(new BloomingNatureIdentifier("wandering_gardener").toString()));

    public static final RegistrySupplier<EntityType<TermiteEntity>> TERMITE = create("termite",
            () -> EntityType.Builder.of(TermiteEntity::new, MobCategory.MONSTER)
                    .build(new BloomingNatureIdentifier("termite").toString())
    );

    public static final RegistrySupplier<EntityType<ModBoatEntity>> MOD_BOAT =
            ENTITY_TYPES.register("mod_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).clientTrackingRange(10).build("mod_boat")
            );


    public static final RegistrySupplier<EntityType<ModChestBoatEntity>> MOD_CHEST_BOAT =
            ENTITY_TYPES.register("mod_chest_boat", () -> EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).clientTrackingRange(10).build("mod_chest_boat")
            );


    public static <T extends EntityType<?>> RegistrySupplier<T> create(final String path, final Supplier<T> type) {
        return ENTITY_TYPES.register(new BloomingNatureIdentifier(path), type);
    }

    public static void init() {
        BloomingNature.LOGGER.debug("Registering Entities for " + BloomingNature.MOD_ID);
        ENTITY_TYPES.register();
        EntityAttributeRegistry.register(WANDERING_GARDENER, WanderingGardenerEntity::createMobAttributes);
        EntityAttributeRegistry.register(TERMITE, TermiteEntity::createMobAttributes);
    }
}
