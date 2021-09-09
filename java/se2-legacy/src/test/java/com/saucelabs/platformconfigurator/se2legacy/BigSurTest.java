package com.saucelabs.platformconfigurator.se2legacy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BigSurTest extends AbstractBaseTest {
    @DisplayName("Latest Chrome")
    @Test
    public void chromeLatest() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Chrome")
    @Test
    public void lateChrome() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "93");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Chrome")
    @Test
    public void earlyChrome() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "69");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Latest Edge")
    @Test
    public void latestEdge() {
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Edge")
    @Test
    public void lateEdge() {
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "92");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Edge")
    @Test
    public void earlyEdge() {
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "79");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("latest Firefox")
    @Test
    public void latestFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("late Firefox")
    @Test
    public void lateFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "91");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Firefox")
    @Test
    public void earlyFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "60");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Safari")
    @Test
    public void safari() {
        DesiredCapabilities caps = DesiredCapabilities.safari();
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "14");

        startDriver(caps);
        validateGoogle();
    }
}
