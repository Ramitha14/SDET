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

public class Activity3_1 {
    AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "de0b1a55");
        caps.setCapability("platformName", "Android");
        caps.setCapability("noReset", true);
        // Use your own device's messaging app
        caps.setCapability("appPackage", "com.android.messaging");
        caps.setCapability("appActivity", ".ui.conversationlist.ConversationListActivity");

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void smsTest() {
        // Locate the button to write a new message and click it
        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Create New Message\")")).click();

        // Enter the number to send message to
        String contactBoxLocator = "resourceId(\"com.oneplus.mms:id/recipient_text_view\")";
        // Enter your own phone number
        driver.findElement(MobileBy.AndroidUIAutomator(contactBoxLocator)).sendKeys("1234567890");

        // Focus on the message text box
        String messageBoxLocator = "resourceId(\"com.oneplus.mms:id/compose_message_text\")";
        driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator)).click();

        // Type in a message
        messageBoxLocator = "resourceId(\"com.oneplus.mms:id/compose_message_text\")";
        MobileElement composeMessageInput = driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator));
        composeMessageInput.sendKeys("Hello from Appium");

        // Send the message
        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Send SMS\")")).click();

        // Wait for message to show
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("android:id/list")));

        // Assertion
        String messageLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/message_text_view\")";
        String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator(messageLocator)).getText();
        Assert.assertEquals(sentMessageText, "Hello from Appium");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
