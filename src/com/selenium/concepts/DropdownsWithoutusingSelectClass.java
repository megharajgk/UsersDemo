package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownsWithoutusingSelectClass extends DropdownsDemo{

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
		withoutSelect();
//		closeBrowser();
	}
	
	public static void withoutSelect()
	{
		try
		{
			WebElement dd=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Thread.sleep(2000);
			selectDropdowns(dd, "USD");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void selectDropdowns(WebElement ele, String val)
	{
		try
		{
			Select sl=new Select(ele);
			List<WebElement> allOptions=sl.getOptions();
			for(WebElement kk:allOptions)
			{
				if(kk.getText().equalsIgnoreCase(val))
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

}
