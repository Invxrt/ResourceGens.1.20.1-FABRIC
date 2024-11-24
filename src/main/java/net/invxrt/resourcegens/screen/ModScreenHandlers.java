package net.invxrt.resourcegens.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.invxrt.resourcegens.ResourceGens;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<Tier1CrusherScreenHandler> TIER_1_CRUSHER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(ResourceGens.MOD_ID, "tier_1_crusher"),
                    new ExtendedScreenHandlerType<>(Tier1CrusherScreenHandler::new));

    public static void registerScreenHandlers() {
        ResourceGens.LOGGER.info("Registering screen handlers for " + ResourceGens.MOD_ID);
    }
}
