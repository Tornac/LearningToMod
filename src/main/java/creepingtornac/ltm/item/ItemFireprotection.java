package creepingtornac.ltm.item;

import java.util.LinkedList;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import creepingtornac.ltm.creative.CreativeTabLTM;

public class ItemFireprotection extends ItemLTM {

   public ItemFireprotection() {
      super();
      setUnlocalizedName("fireprotection");
      setCreativeTab(CreativeTabLTM.LTM_TAB);
   }

   @Override
   public void onUpdate(ItemStack itemstack, World world, Entity player,
         int slot, boolean selected) {

      // LogHelper.info("Item is being worn !");

      if (player.isSprinting()) {
         player.setFire(1);
      }

   }

   @Override
   public ItemStack onItemRightClick(ItemStack itemstack, World world,
         EntityPlayer player) {
      
      MovingObjectPosition mop = getMovingObjectPositionFromPlayer(world, player, false);
      Block block = null;
      if (mop != null) {
         int blockHitSide = mop.sideHit;
         block = world.getBlock(mop.blockX, mop.blockY,
               mop.blockZ);
      }
      if (block == null) {
         return itemstack;
      }
      /*
       * 1  procedure BFS(G,v) is
2      create a queue Q
3      create a set V
4      add v to V
5      enqueue v onto Q
6      while Q is not empty loop
7         t <- Q.dequeue()
8         if t is what we are looking for then
9            return t
10        end if
11        for all edges e in G.adjacentEdges(t) loop
12           u <- G.adjacentVertex(t,e)
13           if u is not in V then
14               add u to V
15               enqueue u onto Q
16           end if
17        end loop
18     end loop
19     return none
20 end BFS
       */
      LinkedList<Block> queue = new LinkedList<Block>();
      queue.addLast(block);
      int depth = 0;
      while (!queue.isEmpty()) {
         Block currentBlock = queue.removeFirst();
      }
      
      return itemstack;
   }
}
