package fr.ayato.coins.commands;

import fr.ayato.coins.coin.Coin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandCoins implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (args.length == 3) {
            if (args[1].equals("fragment")) {
                Player p = (Player) sender;
                p.getInventory().addItem(Coin.getCoinFragment(Integer.parseInt(args[2])));
            } else if (args[1].equals("coin")) {
                Player p = (Player) sender;
                p.getInventory().addItem(Coin.getCoin(Integer.parseInt(args[2])));
            }
        } else {
            sender.sendMessage("§cLa commande est /coins <pseudo> <coin/fragment> <nombre>");
        }
        return false;
    }
}
