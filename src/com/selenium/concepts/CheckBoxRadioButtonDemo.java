package com.selenium.concepts;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckBoxRadioButtonDemo extends DropdownsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
		checkBox();
		radioButton();
		unEnabled();
		closeBrowser();

	}

	public static void checkBox() {
		try {
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
			System.out.println();

			int num = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
			System.out.println("Number of Checkboxes are present is : " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void radioButton() {
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

			int num = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
			System.out.println("Number of Radio buttons are present is : " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void unEnabled() {
		try {
			driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
			driver.findElement(By.className("ui-datepicker-today")).click();
			Thread.sleep(1000);
			System.out.println("Before click : " + driver.findElement(By.id("Div1")).getAttribute("style"));
			driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
			System.out.println("After click : " + driver.findElement(By.id("Div1")).getAttribute("style"));
			if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
				System.out.println("Its enabled");
				Assert.assertTrue(true);
			} else {
				System.out.println("Its disabled");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
