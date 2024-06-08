package dev.mzcy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.net.InetAddress;

public class SkriptFantasies extends JavaPlugin {

    public static final String PREFIX = "§8[§bSkriptFantasies§8] §7";


    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new dev.mzcy.permission.PermissionHandler(), this);
        System.out.println(PREFIX + "§aSkriptFantasies has been enabled!");

    }

    @Override
    public void onDisable() {
        System.out.println(PREFIX + "§cSkriptFantasies has been disabled!");
    }
}