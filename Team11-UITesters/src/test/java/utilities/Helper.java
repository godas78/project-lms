package utilities;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		WebDriver chromedriver;
		/*public void acceptAlert {
			  
			  
			Alert alert = chromedriver.switchTo().alert();
			        String alertMessage= chromedriver.switchTo().alert().getText(); 
			        System.out.println(alertMessage); 
			        alert.accept();
			  }

			public void dismissAlert {
			  
			  Alert alert = chromedriver.switchTo().alert();
			        String alertMessage= chromedriver.switchTo().alert().getText(); 
			        System.out.println(alertMessage); 
			        alert.dismiss();
			  }

			public void ValidateAlertText{
			Alert alert = chromedriver.switchTo().alert();
			        String alertMessage= chromedriver.switchTo().alert().getText(); 
			        System.out.println(alertMessage); 
			  }

		}		*/	  
						
		}


