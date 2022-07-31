package com.github.albardoo02;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack hoe;

    public static void init() {
        createHoe();
    }

    private static void createHoe(){
        ItemStack item = new ItemStack(Material.GOLDEN_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bガラス粉砕ツール");
        List<String> lore = new ArrayList<>();
        lore.add("ガラスを左クリックすることにより一瞬で破壊することが出来ます");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        hoe = item;
    }
}
