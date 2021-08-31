package com.saucelabs.platformconfigurator.appiumlatestse3;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class MobileBrowserTest extends AbstractBaseTest {

    @Test
    public void latestAndroidLatestAppiumBrowser() {
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestAndroidEarliestAppiumBrowser() {
        sauceOptions.setCapability("appiumVersion", "1.15.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidLatestAppiumBrowser() {
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Browser");

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidEarliestAppiumBrowser() {
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Browser");

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestIOSBrowser() {
        sauceOptions.setCapability("appiumVersion", "1.21.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        driver = startIOSDriver(caps);
        validateGoogle((IOSDriver<WebElement>) driver);
    }

    @Test
    public void earliestIOSBrowser() {
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        driver = startIOSDriver(caps);
        validateGoogle((IOSDriver<WebElement>) driver);
    }
}
