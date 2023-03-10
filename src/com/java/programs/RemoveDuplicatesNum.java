package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicatesNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDupli();
	}

	public static void getDupli()
	{
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(9,8,1,2,3,1,2,3,3,7,3,1,2,4,5,6,4,6,8,9,0,2));
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>(ar);
		System.out.println("LinkedHashSet : "+lhs);
		//OR
		TreeSet<Integer> tr=new TreeSet<Integer>(ar);
		System.out.println("TreeSet : "+tr);
	}
}