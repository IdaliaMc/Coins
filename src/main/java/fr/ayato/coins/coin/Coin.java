package fr.ayato.coins.coin;

import fr.ayato.coins.utils.Config;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Coin {

    public static ItemStack getCoinFragment(int amount) {
        ItemStack item = new ItemStack(Material.GOLD_NUGGET);
        item.setAmount(amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Config.getCoinFragmentName());
        meta.setLore(Config.getCoinFragmentLore());
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        return item;
    }

    public static ItemStack getCoin(int amount) {
        ItemStack item = new ItemStack(Material.GOLD_INGOT);
        item.setAmount(amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Config.getCoinName());
        meta.setLore(Config.getCoinLore());
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        return item;
    }
}
