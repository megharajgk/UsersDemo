package java.lastButNotLeast;

class CallValue
{
	void callVal(int a,int b)
	{
		a=a+100;
		b=b*10;
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
	}
}
public class CallByValue {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=5;
		System.out.println("Before a is : "+a);
		System.out.println("Before b is : "+b);
		
		CallValue cb=new CallValue();
		cb.callVal(a, b);
		
		System.out.println("After a is : "+a);
		System.out.println("After b is : "+b);
		
	}

}
