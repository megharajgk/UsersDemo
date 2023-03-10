package com.java.basics;

public class MinNumColoumnMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,4,5,9},{3,4,7,1},{5,9,1,2}};
		int min=a[0][0];
		int minCol=0;
		
		//To print the given matrix
		System.out.println("The given matrix is : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{  
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//To extract the minimum number
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					System.out.println("Minimum number in an given matrix is : "+min);
					minCol=j;
				}
			}
		}
		System.out.println();
		
		//To extract the maximum number
		int max=a[0][minCol];
		int k=0;
		while(k<a.length)
		{
			if(a[k][minCol]>max)
			{
				max=a[k][minCol];
			}
			k++;
		}
		
		System.out.println("Maximum number in a coloumn which is having minimum number in a matrix : "+max);
		

	}

}
