package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searrchpage {

WebDriver driver;
	
	public Searrchpage(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//input[@id='search']") WebElement search_Ele;
    @FindBy(xpath="//a[@data-id='96076']") WebElement Balnket;


	public void searcho(String accessories ) throws InterruptedException
	{
		
	    search_Ele.sendKeys(accessories);
	    search_Ele.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Balnket.click();
		driver.navigate().back();

	
		Thread.sleep(500);
		
	}
}
