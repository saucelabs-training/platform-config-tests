package com.saucelabs.platformconfigurator.se3lastw3c;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.safari.SafariOptions;

public class SafariTest extends AbstractBaseTest {
    SafariOptions browserOptions = new SafariOptions();

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
