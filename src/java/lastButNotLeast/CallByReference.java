package java.lastButNotLeast;

class CallReference
{
	int a,b;

	void callRef(CallReference ref)
	{
		 ref.a=a+100;
		 ref.b=b*10;
		 System.out.println("a is : "+a);
		 System.out.println("b is : "+b);
	}
}

public class CallByReference {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallReference c=new CallReference();
		c.a=10;
		c.b=5;
		System.out.println("Before a is : "+c.a);
		System.out.println("Before b is : "+c.b);
		
		c.callRef(c);
		
		System.out.println("After a is : "+c.a);
		System.out.println("After b is : "+c.b);
	}

}
