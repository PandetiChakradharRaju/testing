package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {

WebDriver driver;
	
	public loginpage(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//li//span[@class='header-icon-link user-profile-icon']") WebElement login;
	
public void LoginToCrm() throws InterruptedException 
{
	Thread.sleep(2000);
	login.click();
	
	Thread.sleep(2000);
	Helperclass.captureScreenshots(driver);

	}
}
