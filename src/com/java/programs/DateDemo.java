package com.java.programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getDate();
	}
	
	public static void getDate()
	{
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/Mm/yyyy");
		String date=sdf.format(d);
		System.out.println(date);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("hh:mm:ss");
		String time=sdf1.format(d);
		System.out.println(time);
	}

}
