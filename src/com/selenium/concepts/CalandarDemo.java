package com.selenium.concepts;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalandarDemo {

	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
		handleCalendar();
//		closeBrowser();
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
			driver.get("https://www.redbus.in/");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void handleCalendar()  
	{
		String month="Sept";
		String day="15";
		try 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
			
			WebElement mnt= driver.findElement(By.xpath("//td[@class='monthTitle']"));
			while(!mnt.getText().contains(month))
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//td[@class='next']/button")).click();
			}
			
			List<WebElement> lst=driver.findElements(By.xpath("//td[contains(@class,'day')]"));
			for(int i=0;i<lst.size();i++)
			{
				if(lst.get(i).getText().equalsIgnoreCase(day))
				{
					lst.get(i).click();
					break;
				}
			}
			
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
