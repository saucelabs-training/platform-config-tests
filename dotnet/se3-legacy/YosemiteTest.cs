using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Remote;

namespace Se3Legacy
{
    [TestClass]
    public class YosemiteTest : TestBase
    {
        [TestMethod]
        public void LateChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "OS X 10.10");
            caps.SetCapability("version", "87");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "OS X 10.10");
            caps.SetCapability("version", "37");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateEdge()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "MicrosoftEdge");
            caps.SetCapability("platform", "OS X 10.10");
            caps.SetCapability("version", "81");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyEdge()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "MicrosoftEdge");
            caps.SetCapability("platform", "OS X 10.10");
            caps.SetCapability("version", "79");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "OS X 10.10");
            caps.SetCapability("version", "47");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "OS X 10.10");
            caps.SetCapability("version", "32");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void Safari()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "safari");
            caps.SetCapability("platform", "OS X 10.10");
            caps.SetCapability("version", "8");

            StartDriver(caps);
            ValidateGoogle();
        }
    }
}
