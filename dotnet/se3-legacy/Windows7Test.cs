using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Remote;

namespace Se3Legacy
{
    [TestClass]
    public class Windows7Test : TestBase
    {
        [TestMethod]
        public void LatestChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "Windows 7");
            caps.SetCapability("version", "latest");

            StartDriver(caps);
            ValidateGoogle();
        }
        
        [TestMethod]
        public void LateChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "Windows 7");
            caps.SetCapability("version", "92");
            
            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "Windows 7");
            caps.SetCapability("version", "26");
            
            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "Windows 7");
            caps.SetCapability("version", "latest");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "Windows 7");
            caps.SetCapability("version", "91");
            
            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "Windows 7");
            caps.SetCapability("version", "4");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestIE()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "internet explorer");
            caps.SetCapability("platform", "Windows 7");
            caps.SetCapability("version", "11");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarliestIE()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "internet explorer");
            caps.SetCapability("platform", "Windows 7");
            caps.SetCapability("version", "9");

            StartDriver(caps);
            ValidateGoogle();
        }
    }
}
