package com.java.programs;

public class LinearSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getLinear();
	}
	
	public static void getLinear()
	{
		int a[]= {10,20,60,40,50,30,70};
		int keyVal=70;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==keyVal)
			{
				System.out.println("Key value found at "+i+"th position");
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Key value not found.....");
		}
		
	}

}
