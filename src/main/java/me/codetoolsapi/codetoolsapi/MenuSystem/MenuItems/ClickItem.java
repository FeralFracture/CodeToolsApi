package me.codetoolsapi.codetoolsapi.MenuSystem.MenuItems;

import me.codetoolsapi.codetoolsapi.PersistentDataUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.ArrayList;

public abstract class ClickItem extends ItemStack {
    protected ItemMeta item_meta = this.getItemMeta();
    public abstract String getName();
    public abstract ArrayList<String> getLore();
    protected abstract void setPersistentData(PersistentDataContainer data);
    public void setPersistentData(String key, String value) {
        PersistentDataUtils.addPersistentData(item_meta.getPersistentDataContainer(), key, value);
        this.setItemMeta(item_meta);
    }
public ClickItem(Material material, String name) {
    super(material);
    item_meta.setLore(getLore());
    item_meta.setDisplayName(name);
    setPersistentData(item_meta.getPersistentDataContainer());
    this.setItemMeta(item_meta);
}
    public ClickItem(Material material) {
        super(material);
        item_meta.setLore(getLore());
        item_meta.setDisplayName(getName());
        setPersistentData(item_meta.getPersistentDataContainer());
        this.setItemMeta(item_meta);
    }
}
