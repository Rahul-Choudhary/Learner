import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String...s)
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul Choudhary\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
System.out.println(driver.getTitle());
driver.quit();
System.out.println("Hii It is done");
System.out.println("Rehn de");
System.out.println("Second Commit Not As a Master");
System.out.println("Perfect");
}
}
