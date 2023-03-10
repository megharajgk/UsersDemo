package com.java.programs;

public class AlteranteCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getCaps();
	}
	
	public static void getCaps()
	{
		String s="Java is a Programming Language";
		System.out.println(s);
		
		s=s.toLowerCase();
		System.out.println(s);
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i+=2)
		{
			ch[i]=Character.toUpperCase(ch[i]);
		}

		String newStr=new String(ch);
		System.out.println(newStr);
	}

}
