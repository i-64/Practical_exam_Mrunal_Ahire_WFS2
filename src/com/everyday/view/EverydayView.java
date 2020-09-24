/**
 * 
 */
package com.everyday.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.everyday.business.EverydayBusiness;
import com.everyday.utilities.BusinessFactory;

/**
 * @author Mrunal Ahire
 * 
 * MAin class, drives the code
 *
 */
public class EverydayView {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
			EverydayBusiness eb = BusinessFactory.createObject();
			
			while (true) {
				System.out.println(" ** MENU ** \n1. Add\n2. Delete\n0. Exit");
				int choice = Integer.parseInt(br.readLine());
				switch (choice) {
					case 0:
						return;
					case 1:
						eb.addItem();
						break;
					case 2:
						eb.retrieveItems();
						break;
					default:
						System.out.println("Invalid choice");
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
