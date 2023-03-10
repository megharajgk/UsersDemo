package com.java.programs;

public class PalindromeStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getPalindromeString();
	}

	public static void getPalindromeString()
	{
		String s="Madam";
		String rev="";
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());// ORs
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println(s+" is a Palindrome string");
		}
		else
		{
			System.out.println(s+" is not a Palindrome string");
		}
	}
}
