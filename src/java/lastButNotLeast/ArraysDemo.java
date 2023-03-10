package java.lastButNotLeast;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		array1D();
		array1DForEach();
		array2D();
		array2DForEach();
	}
	
	public static void array1D()
	{
		try
		{
			int a[]= {10,20,30,40,50};
			System.out.println("Single dimensional array");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void array1DForEach()
	{
		try
		{
			int a[]= {100,200,300,400,500};
			System.out.println("Single dimensional array for each loop");
			for(int kk:a)
			{
				System.out.println(kk);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void array2DForEach()
	{
		try
		{
			System.out.println("Double dimensional array for each loop");
			int a[][]= {{100,200},{300,400},{500,600}};
			for(int kk[]:a)
			{
				for(int bb:kk)
				{
					System.out.print(bb+"\t");
				}
				System.out.println();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void array2D()
	{
		try
		{
			int a[][]= {{10,20},{30,40},{50,60}};
			System.out.println("Double dimensional array");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
