package me.codetoolsapi.codetoolsapi.MenuSystem.MenuItems;

import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class FillerGlass extends ClickItem {
    public FillerGlass() {
        super(Material.GRAY_STAINED_GLASS_PANE);
    }

    @Override
    public String getName() {
        return " ";
    }

    @Override
    public ArrayList<String> getLore() {
        return null;
    }

    @Override
    public void setPersistentData(ItemMeta meta) {

    }
}

