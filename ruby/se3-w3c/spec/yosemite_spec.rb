require 'spec_helper'

describe 'Yosemite' do
  include Utils

  it 'late Chrome version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.chrome
    capabilities[:browser_version] = '87'
    capabilities[:platform_name] = 'OS X 10.10'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'early chrome version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.chrome
    capabilities[:browser_version] = '75'
    capabilities[:platform_name] = 'OS X 10.10'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'late edge version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.edge
    capabilities[:browser_version] = '81'
    capabilities[:platform_name] = 'OS X 10.10'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end

  it 'early edge version' do
    capabilities = Selenium::WebDriver::Remote::Capabilities.edge
    capabilities[:browser_version] = '79'
    capabilities[:platform_name] = 'OS X 10.10'
    capabilities['sauce:options'] = {}

    start_driver(capabilities)
    validate_google
  end
end
