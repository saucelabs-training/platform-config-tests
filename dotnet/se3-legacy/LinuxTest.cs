using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Remote;

namespace Se3Legacy
{
    [TestClass]
    public class LinuxTest : TestBase
    {
        [TestMethod]
        public void LateChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "Linux");
            caps.SetCapability("version", "48");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "Linux");
            caps.SetCapability("version", "26");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "Linux");
            caps.SetCapability("version", "45");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "Linux");
            caps.SetCapability("version", "4");

            StartDriver(caps);
            ValidateGoogle();
        }
    }
}
