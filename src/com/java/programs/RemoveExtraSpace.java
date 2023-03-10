package com.java.programs;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getExtraSpace();
	}
	
	public static void getExtraSpace()
	{
		String s="Java     is     a     Programming    Language";
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				temp=temp+s.charAt(i);
			}
			else if(s.charAt(i)!=' ')
			{
				temp=temp+s.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
