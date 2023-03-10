package com.java.programs;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDupli();
	}
	
	static void getDupli()
	{
		int a[]= {40,10,20,50,30,10,50,20};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		boolean res=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate elements are : "+a[i]);
					res=true;
					break;
				}
			}
		}
		if(res==false)
		{
			System.out.println("Duplicate elements are not found : ");
		}
	}
	
}
