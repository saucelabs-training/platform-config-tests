def test_latest_android_latest_appium(helpers):
    caps = {}
    caps['platformName'] = 'Android'
    caps['browserName'] = 'Chrome'
    caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
    caps['appium:platformVersion'] = '11.0'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.20.2'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_google(driver)

def test_latest_android_earliest_appium(helpers):
    caps = {}
    caps['platformName'] = 'Android'
    caps['browserName'] = 'Chrome'
    caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
    caps['appium:platformVersion'] = '11.0'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.15.0'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_google(driver)

def test_earliest_android_latest_appium(helpers):
    caps = {}
    caps['platformName'] = 'Android'
    caps['browserName'] = 'Browser'
    caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
    caps['appium:platformVersion'] = '5.1'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.20.2'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_google(driver)

def test_earliest_android_earliest_appium(helpers):
    caps = {}
    caps['platformName'] = 'Android'
    caps['browserName'] = 'Browser'
    caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
    caps['appium:platformVersion'] = '5.1'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.8.0'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_google(driver)

def test_latest_ios(helpers):
    caps = {}
    caps['platformName'] = 'iOS'
    caps['browserName'] = 'Safari'
    caps['appium:deviceName'] = 'iPhone Simulator'
    caps['appium:platformVersion'] = '14.5'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.21.0'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_google(driver)

def test_earliest_ios(helpers):
    caps = {}
    caps['platformName'] = 'iOS'
    caps['browserName'] = 'Safari'
    caps['appium:deviceName'] = 'iPhone Simulator'
    caps['appium:platformVersion'] = '10.3'
    caps['sauce:options'] = {}
    caps['sauce:options']['appiumVersion'] = '1.8.0'

    driver = helpers.start_appium_driver(caps)
    helpers.validate_google(driver)
