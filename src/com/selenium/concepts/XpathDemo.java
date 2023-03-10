package com.selenium.concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class XpathDemo {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		login();
		closeBrowser();
	}

	public static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("inputUsername")).sendKeys("rahul");
			driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademies");
			driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
			System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
			String rstPwd=driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
			System.out.println(rstPwd);
			
			String str[]=rstPwd.split(" '");
			String getPwd="";
			for(int i=0;i<str.length;i++)
			{
				String strLen[]=str[1].split("' ");
				for(int j=0;j<strLen.length;j++)
				{
					getPwd=strLen[0];
				}
			}		
			System.out.println(getPwd);
			
			driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("inputUsername")).sendKeys("rahul");
			driver.findElement(By.name("inputPassword")).sendKeys(getPwd);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
			Thread.sleep(2000);
			String strmsg=driver.findElement(By.tagName("p")).getText();
			Assert.assertEquals(strmsg, "You are successfully logged in.");
			driver.findElement(By.xpath("//button[text()='Log Out']")).click();
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
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
