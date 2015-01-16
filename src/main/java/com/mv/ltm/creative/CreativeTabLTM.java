package com.mv.ltm.creative;

import com.mv.ltm.init.ModItems;
import com.mv.ltm.ref.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLTM {

   public static final CreativeTabs LTM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

      @Override
      public Item getTabIconItem() {
         return ModItems.mapleLeaf;
      }

   };
}
