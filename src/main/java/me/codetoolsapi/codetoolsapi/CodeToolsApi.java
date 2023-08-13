package me.codetoolsapi.codetoolsapi;

import me.codetoolsapi.codetoolsapi.MenuSystem.PlayerMenuUtility;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class CodeToolsApi extends JavaPlugin {
    private static final HashMap<UUID, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    public static JavaPlugin getPlugin() {
        return plugin;
    }

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;

    }
    public static PlayerMenuUtility getPlayerMenuUtility(Player p) {
        if (playerMenuUtilityMap.containsKey(p.getUniqueId())) {
            return playerMenuUtilityMap.get(p.getUniqueId());
        } else {
            PlayerMenuUtility temp = new PlayerMenuUtility(p);
            playerMenuUtilityMap.put(p.getUniqueId(), temp);
            return temp;
        }
    }

}
