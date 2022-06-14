package fr.ayato.coins.utils;

import fr.ayato.coins.Main;

import java.util.List;

public class Config {

    //get the name of the coinFragment from the config.yml
    public static String getCoinFragmentName() {
        return Main.getInstance().getConfig().getString("coinFragment.name");
    }

    //Get the lore of the coinFragment from the config.yml
    public static List<String> getCoinFragmentLore() {
        return Main.getInstance().getConfig().getStringList("coinFragment.lore");
    }

    //get the name of the coin from the config.yml
    public static String getCoinName() {
        return Main.getInstance().getConfig().getString("coin.name");
    }

    //Get the lore of the coin from the config.yml
    public static List<String> getCoinLore() {
        return Main.getInstance().getConfig().getStringList("coin.lore");
    }
}
