package com.selenium.actiTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitSetUp {

	public static WebDriver driver=null;
	public static void launchBrowser()
	{
//		String path=null;
		try
		{
			WebDriverManager.chromedriver().setup();
//			path=System.getProperty("user.dir");
//			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void login(String username,String password)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizeFlyoutWindow()
	{
		try
		{
			driver.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void logOut()
	{
		try
		{
			driver.findElement(By.id("logoutLink")).click();
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
	
	public static void clickOnStart()
	{
		try
		{
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
