package creepingtornac.ltm.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import creepingtornac.ltm.creative.CreativeTabLTM;
import creepingtornac.ltm.util.NBTHelper;

public class ItemNBTest extends ItemLTM {

   public ItemNBTest() {
      super();
      setUnlocalizedName("nbTest");
      setCreativeTab(CreativeTabLTM.LTM_TAB);
   }

   @Override
   public void addInformation(ItemStack itemstack, EntityPlayer player,
         List list, boolean parBoolean) {
      list.add("This is an item!");
      list.add("current counter: " + NBTHelper.getInt(itemstack, "counter"));
   }
   
   @Override
   public ItemStack onItemRightClick(ItemStack itemstack, World world,
         EntityPlayer player) {
      
      if (world.isRemote) return itemstack;
      
      NBTHelper.setInteger(itemstack, "counter", NBTHelper.getInt(itemstack, "counter")+1);
      
      return itemstack;
   }
}
