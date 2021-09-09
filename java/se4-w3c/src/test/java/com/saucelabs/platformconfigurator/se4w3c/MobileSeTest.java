package com.saucelabs.platformconfigurator.se4w3c;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.MutableCapabilities;

public class MobileSeTest extends AbstractBaseTest {
    @Test
    public void latestAndroidLatestAppium() {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("sauce:options", sauceOptions);

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void latestAndroidEarliestAppium() {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("appiumVersion", "1.15.0");
        caps.setCapability("sauce:options", sauceOptions);

        startDriver(caps);
        validateGoogle();
    }

    // 6.0 earliest that works, but it's a product problem
    @Test
    public void earliestAndroidLatestAppium() {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("sauce:options", sauceOptions);

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void earliestAndroidEarliestAppium() {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Browser");
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("sauce:options", sauceOptions);

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void latestIOSLatestAppium() {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("appiumVersion", "1.21.0");
        caps.setCapability("sauce:options", sauceOptions);

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void earliestIOSEarliestAppium() {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");
        caps.setCapability("appium:deviceName", "iPhone 6s Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("sauce:options", sauceOptions);

        startDriver(caps);
        validateGoogle();
    }
}
