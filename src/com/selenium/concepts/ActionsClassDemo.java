package com.selenium.concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
		getMoveToElement();
		getSelectText();
		getRightClick();
		closeBrowser();
	}

	static void launchBrowser() {
		String path = null;
		try {
			path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\Library\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void url() {
		try {
			driver.get("http://www.amazon.in");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void getMoveToElement() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void getSelectText() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
					.sendKeys("hello").build().perform();
			driver.findElement(By.id("twotabsearchtextbox")).clear();
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
					.sendKeys("hello").doubleClick().build().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void getRightClick() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Actions a = new Actions(driver);

			a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build()
					.perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
