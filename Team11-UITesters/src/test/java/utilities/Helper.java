package utilities;

import org.openqa.selenium.WebDriver;

public class Helper {
 
	private static WebDriver driver;
	
		public void navigateBack() {
			
		driver.navigate().back();
		}

		public void navigateForward() {

		driver.navigate().forward();

		}
		public String getTitleOfThePage() 
		{
		return driver.getTitle();
		}
}
