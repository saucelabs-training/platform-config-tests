using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Edge;

namespace Se3LastW3C
{
    [TestClass]
    public class YosemiteTest : TestBase
    {
        [TestMethod]
        public void LateChrome()
        {
            var browserOptions = new ChromeOptions();
            browserOptions.PlatformName = "OS X 10.10";
            browserOptions.BrowserVersion = "87";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyChrome()
        {
            var browserOptions = new ChromeOptions();
            browserOptions.PlatformName = "OS X 10.10";
            browserOptions.BrowserVersion = "75";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions, true);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateEdge()
        {
            var browserOptions = new EdgeOptions();
            browserOptions.PlatformName = "OS X 10.10";
            browserOptions.BrowserVersion = "81";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyEdge()
        {
            var browserOptions = new EdgeOptions();
            browserOptions.PlatformName = "OS X 10.10";
            browserOptions.BrowserVersion = "79";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalCapability("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }
    }
}
