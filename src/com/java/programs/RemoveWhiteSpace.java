package com.java.programs;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getWhiteSpace();
		getWhiteSpace1();
	}
	public static void getWhiteSpace()
	{
		String s="Ja   v   a   is  a P ro gr am mi n g la ng u a ge";
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ') 
			{
				temp=temp+s.charAt(i);
			}
		}
		System.out.println(temp);
	}
	
	public static void getWhiteSpace1()
	{
		String s="Ja   v   a   is  a P ro gr am mi n g la ng u a ge";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
