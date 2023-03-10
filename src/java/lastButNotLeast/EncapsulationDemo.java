package java.lastButNotLeast;

class Encap
{
	String bankName;
	private int accNumber;
	
	void setAccNum(int accNumber)
	{
		this.accNumber=accNumber;
	}
	
	int getAccNumber()
	{
		return accNumber;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encap e=new Encap();
		e.bankName="State Bank Of India";
		e.setAccNum(123456789);
		int accNum=e.getAccNumber();
		System.out.println("Account number is : "+accNum);
	}

}
