require 'spec_helper'

describe 'Latest Android' do
  include Utils
  app = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk"

  context 'with latest Appium' do
    it 'Selenium Mobile ' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'Android'
      caps[:browser_name] = 'Chrome'
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.20.2'

      start_driver(caps)
      validate_google
    end

    it 'Appium Mobile' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'Android'
      caps[:browser_name] = 'Chrome'
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.20.2'

      start_appium_driver(caps)
      validate_google
    end

    it 'Appium App' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'Android'
      caps['appium:app'] = app
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.20.2'

      start_appium_driver(caps)
      validate_app
    end
  end

  context 'with earliest Appium' do
    it 'Selenium Mobile ' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'Android'
      caps[:browser_name] = 'Chrome'
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.15.0'

      start_driver(caps)
      validate_google
    end

    it 'Appium Mobile' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'Android'
      caps[:browser_name] = 'Chrome'
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.15.0'

      start_appium_driver(caps)
      validate_google
    end

    it 'Appium App' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'Android'
      caps['appium:app'] = app
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.15.0'

      start_appium_driver(caps)
      validate_app
    end
  end
end
