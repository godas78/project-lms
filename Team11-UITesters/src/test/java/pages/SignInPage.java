package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import managers.FileReaderManager;
import utilities.Log;

public class SignInPage {

	WebDriver driver;
	String appUrl;
		
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(xpath = "//button[@id='login']") WebElement loginButton;
		
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//To get Log in URL
	public void appUrl() {
		driver.get(appUrl);
	}
	
	public String HomePage_Title() {
		return driver.getTitle();
	}
	public void login_button() {
		loginButton.click();
	}

}
