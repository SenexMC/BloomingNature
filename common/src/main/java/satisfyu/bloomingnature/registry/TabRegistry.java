package satisfyu.bloomingnature.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import satisfyu.bloomingnature.BloomingNature;

public class TabRegistry {
    public static final DeferredRegister<CreativeModeTab> BLOOMINGNATURE_TABS = DeferredRegister.create(BloomingNature.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> BLOOMINGNATURE_TAB = BLOOMINGNATURE_TABS.register("bloomingnature", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
            .icon(() -> new ItemStack(ObjectRegistry.BLUEBELL.get()))
            .title(Component.translatable("creative_tab.bloomingnature"))
            .displayItems((parameters, out) -> {
                out.accept(ObjectRegistry.LARCH_LOG.get());
                out.accept(ObjectRegistry.LARCH_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_LARCH_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_LARCH_LOG.get());
                out.accept(ObjectRegistry.LARCH_PLANKS.get());
                out.accept(ObjectRegistry.LARCH_STAIRS.get());
                out.accept(ObjectRegistry.LARCH_SLAB.get());
                out.accept(ObjectRegistry.LARCH_PRESSURE_PLATE.get());
                out.accept(ObjectRegistry.LARCH_BUTTON.get());
                out.accept(ObjectRegistry.LARCH_TRAPDOOR.get());
                out.accept(ObjectRegistry.LARCH_DOOR.get());
                out.accept(ObjectRegistry.LARCH_WINDOW.get());
                out.accept(ObjectRegistry.LARCH_FENCE.get());
                out.accept(ObjectRegistry.LARCH_FENCE_GATE.get());
                out.accept(ObjectRegistry.LARCH_LEAVES.get());
                out.accept(ObjectRegistry.LARCH_SAPLING.get());
                out.accept(BoatsAndSignsRegistry.LARCH_SIGN_ITEM.get());
                out.accept(BoatsAndSignsRegistry.LARCH_HANGING_SIGN_ITEM.get());
                out.accept(ObjectRegistry.BAOBAB_LOG.get());
                out.accept(ObjectRegistry.BAOBAB_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_BAOBAB_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_BAOBAB_LOG.get());
                out.accept(ObjectRegistry.BAOBAB_PLANKS.get());
                out.accept(ObjectRegistry.BAOBAB_STAIRS.get());
                out.accept(ObjectRegistry.BAOBAB_SLAB.get());
                out.accept(ObjectRegistry.BAOBAB_PRESSURE_PLATE.get());
                out.accept(ObjectRegistry.BAOBAB_BUTTON.get());
                out.accept(ObjectRegistry.BAOBAB_TRAPDOOR.get());
                out.accept(ObjectRegistry.BAOBAB_DOOR.get());
                out.accept(ObjectRegistry.BAOBAB_WINDOW.get());
                out.accept(ObjectRegistry.BAOBAB_FENCE.get());
                out.accept(ObjectRegistry.BAOBAB_FENCE_GATE.get());
                out.accept(ObjectRegistry.BAOBAB_LEAVES.get());
                out.accept(ObjectRegistry.BAOBAB_SAPLING.get());
                out.accept(BoatsAndSignsRegistry.BAOBAB_SIGN_ITEM.get());
                out.accept(BoatsAndSignsRegistry.BAOBAB_HANGING_SIGN_ITEM.get());
                out.accept(ObjectRegistry.ASPEN_LOG.get());
                out.accept(ObjectRegistry.ASPEN_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_ASPEN_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_ASPEN_LOG.get());
                out.accept(ObjectRegistry.ASPEN_PLANKS.get());
                out.accept(ObjectRegistry.ASPEN_STAIRS.get());
                out.accept(ObjectRegistry.ASPEN_SLAB.get());
                out.accept(ObjectRegistry.ASPEN_PRESSURE_PLATE.get());
                out.accept(ObjectRegistry.ASPEN_BUTTON.get());
                out.accept(ObjectRegistry.ASPEN_TRAPDOOR.get());
                out.accept(ObjectRegistry.ASPEN_DOOR.get());
                out.accept(ObjectRegistry.ASPEN_WINDOW.get());
                out.accept(ObjectRegistry.ASPEN_FENCE.get());
                out.accept(ObjectRegistry.ASPEN_FENCE_GATE.get());
                out.accept(ObjectRegistry.ASPEN_LEAVES.get());
                out.accept(ObjectRegistry.ASPEN_SAPLING.get());
                out.accept(BoatsAndSignsRegistry.ASPEN_SIGN_ITEM.get());
                out.accept(BoatsAndSignsRegistry.ASPEN_HANGING_SIGN_ITEM.get());
                out.accept(ObjectRegistry.SWAMP_OAK_LOG.get());
                out.accept(ObjectRegistry.SWAMP_OAK_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_SWAMP_OAK_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_SWAMP_OAK_LOG.get());
                out.accept(ObjectRegistry.SWAMP_OAK_PLANKS.get());
                out.accept(ObjectRegistry.SWAMP_OAK_STAIRS.get());
                out.accept(ObjectRegistry.SWAMP_OAK_SLAB.get());
                out.accept(ObjectRegistry.SWAMP_OAK_PRESSURE_PLATE.get());
                out.accept(ObjectRegistry.SWAMP_OAK_BUTTON.get());
                out.accept(ObjectRegistry.SWAMP_OAK_TRAPDOOR.get());
                out.accept(ObjectRegistry.SWAMP_OAK_DOOR.get());
                out.accept(ObjectRegistry.SWAMP_OAK_WINDOW.get());
                out.accept(ObjectRegistry.SWAMP_OAK_FENCE.get());
                out.accept(ObjectRegistry.SWAMP_OAK_FENCE_GATE.get());
                out.accept(ObjectRegistry.ORANGE_LEAVES.get());
                out.accept(ObjectRegistry.SWAMP_OAK_SAPLING.get());
                out.accept(BoatsAndSignsRegistry.SWAMP_OAK_SIGN_ITEM.get());
                out.accept(BoatsAndSignsRegistry.SWAMP_OAK_HANGING_SIGN_ITEM.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_LOG.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_SWAMP_CYPRESS_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_SWAMP_CYPRESS_LOG.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_PLANKS.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_STAIRS.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_SLAB.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_PRESSURE_PLATE.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_BUTTON.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_TRAPDOOR.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_DOOR.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_WINDOW.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_FENCE.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_FENCE_GATE.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_LEAVES.get());
                out.accept(ObjectRegistry.SWAMP_CYPRESS_SAPLING.get());
                out.accept(BoatsAndSignsRegistry.SWAMP_CYPRESS_SIGN_ITEM.get());
                out.accept(BoatsAndSignsRegistry.SWAMP_CYPRESS_HANGING_SIGN_ITEM.get());
                out.accept(ObjectRegistry.PALM_LOG.get());
                out.accept(ObjectRegistry.PALM_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_PALM_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_PALM_LOG.get());
                out.accept(ObjectRegistry.PALM_PLANKS.get());
                out.accept(ObjectRegistry.PALM_STAIRS.get());
                out.accept(ObjectRegistry.PALM_SLAB.get());
                out.accept(ObjectRegistry.PALM_PRESSURE_PLATE.get());
                out.accept(ObjectRegistry.PALM_BUTTON.get());
                out.accept(ObjectRegistry.PALM_TRAPDOOR.get());
                out.accept(ObjectRegistry.PALM_DOOR.get());
                out.accept(ObjectRegistry.PALM_WINDOW.get());
                out.accept(ObjectRegistry.PALM_FENCE.get());
                out.accept(ObjectRegistry.PALM_FENCE_GATE.get());
                out.accept(ObjectRegistry.PALM_LEAVES.get());
                out.accept(ObjectRegistry.PALM_SAPLING.get());
                out.accept(BoatsAndSignsRegistry.PALM_SIGN_ITEM.get());
                out.accept(BoatsAndSignsRegistry.PALM_HANGING_SIGN_ITEM.get());
                out.accept(ObjectRegistry.CHESTNUT_LOG.get());
                out.accept(ObjectRegistry.CHESTNUT_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_CHESTNUT_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_CHESTNUT_LOG.get());
                out.accept(ObjectRegistry.CHESTNUT_PLANKS.get());
                out.accept(ObjectRegistry.CHESTNUT_STAIRS.get());
                out.accept(ObjectRegistry.CHESTNUT_SLAB.get());
                out.accept(ObjectRegistry.CHESTNUT_PRESSURE_PLATE.get());
                out.accept(ObjectRegistry.CHESTNUT_BUTTON.get());
                out.accept(ObjectRegistry.CHESTNUT_TRAPDOOR.get());
                out.accept(ObjectRegistry.CHESTNUT_DOOR.get());
                out.accept(ObjectRegistry.CHESTNUT_WINDOW.get());
                out.accept(ObjectRegistry.CHESTNUT_FENCE.get());
                out.accept(ObjectRegistry.CHESTNUT_FENCE_GATE.get());
                out.accept(ObjectRegistry.CHESTNUT_LEAVES.get());
                out.accept(ObjectRegistry.CHESTNUT_SAPLING.get());
                out.accept(BoatsAndSignsRegistry.CHESTNUT_SIGN_ITEM.get());
                out.accept(BoatsAndSignsRegistry.CHESTNUT_HANGING_SIGN_ITEM.get());
                out.accept(ObjectRegistry.FIR_LOG.get());
                out.accept(ObjectRegistry.FIR_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_FIR_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_FIR_LOG.get());
                out.accept(ObjectRegistry.FIR_PLANKS.get());
                out.accept(ObjectRegistry.FIR_STAIRS.get());
                out.accept(ObjectRegistry.FIR_SLAB.get());
                out.accept(ObjectRegistry.FIR_PRESSURE_PLATE.get());
                out.accept(ObjectRegistry.FIR_BUTTON.get());
                out.accept(ObjectRegistry.FIR_TRAPDOOR.get());
                out.accept(ObjectRegistry.FIR_DOOR.get());
                out.accept(ObjectRegistry.FIR_WINDOW.get());
                out.accept(ObjectRegistry.FIR_FENCE.get());
                out.accept(ObjectRegistry.FIR_FENCE_GATE.get());
                out.accept(ObjectRegistry.FIR_LEAVES.get());
                out.accept(ObjectRegistry.FIR_SAPLING.get());
                out.accept(BoatsAndSignsRegistry.FIR_SIGN_ITEM.get());
                out.accept(BoatsAndSignsRegistry.FIR_HANGING_SIGN_ITEM.get());
                out.accept(ObjectRegistry.RED_BRICKS.get());
                out.accept(ObjectRegistry.RED_BRICK_SLAB.get());
                out.accept(ObjectRegistry.RED_BRICK_STAIRS.get());
                out.accept(ObjectRegistry.RED_BRICK_WALL.get());
                out.accept(ObjectRegistry.TRAVERTIN.get());
                out.accept(ObjectRegistry.TRAVERTIN_BRICKS.get());
                out.accept(ObjectRegistry.TRAVERTIN_BRICK_SLAB.get());
                out.accept(ObjectRegistry.TRAVERTIN_BRICK_STAIRS.get());
                out.accept(ObjectRegistry.TRAVERTIN_BRICK_WALL.get());
                out.accept(ObjectRegistry.RED_TRAVERTIN_BRICKS.get());
                out.accept(ObjectRegistry.RED_TRAVERTIN_BRICK_SLAB.get());
                out.accept(ObjectRegistry.RED_TRAVERTIN_BRICK_STAIRS.get());
                out.accept(ObjectRegistry.RED_TRAVERTIN_BRICK_WALL.get());
                out.accept(ObjectRegistry.RED_TRAVERTIN.get());
                out.accept(ObjectRegistry.FOREST_MOSS.get());
                out.accept(ObjectRegistry.MARSH_BLOCK.get());
                out.accept(ObjectRegistry.TERMITE_MOUND.get());
                out.accept(ObjectRegistry.QUICKSAND.get());
                out.accept(ObjectRegistry.REED.get());
                out.accept(ObjectRegistry.CATTAIL.get());
                out.accept(ObjectRegistry.BEGONIE.get());
                out.accept(ObjectRegistry.JOE_PYE.get());
                out.accept(ObjectRegistry.MOUNTAIN_LAUREL.get());
                out.accept(ObjectRegistry.TALL_MOUNTAIN_LAUREL.get());
                out.accept(ObjectRegistry.HYSSOP.get());
                out.accept(ObjectRegistry.MOUNTAIN_SNOWBELL.get());
                out.accept(ObjectRegistry.CARDINAL.get());
                out.accept(ObjectRegistry.BOTTLEBRUSHES.get());
                out.accept(ObjectRegistry.DAPHNE.get());
                out.accept(ObjectRegistry.WILD_SUNFLOWER.get());
                out.accept(ObjectRegistry.GOLDEN_ROD.get());
                out.accept(ObjectRegistry.BIRD_OF_PARADISE.get());
                out.accept(ObjectRegistry.WHITE_ORCHID.get());
                out.accept(ObjectRegistry.BLUEBELL.get());
                out.accept(ObjectRegistry.GOATSBEARD.get());
                out.accept(ObjectRegistry.GENISTEAE.get());
                out.accept(ObjectRegistry.FOXGLOVE_WHITE.get());
                out.accept(ObjectRegistry.FOXGLOVE_PINK.get());
                out.accept(ObjectRegistry.FREESIA_YELLOW.get());
                out.accept(ObjectRegistry.FREESIA_PINK.get());
                out.accept(ObjectRegistry.LUPINE_BLUE.get());
                out.accept(ObjectRegistry.TALL_LUPINE_BLUE.get());
                out.accept(ObjectRegistry.LUPINE_PURPLE.get());
                out.accept(ObjectRegistry.TALL_LUPINE_PURPLE.get());
                out.accept(ObjectRegistry.BEACH_BUSH.get());
                out.accept(ObjectRegistry.BEACH_BUSH_TALL.get());
                out.accept(ObjectRegistry.BEACH_GRASS.get());
                out.accept(ObjectRegistry.FLOWER_POT_BIG.get());
                out.accept(ObjectRegistry.FLOWER_BOX.get());
                out.accept(BoatsAndSignsRegistry.LARCH_CHEST_BOAT.get());
                out.accept(BoatsAndSignsRegistry.LARCH_BOAT.get());
                out.accept(BoatsAndSignsRegistry.BAOBAB_CHEST_BOAT.get());
                out.accept(BoatsAndSignsRegistry.BAOBAB_BOAT.get());
                out.accept(BoatsAndSignsRegistry.ASPEN_CHEST_BOAT.get());
                out.accept(BoatsAndSignsRegistry.ASPEN_BOAT.get());
                out.accept(BoatsAndSignsRegistry.SWAMP_OAK_CHEST_BOAT.get());
                out.accept(BoatsAndSignsRegistry.SWAMP_OAK_BOAT.get());
                out.accept(BoatsAndSignsRegistry.SWAMP_CYPRESS_CHEST_BOAT.get());
                out.accept(BoatsAndSignsRegistry.SWAMP_CYPRESS_BOAT.get());
                out.accept(BoatsAndSignsRegistry.PALM_CHEST_BOAT.get());
                out.accept(BoatsAndSignsRegistry.PALM_BOAT.get());
                out.accept(BoatsAndSignsRegistry.FIR_BOAT.get());
                out.accept(BoatsAndSignsRegistry.FIR_CHEST_BOAT.get());
                out.accept(BoatsAndSignsRegistry.CHESTNUT_BOAT.get());
                out.accept(BoatsAndSignsRegistry.CHESTNUT_CHEST_BOAT.get());
                out.accept(ObjectRegistry.WANDERING_GARDENER_SPAWN_EGG.get());
                out.accept(ObjectRegistry.DEER_SPAWN_EGG.get());
                out.accept(ObjectRegistry.RED_WOLF_SPAWN_EGG.get());
                out.accept(ObjectRegistry.RACCOON_SPAWN_EGG.get());
                out.accept(ObjectRegistry.SQUIRREL_SPAWN_EGG.get());
                out.accept(ObjectRegistry.MOSSY_SHEEP_SPAWN_EGG.get());
                out.accept(ObjectRegistry.MUDDY_PIG_SPAWN_EGG.get());
                out.accept(ObjectRegistry.PELICAN_SPAWN_EGG.get());
                out.accept(ObjectRegistry.BOAR_SPAWN_EGG.get());
                out.accept(ObjectRegistry.OWL_SPAWN_EGG.get());
                out.accept(ObjectRegistry.TERMITE_SPAWN_EGG.get());

            })
            .build());

    public static void init() {
        BLOOMINGNATURE_TABS.register();
    }
}
