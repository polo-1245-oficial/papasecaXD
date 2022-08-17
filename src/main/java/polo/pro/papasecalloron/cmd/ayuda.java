package polo.pro.papasecalloron.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import polo.pro.papasecalloron.Main;

public class ayuda implements CommandExecutor {

    public ayuda(Main main) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("§cpapasecaXD");
        sender.sendMessage("/D -> Te responde con :D");
        sender.sendMessage("/c -> Te responde con :c");
        sender.sendMessage("/xd -> Te responde con xd");
        sender.sendMessage("/ayuda -> Te responde con esta guía");
        sender.sendMessage("/enojado -> Te responde bien enojado");
        sender.sendMessage("§aCódigo abierto -> htttps://github.com/polo-1245-oficial/papasecaXD");
        return false;
    }
}
