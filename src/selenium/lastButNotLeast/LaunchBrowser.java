package selenium.lastButNotLeast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		
//		launchBrowser();
		launchChromeBrowser();
		launchFirefoxBrowser();
		launchEdgeBrowser();
	}

	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void launchChromeBrowser()
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void launchFirefoxBrowser()
	{
		try
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void launchEdgeBrowser()
	{
		try
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
