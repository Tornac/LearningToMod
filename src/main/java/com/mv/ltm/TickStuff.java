package com.mv.ltm;

import com.mv.ltm.util.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class TickStuff {
   public long countedTicks = 0;
   boolean initiated = false;
   long timer;
   
//   @SubscribeEvent
//   public void inc(WorldTickEvent event) {
//      if (event.phase.equals(TickEvent.Phase.START)) {
//         if (!initiated) {
//            initiated = true;
//            timer = System.currentTimeMillis();
//         }
//         countedTicks++;
//         LogHelper.info("tps = " + (1000f*countedTicks/(System.currentTimeMillis()-timer)));
//         
//      }
//   }
   

}
