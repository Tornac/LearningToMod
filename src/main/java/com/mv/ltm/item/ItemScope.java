package com.mv.ltm.item;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.mv.ltm.creative.CreativeTabLTM;
import com.mv.ltm.util.LogHelper;

public class ItemScope extends ItemLTM {

   public ItemScope() {
      super();
      setUnlocalizedName("scope");
      setCreativeTab(CreativeTabLTM.LTM_TAB);
   }

   @Override
   public ItemStack onItemRightClick(ItemStack itemstack, World world,
         EntityPlayer player) {
      if (world.isRemote) return itemstack;
      LogHelper.info(String.format("Item %s has been used!",
            itemstack.getDisplayName()));
      // MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity
      // .rayTrace(200, 1.0F);
      MovingObjectPosition mop = getMovingObjectPositionFromPlayer(world, player, false);
      if (mop != null) {
         int blockHitSide = mop.sideHit;
         Block blockLookingAt = world.getBlock(mop.blockX, mop.blockY,
               mop.blockZ);
         LogHelper.info(blockLookingAt);

         if (blockLookingAt != null) {
//            blockLookingAt.dropBlockAsItem(world, (int)player.posX, (int)player.posY, (int)player.posZ, 10, 20);
            ArrayList<ItemStack> lootList = blockLookingAt.getDrops(world, mop.blockX, mop.blockY, mop.blockZ, 0, 0);
            for (ItemStack droppedStack: lootList) {
               EntityItem itemEntity = new EntityItem(world, player.posX, player.posY, player.posZ, droppedStack);
               itemEntity.delayBeforeCanPickup = 0;
               world.spawnEntityInWorld(itemEntity);
            }
            world.setBlockToAir(mop.blockX, mop.blockY, mop.blockZ);
         }
      }

      return itemstack;
   }
}
