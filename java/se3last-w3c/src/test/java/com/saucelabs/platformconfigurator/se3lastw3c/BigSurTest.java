package com.saucelabs.platformconfigurator.se3lastw3c;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariOptions;

public class BigSurTest extends AbstractBaseTest {
    @DisplayName("Latest Chrome")
    @Test
    public void latestChrome() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "macOS 11.00");
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
        browserOptions.setCapability("platformName", "macOS 11.00");
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
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "75");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Latest Edge")
    @Test
    public void latestEdge() {
        EdgeOptions browserOptions = new EdgeOptions();
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "latest");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Edge")
    @Test
    public void lateEdge() {
        EdgeOptions browserOptions = new EdgeOptions();
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "92");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Edge")
    @Test
    public void earlyEdge() {
        EdgeOptions browserOptions = new EdgeOptions();
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "79");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("latest Firefox")
    @Test
    public void latestFirefox() {
        FirefoxOptions browserOptions = new FirefoxOptions();
        browserOptions.setCapability("platformName", "macOS 11.00");
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
        browserOptions.setCapability("platformName", "macOS 11.00");
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
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "60");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Safari")
    @Test
    public void safari() {
        SafariOptions browserOptions = new SafariOptions();
        browserOptions.setCapability("platformName", "macOS 11.00");
        browserOptions.setCapability("browserVersion", "14");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }
}
