package com.java.programs;

public class ExtractNumberAndString {

	public static void main(String[] args) 
	{
		String s="asdfghj esr tffnbjv !@#$%Iijfj$%RTVDE$EFR%EEGUCYRDRT$12345765432";
		System.out.println("Length is : "+s.length());
		String temp=s;
		System.out.println("Extracted String is : ");
		s=s.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(s);
		
		System.out.println();
		System.out.println("Extracted numbers are : ");
		temp=temp.replaceAll("[^0-9]", "");
		System.out.println(temp.length());
		System.out.println(temp);
	}

}
