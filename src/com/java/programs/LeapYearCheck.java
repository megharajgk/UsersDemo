package com.java.programs;

public class LeapYearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getLeap();
	}
	
	public static void getLeap()
	{
		int year=2022;
		
		if((year%4==0)||(year%400==0))
		{
			System.out.println(year+" is a Leap year");
		}
		else if(year%100==0)
		{
			System.out.println(year+" is not a Leap year");
		}
		else
		{
			System.out.println(year+" is not a Leap year");
		}
	}

}
