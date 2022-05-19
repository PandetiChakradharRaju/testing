package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage {

	WebDriver driver;
	public BookingPage(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="(//span[@itemprop='name'])[6]") WebElement Bed_click;
	//@FindBy(xpath="//*[@id=\"app-container__content\"]/div[2]/span/div/div[2]/div[1]/div[2]/form/button/span[1]") WebElement addto_cart;


	public void bedlogin() throws InterruptedException
	{
		
		Bed_click.click();
		//addto_cart.click();
		Thread.sleep(1000);
		//System.out.println("addto cart"+ addto_cart.getText());
		driver.navigate().back();
		
		Helperclass.captureScreenshots(driver);

	}
}
