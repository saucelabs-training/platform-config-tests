require 'spec_helper'

describe 'IOS' do
  include Utils
  app = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip"

  context 'with latest version' do
    it 'Selenium Mobile ' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'iOS'
      caps[:browser_name] = 'Safari'
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '14.5'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.20.1'

      start_driver(caps)
      validate_google
    end

    it 'Appium Mobile' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'iOS'
      caps[:browser_name] = 'Safari'
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '14.5'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.20.1'

      start_appium_driver(caps)
      validate_google
    end

    it 'Appium App' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'iOS'
      caps['appium:app'] = app
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '14.5'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.20.1'

      start_appium_driver(caps)
      validate_app
    end
  end

  context 'with earliest version' do
    it 'Selenium Mobile ' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'iOS'
      caps[:browser_name] = 'Safari'
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '10.3'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.8.0'

      start_driver(caps)
      validate_google
    end

    it 'Appium Mobile' do
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'iOS'
      caps[:browser_name] = 'Safari'
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '10.3'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.8.0'

      start_appium_driver(caps)
      validate_google
    end

    it 'Appium App' do
      warn 'Earliest iOS is 10.3, but only 11+ works'
      caps = Selenium::WebDriver::Remote::Capabilities.new
      caps[:platform_name] = 'iOS'
      caps['appium:app'] = 'afsda'
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options'][:appium_version] = '1.8.0'

      start_appium_driver(caps)
      validate_app
    end
  end
end
