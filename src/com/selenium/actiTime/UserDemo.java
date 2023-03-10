package com.selenium.actiTime;

public class UserDemo extends Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		url();
		login("admin", "manager");
		minimizeFlyoutWindow();
		createUser();
		modifyUser();
		logOut();
		login("demo1New", "demousernew1");
		clickOnStart();
		logOut();
		login("admin", "manager");
		deleteUser();
		logOut();
		closeBrowser();
	}
}
