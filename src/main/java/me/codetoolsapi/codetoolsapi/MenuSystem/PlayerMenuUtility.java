package me.codetoolsapi.codetoolsapi.MenuSystem;

import org.bukkit.entity.Player;

public abstract class PlayerMenuUtility {
    private Player owner;
    public PlayerMenuUtility(Player owner) {
        this.owner = owner;
    }
    public Player getOwner() {
        return owner;
    }
    public void setOwner(Player owner) {
        this.owner = owner;
    }
}

