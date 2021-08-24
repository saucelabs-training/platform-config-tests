package com.saucelabs.platformconfigurator.se4w3c;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxTest extends AbstractBaseTest {
    FirefoxOptions browserOptions = new FirefoxOptions();

    @DisplayName("Latest Windows 10")
    @Test
    public void latestWin10() {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Windows 10")
    @Test
    public void lateWin10() {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "91");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    // Incompatible geckodriver
    @DisplayName("Early Windows 10")
    @Test
    public void earlyWin10() {
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "60");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Latest Windows 7")
    @Test
    public void latestWin7() {
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Windows 7")
    @Test
    public void lateWin7() {
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "91");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    // Incompatible geckodriver
    @DisplayName("Early Windows 7")
    @Test
    public void earlyWin7() {
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "60");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("latest Big Sur")
    @Test
    public void latestBigSur() {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("late Big Sur")
    @Test
    public void lateBigSur() {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "91");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    // Incompatible geckodriver
    @DisplayName("early Big Sur")
    @Test
    public void earlyBigSur() {
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "60");
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }
}
