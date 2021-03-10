package GROUP;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin Enabled.");
    }

    public void onDisable() {
        getLogger().info("Plugin Disabled.");
    }
}
