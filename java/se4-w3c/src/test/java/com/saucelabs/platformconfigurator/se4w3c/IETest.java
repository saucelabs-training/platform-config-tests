package com.saucelabs.platformconfigurator.se4w3c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class IETest extends AbstractBaseTest {
    InternetExplorerOptions browserOptions = new InternetExplorerOptions();

    @DisplayName("Latest Windows 10")
    @Test
    public void latestWin10(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Windows 10")
    @Test
    public void lateWin10(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "11");
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
        browserOptions.setCapability("browserVersion", "11");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Windows 7")
    @Test
    public void earlyWin7(TestInfo testInfo) {
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "9");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(testInfo, browserOptions);
        validateGoogle();
    }

//    @BeforeEach
//    public void setName(TestInfo testInfo) {
//        sauceOptions.setCapability("iedriverVersion", "3.150.2");
//    }
}
