package me.codetoolsapi.codetoolsapi.MenuSystem.MenuItems;

import org.bukkit.Material;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.ArrayList;

public class PageButton extends ClickItem{

    private String name;
    public PageButton(String name) {
        super(Material.DARK_OAK_BUTTON);
        this.name = name;
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
