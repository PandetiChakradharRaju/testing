package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class aboutpageoo {
	WebDriver driver;
	public aboutpageoo(WebDriver driver )
	{
		this.driver =driver;
	}

	@FindBy(xpath=" //ul[@class='col-md-6 no-padding bodytext']") WebElement abouttext;
	public void aboutu()
	{
		 System.out.println(abouttext.getLocation());
		Helperclass.captureScreenshots(driver);

	}
}

