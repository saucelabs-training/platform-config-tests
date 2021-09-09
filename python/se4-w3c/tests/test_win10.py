def test_latest_chrome(helpers):
    from selenium.webdriver.chrome.options import Options as ChromeOptions

    options = ChromeOptions()
    options.set_capability('browserVersion', 'latest')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_late_chrome(helpers):
    from selenium.webdriver.chrome.options import Options as ChromeOptions

    options = ChromeOptions()
    options.set_capability('browserVersion', '93')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_early_chrome(helpers):
    from selenium.webdriver.chrome.options import Options as ChromeOptions

    options = ChromeOptions()
    options.set_capability('browserVersion', '75')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_latest_edge(helpers):
    from selenium.webdriver.edge.options import Options as EdgeOptions

    options = EdgeOptions()
    options.set_capability('browserVersion', 'latest')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_late_edge(helpers):
    from selenium.webdriver.edge.options import Options as EdgeOptions

    options = EdgeOptions()
    options.set_capability('browserVersion', '93')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_early_edge(helpers):
    from selenium.webdriver.edge.options import Options as EdgeOptions

    options = EdgeOptions()
    options.set_capability('browserVersion', '79')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_latest_firefox(helpers):
    from selenium.webdriver.firefox.options import Options as FirefoxOptions

    options = FirefoxOptions()
    options.set_capability('browserVersion', 'latest')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_late_firefox(helpers):
    from selenium.webdriver.firefox.options import Options as FirefoxOptions

    options = FirefoxOptions()
    options.set_capability('browserVersion', '92')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_early_firefox(helpers):
    from selenium.webdriver.firefox.options import Options as FirefoxOptions

    options = FirefoxOptions()
    options.set_capability('browserVersion', '60')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_ie(helpers):
    from selenium.webdriver.ie.options import Options as InternetExplorerOptions

    options = InternetExplorerOptions()
    options.set_capability('browserVersion', '11')
    options.set_capability('platformName', 'Windows 10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)
