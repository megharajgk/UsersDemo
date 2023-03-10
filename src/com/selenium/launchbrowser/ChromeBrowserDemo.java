package com.selenium.launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static WebDriver driver=null;
	
	public static void main(String[] args) 
	{
		initialSetup();
		url();
	}
	
	public static void initialSetup()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void url()
	{
		try
		{
			driver.get("https://www.youtube.com");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}