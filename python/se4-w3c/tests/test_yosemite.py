def test_late_chrome(helpers):
    from selenium.webdriver.chrome.options import Options as ChromeOptions

    options = ChromeOptions()
    options.set_capability('browserVersion', '87')
    options.set_capability('platformName', 'OS X 10.10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_early_chrome(helpers):
    from selenium.webdriver.chrome.options import Options as ChromeOptions

    options = ChromeOptions()
    options.set_capability('browserVersion', '75')
    options.set_capability('platformName', 'OS X 10.10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_late_edge(helpers):
    from selenium.webdriver.edge.options import Options as EdgeOptions

    options = EdgeOptions()
    options.set_capability('browserVersion', '81')
    options.set_capability('platformName', 'OS X 10.10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)


def test_early_edge(helpers):
    from selenium.webdriver.edge.options import Options as EdgeOptions

    options = EdgeOptions()
    options.set_capability('browserVersion', '79')
    options.set_capability('platformName', 'OS X 10.10')
    sauce_options = {}
    options.set_capability('sauce:options', sauce_options)

    driver = helpers.start_driver(options)
    helpers.validate_google(driver)
