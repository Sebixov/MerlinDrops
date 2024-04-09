package me.sebixov.admintools;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.SplittableRandom;

public class GiveEmerald implements Listener {

    @EventHandler
    public static void GetEmerald(BlockBreakEvent e){
        Player player = e.getPlayer();
        if (e.getBlock().getType() == Material.DIAMOND_ORE){
            SplittableRandom random = new SplittableRandom();
            boolean c = random.nextInt(100) < 5;
            if (c){
               player.getInventory().addItem(CustomEmerald.MerlinEmerald);
            }
        }
        if (e.getBlock().getType() == Material.EMERALD_ORE){
            SplittableRandom random = new SplittableRandom();
            boolean c = random.nextInt(100) < 5;
            if (c) {
                player.getInventory().addItem(CustomEmerald.MerlinEmerald);
            }
        }
    }
}
