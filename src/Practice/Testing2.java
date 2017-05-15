package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Testing2 {
	WebDriver driver;
		
	/*public Testing2(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}*/
	
	
	@FindBy(how=How.XPATH,using="//input[@id='user_login']")
	WebElement userName;
	
	@FindBy(how=How.XPATH,using="//input[@id='user_pass']")
     WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@id='wp-submit']")
	WebElement Login;
	
	
	public void Login(String uid,String Pass)
	{
		userName.sendKeys(uid);
		Password.sendKeys(Pass);
		Login.click();
	}

}
