using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Remote;

namespace Se3Legacy
{
    [TestClass]
    public class BigSurTest : TestBase
    {
        [TestMethod]
        public void LatestChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "latest");

            StartDriver(caps);
            ValidateGoogle();
        }
        
        [TestMethod]
        public void LateChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "92");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "69");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestEdge()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "MicrosoftEdge");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "latest");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateEdge()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "MicrosoftEdge");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "92");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyEdge()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "MicrosoftEdge");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "79");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "latest");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "91");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "60");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void Safari()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "safari");
            caps.SetCapability("platform", "macOS 11.00");
            caps.SetCapability("version", "14");

            StartDriver(caps);
            ValidateGoogle();
        }
    }
}
