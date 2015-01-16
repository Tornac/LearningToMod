package com.mv.ltm.init;

import com.mv.ltm.item.*;
import com.mv.ltm.ref.Reference;
import com.mv.ltm.util.LogHelper;

import cpw.mods.fml.common.registry.GameRegistry;

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
