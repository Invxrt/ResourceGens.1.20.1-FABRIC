package net.invxrt.resourcegens;

import net.fabricmc.api.ModInitializer;

import net.invxrt.resourcegens.block.ModBlocks;
import net.invxrt.resourcegens.block.entity.ModBlockEntities;
import net.invxrt.resourcegens.item.ModItemGroups;
import net.invxrt.resourcegens.item.ModItems;
import net.invxrt.resourcegens.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceGens implements ModInitializer {
	public static final String MOD_ID = "resourcegens";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}