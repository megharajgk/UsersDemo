package com.java.programs;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDuplicate();
	}
	
	public static void getDuplicate()
	{
		int count=0;
		int a[]= {10,20,30,10,50,20,40,60};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length-1;j++)
			{
				if(a[i]==a[j+1])
				{
					System.out.println("Duplicate element is : "+a[i]);
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("Duplicate are not found.....");
		}
	}		
}
