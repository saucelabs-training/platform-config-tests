require 'spec_helper'

describe 'Mobile with Selenium' do
  include Utils

  let(:caps) { Selenium::WebDriver::Remote::Capabilities.new }

  describe 'Browser' do
    it 'runs latest Android with latest Appium' do
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Chrome'
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.2'

      start_mobile_driver(caps)
      validate_google
    end

    it 'runs latest Android with earliest Appium' do
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Chrome'
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.15.0'

      start_mobile_driver(caps)
      validate_google
    end

    it 'runs earliest Android with latest Appium' do
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Browser'
      caps['appium:deviceName'] = 'Android Emulator'
      caps['appium:platformVersion'] = '5.1'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.2'

      start_mobile_driver(caps)
      validate_google
    end

    it 'runs earliest Android with earliest Appium' do
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Browser'
      caps['appium:deviceName'] = 'Android Emulator'
      caps['appium:platformVersion'] = '5.1'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.8.0'

      start_mobile_driver(caps)
      validate_google
    end

    it 'runs latest iOS' do
      caps['platformName'] = 'iOS'
      caps['browserName'] = 'Safari'
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '14.5'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.1'

      start_mobile_driver(caps)
      validate_google
    end

    it 'with earliest iOS' do
      caps['platformName'] = 'iOS'
      caps['browserName'] = 'Safari'
      caps['appium:deviceName'] = 'iPhone 6s Simulator'
      caps['appium:platformVersion'] = '10.3'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.8.0'

      start_mobile_driver(caps)
      validate_google
    end
  end
end
