package com.saucelabs.platformconfigurator.se2legacy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IETest extends AbstractBaseTest{
    DesiredCapabilities caps = DesiredCapabilities.internetExplorer();

    @BeforeEach
    public void setup(TestInfo testInfo) {
        caps.setCapability("name", testInfo.getDisplayName());
    }

    // "latest" isn't currently displayed, but "latest-1" is
    @DisplayName("Latest Windows 10")
    @Test
    public void chromeLatestWin10() {
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest-1");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Windows 10")
    @Test
    public void chromeLateWin10() {
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "11");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Latest Windows 7")
    @Test
    public void chromeLatestWin7() {
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "latest");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Late Windows 7")
    @Test
    public void chromeLateWin7() {
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "11");

        startDriver(caps);
        validateGoogle();
    }

    @DisplayName("Early Windows 7")
    @Test
    public void earlyWin7() {
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "9");

        startDriver(caps);
        validateGoogle();
    }
}
