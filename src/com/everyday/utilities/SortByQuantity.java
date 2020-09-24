/**
 * 
 */
package com.everyday.utilities;

import java.util.Comparator;

import com.everyday.entity.FoodItem;

/**
 * @author Mrunal Ahire
 * 
 * comparator for sorting by quantity
 *
 */
public class SortByQuantity implements Comparator<FoodItem>{

	@Override
	public int compare(FoodItem arg0, FoodItem arg1) {
		// TODO Auto-generated method stub
		if (arg0.getQuantity() < arg1.getQuantity())
			return -1;
		else if (arg0.getQuantity() > arg1.getQuantity())
			return 1;
		else
			return 0;
	}	
}
