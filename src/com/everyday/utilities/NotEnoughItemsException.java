/**
 * 
 */
package com.everyday.utilities;

/**
 * @author Mrunal Ahire
 * 
 * custom exception for raising in case items are not enough to return
 *
 */
@SuppressWarnings("serial")
public class NotEnoughItemsException extends Exception {
	
	@Override
	public String toString () {
		return "The catalog contains less than 3 items";
	}
}
