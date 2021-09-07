using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Appium;
using OpenQA.Selenium.Remote;

namespace Se3LastW3C
{
    [TestClass]
    public class AndroidLateTest : TestBase
    {
        private string app = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";

        [TestMethod]
        public void LatestAppiumBrowser()
        {
            // Appium >= v4.0.0.2-beta & Selenium >= v3.14.0
            AppiumOptions options = new AppiumOptions();
            options.AddAdditionalCapability("platformName", "Android");
            options.AddAdditionalCapability("browserName", "Chrome");
            options.AddAdditionalCapability("appium:deviceName", "Android GoogleAPI Emulator");
            options.AddAdditionalCapability("appium:platformVersion", "11.0");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.2");
            options.AddAdditionalCapability("sauce:options", sauceOptions);
            
            StartAndroidDriver(options);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestAppiumApp()
        {
// Appium >= v4.0.0.2-beta & Selenium >= v3.14.0
            AppiumOptions options = new AppiumOptions();
            options.AddAdditionalCapability("platformName", "Android");
            options.AddAdditionalCapability("appium:app", app);
            options.AddAdditionalCapability("appium:deviceName", "Android GoogleAPI Emulator");
            options.AddAdditionalCapability("appium:platformVersion", "11.0");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.20.2");
            options.AddAdditionalCapability("sauce:options", sauceOptions);

            StartAndroidDriver(options);
            ValidateApp();
        }
        
        [TestMethod]
        public void EarliestAppiumBrowser()
        {
// Appium >= v4.0.0.2-beta & Selenium >= v3.14.0
            AppiumOptions options = new AppiumOptions();
            options.AddAdditionalCapability("platformName", "Android");
            options.AddAdditionalCapability("browserName", "Chrome");
            options.AddAdditionalCapability("appium:deviceName", "Android GoogleAPI Emulator");
            options.AddAdditionalCapability("appium:platformVersion", "11.0");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.15.0");
            options.AddAdditionalCapability("sauce:options", sauceOptions);

            StartAndroidDriver(options);
            ValidateGoogle();
        }
        
        [TestMethod]
        public void EarliestAppiumApp()
        { 
            // Appium >= v4.0.0.2-beta & Selenium >= v3.14.0
            AppiumOptions options = new AppiumOptions();
            options.AddAdditionalCapability("platformName", "Android");
            options.AddAdditionalCapability("appium:app", app);
            options.AddAdditionalCapability("appium:deviceName", "Android GoogleAPI Emulator");
            options.AddAdditionalCapability("appium:platformVersion", "11.0");
            var sauceOptions = new Dictionary<string, object>();
            sauceOptions.Add("appiumVersion", "1.15.0");
            options.AddAdditionalCapability("sauce:options", sauceOptions);

            StartAndroidDriver(options);
            ValidateApp();
        }
    }
}
