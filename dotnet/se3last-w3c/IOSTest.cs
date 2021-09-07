using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Appium;

namespace Se3LastW3C
{
    [TestClass]
    public class IOSTest : TestBase
    {
        private string app = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip";

        [TestMethod]
        public void LatestBrowser()
        {
            // Appium >= v4.0.0.2-beta & Selenium >= v3.14.0
            AppiumOptions options = new AppiumOptions();
            options.AddAdditionalCapability("platformName", "iOS");
            options.AddAdditionalCapability("browserName", "Safari");
            options.AddAdditionalCapability("appium:deviceName", "iPhone Simulator");
            options.AddAdditionalCapability("appium:platformVersion", "14.5");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.21.0");
            options.AddAdditionalCapability("sauce:options", sauceOptions);

            StartIOSDriver(options);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestApp()
        {
            // Appium >= v4.0.0.2-beta & Selenium >= v3.14.0
            AppiumOptions options = new AppiumOptions();
            options.AddAdditionalCapability("platformName", "iOS");
            options.AddAdditionalCapability("appium:app", app);
            options.AddAdditionalCapability("appium:deviceName", "iPhone Simulator");
            options.AddAdditionalCapability("appium:platformVersion", "14.5");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.21.0");
            options.AddAdditionalCapability("sauce:options", sauceOptions);
    
            StartIOSDriver(options);
            ValidateApp();
        }
        
        [TestMethod]
        public void EarliestBrowser()
        {
            // Appium >= v4.0.0.2-beta & Selenium >= v3.14.0
            AppiumOptions options = new AppiumOptions();
            options.AddAdditionalCapability("platformName", "iOS");
            options.AddAdditionalCapability("browserName", "Safari");
            options.AddAdditionalCapability("appium:deviceName", "iPhone Simulator");
            options.AddAdditionalCapability("appium:platformVersion", "10.3");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.8.0");
            options.AddAdditionalCapability("sauce:options", sauceOptions);

            StartIOSDriver(options);
            ValidateGoogle();
        }
        
        [TestMethod]
        public void EarliestApp()
        { 
            // Appium >= v4.0.0.2-beta & Selenium >= v3.14.0
            AppiumOptions options = new AppiumOptions();
            options.AddAdditionalCapability("platformName", "iOS");
            options.AddAdditionalCapability("appium:app", app);
            options.AddAdditionalCapability("appium:deviceName", "iPhone Simulator");
            options.AddAdditionalCapability("appium:platformVersion", "11.0");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.8.0");
            options.AddAdditionalCapability("sauce:options", sauceOptions);

            StartIOSDriver(options);
            ValidateApp();
        }
    }
}
