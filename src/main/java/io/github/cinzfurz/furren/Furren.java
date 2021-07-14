package io.github.cinzfurz.furren;

import io.github.cinzfurz.furren.power.factory.FurrenPowerFactories;
import io.github.cinzfurz.furren.power.factory.action.FurrenEntityActions;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Furren implements ModInitializer {
	public static final String MODID = "furren";

	public static Identifier id(String path) {
		return new Identifier(MODID, path);
	}

	@Override
	public void onInitialize() {
		FurrenPowerFactories.register();
		FurrenEntityActions.register();
	}
}
