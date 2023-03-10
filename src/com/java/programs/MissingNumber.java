package com.java.programs;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getMissing();
	}

	public static void getMissing()
	{
		int a[]= {0,2,3,20,18,6,8,10,15};
		System.out.println("Before sort : "+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sort : "+Arrays.toString(a));
		
		int max=a[a.length-1];
		
		System.out.println("Missing number are : ");
		int index=0;
		for(int i=0;i<max;i++)
		{
			if(i==a[index])
			{
				index++;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
