/**
 * 
 */
package com.everyday.business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.everyday.dao.EverydayDAO;
import com.everyday.entity.Apparel;
import com.everyday.entity.Electronics;
import com.everyday.entity.FoodItem;
import com.everyday.utilities.DAOFactory;
import com.everyday.utilities.InvalidTypeException;
import com.everyday.utilities.NotEnoughItemsException;

/**
 * @author Mrunal Ahire
 * 
 * business layer class
 *
 */
public class EverydayBusiness implements EverydayBusinessInterface {

	private EverydayDAO dao;
	private BufferedReader br;
	
	public EverydayBusiness () {
		
		dao = DAOFactory.createObject();
		br = new BufferedReader((new InputStreamReader(System.in)));
	}
	
	@Override
	public void addItem() throws InvalidTypeException {
		// TODO Auto-generated method stub
		
		try {
			
			System.out.println("Enter the type");
			String type = br.readLine();
			
			if (type.equalsIgnoreCase("food")) {
				System.out.println("Enter item name");
				String itemName = br.readLine();
				System.out.println("Enter item code");
				int itemCode = Integer.parseInt(br.readLine());
				System.out.println("Enter the quantity");
				int quantity = Integer.parseInt(br.readLine());
				System.out.println("Enter veg/non-veg (1/0)");
				int veg = Integer.parseInt(br.readLine());
				
				boolean vegFlag = false;
				if (veg == 1) vegFlag = true;
				
				FoodItem f = new FoodItem();
				f.setItemCode(itemCode);
				f.setItemName(itemName);
				f.setQuantity(quantity);
				f.setVegetarian(vegFlag);
				
				dao.addNewItem(type, f);
			}
			else if (type.equalsIgnoreCase("Apparel")) {
				System.out.println("Enter item name");
				String itemName = br.readLine();
				System.out.println("Enter item code");
				int itemCode = Integer.parseInt(br.readLine());
				System.out.println("Enter the quantity");
				int quantity = Integer.parseInt(br.readLine());
				System.out.println("Enter size");
				String size = br.readLine();
				System.out.println("Enter the material");
				String material = br.readLine();
				
				Apparel f = new Apparel();
				f.setItemCode(itemCode);
				f.setItemName(itemName);
				f.setQuantity(quantity);
				f.setMaterial(material);
				f.setSize(size);
				
				dao.addNewItem(type, f);
			}
			else if (type.equalsIgnoreCase("electronics")) {
				System.out.println("Enter item name");
				String itemName = br.readLine();
				System.out.println("Enter item code");
				int itemCode = Integer.parseInt(br.readLine());
				System.out.println("Enter the quantity");
				int quantity = Integer.parseInt(br.readLine());
				System.out.println("Enter warranty");
				int warranty = Integer.parseInt(br.readLine());
				
				Electronics f = new Electronics();
				f.setItemCode(itemCode);
				f.setItemName(itemName);
				f.setQuantity(quantity);
				f.setWarranty(warranty);
				
				dao.addNewItem(type, f);
			}
			else {
				System.out.println("Invalid type :(");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void retrieveItems() throws NotEnoughItemsException {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter the type >> ");
			String type = br.readLine();
			
			@SuppressWarnings("rawtypes")
			ArrayList l = dao.retrieveData(type);
			
			for (Object o: l) {
				if (type.equalsIgnoreCase("food"))
					System.out.println(((FoodItem)o).toString());
				else if (type.equalsIgnoreCase("food"))
					System.out.println(((Apparel)o).toString());
				else
					System.out.println(((Electronics)o).toString());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
