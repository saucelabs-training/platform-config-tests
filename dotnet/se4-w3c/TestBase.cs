using System;
using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Remote;

[assembly: Parallelize(Workers = 20, Scope = ExecutionScope.MethodLevel)]

namespace Se4W3C
{
    [TestClass]
    public class TestBase
    {
        protected IWebDriver _driver;
        private string username = Environment.GetEnvironmentVariable("SAUCE_USERNAME");
        private string accessKey = Environment.GetEnvironmentVariable("SAUCE_ACCESS_KEY");
        private const string Url = "https://ondemand.us-west-1.saucelabs.com/wd/hub";
        private string buildTime = Environment.GetEnvironmentVariable("BUILD_TIME");
        private string buildNumber = Environment.GetEnvironmentVariable("GITHUB_RUN_ID");

        public TestContext TestContext { get; set; }

        public string GetBuildNumber()
        {
            return buildNumber ?? buildTime;
        }

        public void StartDriver(DriverOptions options)
        {
            var capabilities = options.ToCapabilities().GetCapability("sauce:options");
            Dictionary<string, object> sauceOptions = (Dictionary<string, object>)capabilities;
            SetCapabilities(sauceOptions);

            _driver = new RemoteWebDriver(new Uri(Url), options);
        }

        public void SetCapabilities(Dictionary<string, object> sauceOptions)
        {
            sauceOptions.Add("username", username);
            sauceOptions.Add("accessKey", accessKey);
            sauceOptions.Add("name", TestContext.TestName);
            sauceOptions.Add("build", "DotNet Se4 - " + GetBuildNumber());
        }
        
        public void ValidateGoogle()
        {
            _driver.Navigate().GoToUrl("https://google.com");
            Assert.IsTrue(_driver.Title == "Google");
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
