package com.java.programs;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=76;
		getAutomorphic(num);	
	}

	public static void getAutomorphic(int num)
	{
		int temp=num;
		int count=0;
		int rem=0;
		int square=num*num;
		int rev=0;
		int rem1=0;
		int rev1=0;

		System.out.println("Entered number is: "+num);
		System.out.println("Square of given number is : "+square);
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("Number of digits in a given number is : "+count);

		for(int i=0;i<count;i++)
		{
			rem=square%10;
			rev=rev*10+rem;
			square=square/10;
		}

		while(rev>0)
		{
			rem1=rev%10;
			rev1=rev1*10+rem1;
			rev=rev/10;
		}
		
		if(num==rev1)
		{
			System.out.println(num+" is Automorphic number");
		}
		else
		{
			System.out.println(num+" is not Automorphic number");
		}
	}

}
