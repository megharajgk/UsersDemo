package com.java.basics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path=System.getProperty("user.dir");
		FileOutputStream fout=new FileOutputStream(path+"\\Credentials.properties");
		Properties prop=new Properties();
		prop.setProperty("Username", "admin");
		prop.setProperty("Password", "manager");
		prop.setProperty("url", "http://localhost:81/login.do");
		prop.store(fout, null);	
		
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		System.out.println(prop.getProperty("url"));
		
		fout.close();
	}

}
