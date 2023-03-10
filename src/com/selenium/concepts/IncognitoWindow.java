package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Library\\drivers\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");

	}

}
