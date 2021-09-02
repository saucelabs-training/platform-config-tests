require 'spec_helper'

describe 'Windows 7' do
  include Utils

  it 'latest Chrome version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.chrome
    capabilities[:browser_version] = 'latest'
    capabilities[:platform_name] = 'Windows 7'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'late Chrome version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.chrome
    capabilities[:browser_version] = '92'
    capabilities[:platform_name] = 'Windows 7'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'early chrome version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.chrome
    capabilities[:browser_version] = '75'
    capabilities[:platform_name] = 'Windows 7'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'latest firefox version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.firefox
    capabilities[:browser_version] = 'latest'
    capabilities[:platform_name] = 'Windows 7'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'late firefox version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.firefox
    capabilities[:browser_version] = '91'
    capabilities[:platform_name] = 'Windows 7'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'early firefox version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.firefox
    capabilities[:browser_version] = '60'
    capabilities[:platform_name] = 'Windows 7'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'late ie version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.ie
    capabilities[:browser_version] = '11'
    capabilities[:platform_name] = 'Windows 7'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'early ie version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.ie
    capabilities[:browser_version] = '10'
    capabilities[:platform_name] = 'Windows 7'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end
end
