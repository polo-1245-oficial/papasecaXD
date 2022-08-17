package polo.pro.papasecalloron.cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import polo.pro.papasecalloron.Main;

public class xd implements CommandExecutor {
    private final Main plugin;

    public xd(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        if(sender instanceof Player) {
            player.sendTitle("§cXD", "");
            sender.sendMessage("§cXD");
        } else {

            Bukkit.getConsoleSender().sendMessage("viejo bellaco q ase desde la consola");
        }

        return false;
    }
}
