package com.java.basics;

public class SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		int a=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
		
	}

}
