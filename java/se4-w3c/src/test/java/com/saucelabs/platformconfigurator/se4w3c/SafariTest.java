package com.saucelabs.platformconfigurator.se4w3c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class SafariTest extends AbstractBaseTest {
    SafariOptions browserOptions = new SafariOptions();

    @DisplayName("latest Yosemite")
    @Test
    public void latestYosemite() {
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Yosemite")
    @Test
    public void lateYosemite() {
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "8");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("latest Big Sur")
    @Test
    public void latestBigSur() {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Big Sur")
    @Test
    public void lateBigSur() {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "14");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }
}
