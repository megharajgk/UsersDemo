	package com.java.programs;

import java.util.Arrays;

public class AnagramStringOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="silent";
		String s2="listen";
		
		getAnagram(s1, s2);
	}
	
	public static void getAnagram(String s1, String s2)
	{
		try
		{
			if(s1.length()!=s2.length())
			{
				System.out.println("'"+s1+"' and '"+s2+"' are Not Anagram strings");
			}
			
			char str1[]=s1.toCharArray();
			char str2[]=s2.toCharArray();
			
			
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			String sortedStr1=Arrays.toString(str1);
			String sortedStr2=Arrays.toString(str2);
			
			if(sortedStr1.equalsIgnoreCase(sortedStr2))
			{
				System.out.println("'"+s1+"' and '"+s2+"' are Anagram strings");
			}
			else 
			{
				System.out.println("'"+s1+"' and '"+s2+"' are Not Anagram strings");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
