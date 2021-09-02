using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Remote;

namespace Se3Legacy
{
    [TestClass]
    public class TestBase
    {
        protected IWebDriver _driver;
        private string _sauceUserName = Environment.GetEnvironmentVariable("SAUCE_USERNAME");
        private string _sauceAccessKey = Environment.GetEnvironmentVariable("SAUCE_ACCESS_KEY");

        public void StartDriver(ICapabilities capabilities)
        {
            string url = "https://" + _sauceUserName + ":" + _sauceAccessKey + "@/Users/titusfortner/code/platform-config-tests/dotnet/se3-legacy";
            _driver = new RemoteWebDriver(new Uri(url), capabilities);
        }

        public void ValidateGoogle()
        {
            _driver.Navigate().GoToUrl("http://google.com");
            Assert.IsTrue(_driver.Title == "Google");
        }

        [TestCleanup]
        public void CleanUpAfterEveryTestMethod()
        {
            if (_driver == null) return;

            var passed = TestContext.CurrentTestOutcome == UnitTestOutcome.Passed;
            ((IJavaScriptExecutor)_driver).ExecuteScript("sauce:job-result=" + (passed ? "passed" : "failed"));
            _driver.Quit();
        }

    }
}
