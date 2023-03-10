package com.java.programs;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getFibonacci();
	}
	
	public static void getFibonacci()
	{
		int f=0;
		int s=1;
		
		System.out.println("First 10 Fibonacci number are : ");
		System.out.println(f);
		System.out.println(s);
		
		for(int i=3;i<=10;i++)
		{
			int t=f+s;
			f=s;
			s=t;
			System.out.println(t);
		}
	}

}
