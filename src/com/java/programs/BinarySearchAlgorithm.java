  
package com.java.programs;

import java.util.Arrays;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getBinary();
	}
	
	public static void getBinary()
	{
		int a[]= {10,50,20,40,30,70,60};
		int key=70;
		System.out.println("Given array is : ");
		for(int kk:a)
		{
			System.out.print(kk+" ");
		}
		System.out.println();
		System.out.println("Key value is : "+key);
		
		System.out.println();
		System.out.println("After sorting the array is : ");
		Arrays.sort(a);
		for(int kk:a)
		{
			System.out.print(kk+" ");
		}
		
		int li=0;
		int hi=a.length-1;
		int mi;
		
		
		if(li>hi)
		{
			System.out.println("Element not found !!!!");
		}
		System.out.println();
		while(li<=hi)
		{
			mi=(li+hi)/2;
			
			if(a[mi]==key)
			{
				System.out.println("Value found at "+mi+" th position");
				break;
			}
			else if(a[mi]<key)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
		}
		
	}

}
