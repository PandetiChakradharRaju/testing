package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Moreinfo {

	WebDriver driver;
	public Moreinfo(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="( //ul[@class=\"col-md-6 no-padding bodytext\"])[3]") WebElement infotext;

	
	public void moruee()
	{
		 System.out.println(infotext.getText());
		Helperclass.captureScreenshots(driver);

	}
}
