/**
 * 
 */
package com.everyday.entity;

/**
 * @author Mrunal Ahire
 * 
 * entity class for food items
 *
 */
public class FoodItem {
	
	private int itemCode, quantity;
	private boolean vegetarian;
	private String itemName;
	
	/**
	 * @return the itemCode
	 */
	public int getItemCode() {
		return itemCode;
	}
	/**
	 * @param itemCode the itemCode to set
	 */
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the vegetarian
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}
	/**
	 * @param vegetarian the vegetarian to set
	 */
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public String toString () {
		return (itemCode + " " + itemName + " " + quantity + " " + vegetarian);
	}
}
