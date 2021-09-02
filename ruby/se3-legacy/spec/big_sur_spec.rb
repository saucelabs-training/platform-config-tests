require 'spec_helper'

describe 'Big Sur' do
  include Utils

  it 'latest Chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'macOS 11.00'
    caps[:version] = 'latest'

    start_desktop_driver(caps)
    validate_google
  end

  it 'late Chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'macOS 11.00'
    caps[:version] = '92'

    start_desktop_driver(caps)
    validate_google
  end

  it 'early chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'macOS 11.00'
    caps[:version] = '69'

    start_desktop_driver(caps)
    validate_google
  end

  it 'latest edge version' do
    caps = Selenium::WebDriver::Remote::Capabilities.edge
    caps[:platform] = 'macOS 11.00'
    caps[:version] = 'latest'

    start_desktop_driver(caps)
    validate_google
  end

  it 'late edge version' do
    caps = Selenium::WebDriver::Remote::Capabilities.edge
    caps[:platform] = 'macOS 11.00'
    caps[:version] = '92'

    start_desktop_driver(caps)
    validate_google
  end

  it 'early edge version' do
    caps = Selenium::WebDriver::Remote::Capabilities.edge
    caps[:platform] = 'macOS 11.00'
    caps[:version] = '79'

    start_desktop_driver(caps)
    validate_google
  end

  it 'latest firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'Windows 10'
    caps[:version] = 'latest'

    start_desktop_driver(caps)
    validate_google
  end

  it 'late firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'macOS 11.00'
    caps[:version] = '91'

    start_desktop_driver(caps)
    validate_google
  end

  it 'early firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'macOS 11.00'
    caps[:version] = '60'

    start_desktop_driver(caps)
    validate_google
  end

  it 'safari' do
    caps = Selenium::WebDriver::Remote::Capabilities.safari
    caps[:platform] = 'macOS 11.00'
    caps[:version] = '14'

    start_desktop_driver(caps)
    validate_google
  end
end
