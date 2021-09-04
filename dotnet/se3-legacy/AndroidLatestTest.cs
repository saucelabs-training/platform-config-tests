using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Remote;

namespace Se3Legacy
{
    [TestClass]
    public class AndroidLateTest : TestBase
    {
        private string app = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";

        [TestMethod]
        public void LatestAppiumSelenium()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "Android");
            caps.SetCapability("browserName", "Chrome");
            caps.SetCapability("appium:deviceName", "Android GoogleAPI Emulator");
            caps.SetCapability("appium:platformVersion", "11.0");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.2");
            caps.SetCapability("sauce:options", sauceOptions);

            StartMobileDriver(caps);
            ValidateGoogle();
        }
        
        [TestMethod]
        public void LatestAppiumBrowser()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "Android");
            caps.SetCapability("browserName", "Browser");
            caps.SetCapability("appium:deviceName", "Android GoogleAPI Emulator");
            caps.SetCapability("appium:platformVersion", "5.1");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.2");
            caps.SetCapability("sauce:options", sauceOptions);

            StartAppiumDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestAppiumApp()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "Android");
            caps.SetCapability("appium:app", app);
            caps.SetCapability("appium:deviceName", "Android GoogleAPI Emulator");
            caps.SetCapability("appium:platformVersion", "5.1");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.2");
            caps.SetCapability("sauce:options", sauceOptions);

            StartAppiumDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarliestAppiumSelenium()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "Android");
            caps.SetCapability("browserName", "Browser");
            caps.SetCapability("appium:deviceName", "Android GoogleAPI Emulator");
            caps.SetCapability("appium:platformVersion", "5.1");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.2");
            caps.SetCapability("sauce:options", sauceOptions);

            StartMobileDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarliestAppiumBrowser()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "Android");
            caps.SetCapability("browserName", "Browser");
            caps.SetCapability("appium:deviceName", "Android GoogleAPI Emulator");
            caps.SetCapability("appium:platformVersion", "5.1");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.2");
            caps.SetCapability("sauce:options", sauceOptions);

            StartAppiumDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarliestAppiumApp()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("platformName", "Android");
            caps.SetCapability("appium:app", app);
            caps.SetCapability("appium:deviceName", "Android GoogleAPI Emulator");
            caps.SetCapability("appium:platformVersion", "5.1");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.2");
            caps.SetCapability("sauce:options", sauceOptions);

            StartAppiumDriver(caps);
            ValidateGoogle();
        }
    }
}
