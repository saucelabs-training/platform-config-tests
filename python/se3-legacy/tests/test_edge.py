def test_latest_win10(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'Windows 10'
    caps['version'] = 'latest'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_win10(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'Windows 10'
    caps['version'] = '92'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_win10(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'Windows 10'
    caps['version'] = '13'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '81'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '79'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_latest_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = 'latest'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '92'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '79'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)
