package com.mv.ltm.init;

import com.mv.ltm.block.BlockFlag;
import com.mv.ltm.block.BlockLTM;
import com.mv.ltm.ref.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(
   value = Reference.MOD_ID)
public class ModBlocks {

   public static final BlockLTM flag = new BlockFlag();

   public static void init() {
      GameRegistry.registerBlock(flag, "flag");
   }

}
