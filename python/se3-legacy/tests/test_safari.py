def test_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'safari'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '8'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)

def test_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'safari'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '14'

    driver = helpers.start_driver(caps)
    helpers.validate_google(driver)
