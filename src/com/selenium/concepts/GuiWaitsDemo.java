package com.selenium.concepts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuiWaitsDemo {

	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
//		getImplicitWait();
		getExplicitWait();
//		getFluentWait();
		 closeBrowser();
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
	public static void getImplicitWait() 
	{
		String s[] = { "Cucumber", "Cauliflower", "Brocolli", "Beetroot" };
		int count = 0;
		try 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			
			List<WebElement> lst = driver.findElements(By.xpath("//h4[@class='product-name']"));
			
			for (int i = 0; i < lst.size(); i++) 
			{
				String lists[] = lst.get(i).getText().split("-");
				String items = lists[0].trim();

				List<String> reqItems = Arrays.asList(s);

				if (reqItems.contains(items)) 
				{
					count++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (count == reqItems.size()) 
					{
						break;
					}
				}
			}
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
			Assert.assertEquals(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText(), "Code applied ..!");

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void getExplicitWait() 
	{
		String s[] = { "Cucumber", "Cauliflower", "Brocolli", "Beetroot" };
		int count = 0;
		try 
		{	
			List<WebElement> lst = driver.findElements(By.xpath("//h4[@class='product-name']"));
			
			for (int i = 0; i < lst.size(); i++) 
			{
				String lists[] = lst.get(i).getText().split("-");
				String items = lists[0].trim();

				List<String> reqItems = Arrays.asList(s);

				if (reqItems.contains(items)) 
				{
					count++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (count == reqItems.size()) 
					{
						break;
					}
				}
			}
			WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
			
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			
			w.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@class='promoCode']"))));
			driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
			
			driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
			
			Assert.assertEquals(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText(), "Code applied ..!");

			System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void getFluentWait() 
	{
		String s[] = { "Cucumber", "Cauliflower", "Brocolli", "Beetroot" };
		int count = 0;
		try 
		{	
			List<WebElement> lst = driver.findElements(By.xpath("//h4[@class='product-name']"));
			
			for (int i = 0; i < lst.size(); i++) 
			{
				String lists[] = lst.get(i).getText().split("-");
				String items = lists[0].trim();

				List<String> reqItems = Arrays.asList(s);

				if (reqItems.contains(items)) 
				{
					count++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (count == reqItems.size()) 
					{
						break;
					}
				}
			}
			
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

			
			Wait<WebDriver> w = new FluentWait<WebDriver>(GuiWaitsDemo.driver)
				       .withTimeout(Duration.ofSeconds(20))
				       .pollingEvery(Duration.ofSeconds(2))
				       .ignoring(NoSuchElementException.class);
			
			
			
			WebElement webele=w.until(new Function<WebDriver, WebElement>() 
			{
				
				public WebElement apply(WebDriver driver) 
				{
					if(driver.findElement(By.xpath("//input[@class='promoCode']")).isDisplayed())
					{
						return driver.findElement(By.xpath("//input[@class='promoCode']"));
					}
					else
					{
						return null;
					}
					
				}
				
			});
			System.out.println(driver.findElement(By.xpath("//input[@class='promoCode']")).isDisplayed());
			driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
			
			driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
			WebElement webelement=w.until(new Function<WebDriver, WebElement>() 
			{

				@Override
				public WebElement apply(WebDriver driver) 
				{
					if(driver.findElement(By.xpath("//span[@class='promoInfo']")).isDisplayed())
					{
						return driver.findElement(By.xpath("//span[@class='promoInfo']"));
					}
					else
					{
						return null;
					}
					
				}
				
			});
			System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).isDisplayed());
			Assert.assertEquals(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText(), "Code applied ..!");

			System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		} catch (Exception e) 
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
