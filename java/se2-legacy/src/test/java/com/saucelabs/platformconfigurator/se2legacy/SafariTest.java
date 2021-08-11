package com.saucelabs.platformconfigurator.se2legacy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SafariTest {
    RemoteWebDriver driver;
    String username = System.getenv("SAUCE_USERNAME");
    String accessKey = System.getenv("SAUCE_ACCESS_KEY");
    String sauceUrl = "https://" + username + ":" + accessKey + "@ondemand.us-west-1.saucelabs.com/wd/hub";
    DesiredCapabilities caps = DesiredCapabilities.safari();

    @DisplayName("latest Yosemite")
    @Test
    public void latestYosemite(TestInfo testInfo) {
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "latest");

        startDriver(testInfo, caps);
        validateGoogle();
    }

    @DisplayName("Yosemite")
    @Test
    public void lateYosemite(TestInfo testInfo) {
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "8");

        startDriver(testInfo, caps);
        validateGoogle();
    }

    @DisplayName("latest Big Sur")
    @Test
    public void latestBigSur(TestInfo testInfo) {
        caps.setCapability("platform", "OS X 11.00");
        caps.setCapability("version", "latest");

        startDriver(testInfo, caps);
        validateGoogle();
    }

    @DisplayName("Big Sur")
    @Test
    public void earlyBigSur(TestInfo testInfo) {
        caps.setCapability("platform", "OS X 11.00");
        caps.setCapability("version", "14");

        startDriver(testInfo, caps);
        validateGoogle();
    }

    public void startDriver(TestInfo testInfo, DesiredCapabilities caps) {
        caps.setCapability("name", testInfo.getDisplayName());

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

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
