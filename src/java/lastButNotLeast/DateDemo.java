package java.lastButNotLeast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		String date=sdf1.format(d);
		System.out.println(date);
		
		SimpleDateFormat sdf2=new SimpleDateFormat("hh:mm:ss a");
		String time=sdf2.format(d);
		System.out.println(time);
		
		SimpleDateFormat sdf3=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		String mix=sdf3.format(d);
		System.out.println(mix);
	}

}
