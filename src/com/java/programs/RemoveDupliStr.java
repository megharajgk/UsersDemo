package com.java.programs;

import java.util.Arrays;

public class RemoveDupliStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDupliStr();
	}
	
	static void getDupliStr()
	{
		String s[]= {"Core","Java","Selenium","SQl","Core","java"};
		System.out.println(Arrays.toString(s));
		boolean res=false;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equalsIgnoreCase(s[j]))
				{
					System.out.println("Duplicate element is : "+s[i]);
					res=true;
					break;	
				}
			}
		}
		if(res=false)
		{
			System.out.println("Duplicate elements are not found");
		}
	}

}
