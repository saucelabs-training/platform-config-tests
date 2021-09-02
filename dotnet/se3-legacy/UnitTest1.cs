using System;
using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Edge;
using OpenQA.Selenium.Remote;
using OpenQA.Selenium.Support.UI;

namespace platform_configurator
{
    [TestClass]
    public class UnitTest1
    {
        private IWebDriver _driver;
        private string _sauceUserName;
        private string _sauceAccessKey;
        private Dictionary<string, object> _sauceOptions;
        public TestContext TestContext { get; set; }

        [TestCleanup]
        public void CleanUpAfterEveryTestMethod()
        {
            if (_driver == null) return;

            var passed = TestContext.CurrentTestOutcome == UnitTestOutcome.Passed;
            ((IJavaScriptExecutor)_driver).ExecuteScript("sauce:job-result=" + (passed ? "passed" : "failed"));
            _driver.Quit();
        }

        [TestMethod]
        public void EdgeW3C()
        {
            //TODO please set your Sauce Labs username/access key in an environment variable
            _sauceUserName = Environment.GetEnvironmentVariable("SAUCE_USERNAME");
            // Do NOT use EnvironmentVariableTarget as it won't work in CI
            _sauceAccessKey = Environment.GetEnvironmentVariable("SAUCE_ACCESS_KEY");
            _sauceOptions = new Dictionary<string, object>
            {
                ["username"] = _sauceUserName,
                ["accessKey"] = _sauceAccessKey,
                ["name"] = TestContext.TestName
            };

            var browserOptions = new EdgeOptions
            {
                BrowserVersion = "latest",
                PlatformName = "Windows 10"
                //AcceptInsecureCertificates = true //Insecure Certs are Not supported by Edge
            };

            browserOptions.AddAdditionalCapability("sauce:options", _sauceOptions);

            _driver = new RemoteWebDriver(new Uri("https://ondemand.saucelabs.com/wd/hub"), browserOptions.ToCapabilities(),
                TimeSpan.FromSeconds(30));
            _driver.Navigate().GoToUrl("https://www.saucedemo.com");

            var wait = new WebDriverWait(_driver, TimeSpan.FromSeconds(6));
            wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementIsVisible(By.CssSelector("#user-name")));
        }
    }
}
