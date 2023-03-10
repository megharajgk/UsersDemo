package java.lastButNotLeast;

public class TypecastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		implicit();
		explicit();
	}

	public static void implicit()
	{
		byte b=10;
		int a=b;
		System.out.println(a);
	}
	public static void explicit()
	{
		int a=100;
		byte b=(byte)a;
		System.out.println(b);
	}
}
