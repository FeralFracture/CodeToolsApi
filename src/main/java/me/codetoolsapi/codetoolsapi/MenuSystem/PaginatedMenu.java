package me.codetoolsapi.codetoolsapi.MenuSystem;

import me.codetoolsapi.codetoolsapi.MenuSystem.MenuItems.CancelOrClose;
import me.codetoolsapi.codetoolsapi.MenuSystem.MenuItems.FillerGlass;
import me.codetoolsapi.codetoolsapi.MenuSystem.MenuItems.PageButton;
import net.md_5.bungee.api.ChatColor;

public abstract class PaginatedMenu extends Menu {
    public PaginatedMenu(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
    }

    protected int page = 0;
    protected int maxItemsPerPage = 45;
    protected int index = 0;

    public void addMenuBorder() {
        inventory.setItem(48, new PageButton(ChatColor.GREEN + "Left"));
        inventory.setItem(49, new CancelOrClose(ChatColor.DARK_RED + "Close"));
        inventory.setItem(50, new PageButton(ChatColor.GREEN + "Right"));
        for (int i = 44; i < 54; i++) {
            if (inventory.getItem(i) == null) {
                inventory.setItem(i, new FillerGlass());
            }
        }
    }
    public int getMaxItemsPerPage() {
        return maxItemsPerPage;
    }
}
