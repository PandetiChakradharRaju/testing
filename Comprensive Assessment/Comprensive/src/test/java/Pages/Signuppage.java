package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signuppage {

	WebDriver driver;
	public Signuppage(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//a[text()='Log In']") WebElement signup ;
	@FindBy(xpath="//form//div//input[@id='spree_user_email']")WebElement send_Email;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement send_pass;
	@FindBy(xpath="//input[@class='button primary']")WebElement send_login;


 
	
	public void signupp(String emailApp,String passwordApp) throws InterruptedException
	{
		signup.click();
		send_Email.sendKeys(emailApp);
		send_pass.sendKeys(passwordApp);
		send_login.click();
		Thread.sleep(2000);
	}

	

}