package selenium_session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			
		//Open the browser
		driver.get("https://www.training-support.net");
			
		//Close the browser
		driver.close();
	    
	}

}
