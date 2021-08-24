def test_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'safari'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '8'

    helpers.validate_google(caps)

def test_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'safari'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '14'

    helpers.validate_google(caps)
