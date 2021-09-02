def test_latest_win10(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'Windows 10'
    caps['version'] = 'latest'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_win10(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'Windows 10'
    caps['version'] = '91'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_win10(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'Windows 10'
    caps['version'] = '4'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_latest_win7(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'Windows 7'
    caps['version'] = 'latest'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_win7(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'Windows 7'
    caps['version'] = '91'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_win7(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'Windows 7'
    caps['version'] = '4'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_linux(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'Linux'
    caps['version'] = '45'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_linux(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'Linux'
    caps['version'] = '4'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '47'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '32'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_latest_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = 'latest'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '91'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'firefox'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '60'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)
