using System;
using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Appium;
using OpenQA.Selenium.Appium.Android;
using OpenQA.Selenium.Remote;

[assembly: Parallelize(Workers = 10, Scope = ExecutionScope.MethodLevel)]

namespace Se3Legacy
{
    [TestClass]
    public class TestBase
    {
        protected IWebDriver _driver;
        private string username = Environment.GetEnvironmentVariable("SAUCE_USERNAME");
        private string accessKey = Environment.GetEnvironmentVariable("SAUCE_ACCESS_KEY");
        private const string Url = "https://ondemand.us-west-1.saucelabs.com/wd/hub";
        private string buildTime = Environment.GetEnvironmentVariable("BUILD_TIME");

        public TestContext TestContext { get; set; }

        public void StartDriver(DesiredCapabilities capabilities)
        {
            capabilities.SetCapability("username", username);
            capabilities.SetCapability("accessKey", accessKey);
            capabilities.SetCapability("name", TestContext.TestName);
            capabilities.SetCapability("build", "C# Se3 Legacy - " + buildTime);

            _driver = new RemoteWebDriver(new Uri(Url), capabilities);
        }

        public void SetMobileCapabilities(DesiredCapabilities capabilities)
        {
            Dictionary<string, object> sauceOptions = (Dictionary<string, object>)capabilities.GetCapability("sauce:options");
            sauceOptions.Add("username", username);
            sauceOptions.Add("accessKey", accessKey);
            sauceOptions.Add("name", TestContext.TestName);
            sauceOptions.Add("build", "C# Se3 Legacy - " + buildTime);
        }

        public void StartMobileDriver(DesiredCapabilities capabilities)
        {
            SetMobileCapabilities(capabilities);
            _driver = new RemoteWebDriver(new Uri(Url), capabilities);
        }

        public void StartAppiumDriver(DesiredCapabilities capabilities)
        {
            SetMobileCapabilities(capabilities);
            if (ReferenceEquals(capabilities.GetCapability("platformName"), "Android"))
                capabilities.SetCapability("appium:appWaitActivity", "com.swaglabsmobileapp.MainActivity");
            _driver = new AndroidDriver<AndroidElement>(new Uri(Url), capabilities);
        }

        public void ValidateGoogle()
        {
            _driver.Navigate().GoToUrl("http://google.com");
            Assert.IsTrue(_driver.Title == "Google");
        }

        public void ValidateApp()
        {
            var elements = _driver.FindElements(MobileBy.AccessibilityId("test-Username"));
            Assert.IsTrue(elements.Count == 1);
        }

        [TestCleanup]
        public void CleanUpAfterEveryTestMethod()
        {
            if (_driver == null) return;

            var result = TestContext.CurrentTestOutcome == UnitTestOutcome.Passed ? "passed" : "failed";
            ((IJavaScriptExecutor)_driver).ExecuteScript("sauce:job-result=" + result);
            _driver.Quit();
        }
    }
}
