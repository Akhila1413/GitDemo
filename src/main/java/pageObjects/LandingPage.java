package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LandingPage {

	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By Feature=By.cssSelector(".text-center>h2");
	By navbar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");

	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public LoginPage getLogin() throws IOException
	{
		driver.findElement(signin).click();
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	public WebElement getFeature()
	{
		 return driver.findElement(Feature);
	}
	public WebElement getNavigation()
	{
		return driver.findElement(navbar);
	}

}

