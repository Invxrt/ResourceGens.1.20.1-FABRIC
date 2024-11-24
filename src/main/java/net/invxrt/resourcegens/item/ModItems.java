package net.invxrt.resourcegens.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.invxrt.resourcegens.ResourceGens;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TIER1CORE = registerItem("tier1core", new Item(new FabricItemSettings()));
    public static final Item TIER1SHARD = registerItem("tier1shard", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TIER1CORE);
        entries.add(TIER1SHARD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ResourceGens.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ResourceGens.LOGGER.info("Registering Mod Items For " + ResourceGens.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

}
