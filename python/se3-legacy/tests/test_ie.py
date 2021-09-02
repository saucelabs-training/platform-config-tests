def test_win10(helpers):
    caps = {}
    caps['browserName'] = 'internet explorer'
    caps['platform'] = 'Windows 10'
    caps['version'] = '11'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_late_win7(helpers):
    caps = {}
    caps['browserName'] = 'internet explorer'
    caps['platform'] = 'Windows 7'
    caps['version'] = '11'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_early_win7(helpers):
    caps = {}
    caps['browserName'] = 'internet explorer'
    caps['platform'] = 'Windows 7'
    caps['version'] = '9'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)
