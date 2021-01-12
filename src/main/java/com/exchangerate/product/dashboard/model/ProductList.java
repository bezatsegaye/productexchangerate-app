package com.exchangerate.product.dashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long itemID;
	private String itemName;
	@Column(scale = 2)
	private double itemCost;
	
	public ProductList() {
		super();
	}

	public ProductList(long itemID, String itemName, double itemCost) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemCost = itemCost;
	}

	public long getItemID() {
		return itemID;
	}

	public void setItemID(long itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	
	
	
	

}
