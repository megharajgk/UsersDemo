/*
 	3
 	6 9
 	12 15 18
 	 	
 */

package com.java.basics;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((a*3)+"\t");
				a++;
			}
			System.out.println();
		}
	}

}
