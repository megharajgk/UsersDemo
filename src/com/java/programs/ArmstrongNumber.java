package com.java.programs;
/*
 *  153
 *  1*1*1=1
 *  5*5*5=125
 *  3*3*3=27
 *  
 *  1+125+27=153
 */

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=153;
		getArmstrong(num);
	}

	public static void getArmstrong(int num)
	{
		int sameNum=num;
		int dupliNum=num;
		int rem=0;
		int armNum=0;
		int count=0;

		while(sameNum>0)
		{
			sameNum=sameNum/10;
			count++;
		}

		while(dupliNum>0)
		{
			rem=dupliNum%10;

			int mul=1;
			for(int i=0;i<count;i++)
			{
				mul=mul*rem;
			}

			armNum=armNum+mul;
			dupliNum=dupliNum/10;
		}

		if(num==armNum)
		{
			System.out.println(num+" is Armstrong number");
		}
		else
		{
			System.out.println(num+" is not an Armstrong number");
		}
	}

}
