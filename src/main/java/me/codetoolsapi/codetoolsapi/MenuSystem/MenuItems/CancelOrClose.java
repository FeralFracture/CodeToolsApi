package me.codetoolsapi.codetoolsapi.MenuSystem.MenuItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.ArrayList;

public class CancelOrClose extends ClickItem{
    private String name = ChatColor.RED + "Cancel";
    public CancelOrClose(String name) {
        super(Material.BARRIER);
        this.name = name;
    }
    public CancelOrClose() {
        super(Material.BARRIER);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public ArrayList<String> getLore() {
        return null;
    }

    @Override
    protected void setPersistentData(PersistentDataContainer data) {

    }
}
