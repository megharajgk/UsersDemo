package com.selenium.concepts;

import java.util.Arrays;
import java.util.List;

public class JavaStreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getSort();
		getDistinct();
		getDistinctSortString();
		getDistinctSortInteger();
		limitOutput();
		countOutput();
		uppercase();
	}
	
	public static void getSort()
	{
		String str[]= {"Rama","Bhima","Virat","Rahul","Hardik","Dhoni","Virat","Rahul"};
		try
		{
			List<String> lst=Arrays.asList(str);
			lst.stream().sorted().forEach(s->System.out.println(s));
			System.out.println("***************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void getDistinct()
	{
		String str[]= {"Rama","Bhima","Virat","Rahul","Hardik","Dhoni","Virat","Rahul"};
		try
		{
			List<String> lst=Arrays.asList(str);
			lst.stream().distinct().forEach(s->System.out.println(s));
			System.out.println("***************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void getDistinctSortString()
	{
		String str[]= {"Rama","Bhima","Virat","Rahul","Hardik","Dhoni","Virat","Rahul"};
		try
		{
			List<String> lst=Arrays.asList(str);
			lst.stream().sorted().distinct().forEach(s->System.out.println(s));
			System.out.println("***************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void getDistinctSortInteger()
	{
		Integer a[]= {1,2,1,2,1,1,3,4,5,3,1,9,4,7,5,8,6,9,0,1};
		try
		{
			List<Integer> lst=Arrays.asList(a);
			lst.stream().sorted().distinct().forEach(s->System.out.println(s));
			System.out.println("***************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void limitOutput()
	{
		String str[]= {"Rama","Bhima","Virat","Rahul","Hardik","Dhoni","Virat","Rahul"};
		try
		{
			List<String> lst=Arrays.asList(str);
			lst.stream().sorted().distinct().limit(2).forEach(s->System.out.println(s));
			System.out.println("***************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void countOutput()
	{
		String str[]= {"Rama","Bhima","Virat","Rahul","Hardik","Dhoni","Virat","Rahul"};
		try
		{
			List<String> lst=Arrays.asList(str);
			Long l=lst.stream().sorted().distinct().count();
			System.out.println("Number of records : "+l);
			lst.stream().sorted().distinct().forEach(s->System.out.println(s));
			System.out.println("***************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void uppercase()
	{
		String str[]= {"Rama","Bhima","Virat","Rahul","Hardik","Dhoni","Virat","Rahul"};
		try
		{
			List<String> lst=Arrays.asList(str);
			lst.stream().sorted().distinct().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			System.out.println("***************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
