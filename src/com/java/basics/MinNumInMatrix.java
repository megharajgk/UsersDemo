package com.java.basics;

public class MinNumInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,4,5},{3,4,7},{5,2,9}};
		
		int min=a[0][0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Minimum number in given matrix is : "+min);
	}

}
