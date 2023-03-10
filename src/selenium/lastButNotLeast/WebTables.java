package selenium.lastButNotLeast;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		rightClick();
	}

	public static void launch()
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void rightClick()
	{
		try
		{
			driver.findElement(By.xpath("//a[normalize-space()='Context Menu']")).click();
			WebElement ele= driver.findElement(By.cssSelector("div[id='hot-spot']"));
			Actions a = new Actions(driver);
			a.contextClick(ele).perform();
			
			driver.switchTo().alert().accept();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
