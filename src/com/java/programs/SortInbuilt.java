package com.java.programs;
import java.util.*;

public class SortInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getSort();
	}
	
	static void getSort()
	{
		int a[]= {10,40,30,20,50,70,60};
		System.out.println("Before sorting array is : "+Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After sorting array is : "+Arrays.toString(a));
		
		Arrays.parallelSort(a);;
		System.out.println("After sorting array is : "+Arrays.toString(a));
	} 

}
