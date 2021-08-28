package com.saucelabs.platformconfigurator.se4w3c;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileSeTest {
    MutableCapabilities caps = new MutableCapabilities();
    RemoteWebDriver driver;
    String username = System.getenv("SAUCE_USERNAME");
    String accessKey = System.getenv("SAUCE_ACCESS_KEY");
    String sauceUrl = "https://" + username + ":" + accessKey + "@ondemand.us-west-1.saucelabs.com/wd/hub";

    public void startDriver(MutableCapabilities caps) {
        try {
            driver = new RemoteWebDriver(new URL(sauceUrl), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void validateGoogle() {
        driver.navigate().to("http://google.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (driver.getTitle().equals("Google")) {
            driver.executeScript("sauce:job-result=passed");
        } else {
            driver.executeScript("sauce:job-result=failed");
        }
    }

    @BeforeEach
    public void setName(TestInfo testInfo) {
        caps.setCapability("sauce:name", testInfo.getDisplayName());
        // caps.setCapability("sauce:seleniumVersion", "4.0.0-rc");
    }

    @Test
    public void latestAndroidLatestAppium() {
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("sauce:appiumVersion", "1.20.2");

        startDriver(caps);
        validateGoogle();
    }

    // Actual Earliest is 1.15
    @Test
    public void latestAndroidEarliestAppium() {
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("sauce:appiumVersion", "1.8.0");

        startDriver(caps);
        validateGoogle();
    }

    // 6.0 earliest that works, but it's a product problem
    @Test
    public void earliestAndroidLatestAppium() {
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("sauce:appiumVersion", "1.20.2");

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void earliestAndroidEarliestAppium() {
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:platformVersion", "6.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("sauce:appiumVersion", "1.8.0");

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void latestIOSLatestAppium() {
        caps.setCapability("sauce:appiumVersion", "1.20.1");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void latestIOSEarliestAppium() {
        caps.setCapability("sauce:appiumVersion", "1.20.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void earliestIOSLatestAppium() {
        caps.setCapability("sauce:appiumVersion", "1.9.1");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void earliestIOSEarliestAppium() {
        caps.setCapability("sauce:appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        startDriver(caps);
        validateGoogle();
    }
}
