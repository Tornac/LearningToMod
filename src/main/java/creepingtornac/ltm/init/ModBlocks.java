package creepingtornac.ltm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import creepingtornac.ltm.block.BlockFlag;
import creepingtornac.ltm.block.BlockLTM;
import creepingtornac.ltm.ref.Reference;

@GameRegistry.ObjectHolder(
   value = Reference.MOD_ID)
public class ModBlocks {

   public static final BlockLTM flag = new BlockFlag();

   public static void init() {
      GameRegistry.registerBlock(flag, "flag");
   }

}
