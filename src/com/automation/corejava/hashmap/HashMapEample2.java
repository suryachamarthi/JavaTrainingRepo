package com.automation.corejava.hashmap;

import java.util.HashMap;

public class HashMapEample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// countrys and capitals
		
		HashMap <String, String> capitalcitys = new HashMap <String, String>();
		
		 capitalcitys.put("England", "London");
		 capitalcitys .put("Germany", "Berlin");
		 capitalcitys.put("Norway", "Oslo");
		 capitalcitys.put("USA", "Washington DC");
		 
		 System.out.println("citycapitals"    +capitalcitys);
		 
		 capitalcitys.remove("England", "London");
		 
		 System.out.println("After Remove London"    +capitalcitys );
		
		 
		 capitalcitys.put("India", "Delhi");
		 
		 System.out.println("Add other country"     +capitalcitys);
		 
		 capitalcitys.replace("Germany", "Tokyo");
		 
		 System.out.println("After Replace"      +capitalcitys);
		 
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
