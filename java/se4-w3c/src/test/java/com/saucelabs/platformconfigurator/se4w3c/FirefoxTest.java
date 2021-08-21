package com.saucelabs.platformconfigurator.se4w3c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxTest extends AbstractBaseTest {
    FirefoxOptions browserOptions = new FirefoxOptions();

    @DisplayName("Latest Windows 10")
    @Test
    public void latestWin10(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Windows 10")
    @Test
    public void lateWin10(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "90");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Windows 10")
    @Test
    public void earlyWin10(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "4");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Latest Windows 7")
    @Test
    public void latestWin7(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Windows 7")
    @Test
    public void lateWin7(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "90");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Windows 7")
    @Test
    public void earlyWin7(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "4");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("latest Yosemite")
    @Test
    public void latestYosemite(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("late Yosemite")
    @Test
    public void lateYosemite(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "47");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("early Yosemite")
    @Test
    public void earlyYosemite(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "32");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("latest Big Sur")
    @Test
    public void latestBigSur(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("late Big Sur")
    @Test
    public void lateBigSur(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "90");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("early Big Sur")
    @Test
    public void earlyBigSur(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "60");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }
}
