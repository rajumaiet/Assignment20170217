package startBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {
	
	public static void main(String[] args)
	{
		//set the system property for IE driver as:
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumDriver\\IEDriverServer.exe");
		
		/* WebDriver is an Interface,and we are defining a reference variable(driver)*/
		WebDriver driver=new InternetExplorerDriver();
		
		//Open Google URL on IE browser
		driver.navigate().to("https://www.google.co.in/");
		
		//Print the title of google URL
		System.out.println(driver.getTitle());
		
		//Kill the browser
		driver.quit();
		
}
}