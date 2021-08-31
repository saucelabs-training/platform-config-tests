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
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestAndroidEarliestAppium() {
        sauceOptions.setCapability("appiumVersion", "1.15.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidLatestAppium() {
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void earliestAndroidEarliestAppium() {
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp((AndroidDriver<WebElement>) driver);
    }

    @Test
    public void latestIOS() {
        sauceOptions.setCapability("appiumVersion", "1.21.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", ios);

        driver = startIOSDriver(caps);
        validateApp((IOSDriver<WebElement>) driver);
    }

    @Test
    @Disabled("10.3 does not want to load app and this test takes forever to fail")
    public void earliestIOSStated() {
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", ios);

        driver = startIOSDriver(caps);
        validateApp((IOSDriver<WebElement>) driver);
    }

    @Test
    public void earliestIOSActual() {
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", ios);

        driver = startIOSDriver(caps);
        validateApp((IOSDriver<WebElement>) driver);
    }
}
