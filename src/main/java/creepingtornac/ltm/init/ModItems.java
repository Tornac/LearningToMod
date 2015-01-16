package creepingtornac.ltm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import creepingtornac.ltm.item.ItemFireprotection;
import creepingtornac.ltm.item.ItemLTM;
import creepingtornac.ltm.item.ItemMapleLeaf;
import creepingtornac.ltm.item.ItemNBTest;
import creepingtornac.ltm.item.ItemScope;
import creepingtornac.ltm.item.ItemTickCounter;
import creepingtornac.ltm.ref.Reference;
import creepingtornac.ltm.util.LogHelper;

@GameRegistry.ObjectHolder(
   value = Reference.MOD_ID)
public class ModItems {

   public static final ItemLTM mapleLeaf = new ItemMapleLeaf();
   public static final ItemLTM scope = new ItemScope();
   public static final ItemLTM fireprotection = new ItemFireprotection();
   public static final ItemLTM tickCounter = new ItemTickCounter();
   public static final ItemLTM nbTest = new ItemNBTest();

   public static void init() {
      GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
      GameRegistry.registerItem(scope, "scope");
      GameRegistry.registerItem(fireprotection, "fireprotection");
      GameRegistry.registerItem(tickCounter, "tickCounter");
      GameRegistry.registerItem(nbTest, "nbTest");
      LogHelper.info("Registerd items");
   }
}
