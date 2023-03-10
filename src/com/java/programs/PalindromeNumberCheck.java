package com.java.programs;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getPalindrome();
	}
	
	
	public static void getPalindrome()
	{
		int num=1234321;
		int n=num;
		int rem=0;
		int rev=0;
		
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(num==rev)
		{
			System.out.println(num+" is a Palindrome number");
		}
		else
		{
			System.out.println(num+" is Not a Palindrome number");
		}
	}

}
