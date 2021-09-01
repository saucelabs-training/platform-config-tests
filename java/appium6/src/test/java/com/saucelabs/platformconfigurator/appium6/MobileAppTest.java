package com.saucelabs.platformconfigurator.appium6;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class MobileAppTest extends AbstractBaseTest {
    String ios = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip";
    String android = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";

    @Test
    public void latestAndroidLatestAppium() {
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:app", android);
        caps.setCapability("appium:deviceName", "Google Pixel 3a GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startAndroidDriver(caps);
        validateApp((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestAndroidEarliestAppium() {
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:app", android);
        caps.setCapability("appium:deviceName", "Google Pixel 3a GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        sauceOptions.setCapability("appiumVersion", "1.15.0");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startAndroidDriver(caps);
        validateApp((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidLatestAppium() {
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:app", android);
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startAndroidDriver(caps);
        validateApp((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidEarliestAppium() {
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:app", android);
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startAndroidDriver(caps);
        validateApp((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestIOS() {
        caps.setCapability("platformName", "iOS");
        caps.setCapability("appium:app", ios);
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        sauceOptions.setCapability("appiumVersion", "1.20.1");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startIOSDriver(caps);
        validateApp((IOSDriver<WebElement>) driver);
    }

    @Test
    @Disabled("10.3 does not want to load app and this test takes forever to fail")
    public void earliestIOSStated() {
        caps.setCapability("platformName", "iOS");
        caps.setCapability("appium:app", ios);
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startIOSDriver(caps);
        validateApp((IOSDriver<WebElement>) driver);
    }

    @Test
    public void earliestIOSActual() {
        caps.setCapability("platformName", "iOS");
        caps.setCapability("appium:app", ios);
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "11.0");
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("sauce:options", sauceOptions);

        driver = startIOSDriver(caps);
        validateApp((IOSDriver<WebElement>) driver);
    }
}
