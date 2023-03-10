package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url("http://google.com");
		closeBrowser();
	}
	
	public static void launchBrowser()
	{
		String path;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void url(String url)
	{
		try
		{
			driver.get(url);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser()
	{
		try
		{
			driver.close();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}
