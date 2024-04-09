package me.sebixov.admintools;

import org.bukkit.plugin.java.JavaPlugin;

public final class AdminTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new GiveEmerald(), this);
        CustomEmerald.init();
        getLogger().info("Plugin loaded with success!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin shut down with success!");
    }
}
