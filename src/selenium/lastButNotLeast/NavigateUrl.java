package selenium.lastButNotLeast;


public class NavigateUrl extends LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		url();
	}

	public static void url() 
	{
		try
		{
			driver.get("http://www.google.com");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
 