package Academy;

	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

	public class HomePage extends Base{

		public WebDriver driver;
		@BeforeTest
		public void initialise() throws IOException
		{
			driver=initialiseDriver();
			
		}
		
		@Test(dataProvider="getData")
		public void basePageNavigation(String username,String password,String text) throws IOException, InterruptedException
		{
			driver.get(prop.getProperty("url"));
			LandingPage l=new LandingPage(driver);
			LoginPage lp=l.getLogin();
			Thread.sleep(2000);
			lp.getEmail().sendKeys(username);
			lp.getPassword().sendKeys(password);
			System.out.println(text);
			lp.getPassword().click();
			ForgotPassword fp=lp.forgotpassword();
			fp.getEmail().sendKeys("xxx");
			fp.clicklink().click();
		}
		
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
		
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[2][3];
			data[0][0]="abc@gmail.com";
			data[0][1]="123456";
			data[0][2]="restricted";
			
			data[1][0]="abc1@gmail.com";
			data[1][1]="1234567";
			data[1][2]="nonrestricted";
			return data;	
			
			
		}
			
		}
		