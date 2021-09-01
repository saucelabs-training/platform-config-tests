package com.saucelabs.platformconfigurator.appiumlatestse4;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class MobileBrowserTest extends AbstractBaseTest {

    @Test
    public void latestAndroidLatestAppiumBrowser() {
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("appium:deviceName", "Google Pixel 3a GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestAndroidEarliestAppiumBrowser() {
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("appium:deviceName", "Google Pixel 3a GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        sauceOptions.setCapability("appiumVersion", "1.15.0");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidLatestAppiumBrowser() {
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Browser");
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidEarliestAppiumBrowser() {
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Browser");
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestIOSBrowser() {
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        sauceOptions.setCapability("appiumVersion", "1.20.1");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startIOSDriver(caps);
        validateGoogle((IOSDriver<WebElement>) driver);
    }

    @Test
    public void earliestIOSBrowser() {
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startIOSDriver(caps);
        validateGoogle((IOSDriver<WebElement>) driver);
    }
}
