package com.saucelabs.platformconfigurator.se2legacy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeTest extends AbstractBaseTest {
    DesiredCapabilities caps = DesiredCapabilities.chrome();

    @BeforeEach
    public void setup(TestInfo testInfo) {
        caps.setCapability("name", testInfo.getDisplayName());
        caps.setCapability("build", "Java Se2 Legacy - " + TIME);
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
        caps.setCapability("version", "26");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Latest Windows 7")
    @Test
    public void latestWin7() {
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Windows 7")
    @Test
    public void lateWin7() {
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "92");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Windows 7")
    @Test
    public void earlyWin7() {
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "26");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("late Linux")
    @Test
    public void lateLinux() {
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "48");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Linux")
    @Test
    public void earlyLinux() {
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "26");

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
        caps.setCapability("version", "87");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("early Yosemite")
    @Test
    public void earlyYosemite() {
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "37");

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
        caps.setCapability("version", "69");

        startDriver(caps);
        validateGoogle();
    }
}
