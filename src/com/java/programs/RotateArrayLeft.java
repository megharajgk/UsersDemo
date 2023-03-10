package com.java.programs;

import java.util.Arrays;

public class RotateArrayLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getRotate();
	}
	
	public static void getRotate()
	{
		int a[]= {10,20,30,40,50,60};
		int n=2;
		int first;
		System.out.println("Given Arrays is  : "+Arrays.toString(a));
		System.out.println("n = "+n);
		for(int i=0;i<n;i++)
		{
			first=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println("After Rotation of "+n+" times, the Array is ");
		System.out.println(Arrays.toString(a));
	}

}
