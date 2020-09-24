/**
 * 
 */
package com.everyday.utilities;

import com.everyday.business.EverydayBusiness;

/**
 * @author Mrunal Ahire
 * 
 * object factory for business layer
 *
 */
public class BusinessFactory {
	
	private BusinessFactory () {
		;
	}
	
	public static EverydayBusiness createObject () {
		return (new EverydayBusiness());
	}
}
