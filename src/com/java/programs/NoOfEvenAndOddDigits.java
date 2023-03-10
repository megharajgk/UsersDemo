package com.java.programs;

public class NoOfEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getEvenOdd();
	}
	
	public static void getEvenOdd()
	{
		int n=123456789;
		int evenDigit=0;
		int oddDigit=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				evenDigit++;
			}
			else
			{
				oddDigit++;
			}
			n=n/10;
		}
		System.out.println("Number of Even digits : "+evenDigit);
		System.out.println("Number of Odd digits : "+oddDigit);
	}
}
