package com.mv.ltm.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.mv.ltm.creative.CreativeTabLTM;
import com.mv.ltm.util.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMapleLeaf extends ItemLTM {

   public ItemMapleLeaf() {
      super();
      setUnlocalizedName("mapleLeaf");
      setCreativeTab(CreativeTabLTM.LTM_TAB);
   }

   @Override
   public EnumRarity getRarity(ItemStack istack) {
      return EnumRarity.epic;
   }

   @Override
   @SideOnly(Side.CLIENT)
   public ItemStack onItemRightClick(ItemStack itemstack, World world,
         EntityPlayer player) {
      LogHelper.info("This itemstack has been rightclicked");

      // itemstack.stackSize = itemstack.stackSize + 1;
      player.setVelocity(0, 2, 0);

      return itemstack;
   }

}
