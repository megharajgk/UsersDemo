package com.java.programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getReverseStr();
	}
	static void getReverseStr()
	{
		// Approach-1
		String s="Core Java";
		StringBuffer sb=new StringBuffer(s);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		
		// Approach-2
		String rev1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev1=rev1+s.charAt(i);
		}
		System.out.println(rev1);
		
		// Approach-3
		String str[]=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			char ch[]=str[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}

}
