package selenium.lastButNotLeast;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllStuffsInOne {

	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
//		basics();
//		countOfLinks();
//		countOfLinksInFooter();
//		countOfLinksInFooterFirstColumn();
//		clickOnLinksInFooterFirstColumn();
//		differentxpath();
//		dropdowns();
		checkboxes();
		
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
	public static void basics()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println(driver.getWindowHandle());
			System.out.println(driver.getPageSource());
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void countOfLinks()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			int count=driver.findElements(By.tagName("a")).size();
			System.out.println("Number of links are : "+count);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void countOfLinksInFooter()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement footer=driver.findElement(By.id("gf-BIG"));
			int count=footer.findElements(By.tagName("a")).size();
			System.out.println("Number of links are : "+count);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void countOfLinksInFooterFirstColumn()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement footer=driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
			int count=footer.findElements(By.tagName("a")).size();
			System.out.println("Number of links are : "+count);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void clickOnLinksInFooterFirstColumn()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement footer=driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
			int count=footer.findElements(By.tagName("a")).size();
			System.out.println("Number of links in footer section of first column are : "+count);
			
			for(int i=1;i<count;i++)
			{
				String clickOnLink=Keys.chord(Keys.CONTROL, Keys.ENTER);
				footer.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
				Thread.sleep(4000);
			}
			
			Set<String> wind=driver.getWindowHandles();
			Iterator<String> ite= wind.iterator();
			while(ite.hasNext())
			{
				Thread.sleep(2000);
				driver.switchTo().window(ite.next());
				System.out.println(driver.getTitle());
			}
			driver.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void differentxpath()
	{
		try
		{
			driver.get("http://www.amazon.in");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText("Mobiles")).click();
			driver.findElement(By.id("sobe_d_b_1_3")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void dropdowns()
	{
		try
		{
			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
			driver.findElement(By.id("justAnInputBox")).click();
//			drop(driver, "choice 1");
//			drop(driver, "choice 1","choice 2 1","choice 2 3","choice 5");
			drop(driver, "all");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void drop(WebDriver driver, String... val)
	{
		try
		{
			List<WebElement> options=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
			if(!val[0].equalsIgnoreCase("all"))
			{
				for(WebElement opt:options)
				{
					String text=opt.getText();
					for(String v:val)
					{
						if(text.equals(v))
						{
							opt.click();
							break;
						}
					}
				}
			}
			else
			{
				for(WebElement opt:options)
				{
					opt.click();
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
		public static void checkboxes()
		{
			try
			{
				driver.get("https://itera-qa.azurewebsites.net/home/automation");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//				boxes(driver, "Friday");
//				boxes(driver, "monday","sunday");
//				boxes(driver, "all");
				
//				//1 select specific checkbox
//				driver.findElement(By.id("monday")).click();
				
//				//2 select all check boxes
//				List<WebElement> days=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
//				for(WebElement day:days)
//				{
//					day.click();
//				}
				
//				//3 select multiple choices (monday & sunday)
//				List<WebElement> days=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
//
//				for(WebElement day:days)
//				{
//					String id=day.getAttribute("id");
//					if((id.equalsIgnoreCase("monday"))||(id.equalsIgnoreCase("sunday")))
//					{
//						day.click();
//					}
//				}
				
//				//4 select last 2 checkboxes
//				List<WebElement> days=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
//			
//				// total checkboxes - no.of checkboxes = starting index
//				// 7 - 2 = 5
//				
//				int total=days.size();
//				int req=2;
//				int statingIndex=total-req;
//				for(int i=statingIndex;i<total;i++)
//				{
//					days.get(i).click();
//				}
				
				//5 select first 2 checkboxes
				List<WebElement> days=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

				
				for(int i=0;i<2;i++)
				{
					days.get(i).click();
				}
				
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void boxes(WebDriver driver, String... value)
		{
			try
			{
				List<WebElement> days=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
				if(!value[0].equalsIgnoreCase("all"))
				{
					for(WebElement day:days)
					{
						String text=day.getText();;
						for(String val:value)
						{
							if((text.contains(val)))
							{
								day.click();
								break;
							}
						}
					}
				}
				else
				{
					for(WebElement day:days)
					{
						day.click();
					}
				}
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
