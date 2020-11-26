package CRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity1 {

	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://alchemy.hguy.co/crm");
	 
	  String title = driver.getTitle();
	 
	Assert.assertEquals(title, "SuiteCRM");
		
	if (title.matches("SuiteCRM") ) {
		driver.close();
		}
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	 
	   driver = new FirefoxDriver();
	 
  }
  @AfterMethod
  public void afterMethod() {
	
  }
}

