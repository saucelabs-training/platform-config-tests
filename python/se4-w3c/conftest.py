import os
import sys
import time

import pytest
from appium import webdriver as appiumdriver
from selenium import webdriver


class Helpers:
    @staticmethod
    def validate_google(driver):
        driver.get("http://google.com")
        time.sleep(1)

        result = 'passed' if driver.title == 'Google' else 'failed'

        driver.execute_script("sauce:job-result={}".format(result))
        driver.quit()

    @staticmethod
    def validate_app(driver):

        elements = driver.find_elements_by_accessibility_id('test-Username')
        result = 'passed' if len(elements) == 1 else 'failed'

        driver.execute_script("sauce:job-result={}".format(result))

    @staticmethod
    def start_driver(caps):
        sauce_username = os.environ["SAUCE_USERNAME"]
        sauce_access_key = os.environ["SAUCE_ACCESS_KEY"]
        remote_url = "http://{}:{}@ondemand.saucelabs.com/wd/hub".format(sauce_username, sauce_access_key)

        caps['sauce:options']['name'] = sys._getframe(1).f_code.co_name
        caps['sauce:options']['build'] = 'Python Se4 W3C - {}'.format(os.environ.get("BUILD_TIME"))

        return webdriver.Remote(remote_url, desired_capabilities=caps)

    @staticmethod
    def start_appium_driver(caps):
        sauce_username = os.environ["SAUCE_USERNAME"]
        sauce_access_key = os.environ["SAUCE_ACCESS_KEY"]
        remote_url = "http://{}:{}@ondemand.saucelabs.com/wd/hub".format(sauce_username, sauce_access_key)

        caps['sauce:options']['name'] = sys._getframe(1).f_code.co_name
        caps['sauce:options']['build'] = 'Python Se4 W3C - {}'.format(os.environ.get("BUILD_TIME"))

        return appiumdriver.Remote(remote_url, desired_capabilities=caps)

@pytest.fixture
def helpers():
    return Helpers
