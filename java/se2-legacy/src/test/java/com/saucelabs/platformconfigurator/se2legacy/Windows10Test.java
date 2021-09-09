package com.saucelabs.platformconfigurator.se2legacy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Windows10Test extends AbstractBaseTest {
    @DisplayName("Latest Chrome")
    @Test
    public void chromeLatest() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Chrome")
    @Test
    public void lateChrome() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "93");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Chrome")
    @Test
    public void earlyChrome() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "26");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Latest Edge")
    @Test
    public void latestEdge() {
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");
        
        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Edge")
    @Test
    public void lateEdge() {
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "92");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Edge")
    @Test
    public void earlyEdge() {
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "13");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("latest Firefox")
    @Test
    public void latestFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("late Firefox")
    @Test
    public void lateFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "91");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Firefox")
    @Test
    public void earlyFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "4");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("IE")
    @Test
    public void iE() {
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "11");

        startDriver(caps);
        validateGoogle();
    }
}
