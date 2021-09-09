def test_latest_win10(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': 'latest',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_win10(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': '92',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_win10(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': '75',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_latest_win7(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': 'latest',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_win7(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': '92',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_win7(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': '75',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_yosemite(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': '87',
        'platformName': 'OS X 10.10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_yosemite(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': '75',
        'platformName': 'OS X 10.10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_latest_big_sur(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': 'latest',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_big_sur(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': '92',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_big_sur(helpers):
    capabilities = {
        'browserName': 'chrome',
        'browserVersion': '75',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)


