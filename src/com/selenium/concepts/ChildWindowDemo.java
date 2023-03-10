package com.selenium.concepts;

import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChildWindowDemo {

	public static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
		multipleWindows();
		closeBrowser();
	}

	static void launchBrowser() 
	{
		String path = null;
		try
		{
			path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\Library\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	static void url()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void multipleWindows()
	{
		try
		{
			driver.findElement(By.className("blinkingText")).click();
			
			// Approach-1 (Using iterator() method)
		/**	Set<String> windowsIds=driver.getWindowHandles();
			Iterator<String> ite=windowsIds.iterator();
			String parentId=ite.next();
			String childId=ite.next();
		*/
			// Approach-2 (Converting set to list)
			
			Set<String> windowsIds=driver.getWindowHandles();
			
			ArrayList<String> ar=new ArrayList<String>(windowsIds);
			String parentId=ar.get(0);
			String childId=ar.get(1);
			
//			System.out.println(parentId);
//			System.out.println(childId);
			
			driver.switchTo().window(childId);
			
//			String email=driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
//			System.out.println(email);
			
			String email=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
			System.out.println("Email is : "+email);
			
			driver.switchTo().window(parentId);
			driver.findElement(By.id("username")).sendKeys(email);
			
		} catch (Exception e) 
		{ 
			e.printStackTrace();
		}
	}
	
	static void closeBrowser() 
	{
		try 
		{
			driver.quit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
