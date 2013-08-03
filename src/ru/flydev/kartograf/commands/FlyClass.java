package ru.flydev.kartograf.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.getspout.spout.player.SpoutCraftPlayer;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.gui.WidgetAnchor;

import ru.flydev.kartograf.FlyClasses;


public class FlyClass extends GenericLabel implements CommandExecutor {

	private FlyClasses plugin;

	public FlyClass(FlyClasses plugin){
		this.plugin = plugin;
	}

	//This is a common command plug
	private GenericLabel wigdet  = new GenericLabel();
	private GenericPopup somePopup = new GenericPopup();
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("fc")){ 
			if (sender instanceof Player) {
				wigdet.setAuto(false).setX(10).setY(10).setWidth(100).setHeight(30);
				wigdet.setAnchor(WidgetAnchor.CENTER_CENTER);
				somePopup.attachWidget(plugin, wigdet);
				SpoutManager.getPlayer((Player) sender).getMainScreen().attachPopupScreen(somePopup);
				return true;
			} else {
				sender.sendMessage("This command can only be run by a player.");
				return true;
			}
		} else return false;
	}
}
