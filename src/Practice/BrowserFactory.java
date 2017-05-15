package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver driver;
	public static WebDriver Browser1(String browserName,String url)
	{
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:/chromedriver_win32/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}

}
