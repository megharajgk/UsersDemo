package com.java.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getReverseNum();
	}

	static void getReverseNum()
	{
		int num=12345;
		int rem=0;
		int rev=0;
		
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of given number is : "+rev);
	}
}
