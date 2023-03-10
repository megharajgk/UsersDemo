package com.java.programs;

import java.util.Scanner;

public class ConvertLowerToUpperViceverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=scn.nextLine();
		getConvert(s);
		scn.close();
	}
	
	public static void getConvert(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=65)&&(s.charAt(i)<=90))
			{
				temp=temp+(char)(s.charAt(i)+32);
			}
			else if((s.charAt(i)>=97)&&(s.charAt(i)<=122))
			{
				temp=temp+(char)(s.charAt(i)-32);
			}
			else
			{
				temp=temp+s.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
