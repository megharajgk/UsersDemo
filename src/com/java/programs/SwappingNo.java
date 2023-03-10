package com.java.programs;

public class SwappingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getSwap();
	}
	
	static void getSwap()
	{
		int a=10;
		int b=20;
		System.out.println("Before swapping ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
