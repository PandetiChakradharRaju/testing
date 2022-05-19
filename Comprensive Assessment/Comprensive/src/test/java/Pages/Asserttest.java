package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Asserttest {
	WebDriver driver;

	public Asserttest(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//li[@class='topnav_item topdealsunit']") WebElement Sale_ss;
	@FindBy(xpath="//li[@class='subnav_item 15040']") WebElement asser_Ele;
	@FindBy(xpath="//div[@class='Fabric Sofa Sets']") WebElement get_txt; 

 public void assersearcho() throws InterruptedException
 {
	 Sale_ss.click();
	 asser_Ele.click();
	 Helperclass.captureScreenshots(driver);

 }
}
