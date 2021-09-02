require 'spec_helper'

describe 'Windows 10' do
  include Utils

  it 'latest Chrome version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.chrome
    capabilities[:browser_version] = 'latest'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end

  it 'late Chrome version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.chrome
    capabilities[:browser_version] = '92'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end

  it 'early chrome version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.chrome
    capabilities[:browser_version] = '75'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end

  it 'latest edge version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.edge
    capabilities[:browser_version] = 'latest'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end

  it 'late edge version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.edge
    capabilities[:browser_version] = '92'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end

  it 'early edge version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.edge
    capabilities[:browser_version] = '79'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end

  it 'latest firefox version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.firefox
    capabilities[:browser_version] = 'latest'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end

  it 'late firefox version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.firefox
    capabilities[:browser_version] = '91'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end

  it 'early firefox version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.firefox
    capabilities[:browser_version] = '60'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end

  it 'ie' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.ie
    capabilities[:browser_version] = '11'
    capabilities[:platform_name] = 'Windows 10'
    capabilities['sauce:options'] = {}

    start_desktop_driver(caps)
    validate_google
  end
end
