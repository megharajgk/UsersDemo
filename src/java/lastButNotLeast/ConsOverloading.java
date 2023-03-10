package java.lastButNotLeast;

class Birds
{
	String s;
	int a;
	Birds(int a, String s)
	{
		System.out.println(a);
		System.out.println(s);
	}
	Birds(int a)
	{
		System.out.println(a);
	}
	Birds(String s)
	{
		System.out.println(s);
	}
}

public class ConsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Birds b=new Birds(10);
		Birds b1=new Birds("Eagle");
		Birds b2=new Birds(10,"Eagle");
	}

}
