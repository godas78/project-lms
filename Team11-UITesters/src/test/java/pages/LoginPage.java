package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import managers.FileReaderManager;
import utilities.Log;
import pages.HomePage;

public class LoginPage {

	String UserName;
	String Password;
	WebDriver driver;
	String appUrl;
		
	@FindBy(id="username") WebElement usernamebox;
	@FindBy(id="password") WebElement passwordbox;
	@FindBy(xpath = "//button[@id='login']") WebElement loginButton;
	@FindBy(xpath = "/html/body/app-root/app-program/div/mat-card/mat-card-title/div[1]/text()") WebElement loggedin;
		
	public LoginPage(WebDriver driver)
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
	public void enterUserName() {
		usernamebox.sendKeys("sdetorganizers@gmail.com");
	}
	public void enterPassword() {
		passwordbox.sendKeys("UIHackathon@02");
	}
	public void ClickOnSignIn() {
		loginButton.click();
	}
	public void getValidLoginMsg()
	{
		driver.getPageSource();
		Log.info("Verifies that user is logged in");
	}
	
}
