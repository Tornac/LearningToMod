package com.mv.ltm.block;

import com.mv.ltm.creative.CreativeTabLTM;

import net.minecraftforge.oredict.OreDictionary;

public class BlockFlag extends BlockLTM {

   public BlockFlag() {
      super();
      this.setBlockName("flag");
      setCreativeTab(CreativeTabLTM.LTM_TAB);
   }
}
