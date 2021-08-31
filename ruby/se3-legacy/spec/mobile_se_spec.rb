require 'spec_helper'

describe 'Mobile with Selenium' do
  include Utils

  let(:caps) { Selenium::WebDriver::Remote::Capabilities.new }

  describe 'Browser' do
    it 'runs latest Android with latest Appium' do
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.2'
      caps['appium:deviceName'] = "Android GoogleAPI Emulator"
      caps['appium:platformVersion'] = "11.0"
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Chrome'

      start_mobile_driver(caps)
      validate_google
    end

    it 'runs latest Android with earliest Appium' do
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.15.0'
      caps['appium:deviceName'] = "Android GoogleAPI Emulator"
      caps['appium:platformVersion'] = "11.0"
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Chrome'

      start_mobile_driver(caps)
      validate_google
    end

    it 'runs earliest Android with latest Appium' do
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.2'
      caps['appium:deviceName'] = "Android GoogleAPI Emulator"
      caps['appium:platformVersion'] = "5.1"
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Browser'

      start_mobile_driver(caps)
      validate_google
    end

    it 'runs earliest Android with earliest Appium' do
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.8.0'
      caps['appium:deviceName'] = "Android GoogleAPI Emulator"
      caps['appium:platformVersion'] = "5.1"
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Browser'

      start_mobile_driver(caps)
      validate_google
    end

    it 'runs latest iOS' do
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.21.0'
      caps['appium:deviceName'] = "iPhone Simulator"
      caps['appium:platformVersion'] = "14.5"
      caps['platformName'] = 'iOS'
      caps['browserName'] = 'Safari'

      start_mobile_driver(caps)
      validate_google
    end

    it 'with earliest iOS' do
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.8.0'
      caps['appium:deviceName'] = "iPhone Simulator"
      caps['appium:platformVersion'] = "10.3"
      caps['platformName'] = 'iOS'
      caps['browserName'] = 'Safari'

      start_mobile_driver(caps)
      validate_google
    end
  end
end
