package it.crystalnest.torch_hit.handler;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;

/**
 * Fabric attack handler.
 */
public final class FabricAttackHandler {
  private FabricAttackHandler() {}

  /**
   * Handles attack events.
   *
   * @param target targeted entity.
   * @param source damage source.
   * @param amount damage amount.
   * @return whether the target can be damaged.
   */
  public static boolean handle(LivingEntity target, DamageSource source, float amount) {
    AttackHandler.handle(source.getEntity(), source.getDirectEntity(), target);
    return true;
  }
}
