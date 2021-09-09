package com.saucelabs.platformconfigurator.se3lastw3c;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AbstractBaseTest {
    RemoteWebDriver driver;
    String username = System.getenv("SAUCE_USERNAME");
    String accessKey = System.getenv("SAUCE_ACCESS_KEY");
    String sauceUrl = "https://" + username + ":" + accessKey + "@ondemand.us-west-1.saucelabs.com/wd/hub";
    public static final String TIME = String.valueOf(System.currentTimeMillis());
    String buildName;
    String testName;

    @RegisterExtension
    public SauceTestWatcher watcher = new SauceTestWatcher();

    @BeforeEach
    public void setup(TestInfo testInfo) {
        this.testName = testInfo.getDisplayName();
        this.buildName = "Java Se3Last W3C - " + TIME;
    }

    public void startDriver(MutableCapabilities caps) {
        MutableCapabilities sauceOptions = (MutableCapabilities) caps.getCapability("sauce:options");

        sauceOptions.setCapability("username", username);
        sauceOptions.setCapability("accessKey", accessKey);
        sauceOptions.setCapability("name", testName);
        sauceOptions.setCapability("build", buildName);

        try {
            driver = new RemoteWebDriver(new URL(sauceUrl), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void validateGoogle() {
        driver.navigate().to("http://google.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("Google", driver.getTitle());
    }

    public class SauceTestWatcher implements TestWatcher {
        @Override
        public void testSuccessful(ExtensionContext context) {
            driver.executeScript("sauce:job-result=passed");
            driver.quit();
        }

        @Override
        public void testFailed(ExtensionContext context, Throwable cause) {
            driver.executeScript("sauce:job-result=failed");
            driver.quit();
        }
    }
}
