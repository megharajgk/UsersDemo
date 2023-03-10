package com.java.programs;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getSwapStr();
	}
	
	static void getSwapStr()
	{
		String s1="Core";
		String s2="Java";
		
		String temp="";
		
		System.out.println("Before swapping ");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println();
		
		temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println("After swapping ");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
	}

}
