package com.automation.corejava.lerning;

public class HelloWorld{
//	single line comment
	public int test(int a, int b)
	{
		System.out.println(" program started");
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		int a = 10; //int varibale creates a referecne in a memory location
		int b = 20;
		String s = "Java"; //String
		char b1 = 'a'; //char
		System.out.println("Hi");
		
		System.out.println("the int value is " + a);
		System.out.println("a");
		// TODO Auto-generated method stub
			int c = a+b;
			int d = a-b;
			int e = a*b;
		System.out.println("Sum of Two number -- "+c );
			System.out.println("substrac of Two number -- "+d );
			System.out.println("substrac of Two number -- "+e );
	}

}

