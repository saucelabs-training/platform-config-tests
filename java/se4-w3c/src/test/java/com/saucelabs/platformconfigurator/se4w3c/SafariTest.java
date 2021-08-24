package com.saucelabs.platformconfigurator.se4w3c;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.safari.SafariOptions;

public class SafariTest extends AbstractBaseTest {
    SafariOptions browserOptions = new SafariOptions();

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
