package com.selenium.concepts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionDemo extends CheckBoxRadioButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
//		assertions();
		softAssertions();
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
	
	public static void assertions()
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
			
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult, 2 Child, 2 Infant");
			
			driver.findElement(By.id("btnclosepaxoption")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void softAssertions()
	{
		try
		{
			SoftAssert sft= new SoftAssert();
			
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			sft.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "2 Adult");
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
			
			sft.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "10 Adult, 2 Child, 2 Infant");

			sft.assertAll();
			driver.findElement(By.id("btnclosepaxoption")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
