package com.TylerHanavan.ItemTracker;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class InventoryListener implements Listener {

	private ItemTracker itemTracker = null;
	
	public InventoryListener(ItemTracker itemTracker){
		
		this.itemTracker = itemTracker;
		
	}
	
	@EventHandler
	public void onInventoryOpen(InventoryOpenEvent event){
		
		
		
	}
	
	@EventHandler
	public void onInventoryClose(InventoryCloseEvent event){
		
		
		
	}
	
}
