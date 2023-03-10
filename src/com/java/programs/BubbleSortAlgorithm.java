package com.java.programs;

import java.util.Arrays;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getBubble();
	}
	
	public static void getBubble()
	{
		int a[]= {50,10,20,40,30,70,60};
		System.out.println("Before Sort : "+Arrays.toString(a));
		
		int len=a.length-1;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("After Sort : "+Arrays.toString(a));
	}

}
