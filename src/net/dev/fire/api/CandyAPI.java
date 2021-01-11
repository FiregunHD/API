package net.dev.fire.api;

import org.bukkit.plugin.java.JavaPlugin;

public class CandyAPI extends JavaPlugin {

    private static CandyAPI api;

    @Override
    public void onEnable() {
        api = this;
    }

    @Override
    public void onDisable() {

    }

    public static CandyAPI getAPI() {
        return api;
    }
}
