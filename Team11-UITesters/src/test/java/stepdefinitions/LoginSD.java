package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import readers.ConfigFileReader;
import pages.HomePage;
///import pages.RegisterPage;
import pages.LoginPage;
import utilities.HandleExceptions;
import utilities.Log;

public class LoginSD {
	//private static String title;
	TestContext testContext;
	String UserName;
	String Password;
	HomePage homePage;
	LoginPage logInPage;		
		
	public LoginSD(TestContext context)
	{
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		logInPage = testContext.getPageObjectManager().getLoginPage();
	}	
	@Given("Navigate to appUrl")
	public void navigate_to_app_url() {
		Log.startTestCase();
		homePage.GoToHomePage();
	}

	@When("The user enter valid credentials")
	public void the_user_enter_valid_credentials() {
		
		logInPage.enterUserName();
		logInPage.enterPassword();
		
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		logInPage.ClickOnSignIn();;
	}

	@Then("user is on Manage Program page")
	public void user_is_on_manage_program_page() {
		Log.info("User is logged on success");
	}

}