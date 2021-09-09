def test_latest_win10(helpers):
    capabilities = {
        'browserName': 'firefox',
        'browserVersion': 'latest',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_win10(helpers):
    capabilities = {
        'browserName': 'firefox',
        'browserVersion': '91',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_win10(helpers):
    capabilities = {
        'browserName': 'firefox',
        'browserVersion': '60',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_latest_win7(helpers):
    capabilities = {
        'browserName': 'firefox',
        'browserVersion': 'latest',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_win7(helpers):
    capabilities = {
        'browserName': 'firefox',
        'browserVersion': '91',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_win7(helpers):
    capabilities = {
        'browserName': 'firefox',
        'browserVersion': '60',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_latest_big_sur(helpers):
    capabilities = {
        'browserName': 'firefox',
        'browserVersion': 'latest',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_big_sur(helpers):
    capabilities = {
        'browserName': 'firefox',
        'browserVersion': '91',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_big_sur(helpers):
    capabilities = {
        'browserName': 'firefox',
        'browserVersion': '60',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)
