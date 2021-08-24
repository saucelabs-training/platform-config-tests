def test_big_sur(helpers):
    capabilities = {
        'browserName': 'safari',
        'browserVersion': '14',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    helpers.validate_google(capabilities)
