package com.TylerHanavan.ItemTracker;

import org.bukkit.plugin.java.JavaPlugin;

public class ItemTracker extends JavaPlugin {

	@Override
	public void onEnable(){
		
		this.getServer().getPluginManager().registerEvents(new InventoryListener(this), this);
		
	}
	
	@Override
	public void onDisable(){
		
		
		
	}
	
}
