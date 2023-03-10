package com.selenium.actiTime;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Users extends InitSetUp {
	public static void createUser()
	{
		String firstName="DemoUser";
		String lastName="User1";
		String email="demoUser@gmail.com";
		String login="demo1";
		String password="demouser1";
		String repassword=password;
		try
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath("//div[text()='USERS']")).click();
			driver.findElement(By.xpath("//div[@class='addUserButton beigeButton useNativeActive']")).click();
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(firstName);
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lastName);
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys(login);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys(password);
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(repassword);
			driver.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
			driver.navigate().refresh();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void modifyUser()
	{
		String firstName="DemoUserNew";
		String lastName="UserNew1";
		String email="demoUserNew@gmail.com";
		String login="demo1New";
		String password="demousernew1";
		String repassword=password;
		try
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath("//div[text()='USERS']")).click();
			WebElement user=driver.findElement(By.xpath("//span[text()='User1, DemoUser']"));
			user.click();
			WebElement fn=driver.findElement(By.id("userDataLightBox_firstNameField"));
			fn.clear();
			fn.sendKeys(firstName);
			WebElement ln=driver.findElement(By.id("userDataLightBox_lastNameField"));
			ln.clear();
			ln.sendKeys(lastName);
			WebElement e=driver.findElement(By.id("userDataLightBox_emailField"));
			e.clear();
			e.sendKeys(email);
			WebElement l= driver.findElement(By.id("userDataLightBox_usernameField"));
			l.clear();
			l.sendKeys(login);
			WebElement p=driver.findElement(By.id("userDataLightBox_passwordField"));
			p.clear();
			p.sendKeys(password);
			WebElement rp= driver.findElement(By.id("userDataLightBox_passwordCopyField"));
			rp.clear();
			rp.sendKeys(repassword);
			WebElement button=driver.findElement(By.id("userDataLightBox_commitBtn"));
			button.click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void deleteUser()
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath("//div[text()='USERS']")).click();
			driver.findElement(By.xpath("//tr[2]//td[@class='userNameCell first']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert al=driver.switchTo().alert();
			al.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
