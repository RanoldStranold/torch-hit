package it.crystalnest.torch_hit.handler;

import it.crystalnest.torch_hit.Constants;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Forge attack handler.
 */
@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeAttackHandler extends AttackHandler {
  private ForgeAttackHandler() {}

  /**
   * Handles the {@link LivingAttackEvent}.
   *
   * @param event {@link LivingAttackEvent}.
   */
  @SubscribeEvent
  public static void handle(LivingAttackEvent event) {
    handle(event.getSource().getEntity(), event.getSource().getDirectEntity(), event.getEntityLiving());
  }
}
