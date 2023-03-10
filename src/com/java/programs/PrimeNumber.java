package com.java.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getRangePrime();
	}
	
	public static boolean getPrime(int num)
	{
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	static void getRangePrime()
	{
		for(int i=0;i<=50;i++)
		{
			if(getPrime(i)==true)
			{
				System.out.println(i+" is a Prime number");
			}
		}
	}

}
