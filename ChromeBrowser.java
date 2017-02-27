package startBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	public static void main(String[] args)
	{
		//set the system property for chrome driver as:
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
		
		//defining a reference variable(driver)
		WebDriver driver=new ChromeDriver();
		
		//Open Google URL on Chrome browser
		driver.get("https://www.google.co.in/");
		
		//Print the title of google URL
		System.out.println(driver.getTitle());
		
		//Kill the browser
		driver.quit();
		
}
}
