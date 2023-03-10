package com.java.programs;

public class PerfectNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getPerfect();
	}
	
	public static void getPerfect()
	{
		int num=6; // Factors --> 1,2,3 ; 1+2+3=6
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+" is a Perfect number");
		}
		else
		{
			System.out.println(num+" is Not a Perfect number");
		}
	}

}
