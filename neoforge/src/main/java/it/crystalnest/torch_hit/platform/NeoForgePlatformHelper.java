package it.crystalnest.torch_hit.platform;

import it.crystalnest.cobweb.platform.model.Platform;
import it.crystalnest.torch_hit.platform.services.PlatformHelper;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

/**
 * NeoForge platform helper.
 */
public final class NeoForgePlatformHelper implements PlatformHelper {
  @Override
  public Platform getPlatformName() {
    return Platform.NEOFORGE;
  }

  @Override
  public boolean isModLoaded(String modId) {
    return ModList.get().isLoaded(modId);
  }

  @Override
  public boolean isDevEnv() {
    return !FMLLoader.isProduction();
  }
}
