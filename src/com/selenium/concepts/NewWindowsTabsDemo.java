package com.selenium.concepts;

import org.openqa.selenium.WindowType;

public class NewWindowsTabsDemo extends CheckBoxRadioButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		windowsDemo();
		closeBrowser();
	}

	public static void windowsDemo()
	{
		try
		{
			driver.get("https://www.selenium.dev/");
			
			// A new tab is opened and switches to it
			driver.switchTo().newWindow(WindowType.TAB);
			
			// Loads Sauce Labs open source website in the newly opened tab
			driver.get("https://opensource.saucelabs.com/");
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
