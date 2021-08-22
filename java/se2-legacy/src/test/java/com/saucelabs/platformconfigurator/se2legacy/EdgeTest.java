package com.saucelabs.platformconfigurator.se2legacy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EdgeTest extends AbstractBaseTest {
    DesiredCapabilities caps = DesiredCapabilities.edge();

    @BeforeEach
    public void setup(TestInfo testInfo) {
        caps.setCapability("name", testInfo.getDisplayName());
    }

    @DisplayName("Latest Windows 10")
    @Test
    public void latestWin10() {
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Windows 10")
    @Test
    public void lateWin10() {
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "92");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Windows 10")
    @Test
    public void earlyWin10() {
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "13");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("latest Yosemite")
    @Test
    public void latestYosemite() {
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("late Yosemite")
    @Test
    public void lateYosemite() {
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "81");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Yosemite")
    @Test
    public void earlyYosemite() {
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "79");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("latest Big Sur")
    @Test
    public void latestBigSur() {
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("late Big Sur")
    @Test
    public void lateBigSur() {
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "92");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Big Sur")
    @Test
    public void earlyBigSur() {
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "79");

        startDriver(caps);
        validateGoogle();
    }
}
