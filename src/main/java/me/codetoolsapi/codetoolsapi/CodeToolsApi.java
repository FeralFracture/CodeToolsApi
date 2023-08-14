package me.codetoolsapi.codetoolsapi;

import me.codetoolsapi.codetoolsapi.MenuSystem.PlayerMenuUtility;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class CodeToolsApi extends JavaPlugin {

    public static JavaPlugin getPlugin() {
        return plugin;
    }

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;

    }
}
