package com.java.programs;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomMails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random num=new Random();
		int n=num.nextInt(100);
		System.out.println(n);
		
		String generateString=RandomStringUtils.randomAlphabetic(6);
		String email=generateString+n+"@gmail.com";
		System.out.println(email);
		
		// To get it in lower case
		email=email.toLowerCase();
		System.out.println(email);
	}

}
