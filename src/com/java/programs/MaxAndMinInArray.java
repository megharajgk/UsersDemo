package com.java.programs;

public class MaxAndMinInArray {

	public static void main(String args[])
	{
		getMaxMin();
	}
	
	public static void getMaxMin()
	{
		int a[]= {10,100,20,50,30,40,01};
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum element is : "+max);
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum element is : "+min);
	}
}
