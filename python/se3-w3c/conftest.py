import os
import sys
import time

import pytest
from selenium import webdriver


class Helpers:
    @staticmethod
    def validate_google(caps):
        sauce_username = os.environ["SAUCE_USERNAME"]
        sauce_access_key = os.environ["SAUCE_ACCESS_KEY"]
        remote_url = "http://{}:{}@ondemand.saucelabs.com/wd/hub".format(sauce_username, sauce_access_key)

        caps['sauce:options']['name'] = sys._getframe(1).f_code.co_name
        caps['sauce:options']['build'] = 'Python Se3 W3C - {}'.format(os.environ.get("BUILD_TIME"))

        driver = webdriver.Remote(remote_url, desired_capabilities=caps)
        driver.get("http://google.com")
        time.sleep(1)

        result = 'passed' if driver.title == 'Google' else 'failed'

        driver.execute_script("sauce:job-result={}".format(result))
        driver.quit()


@pytest.fixture
def helpers():
    return Helpers
