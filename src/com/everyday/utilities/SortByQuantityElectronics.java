/**
 * 
 */
package com.everyday.utilities;

import java.util.Comparator;

import com.everyday.entity.Electronics;

/**
 * @author i-64
 *
 */
public class SortByQuantityElectronics implements Comparator<Electronics> {

	@Override
	public int compare(Electronics arg0, Electronics arg1) {
		// TODO Auto-generated method stub
		if (arg0.getQuantity() < arg1.getQuantity())
			return -1;
		else if (arg0.getQuantity() > arg1.getQuantity())
			return 1;
		else
			return 0;
	}

}
