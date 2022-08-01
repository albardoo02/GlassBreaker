package com.github.albardoo02;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;


public class Events implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        Block block = event.getClickedBlock();
        Action action = event.getAction();
        Player player = event.getPlayer();
        if(action.equals(Action.LEFT_CLICK_BLOCK)){
            if (event.getItem() !=null) {
                if (event.getItem().getItemMeta().equals((ItemManager.hoe.getItemMeta()))) {
                    if (block.getType() == Material.GLASS) {
                        event.setCancelled(true);
                        block.setType(Material.AIR);
                        player.getInventory().addItem(new ItemStack(Material.GLASS));
                        player.playSound(player.getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0f, 1.0f);
                    }
                    if (block.getType() == Material.CARROTS) {
                        event.setCancelled(true);
                    }
                    if (block.getType() == Material.POTATOES) {
                        event.setCancelled(true);
                    }
                    if (block.getType() == Material.WHEAT) {
                        event.setCancelled(true);
                    }
                    if (block.getType() == Material.PUMPKIN_STEM) {
                        event.setCancelled(true);
                    }
                    if (block.getType() == Material.ATTACHED_PUMPKIN_STEM) {
                        event.setCancelled(true);
                    }
                    if (block.getType() == Material.BEETROOTS) {
                        event.setCancelled(true);
                    }
                    if (block.getType() == Material.NETHER_WART) {
                        event.setCancelled(true);
                    }
                }
            }
        }
        if(action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals((ItemManager.hoe.getItemMeta()))) {
                    if (block.getType() == Material.GRASS_BLOCK) {
                        event.setCancelled(true);
                    }
                    if (block.getType() == Material.DIRT) {
                        event.setCancelled(true);
                    }
                    if (block.getType() == Material.COARSE_DIRT) {
                        event.setCancelled(true);
                    }
                }
            }
        }
    }
}
