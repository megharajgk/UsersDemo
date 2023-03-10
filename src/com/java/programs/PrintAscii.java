package com.java.programs;

public class PrintAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getAscii();
	}
	
	static void getAscii()
	{
		System.out.println("ASCII values for A-Z are: ");
		for(char i='A';i<='Z';i++)
		{
			int a=i;
			System.out.println(i+" --> "+a);
		}
		System.out.println();
		
		System.out.println("ASCII values for a-z are: ");
		for(char i='a';i<='z';i++)
		{
			int a=i;
			System.out.println(i+" --> "+a);
		}
		System.out.println();
		
		System.out.println("ASCII values for 0-9 are: ");
		for(char i='0';i<='9';i++)
		{
			int a=i;
			System.out.println(i+" --> "+a);
		}
	}

}
