const {config} = require('./wdio.shared.conf');

// =========================
// Sauce RDC specific config
// =========================
config.user = process.env.SAUCE_USERNAME;
config.key = process.env.SAUCE_ACCESS_KEY;
// If you run your tests on Sauce Labs you can specify the region you want to run your tests
// in via the `region` property. Available short handles for regions are `us` (default) and `eu`.
// These regions are used for the Sauce Labs VM cloud and the Sauce Labs Real Device Cloud.
// If you don't provide the region, it defaults to `us`.
config.region = process.env.REGION || 'us';

config.specs = ['./test/specs/mobile.spec.js']

// ============
// Capabilities
// ============
buildName = 'WDIO Native App - ' + Date.now();
ios = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip";
android = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";

caps = {};
caps['platformName'] = 'Android';
caps['appium:app'] = android;
caps['appium:deviceName'] = 'Android GoogleAPI Emulator';
caps['appium:platformVersion'] = '11.0';
caps['sauce:options'] = {};
caps['sauce:options']['appiumVersion'] = '1.20.2';

caps['sauce:options']['build'] =  buildName;
caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity';
latestAndroidLatestAppium = caps;

caps = {};
caps['platformName'] = 'Android';
caps['appium:app'] = android;
caps['appium:deviceName'] = 'Android GoogleAPI Emulator';
caps['appium:platformVersion'] = '11.0';
caps['sauce:options'] = {};
caps['sauce:options']['appiumVersion'] = '1.15.0';
caps['sauce:options']['build'] =  buildName;
caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity';
latestAndroidEarliestAppium = caps;

caps = {};
caps['platformName'] = 'Android';
caps['appium:app'] = android;
caps['appium:deviceName'] = 'Android GoogleAPI Emulator';
caps['appium:platformVersion'] = '5.1';
caps['sauce:options'] = {};
caps['sauce:options']['appiumVersion'] = '1.20.2';
caps['sauce:options']['build'] =  buildName;
caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity';
earliestAndroidLatestAppium = caps;

caps = {};
caps['platformName'] = 'Android';
caps['appium:app'] = android;
caps['appium:deviceName'] = 'Android GoogleAPI Emulator';
caps['appium:platformVersion'] = '5.1';
caps['sauce:options'] = {};
caps['sauce:options']['appiumVersion'] = '1.8.0';
caps['sauce:options']['build'] =  buildName;
caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity';
earliestAndroidEarliestAppium = caps;

caps = {};
caps['platformName'] = 'iOS';
caps['appium:app'] = ios;
caps['appium:deviceName'] = 'iPad Pro (11 inch) (2nd generation) Simulator';
caps['appium:platformVersion'] = '14.5';
caps['sauce:options'] = {};
caps['sauce:options']['appiumVersion'] = '1.21.0';
caps['sauce:options']['build'] =  buildName;
latestIOS = caps;

caps = {};
caps['platformName'] = 'iOS';
caps['appium:app'] = ios;
caps['appium:deviceName'] = 'iPhone Simulator';
caps['appium:platformVersion'] = '11.0';  // This should be 10.3, but will not load
caps['sauce:options'] = {};
caps['sauce:options']['appiumVersion'] = '1.8.0';
caps['sauce:options']['build'] =  buildName;
earliestIOS = caps;

config.capabilities = [
    latestAndroidLatestAppium,
    latestAndroidEarliestAppium,
    earliestAndroidLatestAppium,
    earliestAndroidEarliestAppium,
    latestIOS,
    earliestIOS
];

config.services = config.services.concat('sauce');

exports.config = config;
