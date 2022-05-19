package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Livingroom {

WebDriver driver;
	
	public Livingroom(WebDriver driver )
	{
		this.driver =driver;
		
	}
		@FindBy(xpath="//div//li[@class='topnav_item livingunit']") WebElement living_Ele;
		@FindBy(xpath="//li[@class='subnav_item 1699'] ") WebElement  Tvunits;
   
      public void tvpageoo()
    {
    	 living_Ele.click();
    	String str=living_Ele.getText();
    	System.out.println(str);
    	Assert.assertEquals("Living", str);

    	  Tvunits.click();
    	     	  
    	  
    }
}

