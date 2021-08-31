package com.saucelabs.platformconfigurator.se3lastw3c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileSeTest {
    MutableCapabilities caps = new MutableCapabilities();
    MutableCapabilities sauceOptions = new MutableCapabilities();
    RemoteWebDriver driver;
    String username = System.getenv("SAUCE_USERNAME");
    String accessKey = System.getenv("SAUCE_ACCESS_KEY");
    String sauceUrl = "https://" + username + ":" + accessKey + "@ondemand.us-west-1.saucelabs.com/wd/hub";
    public static final String TIME = String.valueOf(System.currentTimeMillis());

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
        sauceOptions.setCapability("name", testInfo.getDisplayName());
        sauceOptions.setCapability("build", "Java Se3Last W3C Mobile - " + TIME);
    }

    @AfterEach
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void latestAndroidLatestAppium() {
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void latestAndroidEarliestAppium() {
        sauceOptions.setCapability("appiumVersion", "1.15.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");

        startDriver(caps);
        validateGoogle();
    }

    // 6.0 earliest that works, but it's a product problem
    @Test
    public void earliestAndroidLatestAppium() {
        sauceOptions.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Browser");

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void earliestAndroidEarliestAppium() {
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "5.1");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Browser");

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void latestIOS() {
        sauceOptions.setCapability("appiumVersion", "1.21.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "14.5");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        startDriver(caps);
        validateGoogle();
    }

    @Test
    public void earliestIOS() {
        sauceOptions.setCapability("appiumVersion", "1.8.0");
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "10.3");
        caps.setCapability("sauce:options", sauceOptions);
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");

        startDriver(caps);
        validateGoogle();
    }
}
