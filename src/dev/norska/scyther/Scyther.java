package dev.norska.scyther;

import org.bukkit.plugin.java.JavaPlugin;

public class Scyther extends JavaPlugin {
	
	private static Scyther instance;
	
	 public Scyther() {
	     instance = this;
	 }

	 public static Scyther getInstance() {
	     return instance;
	 }
	 
}
