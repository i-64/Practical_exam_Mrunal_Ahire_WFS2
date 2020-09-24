/**
 * 
 */
package com.everyday.entity;

/**
 * @author Mrunal Ahire
 * 
 * entity class for electronic products
 *
 */
public class Electronics {
	
	private int itemCode, quantity, warranty;
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
	 * @return the warranty
	 */
	public int getWarranty() {
		return warranty;
	}
	/**
	 * @param warranty the warranty to set
	 */
	public void setWarranty(int warranty) {
		this.warranty = warranty;
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
		return (itemCode + " " + itemName + " " + quantity + " " + warranty);
	}
	
}
