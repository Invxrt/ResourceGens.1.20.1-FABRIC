package net.invxrt.resourcegens.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.invxrt.resourcegens.ResourceGens;
import net.invxrt.resourcegens.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<Tier1CrusherBlockEntity> TIER_1_CRUSHER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(ResourceGens.MOD_ID, "tier_1_crusher_be"),
                    FabricBlockEntityTypeBuilder.create(Tier1CrusherBlockEntity::new,
                            ModBlocks.TIER1CRUSHER).build());

    public static void registerBlockEntities() {
        ResourceGens.LOGGER.info("Registering block entities for " + ResourceGens.MOD_ID);
    }
}
