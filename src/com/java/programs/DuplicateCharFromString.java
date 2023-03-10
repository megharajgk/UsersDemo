package com.java.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getRemove();
		getRemove1();
	}
	
	public static void getRemove()
	{
		String s="Programming";
		StringBuilder sb=new StringBuilder();
		s.chars().distinct().forEach(kk -> sb.append((char)kk)); 
		System.out.println(sb);
	}
	
	public static void getRemove1()
	{
		String s="programming";
 		System.out.println("Given string is : "+s);
 		StringBuilder sb=new StringBuilder();
 		Set<Character> values=new LinkedHashSet<Character>();
 		
 		for(int i=0;i<s.length();i++)
 		{
 			values.add(s.charAt(i));
 		}
 		
 		for(Character value:values)
 		{
 			sb.append(value);
 		}
 		System.out.println("After removing duplicates : "+sb);
	}
}
