package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCheckboxes{

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		launchBrowser();
		urlApp();
//		selectSingleDd();
//		selectAllDd();
//		selectLast2Dd();
//		selectFirst2Dd();
		selectRandom2Dd();
		
	}

	public static void launchBrowser()
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void urlApp()
	{
		try
		{
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void selectSingleDd()
	{
		try
		{
			driver.findElement(By.id("monday")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void selectAllDd()
	{
		try
		{
			List<WebElement> lst=driver.findElements(By.xpath("//label[@class='form-check-label']//input[@type='checkbox']"));
			for(WebElement kk:lst)
			{
				kk.click();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void selectLast2Dd()
	{
		try
		{
			List<WebElement> lst=driver.findElements(By.xpath("//label[@class='form-check-label']//input[@type='checkbox']"));
			int len=lst.size();
			for(int i=len-2;i<=len;i++)
			{
				lst.get(i).click();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void selectFirst2Dd()
	{
		try
		{
			List<WebElement> lst=driver.findElements(By.xpath("//label[@class='form-check-label']//input[@type='checkbox']"));
			int len=lst.size();
			for(int i=0;i<len;i++)
			{
				if(i<2)
				{
					lst.get(i).click();
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void selectRandom2Dd()
	{
		try
		{
			List<WebElement> lst=driver.findElements(By.xpath("//label[@class='form-check-label']//input[@type='checkbox']"));
			for(WebElement kk:lst)
			{
				String name=kk.getAttribute("id");
				if((name.equalsIgnoreCase("monday"))||(name.equalsIgnoreCase("sunday"))) 
				{
					kk.click();
					
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
