package com.java.basics;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int a=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(a!=10)
				{
					System.out.print("0"+a+" ");
				}
				else
				{
					System.out.print(a+" ");
				}
			}
			a--;
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("0"+a+" ");
			}
			a--;
			System.out.println();
		}
	}

}
