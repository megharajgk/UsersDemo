package com.selenium.concepts;

import java.util.Arrays; 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartDemo {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
		addItemsToCart();
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
	
	public static void url()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void addItemsToCart()
	{
		String s[]= {"Cucumber","Cauliflower","Brocolli","Beetroot"};
		int count=0;
		try
		{
			List<WebElement> lst=driver.findElements(By.xpath("//h4[@class='product-name']"));
			for(int i=0;i<lst.size();i++)
			{
				String lists[]=lst.get(i).getText().split("-");
				String items=lists[0].trim();
				
				List<String> reqItems=Arrays.asList(s);
				
				if(reqItems.contains(items))
				{
					count++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					if(count==reqItems.size())
					{
						break;
					}
				}
				Thread.sleep(5000);
			}
			
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			Thread.sleep(2000);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
