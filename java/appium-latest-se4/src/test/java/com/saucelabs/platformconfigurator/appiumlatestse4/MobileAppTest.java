package com.saucelabs.platformconfigurator.appiumlatestse4;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class MobileAppTest extends AbstractBaseTest {
    String ios = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip";
    String android = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";
    AppiumDriver<WebElement> driver;

    @Test
    public void latestAndroidLatestAppium() {
        caps.setCapability("sauce:appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp(driver);
    }

    @Test
    public void latestAndroidEarliestAppium() {
        caps.setCapability("sauce:appiumVersion", "1.15.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp(driver);
    }

    @Test
    public void earliestAndroidLatestAppium() {
        caps.setCapability("sauce:appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp(driver);
    }

    @Test
    public void earliestAndroidLatestAppiumActual() {
        caps.setCapability("sauce:appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "6.0");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp(driver);
    }

    @Test
    public void earliestAndroidEarliestAppium() {
        caps.setCapability("sauce:appiumVersion", "1.15.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp(driver);
    }

    @Test
    public void earliestAndroidEarliestAppiumActual() {
        caps.setCapability("sauce:appiumVersion", "1.15.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "6.0");
        caps.setCapability("platformName","Android");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", android);

        driver = startAndroidDriver(caps);
        validateApp(driver);
    }

    @Test
    public void latestIOS() {
        caps.setCapability("sauce:appiumVersion", "1.20.1");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", ios);

        driver = startIOSDriver(caps);
        validateApp(driver);
    }

    @Test
    public void earliestIOS() {
        caps.setCapability("sauce:appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "");
        caps.setCapability("appium:app", ios);

        driver = startIOSDriver(caps);
        validateApp(driver);
    }
}
