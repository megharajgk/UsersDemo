package com.java.programs;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getRandomNum();
	}
	
	public static void getRandomNum()
	{
		Random rand=new Random();
		int num=rand.nextInt(100);
		System.out.println(num);
		
		float num1=rand.nextFloat();
		System.out.println(num1);
	}

}
