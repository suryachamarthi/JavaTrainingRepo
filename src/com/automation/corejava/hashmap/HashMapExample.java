package com.automation.corejava.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer, String> orders = new HashMap <Integer, String>();
		
		orders.put(10, "Ball");
		orders.put(11, "Bat");
		orders.put(12, "Bell");
		orders.put(13, "Wall");
		orders.put(14, "Belt");
		orders.put(15, "Bellon");
		orders.put(16, "Basket");
		orders.put(17, "Apple");
		
		System.out.println("Order Details"  +orders);
		
		orders.remove(17);
		
		System.out.println("After Remove-17"  +orders);
		
		orders.replace(13, "wellcome");
		
		System.out.println("After Replace-13"  +orders);
		
		orders.put(17, "Applae");
		
		System.out.println("Add-17"  +orders);
		
	//	for(Map.Entry<Integer , String> e : orders.entrySet())
		//	System.out.println(e.get);
		
for(Entry<Integer, String> e : orders.entrySet())
		{
			System.out.println("Key -" + e.getKey() + " and Value -- "+ e.getValue());
		}	
	}

	
	
	

}
