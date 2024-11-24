package net.invxrt.resourcegens.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.invxrt.resourcegens.ResourceGens;
import net.invxrt.resourcegens.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RESOURCE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ResourceGens.MOD_ID, "resourcegens"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.resourcegens"))
                    .icon(() -> new ItemStack(ModItems.TIER1CORE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TIER1CORE);
                        entries.add(ModItems.TIER1SHARD);

                        entries.add(ModBlocks.TIER1CRUSHER);

                    }).build());


    public static void registerItemGroups() {
        ResourceGens.LOGGER.info("Registering Item Groups for " + ResourceGens.MOD_ID);
    }
}
