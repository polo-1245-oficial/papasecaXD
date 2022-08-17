package polo.pro.papasecalloron;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import polo.pro.papasecalloron.cmd.*;

public class Main extends JavaPlugin {
    private Main plugin;




    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§apapasecaXD cargado");
        comandos();
    }

    public void comandos(){
        getCommand("xd").setExecutor(new xd(this));
        getCommand("D").setExecutor(new D(this));
        getCommand("C").setExecutor(new c(this));
        getCommand("ayuda").setExecutor(new ayuda(this));
        getCommand("enojado").setExecutor(new enojacion(this));
    }
}
