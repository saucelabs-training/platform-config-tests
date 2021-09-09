def test_win10(helpers):
    capabilities = {
        'browserName': 'internet explorer',
        'browserVersion': '11',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_late_win7(helpers):
    capabilities = {
        'browserName': 'internet explorer',
        'browserVersion': '11',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)

def test_early_win7(helpers):
    capabilities = {
        'browserName': 'internet explorer',
        'browserVersion': '10',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)
