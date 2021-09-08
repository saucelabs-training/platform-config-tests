using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Edge;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.IE;

namespace Se4W3C
{
    [TestClass]
    public class Windows10Test : TestBase
    {
        [TestMethod]
        public void LatestChrome()
        {
            var browserOptions = new ChromeOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "latest";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }
        
        [TestMethod]
        public void LateChrome()
        {
            var browserOptions = new ChromeOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "93";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyChrome()
        {
            var browserOptions = new ChromeOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "75";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestEdge()
        {
            var browserOptions = new EdgeOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "latest";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);
            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateEdge()
        {
            var browserOptions = new EdgeOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "92";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyEdge()
        {
            var browserOptions = new EdgeOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "79";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestFirefox()
        {
            var browserOptions = new FirefoxOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "latest";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateFirefox()
        {
            var browserOptions = new FirefoxOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "91";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyFirefox()
        {
            var browserOptions = new FirefoxOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "60";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }

        [TestMethod]
        public void IE()
        {
            var browserOptions = new InternetExplorerOptions();
            browserOptions.PlatformName = "Windows 10";
            browserOptions.BrowserVersion = "11";
            var sauceOptions = new Dictionary<string, object>();
            browserOptions.AddAdditionalOption("sauce:options", sauceOptions);

            StartDriver(browserOptions);
            ValidateGoogle();
        }
    }
}
