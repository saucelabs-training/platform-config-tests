require 'spec_helper'

describe 'Windows 7' do
  include Utils

  it 'latest Chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'Windows 7'
    caps[:version] = 'latest'

    start_desktop_driver(caps)
    validate_google
  end

  it 'late Chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'Windows 7'
    caps[:version] = '92'

    start_desktop_driver(caps)
    validate_google
  end

  it 'early chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'Windows 7'
    caps[:version] = '26'

    start_desktop_driver(caps)
    validate_google
  end

  it 'latest firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'Windows 7'
    caps[:version] = 'latest'

    start_desktop_driver(caps)
    validate_google
  end

  it 'late firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'Windows 7'
    caps[:version] = '91'

    start_desktop_driver(caps)
    validate_google
  end

  it 'early firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'Windows 7'
    caps[:version] = '4'

    start_desktop_driver(caps)
    validate_google
  end

  it 'late ie version' do
    caps = Selenium::WebDriver::Remote::Capabilities.ie
    caps[:platform] = 'Windows 7'
    caps[:version] = '11'

    start_desktop_driver(caps)
    validate_google
  end

  it 'early ie version' do
    caps = Selenium::WebDriver::Remote::Capabilities.ie
    caps[:platform] = 'Windows 7'
    caps[:version] = '9'

    start_desktop_driver(caps)
    validate_google
  end
end
