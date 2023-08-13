package me.codetoolsapi.codetoolsapi.CommandTools;

import org.bukkit.entity.Player;

public abstract class Subcommand {
    public abstract String getName();
    public abstract String getDescription();
    public abstract String getSyntax();
    public abstract void perform(Player p, String[] args);
}
