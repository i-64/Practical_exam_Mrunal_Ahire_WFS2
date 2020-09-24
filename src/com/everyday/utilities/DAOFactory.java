/**
 * 
 */
package com.everyday.utilities;

import com.everyday.dao.EverydayDAO;

/**
 * @author Mrunal Ahire
 * 
 * object factory for DAO layer
 *
 */
public class DAOFactory {
	
	private DAOFactory () {
		;
	}
	
	public static EverydayDAO createObject() {
		
		return (new EverydayDAO());
	}
}
