package Appium_Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class Activity2_3 {
  
	    AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;

	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "de0b1a55");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.android.dialer");
	        caps.setCapability("appActivity", ".activities.Activity2_3");
	        caps.setCapability("noReset", true);

	        // Instantiate  Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 5);
	    }

	    @Test
	    public void addContact() {
	        // Click on add new contact floating button
	        driver.findElementByAccessibilityId("com.android.dialer:id/menu_add_contact").click();
	        
	        // Find the first name, last name, and phone number fields
	        MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='First name']");
	        MobileElement lastName = driver.findElementByXPath("//android.widget.EditText[@text='Surname']");
	        MobileElement phoneNumber = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");
	        
	        // Enter the text in the fields
	        firstName.sendKeys("Surya");
	        lastName.sendKeys("Maara");
	        phoneNumber.sendKeys("9991284782");
	        
	        // Save the contact
	        driver.findElementById("com.android.contacts:id/menu_save").click();
	        
	        // Wait for contact card to appear
	        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.android.contacts:id/card_container")));

	        // Assertion
	        MobileElement mobileCard = driver.findElementById("com.android.contacts:id/card_container");
	        Assert.assertTrue(mobileCard.isDisplayed());
	        
	        String contactName = driver.findElementById("com.android.contacts:id/large_title").getText();
	        Assert.assertEquals(contactName, "Surya Maara");
	    }

	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
	}

