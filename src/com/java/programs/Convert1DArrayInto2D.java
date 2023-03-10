package com.java.programs;

import java.util.Arrays;

public class Convert1DArrayInto2D {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60};
		int m=3; // no. of rows
		int n=2; // no. of columns
		
		System.out.println("Given 1D array is : ");
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		System.out.println("After converting it into 2D array is : ");
		
		int ar[][]=new int[m][n];
		
		for(int i=0;i<a.length;i++)
		{
			int nr=i/n;
			int nc=i%n;
			ar[nr][nc]=a[i];
		}
		
		for(int kk[]:ar)
		{
			for(int bb:kk)
			{
				System.out.print(bb+" ");
			}
			System.out.println();
		}
		System.out.println("Git purpose1");
	}

}
