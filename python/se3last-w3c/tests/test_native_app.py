iOS = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip"
android = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk"

def test_latest_android_latest_appium(helpers):
    caps = {}
    caps['platformName'] = 'Android'
    caps['appium:app'] = android
    caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
    caps['appium:platformVersion'] = '11.0'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.20.2'
    caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_app(driver)

def test_latest_android_earliest_appium(helpers):
    caps = {}
    caps['platformName'] = 'Android'
    caps['appium:app'] = android
    caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
    caps['appium:platformVersion'] = '11.0'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.15.0'
    caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_app(driver)

def test_earliest_android_latest_appium(helpers):
    caps = {}
    caps['platformName'] = 'Android'
    caps['appium:app'] = android
    caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
    caps['appium:platformVersion'] = '5.1'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.20.2'
    caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_app(driver)

def test_earliest_android_latest_appium_actual(helpers):
    caps = {}
    caps['platformName'] = 'Android'
    caps['appium:app'] = android
    caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
    caps['appium:platformVersion'] = '5.1'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.8.0'
    caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_app(driver)

def test_earliest_android_earliest_appium(helpers):
    caps = {}
    caps['platformName'] = 'Android'
    caps['appium:app'] = android
    caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
    caps['appium:platformVersion'] = '5.1'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.8.0'
    caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_app(driver)

def test_latest_ios(helpers):
    caps = {}
    caps['platformName'] = 'iOS'
    caps['appium:app'] = iOS
    caps['appium:deviceName'] = 'iPhone Simulator'
    caps['appium:platformVersion'] = '14.5'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.21.0'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_app(driver)

def test_earliest_ios(helpers):
    caps = {}
    caps['platformName'] = 'iOS'
    caps['appium:app'] = iOS
    caps['appium:deviceName'] = 'iPhone Simulator'
    caps['appium:platformVersion'] = '10.3'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.8.0'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_app(driver)
