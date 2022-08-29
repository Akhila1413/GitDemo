package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	public WebDriver driver;
	By email=By.id("user_email");
	By sendme=By.cssSelector("[type='submit']");
	
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail() throws IOException
	{
		return driver.findElement(email);
	}
	public WebElement clicklink() throws IOException
	{
		return driver.findElement(email);
	}
	
}
