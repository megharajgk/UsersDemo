/*
  	1
  	1 2
  	1 2 3
  	1 2 3 4
 
 */

package com.java.basics;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
