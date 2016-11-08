package me.Juan_Pablo.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Juan_Pablo.Main;

public class Website implements CommandExecutor {
	
	public Website(Main main) {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("website")) {
			p.sendMessage("§c§m--§7§m[-§r  §7§lGrave§c§lyard§r  §7§m-]§c§m--§r");
			p.sendMessage("");
			p.sendMessage("§6§lWebsite §3§l> §bhttp://www.undeadgraveyard.enjin.com");
			p.sendMessage("");
			p.sendMessage("§c§m--§7§m[-§r  §7§lGrave§c§lyard§r  §7§m-]§c§m--§r");

		}
		return false;
	}

}
