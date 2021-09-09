package com.saucelabs.platformconfigurator.appiumlatestse4;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AbstractBaseTest {
    String username = System.getenv("SAUCE_USERNAME");
    String accessKey = System.getenv("SAUCE_ACCESS_KEY");
    String sauceUrl = "https://ondemand.us-west-1.saucelabs.com/wd/hub";
    public static final String TIME = String.valueOf(System.currentTimeMillis());
    String testName;
    String buildName;
    RemoteWebDriver driver;

    @RegisterExtension
    public SauceTestWatcher watcher = new SauceTestWatcher();

    @BeforeEach
    public void setName(TestInfo testInfo) {
        testName = testInfo.getDisplayName();
        buildName = "Java Appium Se4 - " + TIME;
    }

    public void setCapabilities(MutableCapabilities caps) {
        MutableCapabilities sauceOptions = (MutableCapabilities) caps.getCapability("sauce:options");

        sauceOptions.setCapability("username", username);
        sauceOptions.setCapability("accessKey", accessKey);
        sauceOptions.setCapability("name", testName);
        sauceOptions.setCapability("build", buildName);
    }

    public AndroidDriver<WebElement> startAndroidDriver(MutableCapabilities caps) {
        setCapabilities(caps);
        caps.setCapability("appium:appWaitActivity", "com.swaglabsmobileapp.MainActivity");

        try {
            return new AndroidDriver<>(new URL(sauceUrl), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public IOSDriver<WebElement> startIOSDriver(MutableCapabilities caps) {
        setCapabilities(caps);
        try {
            return new IOSDriver<>(new URL(sauceUrl), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void validateApp(AppiumDriver<WebElement> driver) {
        int found = driver.findElements(MobileBy.AccessibilityId("test-Username")).size();

        assertTrue(found > 0);
    }

    public void validateGoogle(AppiumDriver<WebElement> driver) {
        driver.get("http://google.com");

        assertEquals("Google", driver.getTitle());
    }

    public class SauceTestWatcher implements TestWatcher {
        @Override
        public void testSuccessful(ExtensionContext context) {
            driver.executeScript("sauce:job-result=passed");
            driver.quit();
        }

        @Override
        public void testFailed(ExtensionContext context, Throwable cause) {
            driver.executeScript("sauce:job-result=failed");
            driver.quit();
        }
    }
}
