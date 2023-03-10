package com.java.programs;

public class SwapStrWithoutAnotherVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getSwap();
	}
	
	static void getSwap()
	{
		String s1="Core Java";
		String s2="Selenium";
		
		System.out.println("Before swapping ");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println();
		
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("After swapping ");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
	}
}
