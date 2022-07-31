package com.github.albardoo02;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class Events implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        Block block = event.getClickedBlock();
        Action action = event.getAction();
        if(action.equals(Action.LEFT_CLICK_BLOCK)){
            if (event.getItem() !=null) {
                if (event.getItem().getItemMeta().equals((ItemManager.hoe.getItemMeta()))) {
                    if (block.getType() == Material.GLASS) {
                        event.setCancelled(true);
                        block.setType(Material.AIR);
                    }
                }
            }
        }
    }
}
