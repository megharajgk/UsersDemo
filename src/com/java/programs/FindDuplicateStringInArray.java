package com.java.programs;

public class FindDuplicateStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getDuplicateString();
	}

	public static void getDuplicateString()
	{
		String str[]= {"java","core","manual","selenium","java","core",	"test","core"};
		
		boolean res=false;
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println("Duplicate string is : "+str[i]);
					res=true;
					break;
				}
			}
		}
		if(res==false)
		{
			System.out.println("Duplicate string not found.........");
		}
	}
}
