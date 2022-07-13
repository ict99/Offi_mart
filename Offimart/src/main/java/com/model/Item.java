package com.model;

//pojo class with required attributes,getters and setters 
//Use Appropriate Annotation
public class Item {
	
private String itemId; 	
private String itemName;
//Fill the code
private int quantity;
private double costPerItem;
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getCostPerItem() {
	return costPerItem;
}
public void setCostPerItem(double costPerItem) {
	this.costPerItem = costPerItem;
}
public Item(String itemId, String itemName, int quantity, double costPerItem) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.quantity = quantity;
	this.costPerItem = costPerItem;
}
public Item(){}
}

