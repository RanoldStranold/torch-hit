package it.crystalnest.torch_hit;

import it.crystalnest.cobweb.api.event.ServerLivingEntityEvents;
import it.crystalnest.torch_hit.handler.FabricAttackHandler;
import net.fabricmc.api.ModInitializer;
import org.jetbrains.annotations.ApiStatus;

/**
 * Mod loader.
 */
@ApiStatus.Internal
public final class ModLoader implements ModInitializer {
  @Override
  public void onInitialize() {
    CommonModLoader.init();
    ServerLivingEntityEvents.ALLOW_DAMAGE.register(FabricAttackHandler::handle);
  }
}
