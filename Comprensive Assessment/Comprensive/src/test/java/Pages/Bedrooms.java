package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bedrooms {
	WebDriver driver;
	public Bedrooms(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//li[@class='topnav_item topdealsunit']") WebElement Sale_s;
	@FindBy(xpath="//li[@class='subnav_item 15040']") WebElement Sale_sofa; 
	
	
	public void LoginBed() throws InterruptedException 
	{
		Thread.sleep(2000);
		Sale_s.click();
		System.out.println(Sale_s.getText());
	   Sale_sofa.click();
		Helperclass.captureScreenshots(driver);
			
		
		Thread.sleep(2000);
		}
}

