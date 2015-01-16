package creepingtornac.ltm.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import creepingtornac.ltm.ref.Reference;

public class ItemLTM extends Item {

   public ItemLTM() {
      super();

   }

   /*
    * Note to self about unlocalized item names The raw one is formated like
    * "item.NAME" The one I get by editing it is "item.MOD_ID:NAME" The
    * unwrapped version is like "MOD_ID:NAME"
    */

   /**
    * @return Unlocalized name with MOD_ID added in, i.e. "item.MOD_ID:NAME"
    */
   @Override
   public String getUnlocalizedName() {
      return String.format("item.%s", getUnwrappedUnlocalizedName());
   }

   public String getUnlocalizedName(ItemStack itemstack) {
      return getUnlocalizedName();
   }

   /**
    * @return The unlocalized name with the "item." portion gotten rid of.
    */
   protected String getUnwrappedUnlocalizedName() {
      String unlocalized = super.getUnlocalizedName();
      return String.format("%s:%s", Reference.MOD_ID,
            unlocalized.substring(unlocalized.indexOf(".") + 1));
   }

   @Override
   @SideOnly(Side.CLIENT)
   public void registerIcons(IIconRegister iiconRegister) {
      itemIcon = iiconRegister.registerIcon(getUnwrappedUnlocalizedName());
   }

   // public void printStuff() {
   // System.out.println("========================");
   // System.out.println("Here's some info about this item");
   // System.out.println("actual unlocalized name: "
   // + super.getUnlocalizedName());
   // System.out.println("edited unlocalized name: "
   // + this.getUnlocalizedName());
   // System.out.println("unwrapped-unlocalized name: "
   // + this.getUnwrappedUnlocalizedName());
   // System.out.println("========================");
   // }

}
