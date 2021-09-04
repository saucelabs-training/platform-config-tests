using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Remote;

namespace Se3Legacy
{
    [TestClass]
    public class IOSTest : TestBase
    {
        private string app = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip";

        [TestMethod]
        public void LatestAppiumSelenium()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "iOS");
            caps.SetCapability("browserName", "Safari");
            caps.SetCapability("appium:deviceName", "iPhone Simulator");
            caps.SetCapability("appium:platformVersion", "14.5");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.1");
            caps.SetCapability("sauce:options", sauceOptions);

            StartMobileDriver(caps);
            ValidateGoogle();
        }
        
        [TestMethod]
        public void LatestAppiumBrowser()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "iOS");
            caps.SetCapability("browserName", "Safari");
            caps.SetCapability("appium:deviceName", "iPhone Simulator");
            caps.SetCapability("appium:platformVersion", "14.5");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.1");
            caps.SetCapability("sauce:options", sauceOptions);

            StartAppiumDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestAppiumApp()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "iOS");
            caps.SetCapability("app", app);
            caps.SetCapability("appium:deviceName", "iPhone Simulator");
            caps.SetCapability("appium:platformVersion", "14.5");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.1");
            caps.SetCapability("sauce:options", sauceOptions);

            StartAppiumDriver(caps);
            ValidateApp();
        }

        [TestMethod]
        public void EarliestAppiumSelenium()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "iOS");
            caps.SetCapability("browserName", "Safari");
            caps.SetCapability("appium:deviceName", "iPhone Simulator");
            caps.SetCapability("appium:platformVersion", "10.3");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.9.1");
            caps.SetCapability("sauce:options", sauceOptions);

            StartMobileDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarliestAppiumBrowser()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "iOS");
            caps.SetCapability("browserName", "Safari");
            caps.SetCapability("appium:deviceName", "iPhone Simulator");
            caps.SetCapability("appium:platformVersion", "10.3");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.9.1");
            caps.SetCapability("sauce:options", sauceOptions);

            StartAppiumDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarliestAppiumApp()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "iOS");
            caps.SetCapability("app", app);
            caps.SetCapability("appium:deviceName", "iPhone Simulator");
            caps.SetCapability("appium:platformVersion", "11.0");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.8.0");
            caps.SetCapability("sauce:options", sauceOptions);

            StartAppiumDriver(caps);
            ValidateApp();
        }
    }
}
