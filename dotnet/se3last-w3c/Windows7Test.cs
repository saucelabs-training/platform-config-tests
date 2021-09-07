using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.IE;
using OpenQA.Selenium.Remote;

namespace Se3LastW3C
{
    [TestClass]
    public class Windows7Test : TestBase
    {
        [TestMethod]
        public void LatestChrome()
        {
            var browserOptions = new ChromeOptions();
            browserOptions.PlatformName = "Windows 7";
            browserOptions.BrowserVersion = "latest";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);

            StartDriver(browserOptions);
            ValidateGoogle();
        }
        
        [TestMethod]
        public void LateChrome()
        {
            var browserOptions = new ChromeOptions();
            browserOptions.PlatformName = "Windows 7";
            browserOptions.BrowserVersion = "93";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyChrome()
        {
            var browserOptions = new ChromeOptions();
            browserOptions.PlatformName = "Windows 7";
            browserOptions.BrowserVersion = "75";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestFirefox()
        {
            var browserOptions = new FirefoxOptions();
            browserOptions.PlatformName = "Windows 7";
            browserOptions.BrowserVersion = "latest";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);
            
            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateFirefox()
        {
            var browserOptions = new FirefoxOptions();
            browserOptions.PlatformName = "Windows 7";
            browserOptions.BrowserVersion = "91";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);            
            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyFirefox()
        {
            var browserOptions = new FirefoxOptions();
            browserOptions.PlatformName = "Windows 7";
            browserOptions.BrowserVersion = "60";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestIE()
        {
            var browserOptions = new InternetExplorerOptions();
            browserOptions.PlatformName = "Windows 7";
            browserOptions.BrowserVersion = "11";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarliestIE()
        {
            var browserOptions = new InternetExplorerOptions();
            browserOptions.PlatformName = "Windows 7";
            browserOptions.BrowserVersion = "10";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);

            StartDriver(browserOptions);
            ValidateGoogle();
        }
    }
}
