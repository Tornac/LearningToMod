package com.mv.ltm;

import com.mv.ltm.client.handler.KeyInputEventHandler;
import com.mv.ltm.handler.ConfigurationHandler;
import com.mv.ltm.init.ModBlocks;
import com.mv.ltm.init.ModItems;
import com.mv.ltm.init.Recipes;
import com.mv.ltm.proxy.IProxy;
import com.mv.ltm.ref.Reference;
import com.mv.ltm.util.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

// Declaring various things about the mod itself
@Mod(
   modid = Reference.MOD_ID,
   name = Reference.MOD_NAME,
   version = Reference.MOD_VER,
   guiFactory = Reference.GUI_FACTORY_CLASS)
public class LearningToMod {

   // A clean instance of this mod class that can be referred to. I have no idea
   // what the point of this is just yet.
   @Instance(Reference.MOD_ID)
   public static LearningToMod instance;

   // Defining proxies which are supposedly important to separate between client
   // and server.
   @SidedProxy(
      clientSide = Reference.PROXYCLASS_CLIENT,
      serverSide = Reference.PROXYCLASS_SERVER)
   public static IProxy proxy;

   // The three steps of initialization
   @Mod.EventHandler
   public void preInit(FMLPreInitializationEvent event) {
      LogHelper.info("Entering preInit");
      long timerNS = System.nanoTime();
      // Initiating and registering the ConfigurationHandler, which is needed in
      // order to ... handle configurations (who'd have guessed)
      ConfigurationHandler.init(event.getSuggestedConfigurationFile());
      FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

      // Initiating all my items
      ModItems.init();
      ModBlocks.init();

      proxy.registerKeyBindings();

      LogHelper.info(String.format("preInit complete [took about %dns]",
            System.nanoTime() - timerNS));
   }

   @Mod.EventHandler
   public void init(FMLInitializationEvent event) {
      LogHelper.info("entering init");
      long timerNS = System.nanoTime();

      // This is where my stuff goes
      Recipes.init();
      FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
      FMLCommonHandler.instance().bus().register(new TickStuff());

      LogHelper.info(String.format("init complete [took about %dns]",
            System.nanoTime() - timerNS));
   }

   @Mod.EventHandler
   public void postInit(FMLPostInitializationEvent event) {
      LogHelper.info("entering postInit");
      long timerNS = System.nanoTime();

      // This is where my stuff goes

      LogHelper.info(String.format("postInit complete [took about %dns]",
            System.nanoTime() - timerNS));
   }

}
