package com.automation.corejava.lerning;

public class controlStruturalSwich2 {

	public static void main(String arg[]) {
		
		int NoOfDays = 30;  
	     switch(NoOfDays)   
	    {  
	        //Case statements  
	       case 28: 
	        System.out.println("February-28 days");  
	        break;  
	        case 30:
	        System.out.println("April, June - 30 days");  
	        break;  
	       case 31: System.out.println("January, March, May-31 days");  
	        break;  
	        //Default case statement  
	       default: System.out.println("Please enter valid no of days");  
	    }  
	   }  
	}