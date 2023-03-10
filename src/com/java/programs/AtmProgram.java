package com.java.programs;

import java.util.Scanner;

public class AtmProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getATM();
	}
	
	public static void getATM()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ATM (Automatic Teller Machine)");
		System.out.println();
		int balance=10000;
		
		while(true)
		{
			System.out.println();
			System.out.println("Press-1 : To Check balance");
			System.out.println("Press-2 : To deposit the money");
			System.out.println("Press-3 : To Withdrawn the money");
			System.out.println("Press-4 : To exit");
			System.out.println();
			int num=scn.nextInt();
			
			if(num>4)
			{
				System.out.println("Invalid Number Please Enter Valid Number");
			}

			switch(num) 
			{
			case 1: 
				System.out.println("Your balance is : "+balance);
				break;

			case 2:
				System.out.println("Please enter amount to be deposited : ");
				int deposit=scn.nextInt();
				balance=balance+deposit;
				System.out.println("Your balance is : "+balance);
				break;
				
			case 3:
				System.out.println("Please enter the money to be withdrawn : ");
				int withdrwn=scn.nextInt();
				System.out.println("Your balance is : "+balance);
				
				if(withdrwn<=balance)
				{
					balance=balance-withdrwn;
					System.out.println("Amount withdrawn successfully");
				}
				else
				{
					System.out.println("Insufficient balance");
				}
				break;
				
			case 4:
				System.out.println("Thank you.....");
				System.exit(0);
			}
		}
	}
}
