def test_latest_win10(helpers):
    capabilities = {
        'browserName': 'MicrosoftEdge',
        'browserVersion': 'latest',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_win10(helpers):
    capabilities = {
        'browserName': 'MicrosoftEdge',
        'browserVersion': '92',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_win10(helpers):
    capabilities = {
        'browserName': 'MicrosoftEdge',
        'browserVersion': '79',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_yosemite(helpers):
    capabilities = {
        'browserName': 'MicrosoftEdge',
        'browserVersion': '81',
        'platformName': 'OS X 10.10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_yosemite(helpers):
    capabilities = {
        'browserName': 'MicrosoftEdge',
        'browserVersion': '79',
        'platformName': 'OS X 10.10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_latest_big_sur(helpers):
    capabilities = {
        'browserName': 'MicrosoftEdge',
        'browserVersion': 'latest',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }
    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_big_sur(helpers):
    capabilities = {
        'browserName': 'MicrosoftEdge',
        'browserVersion': '92',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_big_sur(helpers):
    capabilities = {
        'browserName': 'MicrosoftEdge',
        'browserVersion': '79',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)


