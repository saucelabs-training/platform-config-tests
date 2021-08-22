package com.saucelabs.platformconfigurator.se3w3c;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.safari.SafariOptions;

public class SafariTest extends AbstractBaseTest {
    SafariOptions browserOptions = new SafariOptions();

    // Latest doesn't exist, but latest-1 does
    @DisplayName("latest Yosemite")
    @Test
    public void latestYosemite() {
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "latest-1");
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
