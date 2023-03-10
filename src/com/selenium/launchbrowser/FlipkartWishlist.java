package com.selenium.launchbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartWishlist {

	 public static WebDriver driver =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setIntiPrpty();
		launchBrowser();
		url();
		wishlist();
//		closeBrowser();
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
			driver.get("http://www.flipkart.com");
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void wishlist()
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//div[@class='_1psGvi _3BvnxG']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9538815435");
			driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("megharaj123$");
			driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
			Thread.sleep(2000);
			WebElement oEle=driver.findElement(By.xpath("//img[@alt='Fashion']"));
			Thread.sleep(2000);
			Actions oMouse=new Actions(driver);
			oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@class='_3XS_gI']/a[3]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@class='eX72wL']/following::div[42]")).click();
			Thread.sleep(4000);
			WebElement wel=driver.findElement(By.xpath("//*[@class='_1psGvi _3BvnxG']"));
			Thread.sleep(4000);
			oMouse.moveToElement(wel).build().perform();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@class='_2NOVgj'][5]")).click();
			driver.navigate().refresh();
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
