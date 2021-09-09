package com.saucelabs.platformconfigurator.se2legacy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Windows7Test extends AbstractBaseTest {
    @DisplayName("Latest Chrome")
    @Test
    public void chromeLatest() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Chrome")
    @Test
    public void lateChrome() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "93");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Chrome")
    @Test
    public void earlyChrome() {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "26");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("latest Firefox")
    @Test
    public void latestFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("late Firefox")
    @Test
    public void lateFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "91");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Firefox")
    @Test
    public void earlyFirefox() {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "4");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late IE")
    @Test
    public void lateIE() {
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "11");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early IE")
    @Test
    public void earlyIE() {
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "9");

        startDriver(caps);
        validateGoogle();
    }
}
