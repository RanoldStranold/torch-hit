package it.crystalnest.torch_hit.compat;

import it.crystalnest.soul_fire_d.api.FireManager;
import it.crystalnest.soul_fire_d.api.type.FireTyped;
import it.crystalnest.torch_hit.Constants;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.StandingAndWallBlockItem;

public final class SoulFired {
  private SoulFired() {}

  public static void setOnFire(ItemStack item, Entity entity, int seconds) {
    if (item.getItem() instanceof StandingAndWallBlockItem torch && torch.getBlock() instanceof FireTyped fireTypedTorch) {
      FireManager.setOnFire(entity, seconds, fireTypedTorch.getFireType());
    } else if (Constants.isSoulTorch(item)) {
      FireManager.setOnFire(entity, seconds, FireManager.SOUL_FIRE_TYPE);
    } else {
      FireManager.setOnFire(entity, seconds, FireManager.DEFAULT_FIRE_TYPE);
    }
  }
}
