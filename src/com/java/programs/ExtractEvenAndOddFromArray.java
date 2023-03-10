package com.java.programs;

import java.util.Arrays;

public class ExtractEvenAndOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getEvenOdd();
	}
	
	public static void getEvenOdd()
	{
		int a[]= {1,2,4,6,3,5,7,8,9,10,11,14,13,12,15};
		
		System.out.println("Given Array is : "+Arrays.toString(a));
		System.out.println();
		System.out.println("Even number is : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" ");
			}
		}
		
		System.out.println("Odd number is : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]+" ");
			}
		}
	}

}
