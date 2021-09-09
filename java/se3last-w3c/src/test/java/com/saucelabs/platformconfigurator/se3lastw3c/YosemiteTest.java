package com.saucelabs.platformconfigurator.se3lastw3c;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class YosemiteTest extends AbstractBaseTest {
    @DisplayName("Late Chrome")
    @Test
    public void lateChrome() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "87");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Chrome")
    @Test
    public void earlyChrome() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "75");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Late Edge")
    @Test
    public void lateEdge() {
        EdgeOptions browserOptions = new EdgeOptions();
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "81");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }

    @DisplayName("Early Edge")
    @Test
    public void earlyEdge() {
        EdgeOptions browserOptions = new EdgeOptions();
        browserOptions.setCapability("platformName", "OS X 10.10");
        browserOptions.setCapability("browserVersion", "79");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        browserOptions.setCapability("sauce:options", sauceOptions);

        startDriver(browserOptions);
        validateGoogle();
    }
}
