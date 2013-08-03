package ru.flydev.kartograf;

import org.bukkit.plugin.java.JavaPlugin;

import ru.flydev.kartograf.commands.FRpg;
import ru.flydev.kartograf.commands.FlyClass;

public class FlyClasses extends JavaPlugin {
		 
		public void onEnable(){
			getLogger().info("Enable FlyClasses!");
			
			getCommand("fc").setExecutor(new FlyClass(this));
			getCommand("frpg").setExecutor(new FRpg(this));
		}
	 
		public void onDisable(){
			getLogger().info("Disable FlyClasses!");
		}
}