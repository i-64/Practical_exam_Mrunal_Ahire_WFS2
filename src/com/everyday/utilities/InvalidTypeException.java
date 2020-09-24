/**
 * 
 */
package com.everyday.utilities;

/**
 * @author Mrunal Ahire
 * 
 * custom exception for invalid type
 *
 */
@SuppressWarnings("serial")
public class InvalidTypeException extends Exception {
	
	@Override
	public String toString() {
		return "The type provided is not valid";
	}
}
