package com.saucelabs.platformconfigurator.se3w3c;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeTest extends AbstractBaseTest {
    EdgeOptions browserOptions = new EdgeOptions();

    @DisplayName("Latest Windows 10")
    @Test
    public void latestWin10() {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Windows 10")
    @Test
    public void lateWin10() {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "92");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Windows 10")
    @Test
    public void earlyWin10() {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "79");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("late Yosemite")
    @Test
    public void lateYosemite() {
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "81");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("early Yosemite")
    @Test
    public void earlyYosemite() {
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "79");
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

    @DisplayName("late Big Sur")
    @Test
    public void lateBigSur() {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "92");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("early Big Sur")
    @Test
    public void earlyBigSur() {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "79");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }
}
