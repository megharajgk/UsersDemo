package com.java.programs;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDigits();
	}
	public static void getDigits()
	{
		int n=123456;
		int rem=0;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Number of digits in a given number : "+count);
	}

}
