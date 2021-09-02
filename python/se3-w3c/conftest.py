import inspect
from datetime import datetime

import pytest
import os
import time
from selenium import webdriver

build_time = datetime.utcnow()

class Helpers:
    @staticmethod
    def validate_google(caps):
        sauce_username = os.environ["SAUCE_USERNAME"]
        sauce_access_key = os.environ["SAUCE_ACCESS_KEY"]
        remote_url = "http://{}:{}@ondemand.saucelabs.com/wd/hub".format(sauce_username, sauce_access_key)

        caps['sauce:options']['name'] = inspect.currentframe().f_back.f_code.co_name
        caps['sauce:options']['build'] = 'Python Se3 W3C - {}'.format(build_time)

        driver = webdriver.Remote(remote_url, desired_capabilities=caps)
        driver.get("http://google.com")
        time.sleep(1)

        result = 'passed' if driver.title == 'Google' else 'failed'

        driver.execute_script("sauce:job-result={}".format(result))
        driver.quit()


@pytest.fixture
def helpers():
    return Helpers
