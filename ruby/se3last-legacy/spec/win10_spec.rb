require 'spec_helper'

describe 'Windows 10' do
  include Utils

  it 'latest Chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'Windows 10'
    caps[:version] = 'latest'

    start_driver(caps)
    validate_google
  end

  it 'late Chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'Windows 10'
    caps[:version] = '92'

    start_driver(caps)
    validate_google
  end

  it 'early chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'Windows 10'
    caps[:version] = '26'

    start_driver(caps)
    validate_google
  end

  it 'latest edge version' do
    caps = Selenium::WebDriver::Remote::Capabilities.edge
    caps[:platform] = 'Windows 10'
    caps[:version] = 'latest'

    start_driver(caps)
    validate_google
  end

  it 'late edge version' do
    caps = Selenium::WebDriver::Remote::Capabilities.edge
    caps[:platform] = 'Windows 10'
    caps[:version] = '92'

    start_driver(caps)
    validate_google
  end

  it 'early edge version' do
    caps = Selenium::WebDriver::Remote::Capabilities.edge
    caps[:platform] = 'Windows 10'
    caps[:version] = '13'

    start_driver(caps)
    validate_google
  end

  it 'latest firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'Windows 10'
    caps[:version] = 'latest'

    start_driver(caps)
    validate_google
  end

  it 'late firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'Windows 10'
    caps[:version] = '91'

    start_driver(caps)
    validate_google
  end

  it 'early firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'Windows 10'
    caps[:version] = '4'

    start_driver(caps)
    validate_google
  end

  it 'ie' do
    caps = Selenium::WebDriver::Remote::Capabilities.ie
    caps[:platform] = 'Windows 10'
    caps[:version] = '11'

    start_driver(caps)
    validate_google
  end
end
