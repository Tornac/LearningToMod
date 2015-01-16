package creepingtornac.ltm.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import creepingtornac.ltm.creative.CreativeTabLTM;
import creepingtornac.ltm.util.LogHelper;

public class ItemTickCounter extends ItemLTM {

   public static long ticks = 0;
   public static boolean active = false;

   public ItemTickCounter() {
      super();
      setUnlocalizedName("tickCounter");
      setCreativeTab(CreativeTabLTM.LTM_TAB);
   }

   @Override
   public void onUpdate(ItemStack itemstack, World world, Entity player,
         int slot, boolean selected) {

      if (world.isRemote) return;
      EntityPlayer playerCast = (EntityPlayer) player;

      ticks++;
      if (ticks == 200) { // Deactivate
         active = !active;
         LogHelper.info("Active set to " + active);
         ticks = 0;
         if (active) {
         } else {
         }
      }
   }
}
