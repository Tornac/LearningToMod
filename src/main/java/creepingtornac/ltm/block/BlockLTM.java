package creepingtornac.ltm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import creepingtornac.ltm.ref.Reference;

public class BlockLTM extends Block {

   public BlockLTM(Material material) {
      super(material);
   }

   public BlockLTM() {
      super(Material.rock);
   }

   @Override
   public String getUnlocalizedName() {
      return String.format("tile.%s", getUnwrappedUnlocalizedName());
   }

   protected String getUnwrappedUnlocalizedName() {
      String unlocalized = super.getUnlocalizedName();
      return String.format("%s:%s", Reference.MOD_ID,
            unlocalized.substring(unlocalized.indexOf(".") + 1));
   }

   @Override
   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iiconRegister) {
      blockIcon = iiconRegister.registerIcon(getUnwrappedUnlocalizedName());
   }
}
