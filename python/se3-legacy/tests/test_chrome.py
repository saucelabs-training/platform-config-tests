def test_latest_win10(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'Windows 10'
    caps['version'] = 'latest'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_win10(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'Windows 10'
    caps['version'] = '92'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_win10(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'Windows 10'
    caps['version'] = '26'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_latest_win7(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'Windows 7'
    caps['version'] = 'latest'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_win7(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'Windows 7'
    caps['version'] = '92'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_win7(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'Windows 7'
    caps['version'] = '26'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_linux(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'Linux'
    caps['version'] = '48'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_linux(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'Linux'
    caps['version'] = '26'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '87'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '37'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_latest_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = 'latest'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '92'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'chrome'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '69'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)
