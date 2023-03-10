package com.java.programs;

import java.util.Arrays;

public class Compare2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getCompareArrays();
		getCompareArrays1();
	}
	
	public static void getCompareArrays()
	{
		int a[]= {10,20,50,30,40};
		int b[]= {10,20,50,30,40};
		
		if(Arrays.equals(a, b)==true)
		{
			System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Both arrays are not equal");
		}
	}
	
	public static void getCompareArrays1()
	{
		int a[]= {10,20,50,31,40};
		int b[]= {10,20,50,30,40};
		boolean res=true;
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					res=false;
				}
			}
		}
		else
		{
			res=false;
		}
		
		if(res==true)
		{
			System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Both arrays are not equal");
		}
	}
	
	

}
