/**
 * 
 */
package com.everyday.business;

import com.everyday.utilities.InvalidTypeException;
import com.everyday.utilities.NotEnoughItemsException;

/**
 * @author Mrunal Ahire
 * 
 * interface for business layer
 *
 */
public interface EverydayBusinessInterface {
	
	public void addItem() throws InvalidTypeException;
	public void retrieveItems() throws NotEnoughItemsException;
}
