package creepingtornac.ltm.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import creepingtornac.ltm.creative.CreativeTabLTM;
import creepingtornac.ltm.util.LogHelper;

public class ItemMapleLeaf extends ItemLTM {

   public ItemMapleLeaf() {
      super();
      setUnlocalizedName("mapleLeaf");
      setCreativeTab(CreativeTabLTM.LTM_TAB);
   }

   @Override
   public EnumRarity getRarity(ItemStack istack) {
      return EnumRarity.epic;
   }

   @Override
   @SideOnly(Side.CLIENT)
   public ItemStack onItemRightClick(ItemStack itemstack, World world,
         EntityPlayer player) {
      LogHelper.info("This itemstack has been rightclicked");

      // itemstack.stackSize = itemstack.stackSize + 1;
      player.setVelocity(0, 2, 0);

      return itemstack;
   }

}
