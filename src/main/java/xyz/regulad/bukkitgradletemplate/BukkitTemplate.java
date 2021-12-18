package xyz.regulad.bukkitgradletemplate;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * A template plugin to be used in Minecraft plugins.
 */
public class BukkitTemplate extends JavaPlugin {
    @Override
    public void onEnable() {
        final @NotNull Metrics metrics = new Metrics(this, 13651);
    }
}
