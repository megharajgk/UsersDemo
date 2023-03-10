package com.java.basics;

public class PatternName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="King";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println();
		}

	}

}
