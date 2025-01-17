/**
 * Purpose : creating getter setter for inventory
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 */

package com.bridgelabz.oops;

import java.util.ArrayList;

import java.util.List;


public class InventoryList4{
	
	//creating inventory getter setter methods
	
	private String inventoryName;
	
	private List <Inventory4> listofInventories= new ArrayList<Inventory4>();

	public String getInventoryName() {
		return inventoryName;
	}

	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	public List<Inventory4> getListofInventories() {
		return listofInventories;
	}

	public void setListofInventories(List<Inventory4> listofInventories) {
		this.listofInventories = listofInventories;
	}
}	
	