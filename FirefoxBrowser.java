package startBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.gecko.driver","C:\\SeleniumDriver\\geckodriver.exe");
		
		System.setProperty("webdriver.firefox.marionette","C:\\SeleniumDriver\\geckodriver.exe");
		
		/* WebDriver is an Interface,and we are defining a reference variable(driver)*/
		WebDriver driver=new FirefoxDriver();
		
		//Open Google URL on IE browser
		driver.navigate().to("https://www.google.co.in/");
		
		//Print the title of google URL
		System.out.println(driver.getTitle());
		
		//Kill the browser
		driver.quit();
		
}
}
