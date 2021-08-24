def test_latest_win10(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'Windows 10'
    caps['version'] = 'latest'

    helpers.validate_google(caps)

def test_late_win10(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'Windows 10'
    caps['version'] = '92'

    helpers.validate_google(caps)

def test_early_win10(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'Windows 10'
    caps['version'] = '13'

    helpers.validate_google(caps)

def test_late_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '81'

    helpers.validate_google(caps)

def test_early_yosemite(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '79'

    helpers.validate_google(caps)

def test_latest_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = 'latest'

    helpers.validate_google(caps)

def test_late_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '92'

    helpers.validate_google(caps)

def test_early_big_sur(helpers):
    caps = {}
    caps['browserName'] = 'MicrosoftEdge'
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '79'

    helpers.validate_google(caps)


