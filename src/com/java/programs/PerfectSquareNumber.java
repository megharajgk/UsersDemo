package com.java.programs;

public class PerfectSquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rangeSquare();
	}

	/*
	 * A number whose sum of factors (excluding the number itself) 
	 * is equal to the number is called a perfect number.
	 */
	
	public static boolean getPefectSquareNo(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				if(i*i==num)
				{
					count++;
				}
			}
		}
		if(count==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void rangeSquare()
	{
		for(int i=0;i<=100;i++)
		{
			if(getPefectSquareNo(i)==true)
			{
				System.out.println(i+" is a Perfect Square number");
			}
		}
	}

	
}
 