package com.saucelabs.platformconfigurator.se3lastw3c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest {
    RemoteWebDriver driver;
    String username = System.getenv("SAUCE_USERNAME");
    String accessKey = System.getenv("SAUCE_ACCESS_KEY");
    String sauceUrl = "https://" + username + ":" + accessKey + "@ondemand.us-west-1.saucelabs.com/wd/hub";
    MutableCapabilities sauceOptions = new MutableCapabilities();
    ChromeOptions browserOptions = new ChromeOptions();

    @DisplayName("Latest Windows 10")
    @Test
    public void latestWin10(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Windows 10")
    @Test
    public void lateWin10(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "92");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Windows 10")
    @Test
    public void earlyWin10(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "26");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Latest Windows 7")
    @Test
    public void latestWin7(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Windows 7")
    @Test
    public void lateWin7(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "92");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Windows 7")
    @Test
    public void earlyWin7(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "26");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("latest Yosemite")
    @Test
    public void latestYosemite(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("late Yosemite")
    @Test
    public void lateYosemite(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "87");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("early Yosemite")
    @Test
    public void earlyYosemite(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "37");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("latest Big Sur")
    @Test
    public void latestBigSur(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("late Big Sur")
    @Test
    public void lateBigSur(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "92");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("early Big Sur")
    @Test
    public void earlyBigSur(TestInfo testInfo) {
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "69");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }
    
    @BeforeEach
    public void setName(TestInfo testInfo) {
        sauceOptions.setCapability("name", testInfo.getDisplayName());
    }

    public void startDriver(TestInfo testInfo, MutableCapabilities caps) {
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
