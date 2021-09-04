using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Remote;

namespace Se3Legacy
{
    [TestClass]
    public class Windows10Test : TestBase
    {
        [TestMethod]
        public void LatestChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "latest");


            StartDriver(caps);
            ValidateGoogle();
        }
        
        [TestMethod]
        public void LateChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "92");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyChrome()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "chrome");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "26");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestEdge()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "MicrosoftEdge");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "latest");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateEdge()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "MicrosoftEdge");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "92");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyEdge()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "MicrosoftEdge");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "13");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LatestFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "latest");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void LateFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "91");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void EarlyFirefox()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "firefox");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "4");

            StartDriver(caps);
            ValidateGoogle();
        }

        [TestMethod]
        public void IE()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "internet explorer");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "11");

            StartDriver(caps);
            ValidateGoogle();
        }
    }
}
