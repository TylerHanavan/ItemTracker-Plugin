package com.TylerHanavan.ItemTracker;

import org.bukkit.plugin.java.JavaPlugin;

public class ItemTracker extends JavaPlugin {

	@Override
	public void onEnable(){
		
		this.getServer().getPluginManager().registerEvents(new InventoryListener(this), this);
		
		this.getCommand("it").setExecutor(new ItemTrackerCommand());
		
	}
	
	@Override
	public void onDisable(){
		
		
		
	}
	
}
