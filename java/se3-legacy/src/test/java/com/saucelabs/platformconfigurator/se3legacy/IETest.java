package com.saucelabs.platformconfigurator.se3legacy;

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

    @DisplayName("Late Windows 10")
    @Test
    public void chromeLateWin10() {
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "11");

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
