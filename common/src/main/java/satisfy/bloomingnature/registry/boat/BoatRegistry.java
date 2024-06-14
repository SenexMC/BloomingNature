package satisfy.bloomingnature.registry.boat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import satisfy.bloomingnature.BloomingNature;

public class BoatRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BloomingNature.MOD_ID, Registries.ITEM);

    public static RegistrySupplier<Item> ASPEN_BOAT = ITEMS.register("aspen_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.ASPEN, new Item.Properties()));
    public static RegistrySupplier<Item> ASPEN_CHEST_BOAT = ITEMS.register("aspen_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.ASPEN, new Item.Properties()));
    public static RegistrySupplier<Item> LARCH_BOAT = ITEMS.register("larch_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.LARCH, new Item.Properties()));
    public static RegistrySupplier<Item> LARCH_CHEST_BOAT = ITEMS.register("larch_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.LARCH, new Item.Properties()));
    public static RegistrySupplier<Item> SWAMP_OAK_BOAT = ITEMS.register("swamp_oak_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.SWAMP_OAK, new Item.Properties()));
    public static RegistrySupplier<Item> SWAMP_OAK_CHEST_BOAT = ITEMS.register("swamp_oak_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.SWAMP_OAK, new Item.Properties()));
    public static RegistrySupplier<Item> BAOBAB_BOAT = ITEMS.register("baobab_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.BAOBAB, new Item.Properties()));
    public static RegistrySupplier<Item> BAOBAB_CHEST_BOAT = ITEMS.register("baobab_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.BAOBAB, new Item.Properties()));
    public static RegistrySupplier<Item> FAN_PALM_BOAT = ITEMS.register("fan_palm_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.FAN_PALM, new Item.Properties()));
    public static RegistrySupplier<Item> FAN_PALM_CHEST_BOAT = ITEMS.register("fan_palm_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.FAN_PALM, new Item.Properties()));
    public static RegistrySupplier<Item> FIR_BOAT = ITEMS.register("fir_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.FIR, new Item.Properties()));
    public static RegistrySupplier<Item> FIR_CHEST_BOAT = ITEMS.register("fir_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.FIR, new Item.Properties()));
    public static RegistrySupplier<Item> SWAMP_CYPRESS_BOAT = ITEMS.register("swamp_cypress_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.SWAMP_CYPRESS, new Item.Properties()));
    public static RegistrySupplier<Item> SWAMP_CYPRESS_CHEST_BOAT = ITEMS.register("swamp_cypress_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.SWAMP_CYPRESS, new Item.Properties()));
    public static RegistrySupplier<Item> CHESTNUT_BOAT = ITEMS.register("chestnut_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.CHESTNUT, new Item.Properties()));
    public static RegistrySupplier<Item> CHESTNUT_CHEST_BOAT = ITEMS.register("chestnut_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.CHESTNUT, new Item.Properties()));
    public static RegistrySupplier<Item> EBONY_BOAT = ITEMS.register("ebony_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.EBONY, new Item.Properties()));
    public static RegistrySupplier<Item> EBONY_CHEST_BOAT = ITEMS.register("ebony_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.EBONY, new Item.Properties()));

    public static void init() {
        BloomingNature.LOGGER.debug("Registering Mod Boats and Items for " + BloomingNature.MOD_ID);
        ITEMS.register();
    }
}