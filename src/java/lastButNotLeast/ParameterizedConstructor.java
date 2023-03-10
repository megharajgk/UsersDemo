package java.lastButNotLeast;

public class ParameterizedConstructor {

	String name;
	int age;
	
	ParameterizedConstructor(int age, String name)
	{
		this.age=age;
		this.name=name;
		System.out.println(name);
		System.out.println(age);
	}
	
	void dis() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParameterizedConstructor pc=new ParameterizedConstructor(10, "Virat");
		pc.dis();
	}

}
