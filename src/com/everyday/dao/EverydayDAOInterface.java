/**
 * 
 */
package com.everyday.dao;

import java.util.ArrayList;

import com.everyday.utilities.InvalidTypeException;
import com.everyday.utilities.NotEnoughItemsException;

/**
 * @author Mrunal Ahire
 * 
 * interface for data access layer
 *
 */
public interface EverydayDAOInterface {

	public int addNewItem(String type, Object item) throws InvalidTypeException;
	public ArrayList<Object> retrieveData(String type) throws NotEnoughItemsException;
}
