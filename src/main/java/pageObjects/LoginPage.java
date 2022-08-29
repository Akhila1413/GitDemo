package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	

	public WebDriver driver;
	By email=By.id("user_email");
	By password=By.id("user_password");
	By submit=By.cssSelector("[value='Log In']");
	By forgotpswd=By.cssSelector("[href*=password/new]");

	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getEmail() throws IOException
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword() throws IOException
	{
		return driver.findElement(password);
	}
	
	public WebElement getButton() throws IOException
	{
		return driver.findElement(submit);
	}
	
	public ForgotPassword forgotpassword()
	{
		driver.findElement(forgotpswd).click();
		return new ForgotPassword(driver);
	}

}
