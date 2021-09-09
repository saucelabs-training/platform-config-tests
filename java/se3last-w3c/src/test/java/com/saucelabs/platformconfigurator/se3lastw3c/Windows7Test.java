package com.saucelabs.platformconfigurator.se3lastw3c;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Windows7Test extends AbstractBaseTest {
    @DisplayName("Latest Chrome")
    @Test
    public void latestChrome() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "latest");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Chrome")
    @Test
    public void lateChrome() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "93");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Chrome")
    @Test
    public void earlyChrome() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "75");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }
    @DisplayName("latest Firefox")
    @Test
    public void latestFirefox() {
        FirefoxOptions browserOptions = new FirefoxOptions();
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "latest");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("late Firefox")
    @Test
    public void lateFirefox() {
        FirefoxOptions browserOptions = new FirefoxOptions();
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "91");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("early Firefox")
    @Test
    public void earlyFirefox() {
        FirefoxOptions browserOptions = new FirefoxOptions();
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "60");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Late IE")
    @Test
    public void lateIE() {
        InternetExplorerOptions browserOptions = new InternetExplorerOptions();
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "11");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Early IE")
    @Test
    public void earlyIE() {
        InternetExplorerOptions browserOptions = new InternetExplorerOptions();
        browserOptions.setCapability("platformName", "Windows 7");
        browserOptions.setCapability("browserVersion", "10");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }
}
