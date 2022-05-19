package Pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Hybrid.BrowserFactory;

class Baseclass {
		public WebDriver driver;
		public ConfigDataproviders config;
		@BeforeSuite
		public void setupsuite() throws FileNotFoundException
		{
			config=new ConfigDataproviders();
		}
		@BeforeClass
		 public void voidsetup()
		 {
			
			driver=BrowserFactory.startApplication(driver,config.getBrowser(), config.getStagingurl());

		 }
		@AfterClass
		 public void teardown() 
		 {
			BrowserFactory.quitBrowser(driver);
			 
		 }
}
