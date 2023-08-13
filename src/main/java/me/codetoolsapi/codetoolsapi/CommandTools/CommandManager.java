package me.codetoolsapi.codetoolsapi.CommandTools;

import me.codetoolsapi.codetoolsapi.CodeToolsApi;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class CommandManager implements TabExecutor {
    protected ArrayList<Subcommand> subcommands = new ArrayList<>();

    public abstract ArrayList<String> subcommand_player_autoTab();

    public abstract int header_footer_bar_length();

    public abstract String command_prefix();
    public abstract String command_manager_title();

    public abstract String command_name_color();

    public abstract String command_description_color();

    public abstract String command_syntax_color();

    public abstract String header_footer_color();

    public abstract boolean add_header_footer_bars();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player p) {
            if (args.length > 0) {
                //help notations
                if (args[0].equalsIgnoreCase("help")) {
                    if (args.length == 1) {
                        sendBasicHelpMessage(p);
                    } else {
                        for (int i = 0; i < subcommands.size(); i++) {
                            if (args[1].equalsIgnoreCase(subcommands.get(i).getName())) {
                                if (add_header_footer_bars()) {
                                    sendBar(p, true);
                                }
                                p.sendMessage(command_syntax_color() + subcommands.get(i).getSyntax());
                                p.sendMessage(command_description_color() + subcommands.get(i).getDescription());
                                if (add_header_footer_bars()) {
                                    sendBar(p, false);
                                }
                                break;
                            }
                        }
                    }
                }
                //subcommand executions
                else {
                    for (int i = 0; i < subcommands.size(); i++) {
                        if (args[0].equalsIgnoreCase(subcommands.get(i).getName())) {
                            subcommands.get(i).perform(p, args);
                            break;
                        }
                    }
                }
            } else {
                sendBasicHelpMessage(p);
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {
        ArrayList<String> words = new ArrayList<>();
        if (args.length == 1) {
            for (int i = 0; i < subcommands.size(); i++) {
                words.add(subcommands.get(i).getName());
            }
            words.add("help");
        } else if (args.length == 2) {
            if (subcommand_player_autoTab().contains(args[0].toLowerCase())) {
                for (Player p : CodeToolsApi.getPlugin().getServer().getOnlinePlayers()) {
                    words.add(p.getDisplayName());
                }
            } else if (args[0].equalsIgnoreCase("help")) {
                for (int i = 0; i < subcommands.size(); i++) {
                    words.add(subcommands.get(i).getName());
                }
            }
        }
        return words;
    }

    private void sendBasicHelpMessage(Player p) {
        sendBar(p, true);
        p.sendMessage(ChatColor.BLUE + "Type '" + command_prefix() + " help <command>' for more information");
        for (int i = 0; i < subcommands.size(); i++) {
            p.sendMessage(command_name_color() + "/" + command_prefix() + " " + subcommands.get(i).getName());
        }
        sendBar(p, false);
    }

    private void sendBar(Player p, boolean title) {
        if (title) {
            int subs = (header_footer_bar_length() - command_manager_title().length()) / 2;
            StringBuilder out = new StringBuilder(header_footer_color());
            for (int i = 0; i < subs; i++) {
                out.append("=");
            }
            out.append(command_name_color());
            out.append(command_manager_title());
            out.append(header_footer_color());
            for (int i = 0; i < subs; i++) {
                out.append("=");
            }
            p.sendMessage(out.toString());
        } else {
            StringBuilder out = new StringBuilder(header_footer_color());
            for (int i = 0; i < header_footer_bar_length(); i++) {
                out.append("=");
            }
            p.sendMessage(out.toString());
        }
    }
}
