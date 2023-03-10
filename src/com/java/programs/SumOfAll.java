package com.java.programs;

public class SumOfAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getSum();
	}
	
	static void getSum()
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum is : "+sum);
	}

}
