package com.java.programs;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.*;

public class RemoveDuplicateStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDupli();
		
	}
	
	public static void getDupli()
	{
		String s[]= {"core","java","core","sql","manual","testing","sql","selenium"};
		ArrayList<String> ar =new ArrayList<String>(Arrays.asList(s));
		System.out.println(ar);
		System.out.println();
		
		TreeSet<String> tr=new TreeSet<String>(ar);
		System.out.println("TreeSet : Ascending order");
		System.out.println(tr);
		System.out.println();
		
		HashSet<String> hs=new HashSet<String>(ar);
		System.out.println("HashSet : Random order");
		System.out.println(hs);
		System.out.println();
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>(ar);
		System.out.println("LinkedHashSet : Based on Insertion order");
		System.out.println(lhs);
	}
}
