package me.TentCoverage.Tutorial1;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.TentCoverage.Tutorial1.Commands.awesome;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("Plugin is currently working, @copyright TentCoverage no creation of anything can be done without consent of pc9040@pleasantonusd.net");
	
		this.getCommand("findme").setExecutor((CommandExecutor)new awesome());
	}
	@Override
	public void onDisable() {
		System.out.println("The plugin is now turning off @copyright TentCoverage, no use of copying or reorganizing can be done without the consent of pc9040@pleasantonusd.net");
		
	}

}
