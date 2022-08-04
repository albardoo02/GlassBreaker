package com.github.albardoo02;


import org.bukkit.plugin.java.JavaPlugin;

public final class GlassBreaker extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("§3正常に処理が完了しました");

        ItemManager.init();
        getCommand("/get").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("§3プラグインを停止しています...");
        getLogger().info("§3正常に処理が完了しました");
    }
}
