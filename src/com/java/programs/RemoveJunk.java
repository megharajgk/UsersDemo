package com.java.programs;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getJunk();
	}
	
	static void getJunk()
	{
		String s= "!@#$%*&^%java i#$s $%a@#$ programming@#$%^&123456789    !@#$     ";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
