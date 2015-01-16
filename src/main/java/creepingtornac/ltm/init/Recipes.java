package creepingtornac.ltm.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

   public static void init() {
      GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss",
            " s ", 's', new ItemStack(Items.stick));
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag),
            new ItemStack(ModItems.mapleLeaf));
      GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
            ModItems.mapleLeaf), "s  ", "s  ", "s  ", 's', "plankWood"));
   }

}
