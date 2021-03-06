require 'spec_helper'

describe 'Mobile with Appium' do
  include Utils
  iOS = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.zip"
  android = "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk"

  let(:caps) { Selenium::WebDriver::Remote::Capabilities.new }

  describe 'Browser' do
    it 'runs latest Android with latest Appium' do
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Chrome'
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.2'

      start_appium_driver(caps)
      validate_google
    end

    it 'runs latest Android with earliest Appium' do
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Chrome'
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.15.0'

      start_appium_driver(caps)
      validate_google
    end

    it 'runs earliest Android with latest Appium' do
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Browser'
      caps['appium:deviceName'] = 'Android Emulator'
      caps['appium:platformVersion'] = '5.1'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.2'

      start_appium_driver(caps)
      validate_google
    end

    it 'runs earliest Android with earliest Appium Stated' do
      skip('1.8.0 does not convert timeout calls, so get error')
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Browser'
      caps['appium:deviceName'] = 'Android Emulator'
      caps['appium:platformVersion'] = '5.1'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.8.0'

      start_appium_driver(caps)
      validate_google
    end

    it 'runs earliest Android with earliest Appium Actual' do
      caps['platformName'] = 'Android'
      caps['browserName'] = 'Browser'
      caps['appium:deviceName'] = 'Android Emulator'
      caps['appium:platformVersion'] = '5.1'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.9.1'

      start_appium_driver(caps)
      validate_google
    end

    it 'runs latest iOS' do
      caps['platformName'] = 'iOS'
      caps['browserName'] = 'Safari'
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '14.5'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.1'

      start_appium_driver(caps)
      validate_google
    end

    it 'with earliest iOS' do
      caps['platformName'] = 'iOS'
      caps['browserName'] = 'Safari'
      caps['appium:deviceName'] = 'iPhone 6s Simulator'
      caps['appium:platformVersion'] = '10.3'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.8.0'

      start_appium_driver(caps)
      validate_google
    end
  end

  describe 'Native App' do
    it 'runs latest Android with latest Appium' do
      caps['platformName'] = 'Android'
      caps['appium:app'] = android
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.2'
      caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity'

      start_appium_driver(caps)
      validate_app
    end

    it 'runs latest Android with earliest Appium' do
      caps['platformName'] = 'Android'
      caps['appium:app'] = android
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.15.0'
      caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity'

      start_appium_driver(caps)
      validate_app
    end

    it 'runs earliest Android with latest Appium' do
      caps['platformName'] = 'Android'
      caps['appium:app'] = android
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '5.1'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.2'
      caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity'

      start_appium_driver(caps)
      validate_app
    end

    it 'runs earliest Android with earliest Appium' do
      caps['platformName'] = 'Android'
      caps['appium:app'] = android
      caps['appium:deviceName'] = 'Android GoogleAPI Emulator'
      caps['appium:platformVersion'] = '5.1'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.8.0'
      caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity'

      start_appium_driver(caps)
      validate_app
    end

    it 'runs latest iOS' do
      caps['platformName'] = 'iOS'
      caps['appium:app'] = iOS
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '14.5'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.20.1'

      start_appium_driver(caps)
      validate_app
    end

    it 'with earliest iOS Stated' do
      skip('10.3 does not want to start an app; skip because takes too long to fail')
      caps['platformName'] = 'iOS'
      caps['appium:app'] = iOS
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '10.3'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.8.0'

      start_appium_driver(caps)
      validate_app
    end

    it 'with earliest iOS Actual' do
      caps['platformName'] = 'iOS'
      caps['appium:app'] = iOS
      caps['appium:deviceName'] = 'iPhone Simulator'
      caps['appium:platformVersion'] = '11.0'
      caps['sauce:options'] = {}
      caps['sauce:options']['appiumVersion'] = '1.8.0'

      start_appium_driver(caps)
      validate_app
    end
  end
end
