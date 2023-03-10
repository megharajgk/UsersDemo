package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownsDemo {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
		staticDropdowns();
		addElementsDropdowns();
		dynamicDropdowns();
		autoSuggestDropdowns();
		closeBrowser();
	}

	public static void launchBrowser()
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void url()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void staticDropdowns()
	{
		try
		{
			WebElement dn= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select sl=new Select(dn);

			sl.selectByIndex(2);
			System.out.println(	sl.getFirstSelectedOption().getText());
			Thread.sleep(1000);

			sl.selectByValue("USD");
			System.out.println(	sl.getFirstSelectedOption().getText());
			Thread.sleep(1000);

			sl.selectByVisibleText("INR");
			System.out.println(	sl.getFirstSelectedOption().getText());
			Thread.sleep(1000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public static void addElementsDropdowns()
	{
		try
		{
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(1000);
			for(int i=1;i<=3;i++)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
			}
			Thread.sleep(1000);
			for(int i=1;i<=2;i++)
			{
				driver.findElement(By.id("hrefIncChd")).click();
			}
			Thread.sleep(1000);
			for(int i=1;i<=2;i++)
			{
				driver.findElement(By.id("hrefIncInf")).click();
			}
			Thread.sleep(1000);
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

			driver.findElement(By.id("btnclosepaxoption")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void dynamicDropdowns()
	{
		try
		{
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(1000);
			//			driver.findElement(By.xpath("(//a[@value='IXG'])[2]")).click();
			//			OR
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXG']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void autoSuggestDropdowns()
	{
		try
		{
			driver.findElement(By.id("autosuggest")).sendKeys("ind");
			Thread.sleep(1000);
			List<WebElement> lst=driver.findElements(By.className("ui-menu-item"));
			Thread.sleep(1000);

			// To print values
			for(WebElement str:lst)
			{
				System.out.println(str.getText());
			}

			//To select the value)
			for(WebElement kk:lst)
			{
				if(kk.getText().equalsIgnoreCase("india"))
				{
					kk.click();
					break;
				}
			}
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
