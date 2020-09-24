/**
 * 
 */
package com.everyday.dao;

import java.util.ArrayList;
import java.util.Collections;

import com.everyday.entity.Apparel;
import com.everyday.entity.Electronics;
import com.everyday.entity.FoodItem;
import com.everyday.utilities.InvalidTypeException;
import com.everyday.utilities.NotEnoughItemsException;
import com.everyday.utilities.SortByQuantity;
import com.everyday.utilities.SortByQuantityApparel;
import com.everyday.utilities.SortByQuantityElectronics;

/**
 * @author Mrunal Ahire
 * 
 * class for data access layer
 *
 */
public class EverydayDAO implements EverydayDAOInterface {
	
	private ArrayList <FoodItem> foodItems;
	private ArrayList <Apparel> apparel;
	private ArrayList <Electronics> electronics;
	
	public EverydayDAO () {
		
		foodItems = new ArrayList<>();
		apparel = new ArrayList<>();
		electronics = new ArrayList<>();
	}

	@Override
	public int addNewItem(String type, Object item) throws InvalidTypeException {
		// TODO Auto-generated method stub
		
		if (type.equalsIgnoreCase("food")) {
			if (foodItems.add((FoodItem)item))
				return 1;
			else
				return 0;
		}
		else if (type.equalsIgnoreCase("apparel")) {
			if (apparel.add((Apparel)item))
				return 1;
			else
				return 0;
		}
		else if (type.equalsIgnoreCase("electronics")) {
			if (electronics.add((Electronics)item))
				return 1;
			else
				return 0;
		}
		else 
			throw (new InvalidTypeException());
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList retrieveData(String type) throws NotEnoughItemsException {
		// TODO Auto-generated method stub
		
		if (type.equalsIgnoreCase("food")) {
			if (foodItems.size() < 3) {
				
				throw (new NotEnoughItemsException());
			}
			else {
				return getTopThreeFoodItem();
			}
		}
		else
			return null;
	}
	
	private ArrayList<FoodItem> getTopThreeFoodItem () {
		
		ArrayList<FoodItem> topThreeItems = new ArrayList<>();
		
		Collections.sort(foodItems, new SortByQuantity());
		
		for (int i = 0; i < 3; i++) {
			topThreeItems.add(foodItems.get(i));
		}
		return topThreeItems;
	}
	
	private ArrayList<Apparel> getTopThreeApparel() {
			
		ArrayList<Apparel> topThreeItems = new ArrayList<>();
			
		Collections.sort(apparel, new SortByQuantityApparel());
			
		for (int i = 0; i < 3; i++) {
			topThreeItems.add(apparel.get(i));
		}
		return topThreeItems;
		}
	
	private ArrayList<Electronics> getTopThreeElectronics () {
		
		ArrayList<Electronics> topThreeItems = new ArrayList<>();
		
		Collections.sort(electronics, new SortByQuantityElectronics());
		
		for (int i = 0; i < 3; i++) {
			topThreeItems.add(electronics.get(i));
		}
		return topThreeItems;
	}

}
