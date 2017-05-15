import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
public static void main(String...s)
{
WebDriver driver = new FirefoxDriver();
driver.get("http://www.google.com");
System.out.println(driver.getTitle());
driver.quit();
System.out.println("Hii It is done");
System.out.println("Rehn de");
}
}
