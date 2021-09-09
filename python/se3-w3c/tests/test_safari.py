def test_big_sur(helpers):
    capabilities = {
        'browserName': 'safari',
        'browserVersion': '14',
        'platformName': 'macOS 11.00',
        'sauce:options': {
        }
    }

    driver = helpers.start_driver(capabilities)
    helpers.validate_google(driver)
