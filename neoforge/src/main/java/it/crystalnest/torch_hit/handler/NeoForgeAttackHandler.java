package it.crystalnest.torch_hit.handler;

import it.crystalnest.torch_hit.Constants;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;

/**
 * NeoForge attack handler.
 */
@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class NeoForgeAttackHandler extends AttackHandler {
  private NeoForgeAttackHandler() {}

  /**
   * Handles the {@link LivingAttackEvent}.
   *
   * @param event {@link LivingAttackEvent}.
   */
  @SubscribeEvent
  public static void handle(LivingAttackEvent event) {
    handle(event.getSource().getEntity(), event.getSource().getDirectEntity(), event.getEntity());
  }
}
