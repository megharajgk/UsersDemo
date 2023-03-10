package com.java.basics;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("D:\\FileProgram");
		System.out.println(f.mkdir());
		System.out.println(f.delete());
		
		File f2=new File("D:\\FileProgram\\Demo");
		boolean res=f2.mkdirs();
		System.out.println(res);
		
		File f3=new File("D:\\FileProgram\\Demo\\Test.txt");
		System.out.println(f3.createNewFile());
		
		File f4=new File("D:\\FileProgram\\Demo\\Demo.pdf");
		System.out.println(f4.createNewFile());
		
		File f5=new File("D:\\FileProgram\\Demo\\Sample.xlsx");
		System.out.println(f5.createNewFile());
		
		File f6=new File("D:\\FileProgram\\Demo\\Program.docx");
		System.out.println(f6.createNewFile());
		
		File f7=new File("D:\\FileProgram\\Demo\\Package.properties");
		System.out.println(f7.createNewFile());
		System.out.println();
		
		File f8= new File("D:\\FileProgram\\Demo");
		String s[]=f8.list();
		for(int i=0;i<s.length;i++)
		{
			File f9=new File(f8,s[i]);
			if(f9.isDirectory()==true)
			{
				String name=f9.getAbsolutePath();
				System.out.println(name);
			}
		}
		
		
	}
}
