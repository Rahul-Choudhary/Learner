package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class Example {
	WebDriver driver;
	
	@Test
	public void main1() throws IOException, InterruptedException
	{
		
		driver=BrowserFactory.Browser1("chrome","https://demos1.softaculous.com/WordPress/wp-login.php?redirect_to=https%3A%2F%2Fdemos1.softaculous.com%2FWordPress%2Fwp-admin%2F&reauth=1");
		Testing2 obj= PageFactory.initElements(driver, Testing2.class);
		obj.Login("admin", "demo123");
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
