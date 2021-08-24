package com.saucelabs.platformconfigurator.se3legacy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SafariTest extends AbstractBaseTest{
    DesiredCapabilities caps = DesiredCapabilities.safari();

    @BeforeEach
    public void setup(TestInfo testInfo) {
        caps.setCapability("name", testInfo.getDisplayName());
    }

    @DisplayName("Yosemite")
    @Test
    public void lateYosemite() {
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "8");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Big Sur")
    @Test
    public void earlyBigSur() {
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "14");

        startDriver(caps);
        validateGoogle();
    }
}
