package com.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsAndCount {

	public static void main(String[] args) 
	{
//		duplicateCharsAndCountOfChars();
		duplicateCharsAndCountOfChars1();
	}
	
	public static void duplicateCharsAndCountOfChars()
	{
		String s ="Java Program";
		System.out.println(s);
		int count;
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++) 
			{
				if((ch[i]==ch[j]) && (ch[i]!=' '))
				{
					count++;
					ch[j]='0';
				}
			}
			
			if(count>1 && ch[i]!='0')
			{
				System.out.println(ch[i]);
			}
		}
	}
	
	
	public static void duplicateCharsAndCountOfChars1()
	{
		String s ="JavaProgram";
		System.out.println("Given string : "+s);
		
		Map<Character, Integer> mp= new HashMap<Character, Integer>();
		
		char ch[]=s.toCharArray();
		
		for(char c:ch)
		{
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c)+1);
			}
			else
			{
				mp.put(c, 1);
			}
		}
		System.out.println("Each chars and count in a string");
		System.out.println(mp);
		
		System.out.println("Duplicate chars and count");
		Set<Character> st=mp.keySet();
		for(Character val:st)
		{
			if(mp.get(val)>1)
			{
				System.out.println(val+" = "+mp.get(val));
			}
		}
	}

}
