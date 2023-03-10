package com.java.programs;

public class CountCharAndDigits {

	public static void main(String[] args) 
	{
		getCounts();
	}
	
	public static void getCounts()
	{
		String s ="Jav1a2 i4s7 8a9 La2ng4u9a8g7e";
		
		int charCount=0;
		int digitCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))==true)
			{
				digitCount++;
			}
			else
			{
				if((s.charAt(i)!=' '))
				{
					System.out.print(s.charAt(i));
					charCount++;
				}
			}
		}
		System.out.println();
		System.out.println("No of characters in given string is : "+charCount);
		System.out.println("No of digits in a given string is : "+digitCount);
	}
}
