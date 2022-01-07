package xyz.regulad.papergradletemplate;

import lombok.Getter;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class PaperGradleTemplate extends JavaPlugin {
    @Getter
    private static PaperGradleTemplate instance;
    @Getter
    private Metrics metrics;

    @Override
    public void onEnable() {
        // Setup instance access
        instance = this;
        // Setup Metrics
        this.metrics = new Metrics(this, 13651);
    }

    @Override
    public void onDisable() {
        // Unload instance
        instance = null;
        // Let metrics garbage collect
        this.metrics = null;
    }
}
