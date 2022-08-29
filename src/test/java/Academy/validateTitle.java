package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class validateTitle extends Base{
	
	public WebDriver driver;
	@BeforeTest
	public void initialise() throws IOException
	{
		driver=initialiseDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basePageNavigation() throws IOException	{
		LandingPage l=new LandingPage(driver);
		String s=l.getFeature().getText();
		Assert.assertEquals(s, "FEATURED COURSES123");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}


}
