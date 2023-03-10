package com.selenium.concepts;

import java.io.File; 
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class AllInOne {

	public static WebDriver driver=null;
	public static String path=System.getProperty("user.dir");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
//		countOfLinks();
//		countOfLinksInFooter();
//		countOfLinksInFooterInColumn();
//		clickLinksInFooterInColumn();
//		radioButton();
//		autoSuggestiveDropdown();
//		dropdownDemo();
//		checkBoxes();
//		switchWindow();
//		switchTab();
//		switchAlerts();
//		showHide();
//		mouseOver();
//		scrollDemo();
//		framesDemo();
//		webTableScroll();
//		badSSL();
//		getScreenshot();
//		countColumnValues();
//		linksCount();
//		brokenLinks();
//		authenticatedPopup();
//		permissionPopup();
//		framesHandling();
//		calendarDemo();
//		keyboardActions();
//		multipleKeys();
//		toolTip();
//		newTabAndWindow();
//		sizeAndLocationOfElement();
//		drawBorderAndGenerateAlert();
//		manageCookies();
		downloadFile();
//		uploadFileUsingsendKeys();
//		closeBrowser();
	}

	static void launchBrowser() 
	{
		String path = null;
		try
		{
			path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\Library\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void countOfLinks()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			int count=driver.findElements(By.tagName("a")).size();
			System.out.println("Count of links in a Page : "+count);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void countOfLinksInFooter()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			int count=driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size();
			System.out.println("Count of links in a Footer section : "+count);
			
			System.out.println("----OR----");
			
			WebElement ele=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
			int count1=ele.findElements(By.tagName("a")).size();
			System.out.println("Count of links in a Footer section : "+count1);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void countOfLinksInFooterInColumn()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement ele=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
			
			int count=ele.findElements(By.tagName("a")).size();
			System.out.println("Count of links in a Footer section in First coloumn : "+count);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void clickLinksInFooterInColumn()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement ele=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
			
			int count=ele.findElements(By.tagName("a")).size();
			
			for(int i=1;i<count;i++)
			{
				String clickOnLink=Keys.chord(Keys.CONTROL, Keys.ENTER);
				
				ele.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
				Thread.sleep(4000);
			}
			
			Set<String> titles =driver.getWindowHandles();
			Iterator<String> ite=titles.iterator();
			while(ite.hasNext())
			{
				driver.switchTo().window(ite.next());
				System.out.println(driver.getTitle());
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	static void radioButton() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			List<WebElement> ele=driver.findElements(By.name("radioButton"));
			int len=ele.size();
			System.out.println("Number of Radio buttons : "+len);
			for(int i=0;i<len;i++)
			{
				ele.get(i).click();
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void autoSuggestiveDropdown() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("autocomplete")).sendKeys("ind");
			List<WebElement> lst= driver.findElements(By.className("ui-menu-item"));
			
			for(WebElement str:lst)
			{
				System.out.println(str.getText());
			}
			
			for(WebElement slt:lst)
			{
				if(slt.getText().equalsIgnoreCase("india"))
				{
					slt.click();
					break;
				}
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void dropdownDemo() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement dd=driver.findElement(By.id("dropdown-class-example"));
			Select s=new Select(dd);
		
			s.selectByIndex(2);

			s.selectByValue("option1");
			
			s.selectByVisibleText("Option3");
			driver.navigate().refresh();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void checkBoxes() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			List<WebElement> lst= driver.findElements(By.id("checkbox-example"));
			for(WebElement kk:lst)
			{
				System.out.println(kk.getText());
			}
			
			List<WebElement> opt=driver.findElements(By.xpath("//div[@class='right-align'] //input[@type='checkbox']"));
			
			for(int i=0;i<opt.size();i++)
			{
				opt.get(i).click();
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void switchWindow() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("openwindow")).click();
			System.out.println(driver.getTitle());
			Set<String> windows=driver.getWindowHandles();
			Iterator<String> ite= windows.iterator();

			String parentId=ite.next();
			String childId=ite.next();
			
			driver.switchTo().window(childId);
			System.out.println(driver.getTitle());
			
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void switchTab() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("opentab")).click();
			
			System.out.println(driver.getTitle());
			Set<String> windows=driver.getWindowHandles();
			Iterator<String> ite= windows.iterator();

			String parentId=ite.next();
			String childId=ite.next();
			
			driver.switchTo().window(childId);
			System.out.println(driver.getTitle());
			
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void switchAlerts()  
	{
		String name="WelCome";
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("name")).sendKeys(name);
			driver.findElement(By.id("confirmbtn")).click();
			Alert al=driver.switchTo().alert();
			
			String s=al.getText();
			
			al.accept();
		String captured=s.split(",")[0].split(" ")[1].trim();
		if(name.equalsIgnoreCase(captured))
		{
			System.out.println("Alert message captures successfully that is : "+captured);
		}
		else
		{
			System.out.println("Alert message not captures successfully");
		}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	static void showHide()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement web1=driver.findElement(By.id("displayed-text"));
			web1.sendKeys("Megharaj");
			
			driver.findElement(By.id("show-textbox")).click();
			System.out.println(web1.isDisplayed());//true
			
			driver.findElement(By.id("hide-textbox")).click();
			System.out.println(web1.isDisplayed());//false

			driver.findElement(By.id("show-textbox")).click();
			System.out.println(web1.isDisplayed());//true
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void mouseOver()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Actions a =new Actions(driver);
			a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
			WebElement web1=driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[1]"));
			System.out.println(web1.getText());
			web1.click();
			
			a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
			WebElement web2=driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[2]"));
			System.out.println(web2.getText());
			web2.click();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void scrollDemo()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,1400)");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void framesDemo()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,1400)");
			driver.switchTo().frame("iframe-name");
			driver.findElement(By.linkText("Practice")).click();
		
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void webTableScroll()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,600)");
			Thread.sleep(2000);
			
			je.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void countColumnValues()  
	{
	
		int sum=0;
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,600)");
			Thread.sleep(2000);
			
			je.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
			List<WebElement> lst=driver.findElements(By.xpath("//div[@class='tableFixHead']//tr/td[4]"));
			for(int i=0;i<lst.size();i++)
			{
				String s=lst.get(i).getText();
				sum=sum+Integer.parseInt(s);
			}
			System.out.println("Total sum is : "+sum);
			
			String num=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
			
			String newNum=num.split(":")[1].trim();
			
			int getNum=Integer.parseInt(newNum);
			System.out.println("Given sum is : "+getNum);
			
			if(sum==getNum)
			{
				System.out.println("The sum is correct");
			}
			else
			{
				System.out.println("The sum is not correct");
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void badSSL()  
	{
		String path="";
		try 
		{
			path = System.getProperty("user.dir");
//			System.setProperty("webdriver.chrome.driver", path + "\\Library\\drivers\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", path + "\\Library\\drivers\\geckodriver.exe");

//			ChromeOptions opt=new ChromeOptions();
			FirefoxOptions opt=new FirefoxOptions();
			opt.setAcceptInsecureCerts(true);
//			driver=new ChromeDriver(opt);
			driver=new FirefoxDriver(opt);
			driver.manage().window().maximize();
			driver.get("https://expired.badssl.com/");
			System.out.println(driver.getTitle());
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void getScreenshot()  
	{
		try 
		{
			driver.get("http://www.flipkart.com");
			
			//Full page
			TakesScreenshot s= (TakesScreenshot)driver;
			File f=s.getScreenshotAs(OutputType.FILE);
			File src=new File(".\\Screenshot\\Homepage.png");
			FileUtils.copyFile(f, src);
			
			//Only some portion
			WebElement login= driver.findElement(By.xpath("//div[@class='_3wFoIb row']"));
			File f1=login.getScreenshotAs(OutputType.FILE);
			File src1=new File(".\\Screenshot\\Login.png");
			FileUtils.copyFile(f1, src1);
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			// Only Logo
			WebElement logo=driver.findElement(By.xpath("//img[@class='_2xm1JU']"));
			File f2=logo.getScreenshotAs(OutputType.FILE);
			File scr2=new File(".\\Screenshot\\logo.png");
			FileUtils.copyFile(f2, scr2);
			
			driver.close();
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void linksCount()
	{
		try
		{
			driver.get("http://www.amazon.in");
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println("Number of Links : "+links.size());
			for(WebElement kk:links)
			{
				System.out.println(kk.getAttribute("href"));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void brokenLinks()  
	{
//		SoftAssert a=new SoftAssert();
		int brokenLinksCount=0;
		try 
		{
			driver.get("http://www.deadlinkcity.com/");
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,500)");
			
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println("Number of links : "+links.size());
			
			for(WebElement kk:links)
			{
				String urls=kk.getAttribute("href");
				URL u=new URL(urls);
				
				HttpURLConnection conn= (HttpURLConnection) u.openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				
				int resCode=conn.getResponseCode();
				
				if(resCode>=400)
				{
					System.out.println(resCode+" : "+urls+" is Broken link");
					brokenLinksCount++;
				}
				else
				{
					System.out.println(resCode+" : "+urls+" is valid link");
				}
				
//				a.assertTrue(resCode<400, "The link with text "+kk.getText()+" is broken with code : "+resCode);
			}
			System.out.println("Count of Broken links : "+brokenLinksCount);
//			a.assertAll();
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void authenticatedPopup() 
	{
		try 
		{
			// Before handling
			driver.get("https://the-internet.herokuapp.com/basic_auth");
			Thread.sleep(2000);

			// After handling
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void permissionPopup()  
	{
		try 
		{
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver=new ChromeDriver(opt);
			driver.get("http://www.redbus.in");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void framesHandling()  
	{
		try 
		{
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.xpath("//a[text()='org.openqa.selenium' and @target='packageFrame']")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.xpath("//span[@class='interfaceName' and text()='WebDriver']")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("classFrame");
			driver.findElement(By.xpath("//header[@role='banner']//li[8]")).click();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void calendarDemo()  
	{
		String year="2022";
		String month="aug";
		String date="20";
		try 
		{
			System.out.println("Given Date is : "+date+"-"+month+"-"+year);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.redbus.in");
			driver.findElement(By.id("onward_cal")).click();
			while(true)
			{
				String monthYear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
				String ar[]= monthYear.split(" ");
				String mon=ar[0];
				String yr=ar[1];
				
				if((mon.equalsIgnoreCase(month)) && (yr.equals(year)))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//td[@class='next']")).click();
				}
			}
	
			List<WebElement> allDates=driver.findElements(By.xpath("//tbody/tr/td"));
			
			for(WebElement kk:allDates)
			{
				String dt=kk.getText();
				if(dt.equals(date))
				{
					kk.click();
					break;
				}
			}
			String capturedDate= driver.findElement(By.id("onward_cal")).getAttribute("data-caleng");
			System.out.println("Entered Date is : "+capturedDate);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void keyboardActions()  
	{
		try 
		{
			driver.get("https://the-internet.herokuapp.com/key_presses");
		
			Actions a=new Actions(driver);
			a.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			a.sendKeys(Keys.ALT).perform();
			Thread.sleep(2000);
			a.sendKeys(Keys.ESCAPE).perform();
			Thread.sleep(2000);
			a.sendKeys(Keys.ARROW_RIGHT).perform();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void multipleKeys()  
	{
		try 
		{
			driver.get("https://text-compare.com");
			WebElement input1= driver.findElement(By.id("inputText1"));
			WebElement input2=driver.findElement(By.id("inputText2"));
			Actions a =new Actions(driver);
			input1.sendKeys("Welcome To Testing");
			
			//CTRL+A
			a.keyDown(Keys.CONTROL);
			a.sendKeys("a");
			a.keyUp(Keys.CONTROL);
			a.perform();
			
			
			//CTRL+C
			a.keyDown(Keys.CONTROL);
			a.sendKeys("c");
			a.keyUp(Keys.CONTROL);
			a.perform();
			
			//shift to input2 box
			a.sendKeys(Keys.TAB);
			a.perform();
			
			//CTRL+V
			a.keyDown(Keys.CONTROL);
			a.sendKeys("v");
			a.keyUp(Keys.CONTROL);
			a.perform();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void toolTip()  
	{
		try 
		{
			driver.get("https://jqueryui.com/tooltip/");
			driver.switchTo().frame(0);
			WebElement tooltip=driver.findElement(By.id("age"));
			String toolTipText=tooltip.getAttribute("title");
			System.out.println(toolTipText);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void newTabAndWindow()  
	{
		try 
		{
			driver.get("http://www.amazon.in");
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("http://www.flipkart.com");
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("http://www.google.com");
			driver.quit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void sizeAndLocationOfElement()  
	{
		try 
		{
			driver.get("http://www.amazon.in");
			
			WebElement logo=driver.findElement(By.id("nav-logo"));
			
			System.out.println("Size : "+logo.getSize());
			System.out.println("Height : "+logo.getSize().height);
			System.out.println("Width : "+logo.getSize().width);
			System.out.println();
			
			System.out.println("Location : "+logo.getLocation());
			System.out.println("X : "+logo.getLocation().getX());
			System.out.println("Y : "+logo.getLocation().getY());
			System.out.println();
			
			System.out.println("Size : "+logo.getRect().getDimension());
			System.out.println("Height : "+logo.getRect().getHeight());
			System.out.println("Width : "+logo.getRect().getWidth());
			System.out.println("X : "+logo.getRect().getX());
			System.out.println("Y : "+logo.getRect().getY());
			
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void drawBorderAndGenerateAlert()  
	{
		try 
		{
			driver.get("http://www.amazon.in");
			// To draw border
			WebElement logo=driver.findElement(By.id("nav-logo"));
			JavascriptExecutor je=(JavascriptExecutor)driver;
			String border="arguments[0].style.border='4px solid red'";
			je.executeScript(border, logo);
			
			// To generate an alert
			String al="alert('This is my alert')";
			je.executeScript(al);
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void manageCookies()  
	{
		try 
		{
			driver.get("http://www.amazon.in");
			
			// To get all cookies
			Set<Cookie> cookies=driver.manage().getCookies();
			
			// To get the size of the cookies
			int size=cookies.size();
			System.out.println("Before adding cookie, Size of Cookies is : "+cookies.size());
			
			// To print all the cookies
			System.out.println("Before adding cookie");
			for(Cookie kk:cookies)
			{
				System.out.println(kk.getName()+" \t : "+kk.getValue());
			}
			System.out.println();
			
			// To add the cookie
			Cookie ck=new Cookie("MyCookie123", "12345");
			driver.manage().addCookie(ck);
			cookies=driver.manage().getCookies();
			System.out.println("After adding cookie, Size of Cookies is : "+cookies.size());
			System.out.println("After adding cookie");
			for(Cookie kk:cookies)
			{
				System.out.println(kk.getName()+" \t : "+kk.getValue());
			}
			
			// To Delete cookie
			driver.manage().deleteCookie(ck);
			driver.manage().deleteCookieNamed("MyCookie123");
			cookies=driver.manage().getCookies();
			System.out.println("After deleting cookie, Size of Cookies is : "+cookies.size());
			
			// To delete all cookie
			driver.manage().deleteAllCookies();
			cookies=driver.manage().getCookies();
			System.out.println("After deleting all cookies, Size of Cookies is : "+cookies.size());
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void downloadFile()  
	{
		try 
		{		
			String path=System.getProperty("user.dir");
			
			HashMap<String, Object> cprefs=new HashMap<String, Object>();
			cprefs.put("profile.default_content_settings.popups", 0);
			cprefs.put("download.default_directory",path+"\\Downloads\\");
			
			ChromeOptions opt=new ChromeOptions();
			opt.setExperimentalOption("prefs", cprefs);
			WebDriver driver1=new ChromeDriver(opt);
			
			//driver1.manage().window().maximize();
			
			driver1.get("https://the-internet.herokuapp.com/download");
			
			// To download a file in a default location
			driver1.findElement(By.xpath("//a[text()='fileText.txt']")).click();
			driver.quit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void uploadFileUsingsendKeys()  
	{
		try 
		{
			// sendKeys() we can use only if the <type> tag contains File type
			// type=File
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://the-internet.herokuapp.com/upload");
			
			driver.findElement(By.id("file-upload")).sendKeys("D:\\Ready\\dummy.txt");
			driver.findElement(By.id("file-submit")).click();
			String success=driver.findElement(By.xpath("//div/h3[text()='File Uploaded!']")).getText();
			Assert.assertEquals(success, "File Uploaded!");
			Thread.sleep(2000);
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void closeBrowser()  
	{
		try 
		{
			driver.quit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
	