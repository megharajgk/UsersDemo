package com.java.programs;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getSum();
	}

	static void getSum()
	{
		int num=12345;
		int rem=0;
		int sum=0;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of Digits is : "+sum);
	}
}
