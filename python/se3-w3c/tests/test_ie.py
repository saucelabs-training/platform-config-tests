def test_win10(helpers):
    capabilities = {
        'browserName': 'internet explorer',
        'browserVersion': '11',
        'platformName': 'Windows 10',
        'sauce:options': {
        }
    }

    helpers.validate_google(capabilities)

def test_late_win7(helpers):
    capabilities = {
        'browserName': 'internet explorer',
        'browserVersion': '11',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    helpers.validate_google(capabilities)

def test_early_win7(helpers):
    capabilities = {
        'browserName': 'internet explorer',
        'browserVersion': '10',
        'platformName': 'Windows 7',
        'sauce:options': {
        }
    }

    helpers.validate_google(capabilities)
