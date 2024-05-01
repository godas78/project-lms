package stepdefinitions;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
//import pages.RegisterPage;
import pages.LoginPage;
import utilities.HandleExceptions;
import utilities.Log;

public class HomeSD {

	TestContext testContext;
	
	HomePage homePage;
	//RegisterPage registerPage;
	  LoginPage logInPage;

	public HomeSD(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		//registerPage = testContext.getPageObjectManager().getRegistrationPage();
		logInPage = testContext.getPageObjectManager().getLoginPage();
	}

	@Given("user is on appUrl")
	public void user_is_on_appUrl() {
			Log.startTestCase();
			homePage.GoToHomePage();
		}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
			homePage.GoToHomePage();
		}

	@Then("appUrl Page Title should be \"LMS\"")
	public void appUrl_Page_Title_should_be_LMS() {
			homePage.VerifyHomePageURL();
		} 
	}

	
