package fr.ayato.coins;

import fr.ayato.coins.commands.CommandCoins;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main getInstance() {
        return JavaPlugin.getPlugin(Main.class);
    }

    @Override
    public void onEnable() {
        System.out.println(ChatColor.WHITE + "--------------------");
        System.out.println(ChatColor.AQUA + "[" + ChatColor.YELLOW + "Idalia" + ChatColor.AQUA + "]" + ChatColor.GREEN + " Coins is now enabled !");
        System.out.println(ChatColor.WHITE + "--------------------");
        saveDefaultConfig();
        getCommand("coins").setExecutor(new CommandCoins());
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.WHITE + "--------------------");
        System.out.println(ChatColor.AQUA + "[" + ChatColor.YELLOW + "Idalia" + ChatColor.AQUA + "]" + ChatColor.RED + " Coins is now disabled !");
        System.out.println(ChatColor.WHITE + "--------------------");
    }
}
