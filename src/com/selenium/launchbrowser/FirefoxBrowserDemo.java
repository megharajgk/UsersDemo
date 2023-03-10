package com.selenium.launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {

	 public static WebDriver driver =null;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setIntiPrpty();
		launchBrowser();
		url();
		closeBrowser();
	}
	
	public static void setIntiPrpty()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void launchBrowser()
	{
		try
		{
			driver=new FirefoxDriver();
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
			driver.get("http://localhost:81/login.do");
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser()
	{
		try
		{
			Thread.sleep(4000);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
