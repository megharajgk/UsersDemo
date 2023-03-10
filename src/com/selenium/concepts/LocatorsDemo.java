package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsDemo {

	 public static WebDriver driver =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setIntiPrpty();
		launchBrowser();
		url();
		login();
		closeBrowser();
	}
	
	public static void setIntiPrpty()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void launchBrowser()
	{
		try
		{
			WebDriver driver=new ChromeDriver();
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
	public static void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.className("initial")).click();
			System.out.println(driver.getTitle());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeBrowser()
	{
		try
		{
			Thread.sleep(2000);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	

}
