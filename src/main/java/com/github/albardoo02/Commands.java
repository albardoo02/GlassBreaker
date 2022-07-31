package com.github.albardoo02;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                    "&8[&3&lGlassBreaker&8] &cコンソールからは実行できません!"));
            return true;
        }
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("/get")){
            player.getInventory().addItem(ItemManager.hoe);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                    "&8[&3&lGlassBreaker&8] &eアイテムを入手しました"));
        }
        return true;
    }
}