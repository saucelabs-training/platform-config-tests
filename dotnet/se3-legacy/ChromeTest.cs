using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Remote;

namespace Se3Legacy
{
    [TestClass]
    public class ChromeTest : TestBase
    {
        [TestMethod]
        public void LatestChromeLatestWindows()
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.SetCapability("browserName", "Chrome");
            caps.SetCapability("platform", "Windows 10");
            caps.SetCapability("version", "latest");
            
            StartDriver(caps);
            ValidateGoogle();
        }
    }
}
