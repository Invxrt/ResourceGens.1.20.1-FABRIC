package net.invxrt.resourcegens;

import net.fabricmc.api.ClientModInitializer;
import net.invxrt.resourcegens.screen.ModScreenHandlers;
import net.invxrt.resourcegens.screen.Tier1CrusherScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class ResourceGensClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.TIER_1_CRUSHER_SCREEN_HANDLER, Tier1CrusherScreen::new);

    }
}
