package com.java.programs;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getFact();
	}
	
	public static void getFact()
	{
		int n=5;
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is : "+fact);
	}

}
