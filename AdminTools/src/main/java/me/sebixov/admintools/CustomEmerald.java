package me.sebixov.admintools;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class CustomEmerald {
    public static ItemStack MerlinEmerald;
    public  static ItemStack MerlinBlock;
    public static ItemStack  MerlinSword;
    public static ItemStack MerlinPickaxe;

    public static void init() {
        createEmerald();
        createEmeraldBlock();
        createSword();
        createPickaxe();

    }
    private static void createEmerald() {
        ItemStack emerald = new ItemStack(Material.EMERALD, 1);
        ItemMeta meta = emerald.getItemMeta();
        meta.setDisplayName("§2Merlin's crystal");
        List<String> lore = new ArrayList<>();
        lore.add("§7A magic resource that allows new crafting!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        MerlinEmerald.setItemMeta(meta);
        MerlinEmerald = emerald;


    }
    private static void createEmeraldBlock(){
        ItemStack block = new ItemStack(Material.EMERALD_BLOCK, 1);
        ItemMeta meta = block.getItemMeta();
        meta.setDisplayName("§2Block of Merlin's crystals");
        List<String> lore = new ArrayList<>();
        lore.add("§7A magic resource that allows new crafting!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        MerlinBlock.setItemMeta(meta);
        MerlinBlock = block;

        ShapedRecipe BlockCrafting = new ShapedRecipe(NamespacedKey.minecraft("Block"), MerlinBlock);
        BlockCrafting.shape("E", "E", "E",
                "E", "E", "E",
                "E", "E", "E");
        BlockCrafting.setIngredient('E', MerlinEmerald);
        Bukkit.getServer().addRecipe(BlockCrafting);
    }
    private static void createSword(){
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = sword.getItemMeta();
        meta.setDisplayName("§2Merlin's Sword");
        List<String> lore  = new ArrayList<>();
        lore.add("§7A magic and powerful sword");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 4, false);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 7, false);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 2, false);
        MerlinSword.setItemMeta(meta);
        MerlinSword = sword;

        ShapedRecipe SwordCrafting  = new ShapedRecipe(NamespacedKey.minecraft("pickaxe"), MerlinPickaxe);
        SwordCrafting.shape("", "B", "",
                            "", "B", "",
                            "B", "S", "B");
        SwordCrafting.setIngredient('B', MerlinBlock);
        SwordCrafting.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(SwordCrafting);


    }
    private static void createPickaxe(){
        ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta = pickaxe.getItemMeta();
        meta.setDisplayName("Merlin's Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("A magic and powerful pickaxe");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DIG_SPEED, 6, false);
        meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 4, false);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        MerlinPickaxe.setItemMeta(meta);
        MerlinPickaxe = pickaxe;

        ShapedRecipe PickaxeCrafting  = new ShapedRecipe(NamespacedKey.minecraft("pickaxe"), MerlinPickaxe);
        PickaxeCrafting.shape("B", "B", "B",
                              "", "S", "",
                              "", "S", "");
        PickaxeCrafting.setIngredient('B', MerlinBlock);
        PickaxeCrafting.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(PickaxeCrafting);
    }
}
