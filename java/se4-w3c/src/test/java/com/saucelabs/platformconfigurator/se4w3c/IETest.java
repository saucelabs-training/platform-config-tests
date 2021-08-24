package com.saucelabs.platformconfigurator.se4w3c;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class IETest extends AbstractBaseTest {
    InternetExplorerOptions browserOptions = new InternetExplorerOptions();

    @DisplayName("Windows 10")
    @Test
    public void lateWin10() {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "11");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Windows 7")
    @Test
    public void lateWin7() {
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "11");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }


    @DisplayName("Early Windows 7")
    @Test
    public void earlyWin7() {
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "10");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }
}