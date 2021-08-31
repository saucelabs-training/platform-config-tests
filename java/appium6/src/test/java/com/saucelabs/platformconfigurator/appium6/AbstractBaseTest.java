package com.saucelabs.platformconfigurator.appium6;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.fail;
public class AbstractBaseTest {
    String username = System.getenv("SAUCE_USERNAME");
    String accessKey = System.getenv("SAUCE_ACCESS_KEY");
    String sauceUrl = "https://" + username + ":" + accessKey + "@ondemand.us-west-1.saucelabs.com/wd/hub";
    public static final String TIME = String.valueOf(System.currentTimeMillis());
    MutableCapabilities caps = new MutableCapabilities();
    MutableCapabilities sauceOptions = new MutableCapabilities();
    RemoteWebDriver driver;

    @BeforeEach
    public void setName(TestInfo testInfo) {
        sauceOptions.setCapability("name", testInfo.getDisplayName());
        sauceOptions.setCapability("build", "Java Early Appium - " + TIME);
    }

    @AfterEach
    public void quit() {
        driver.quit();
    }

    public AndroidDriver<WebElement> startAndroidDriver(MutableCapabilities caps) {
        caps.setCapability("appium:appWaitActivity", "com.swaglabsmobileapp.MainActivity");
        try {
            return new AndroidDriver<>(new URL(sauceUrl), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public IOSDriver<WebElement> startIOSDriver(MutableCapabilities caps) {
        try {
            return new IOSDriver<>(new URL(sauceUrl), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void validateApp(AppiumDriver<WebElement> driver) {
        int found = driver.findElements(MobileBy.AccessibilityId("test-Username")).size();

        if (found > 0) {
            driver.executeScript("sauce:job-result=passed");
        } else {
            driver.executeScript("sauce:job-result=failed");
            fail("Unable to find element");
        }
    }

    public void validateGoogle(AppiumDriver<WebElement> driver) {
        driver.get("http://google.com");

        if (driver.getTitle().equals("Google")) {
            driver.executeScript("sauce:job-result=passed");
        } else {
            driver.executeScript("sauce:job-result=failed");
            fail("Unable to navigate");
        }
    }
}
