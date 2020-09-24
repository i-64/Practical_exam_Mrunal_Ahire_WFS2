/**
 * 
 */
package com.everyday.utilities;

import java.util.Comparator;

import com.everyday.entity.Apparel;

/**
 * @author Mrunal Ahire
 * 
 * comparator for sorting Apparels
 *
 */
public class SortByQuantityApparel implements Comparator<Apparel> {

	@Override
	public int compare(Apparel arg0, Apparel arg1) {
		// TODO Auto-generated method stub
		if (arg0.getQuantity() < arg1.getQuantity())
			return -1;
		else if (arg0.getQuantity() > arg1.getQuantity())
			return 1;
		else
			return 0;
	}

}
