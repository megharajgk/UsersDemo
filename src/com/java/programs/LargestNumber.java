package com.java.programs;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getLargest();
	}
	
	public static void getLargest()
	{
		int a=50;
		int b=20;
		int c=30;
		
		int largest=a>b?a:b;
		largest=c>largest?c:largest;
		
		System.out.println("Largest number is : "+largest);
	}

}
