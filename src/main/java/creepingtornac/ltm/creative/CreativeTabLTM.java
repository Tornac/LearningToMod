package creepingtornac.ltm.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import creepingtornac.ltm.init.ModItems;
import creepingtornac.ltm.ref.Reference;

public class CreativeTabLTM {

   public static final CreativeTabs LTM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

      @Override
      public Item getTabIconItem() {
         return ModItems.mapleLeaf;
      }

   };
}
