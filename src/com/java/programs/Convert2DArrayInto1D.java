package com.java.programs;

import java.util.ArrayList;
import java.util.List;

public class Convert2DArrayInto1D {

	public static void main(String[] args) 
	{
		int a[][]= {{10,20,30},{40,50,60}};
		System.out.println("Given 2D array is : ");
		for(int kk[]:a)
		{
			for(int bb:kk)
			{
				System.out.print(bb+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("After converting into 1D array is : ");
		
		List<Integer> ar=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				ar.add(a[i][j]);
			}
		}
		
		int ab[]=new int[ar.size()];
		for(int i=0;i<ab.length;i++)
		{
			ab[i]=ar.get(i);
			System.out.print(ab[i]+" ");
		}
	}

}
