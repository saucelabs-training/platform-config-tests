package com.saucelabs.platformconfigurator.se3legacy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class YosemiteTest extends AbstractBaseTest {
    @DisplayName("Late Chrome")
    @Test
    public void lateChrome() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "87");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Chrome")
    @Test
    public void earlyChrome() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "37");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Edge")
    @Test
    public void lateEdge() {
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "81");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Edge")
    @Test
    public void earlyEdge() {
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "79");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("late Firefox")
    @Test
    public void lateFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "47");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Firefox")
    @Test
    public void earlyFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "32");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Safari")
    @Test
    public void Safari() {
        DesiredCapabilities caps = DesiredCapabilities.safari();
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "8");

        startDriver(caps);
        validateGoogle();
    }
}
