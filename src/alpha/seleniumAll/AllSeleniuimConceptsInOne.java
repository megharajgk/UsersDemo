package alpha.seleniumAll;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllSeleniuimConceptsInOne {

	public static WebDriver driver=null;
	public static ChromeOptions opt=null;
	
	public static void main(String[] args) 
	{
		launchBrowser();
//		countOfLinks();
//		countOfLinksInFooter();
//		countOfLinksInFooterOf2ndCol();
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
//		framesDemo();
//		webTableScroll();
//		countColumnValues();
//		badSSL();
//		getScreenshot();
//		linksCountAndValue();
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
//		downloadFile();
//		uploadFileUsingsendKeys();
//		uploadFileUsingAutoIt();
//		incognito();
//		zoomInzoonOut();
//		pageSize();
	}

	public static void launchBrowser()
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
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
			System.out.println("Number of links in a given webpage is : "+count);
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
			WebElement ele=driver.findElement(By.id("gf-BIG"));
			int count=ele.findElements(By.tagName("a")).size();
			System.out.println("Number of links in footer section of a given webpage is : "+count);
			
			//OR
			
			int count1=driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size();
			System.out.println("Number of links in footer section of a given webpage is : "+count1);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void countOfLinksInFooterOf2ndCol()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement ele=driver.findElement(By.xpath("//div[@id='gf-BIG']//td[2]"));
			int count=ele.findElements(By.tagName("a")).size();
			System.out.println("Number of links in footer section of 2nd colo of a given webpage is : "+count);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void clickLinksInFooterInColumn()
	{
		try
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement ele=driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
			List<WebElement> links= ele.findElements(By.tagName("a"));
			int len=links.size();
			System.out.println("Number of links are : "+len);
			
			/*
			for(WebElement link:links)
			{
				String clk = Keys.chord(Keys.CONTROL, Keys.ENTER);
				link.sendKeys(clk);
				Thread.sleep(2000);
			}
			*/
			
			for(int i=1;i<len;i++)
			{
				String clk=Keys.chord(Keys.CONTROL, Keys.RETURN);
				links.get(i).sendKeys(clk);
				Thread.sleep(2000);
			}
			Set<String> clicks=driver.getWindowHandles();
			Iterator<String> ite=clicks.iterator();
			while(ite.hasNext())
			{
				driver.switchTo().window(ite.next());
				System.out.println(driver.getTitle());
			}
			driver.quit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void radioButton() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			List<WebElement> buttons=driver.findElements(By.cssSelector(".radioButton"));
			System.out.println("Number of Radio buttons are : "+buttons.size());
			
			for(WebElement button:buttons)
			{
				button.click();
				Thread.sleep(2000);
			}
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void autoSuggestiveDropdown() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("autocomplete")).sendKeys("ind");
			List<WebElement> countries= driver.findElements(By.className("ui-menu-item"));
			for(WebElement country:countries)
			{
				System.out.println(country.getText());
			}
			for(WebElement country:countries)
			{
				String text=country.getText();
				if(text.equalsIgnoreCase("india"))
				{
					country.click();
				}
			}
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void dropdownDemo() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement ele=driver.findElement(By.id("dropdown-class-example"));
			Select s=new Select(ele);
			s.selectByIndex(3);
			Thread.sleep(2000);
			System.out.println(s.getFirstSelectedOption().getText());
			s.selectByValue("option1");
			Thread.sleep(2000);
			System.out.println(s.getFirstSelectedOption().getText());
			s.selectByVisibleText("Option2");
			Thread.sleep(2000);
			System.out.println(s.getFirstSelectedOption().getText());
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void checkBoxes() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			List<WebElement> checkboxes=driver.findElements(By.xpath("//div[@id='checkbox-example']//input[@type='checkbox']"));
			System.out.println("Number of checkboxes are : "+checkboxes.size());
			
			for(WebElement checkbox:checkboxes)
			{
				checkbox.click();
			}
			driver.close();
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
			
			Set<String> ids=driver.getWindowHandles();
			Iterator<String> ite= ids.iterator();
			
			String parentId=ite.next();
			String childId=ite.next();
			
			System.out.println(driver.getTitle());
			driver.switchTo().window(childId);
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(parentId);
			System.out.println(driver.getTitle());
			driver.quit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void switchTab() 
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("opentab")).click();
			
			Set<String> ids=driver.getWindowHandles();
			Iterator<String> ite= ids.iterator();
			
			System.out.println(driver.getTitle());
			
			String parentId =ite.next();
			String childId=ite.next();
			
			driver.switchTo().window(childId);
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(parentId);
			System.out.println(driver.getTitle());
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void switchAlerts()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("name")).sendKeys("Lion");
			driver.findElement(By.id("alertbtn")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			String text=al.getText();
			System.out.println(text);
			al.accept();
			
			String captured=text.split(",")[0].split(" ")[1].trim();
			System.out.println(captured);
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void showHide()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("show-textbox")).click();
			WebElement ele= driver.findElement(By.cssSelector("#displayed-text"));
			ele.sendKeys("Hello Lion");
			System.out.println(ele.isDisplayed());
			Thread.sleep(2000);
			driver.findElement(By.id("hide-textbox")).click();
			Thread.sleep(2000);
			System.out.println(ele.isDisplayed());
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void mouseOver()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			JavascriptExecutor je= (JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0,1000)");
			
			WebElement mouse= driver.findElement(By.cssSelector("#mousehover"));
			Actions a= new Actions(driver);
			
			a.moveToElement(mouse).perform();
			Thread.sleep(2000);
			
			WebElement top=driver.findElement(By.xpath("//button[@id='mousehover']/following-sibling::div/a[1]"));
			System.out.println(top.getText());
			top.click();
			Thread.sleep(2000);
			
			a.moveToElement(mouse).perform();
			Thread.sleep(2000);
			
			WebElement reload=driver.findElement(By.xpath("//button[@id='mousehover']/following-sibling::div/a[2]"));
			System.out.println(reload.getText());
			reload.click();
			Thread.sleep(2000);
			
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void framesDemo()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,1400)");
			
			WebElement frame=driver.findElement(By.cssSelector("#courses-iframe"));
			
			driver.switchTo().frame(frame);
			Thread.sleep(2000);
			driver.findElement(By.linkText("Practice")).click();
			Thread.sleep(2000);
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void webTableScroll()  
	{
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,600)");
			Thread.sleep(2000);
			
			je.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
			Thread.sleep(2000);
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void countColumnValues()  
	{
		int sum=0;
		try 
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			JavascriptExecutor je=(JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0,600)");
			List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
			 for(WebElement val:values)
			 {
				 String s=val.getText();
				 int n=Integer.parseInt(s);
				 sum=sum+n;
			 }
			 String text=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
			 String captured=text.split(":")[1].trim();
			 int actual=Integer.parseInt(captured);
			 
			 if(actual==sum)
			 {
				 System.out.println(sum+" : Sum is same as Actual : "+actual);
			 }
			 else
			 {
				 System.out.println(sum+" : Sum is not same as Actual : "+actual);
			 }
			 
			 driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void badSSL()  
	{
		try 
		{
			opt=new ChromeOptions();
			opt.setAcceptInsecureCerts(true);
			WebDriver drive=new ChromeDriver(opt);
			drive.get("https://expired.badssl.com/");
			Thread.sleep(2000);
			drive.close();
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void getScreenshot()  
	{
		try 
		{
			driver.get("http://www.amazon.in");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			// Full page
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dst=new File(".\\Screenshot\\Page1.png");
			FileUtils.copyFile(src, dst);
			
			driver.findElement(By.linkText("Mobiles")).click();
			JavascriptExecutor je=(JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0,2200)");
			
			WebElement ele=driver.findElement(By.id("sobe_d_b_9-carousel"));
			File scr1=ele.getScreenshotAs(OutputType.FILE);
			File dst1=new File(".\\Screenshot\\Page2.png");
			FileUtils.copyFile(scr1, dst1);
			
			WebElement part=driver.findElement(By.id("sobe_d_b_9_3"));
			File scr2=part.getScreenshotAs(OutputType.FILE);
			File dst2=new File(".\\Screenshot\\Page3.png");
			FileUtils.copyFile(scr2, dst2);
			
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void linksCountAndValue()
	{
		int n=1;
		try
		{
			driver.get("http://www.amazon.in");
			List<WebElement> links= driver.findElements(By.tagName("a"));
			System.out.println("Number of links are : "+links.size());
			for(WebElement link:links)
			{
				String urls=link.getAttribute("href");
				String val=link.getText();
				
				System.out.println(n++ +" : "+val +" : "+urls);
			}
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void brokenLinks()  
	{
		int brokenLinks=0;
		try 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("http://www.deadlinkcity.com/");
			List<WebElement> links= driver.findElements(By.tagName("a"));
			System.out.println("Number of links are : "+links.size());
			
			for(WebElement link:links)
			{
				String s=link.getAttribute("href");
				
				URL url =new URL(s);
				System.out.println(url);
				
				HttpURLConnection conn= (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				
				int respCode=conn.getResponseCode();
				
				if(respCode>=400)
				{
					System.out.println("Broken link : "+respCode+" : "+url);
					brokenLinks++;
				}
				else
				{
					System.out.println("Valid link : "+respCode+" : "+url);
				}
			}
			System.out.println("Total number of broken links are : "+brokenLinks);
			
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void authenticatedPopup() 
	{
		try 
		{
			// Before handling
			driver.get("https://the-internet.herokuapp.com/basic_auth");
			Thread.sleep(2000);

			// After handling
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void permissionPopup()  
	{
		try 
		{
			opt=new ChromeOptions();
			WebDriver drive=new ChromeDriver(opt);
			opt.addArguments("--disable-notifications");
			drive.get("http://www.redbus.in");
			Thread.sleep(4000);
			drive.close();
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void framesHandling()  
	{
		try 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
			
			driver.switchTo().frame("packageListFrame");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("packageFrame");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='interfaceName' and text()='WebDriver']")).click();
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("classFrame");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='topNav']//a[text()='Help']")).click();
			
			Thread.sleep(2000);
			driver.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void calendarDemo()  
	{
		String date="14";
		String month="feb";
		String year="2023";
		try 
		{
			System.out.println("Entered date is : "+date+"/"+month+"/"+year);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.redbus.in");
			driver.findElement(By.id("onward_cal")).click();
	
			while(true)
			{
				String monthYear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
				String mon=monthYear.split(" ")[0];
				String yy=monthYear.split(" ")[1];
				
				if(((mon.equalsIgnoreCase(month))&&(yy.equalsIgnoreCase(year))))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//td[@class='next']")).click();
				}
			}
			
			List<WebElement> dts=  driver.findElements(By.xpath("//td[contains(@class,'day')]"));
			
			for(WebElement dt:dts)
			{
				String s=dt.getText();
				if(s.equalsIgnoreCase(date))
				{
					dt.click();
					break;
				}
				
			}
			
			Thread.sleep(2000);
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void keyboardActions()  
	{
		try 
		{
			driver.get("https://the-internet.herokuapp.com/key_presses");
			Actions a=new Actions(driver);
			
			a.sendKeys(Keys.ENTER).perform();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void multipleKeys()  
	{
		try 
		{
			driver.get("https://text-compare.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement textbox1=driver.findElement(By.name("text1"));
			textbox1.sendKeys("Hello");
			
			  
			Actions a =new Actions(driver);
			
			a.keyDown(Keys.CONTROL);
			a.sendKeys("a");
			a.keyUp(Keys.CONTROL);
			a.perform();
			
			a.keyDown(Keys.CONTROL);
			a.sendKeys("c");
			a.keyUp(Keys.CONTROL);
			a.perform();
			
			a.sendKeys(Keys.TAB);
			a.perform();
			
			a.keyDown(Keys.CONTROL);
			a.sendKeys("v");
			a.keyUp(Keys.CONTROL);
			a.perform();
			
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void toolTip()  
	{
		try 
		{
			driver.get("https://jqueryui.com/tooltip/");
			WebElement ele=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(ele);
			String toolTip=driver.findElement(By.id("age")).getAttribute("title");
			System.out.println(toolTip);
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void newTabAndWindow()  
	{
		try 
		{
			driver.get("http://www.amazon.in");
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.selenium.dev");
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("http://www.youtube.com");
			driver.quit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void sizeAndLocationOfElement()  
	{
		try 
		{
			driver.get("http://www.amazon.in");
			WebElement logo=driver.findElement(By.id("nav-logo"));
			
			System.out.println(logo.getSize());
			
			System.out.println("height : "+logo.getRect().height);
			System.out.println("width :  "+logo.getRect().width);
			System.out.println("getHeight : "+logo.getRect().getHeight());
			System.out.println("getWidth : "+logo.getRect().getWidth());
			
			System.out.println("getLocation : "+logo.getLocation());
			System.out.println("x : "+logo.getLocation().x);
			System.out.println("y : "+logo.getLocation().y);
			System.out.println("getX : "+logo.getLocation().getX());
			System.out.println("getY : "+logo.getLocation().getY());
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void drawBorderAndGenerateAlert()  
	{
		try 
		{
			driver.get("http://www.amazon.in");
			// To draw border
			WebElement logo=driver.findElement(By.id("nav-logo"));
			JavascriptExecutor je=(JavascriptExecutor)driver;
			String border="arguments[0].style.border='5px solid red'";
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
	
	public static void manageCookies()  
	{
		try 
		{
			driver.get("http://www.amazon.in");
			
			// To get all cookies
			Set<Cookie> cookies=driver.manage().getCookies();
			
			// To get the size of the cookies
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
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void downloadFile()  
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
			driver1.findElement(By.xpath("//a[text()='text.txt']")).click();
			driver1.quit();
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void uploadFileUsingsendKeys()  
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
	
	public static void uploadFileUsingAutoIt()  
	{
		try 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://the-internet.herokuapp.com/upload");
			WebElement box= driver.findElement(By.id("drag-drop-upload"));
			box.click();
			Thread.sleep(2000 );
			Runtime.getRuntime().exec("D:\\AutoIT\\AutoUploadFile.exe");
			Thread.sleep(2000 );
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void incognito()
	{
		try
		{
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--incognito");
			WebDriver drive=new ChromeDriver(opt);
			drive.get("http://www.redbus.in");
			driver.close();
			Thread.sleep(2000);
			drive.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void zoomInzoonOut()
	{
		try
		{
			driver.get("http://www.youtube.com");
			JavascriptExecutor je=(JavascriptExecutor) driver;
			je.executeScript("document.body.style.zoom='150%'");
			Thread.sleep(2000);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void pageSize()
	{
		try
		{
			driver.get("http://www.selenium.dev");
			System.out.println(driver.manage().window().getSize().getHeight());
			driver.manage().window().fullscreen();
			System.out.println(driver.manage().window().getSize().getWidth());
			Thread.sleep(5000);
			
			driver.get("http://www.redbus.in");
			System.out.println(driver.manage().window().getSize());
			driver.manage().window().maximize();
			System.out.println(driver.manage().window().getSize());
			Thread.sleep(5000);
			
			Dimension d=new Dimension(100, 200);
			System.out.println(driver.manage().window().getSize());
			driver.manage().window().setSize(d);
			System.out.println(driver.manage().window().getSize());
			driver.get("http://www.youtube.com");
			
			System.out.println(driver.manage().window().getSize());
			Thread.sleep(5000);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}