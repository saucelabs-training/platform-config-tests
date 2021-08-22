package com.saucelabs.platformconfigurator.se3legacy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxTest extends AbstractBaseTest {
    DesiredCapabilities caps = DesiredCapabilities.firefox();

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
        caps.setCapability("version", "91");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Windows 10")
    @Test
    public void earlyWin10() {
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "4");

        startDriver(caps);
        validateGoogle();
    }
    @DisplayName("Latest Windows 7")
    @Test
    public void firefoxLatestWin7() {
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Windows 7")
    @Test
    public void firefoxLateWin7() {
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "91");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Windows 7")
    @Test
    public void earlyWin7() {
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "4");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("latest Linux")
    @Test
    public void latestLinux() {
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("late Linux")
    @Test
    public void lateLinux() {
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Linux")
    @Test
    public void earlyLinux() {
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "4");

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
        caps.setCapability("version", "47");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Yosemite")
    @Test
    public void earlyYosemite() {
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "32");

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
        caps.setCapability("version", "91");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Big Sur")
    @Test
    public void earlyBigSur() {
        caps.setCapability("platform", "macOS 11.00");
        caps.setCapability("version", "60");

        startDriver(caps);
        validateGoogle();
    }
}
