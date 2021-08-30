package com.saucelabs.platformconfigurator.appiumlatestse4;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class MobileBrowserTest extends AbstractBaseTest {
    String ios = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip";
    String android = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";

    @Test
    public void latestAndroidLatestAppiumBrowser() {
        caps.setCapability("sauce:appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "Chrome");

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestAndroidEarliestAppiumBrowser() {
        caps.setCapability("sauce:appiumVersion", "1.15.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "Chrome");

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidLatestAppiumBrowser() {
        caps.setCapability("sauce:appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "Browser");

        driver = startAndroidDriver(caps);
        validateApp((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidEarliestAppiumBrowser() {
        caps.setCapability("sauce:appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "Browser");

        driver = startAndroidDriver(caps);
        validateGoogle((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestIOSBrowser() {
        caps.setCapability("sauce:appiumVersion", "1.20.1");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        driver = startIOSDriver(caps);
        validateGoogle((IOSDriver<WebElement>) driver);
    }

    @Test
    public void earliestIOSBrowser() {
        caps.setCapability("sauce:appiumVersion", "1.9.1");
        caps.setCapability("appium:deviceName", "iPhone 6s Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        driver = startIOSDriver(caps);
        validateGoogle((IOSDriver<WebElement>) driver);
    }
}
