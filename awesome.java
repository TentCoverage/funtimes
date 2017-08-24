package me.TentCoverage.Tutorial1.Commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class awesome implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (player.isDead()) {
			player.sendMessage("Sorry! You died! ;), please do /findme for more results on this plugin! If you want to know how to get better at Minecraft, click ");
		} else if (player.hasPlayedBefore()) {
			
		player.sendMessage("Welcome to the realm! If you would like to know how to play Minecraft, please click the link: https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=2&cad=rja&uact=8&ved=0ahUKEwifkJrhluzVAhUS3GMKHTxACgQQFggnMAE&url=http%3A%2F%2Fwww.wikihow.com%2FPlay-Minecraft&usg=AFQjCNFN4SrHQA_Uz8lbLzQOzEH5IGKfTw");
		player.sendMessage("Thank you for downloading this plugin! I hope you have a great time!");
	
			
		} else {
		player.getEyeLocation();
		
		return true;
		}
		return false;}
} 


