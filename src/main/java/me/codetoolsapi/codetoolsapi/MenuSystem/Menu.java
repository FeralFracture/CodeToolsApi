package me.codetoolsapi.codetoolsapi.MenuSystem;

import me.codetoolsapi.codetoolsapi.MenuSystem.MenuItems.FillerGlass;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public abstract class Menu implements InventoryHolder {
    protected Inventory inventory;
    protected PlayerMenuUtility playerMenuUtility;

    public Menu(PlayerMenuUtility playerMenuUtility) {
        this.playerMenuUtility = playerMenuUtility;
    }

    public abstract String getMenuName();

    public abstract boolean autoCancel();

    public abstract int getRows();

    public abstract void handleMenu(InventoryClickEvent e);

    public abstract void setMenuItems();

    public abstract boolean fillerGlass();

    public void open() {
        inventory = Bukkit.createInventory(this, getRows() * 9, getMenuName());
        if (autoCancel()) {
            this.setMenuItems();
        }
        if (fillerGlass()) {
            for (int i = 0; i < getRows() * 9; i++) {
                if (inventory.getItem(i) == null) {
                    inventory.setItem(i, new FillerGlass());
                }
            }
        }
        playerMenuUtility.getOwner().openInventory(inventory);
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }


}
