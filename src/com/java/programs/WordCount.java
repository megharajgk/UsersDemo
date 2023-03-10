package com.java.programs;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getCount();
	}
	
	static void getCount()
	{
		String s="Java is a Programming Language";
		int count=1;
		
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words in a given string is : "+count);
	}

}
