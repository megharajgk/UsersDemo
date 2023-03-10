package alpha.seleniumAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * (a) Login (Should only accept the specified username and password and should fail on other passwords).
 * (b) “Add to cart” button functionality. (Single item,
 * (c) “Remove” button functionality.
 * (d) “Checkout Form” functionality.
 */

public class SDETTestScript {

	public static WebDriver driver=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		login("standard_user","secret_sauce");
		addToCart();
		remove();
		checkOut();
		closeBrowser();
	}
	
	public static void launchBrowser()
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void login(String username,String password)
	{
		try
		{
			WebElement userName = driver.findElement(By.id("user-name"));
			userName.sendKeys(username);
			WebElement pwd= driver.findElement(By.id("password"));
			pwd.sendKeys(password);
			WebElement btnLogin=driver.findElement(By.id("login-button"));
			btnLogin.click();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void addToCart()
	{
		try
		{
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,600)");
			
			WebElement addCart=driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
			addCart.click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void remove()
	{
		try
		{
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,600)");
			
			WebElement addCart=driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
			addCart.click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void checkOut()
	{
		try
		{
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,-800)");
			
			WebElement addCart=driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
			addCart.click();
			Thread.sleep(2000);
			
			WebElement btnCart= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
			btnCart.click();
			
			WebElement btnCheckOut=driver.findElement(By.id("checkout"));
			btnCheckOut.click();
			
			WebElement firstName=driver.findElement(By.id("first-name"));
			firstName.sendKeys("Standard");
			WebElement lastName=driver.findElement(By.id("last-name"));
			lastName.sendKeys("User");
			WebElement postalCode=driver.findElement(By.id("postal-code"));
			postalCode.sendKeys("123456");
			WebElement btnContinue=driver.findElement(By.id("continue"));
			btnContinue.click();
			WebElement btnFinish=driver.findElement(By.id("finish"));
			btnFinish.click();
			
			String text=driver.findElement(By.xpath("//h2")).getText();
			Assert.assertEquals(text, "THANK YOU FOR YOUR ORDER");
			
		}catch (Exception e) 
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
