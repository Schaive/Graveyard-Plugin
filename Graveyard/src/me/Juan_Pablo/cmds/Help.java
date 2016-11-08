package me.Juan_Pablo.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Juan_Pablo.Main;

public class Help implements CommandExecutor {
	
	public Help(Main main) {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("help")) {
			p.sendMessage("§c§m--§7§m[-§r  §7§lGrave§c§lyard§r  §7§m-]§c§m--§r");
			p.sendMessage(" §3/helpop §9»§c Sends Private Msg To Admins");
			p.sendMessage(" §3/plotMe §9»§c Lists All Of The PlotMe Commands");
			p.sendMessage(" §3/wild §9»§c Teleports You To A Random Location");
			p.sendMessage(" §3/shop §9»§c Teleports You To The Shop");
			p.sendMessage(" §3/rules §9»§c Lists All The Rules");
			p.sendMessage("§6Help Page §c1§3 - §c6");
			p.sendMessage("§c§m--§7§m[-§r  §7§lGrave§c§lyard§r  §7§m-]§c§m--§r");
		}
		if(args[0].equalsIgnoreCase("1") {
			p.sendMessage("§c§m--§7§m[-§r  §7§lGrave§c§lyard§r  §7§m-]§c§m--§r");
			p.sendMessage("§3/warps §9»§cLists All The Warps");
			p.sendMessage("§3/buy §9»§c Lists All Of The PlotMe Commands");
			p.sendMessage("§3/wild §9»§c Teleports You To A Random Location");
			p.sendMessage("§3/shop §9»§c Teleports You To The Shop");
			p.sendMessage("§3/rules §9»§c Lists All The Rules");
			p.sendMessage("§6Help Page §c2§3 - §c6");
			p.sendMessage("§c§m--§7§m[-§r  §7§lGrave§c§lyard§r  §7§m-]§c§m--§r");
		}
		return false;
	}
	

}
