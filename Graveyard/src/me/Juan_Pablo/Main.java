package me.Juan_Pablo;

import org.bukkit.plugin.java.JavaPlugin;

import me.Juan_Pablo.cmds.Help;
import me.Juan_Pablo.cmds.Website;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getCommand("website").setExecutor(new Website(this));
		getCommand("help").setExecutor(new Help(this));
	}
	
	public void onDisable() {
		
	}

}
