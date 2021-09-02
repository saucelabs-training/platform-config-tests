require 'spec_helper'

describe 'Yosemite' do
  include Utils

  it 'late Chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'OS X 10.10'
    caps[:version] = '87'

    start_driver(caps)
    validate_google
  end

  it 'early chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'OS X 10.10'
    caps[:version] = '37'

    start_driver(caps)
    validate_google
  end

  it 'late edge version' do
    caps = Selenium::WebDriver::Remote::Capabilities.edge
    caps[:platform] = 'OS X 10.10'
    caps[:version] = '81'

    start_driver(caps)
    validate_google
  end

  it 'early edge version' do
    caps = Selenium::WebDriver::Remote::Capabilities.edge
    caps[:platform] = 'OS X 10.10'
    caps[:version] = '79'

    start_driver(caps)
    validate_google
  end

  it 'late firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'OS X 10.10'
    caps[:version] = '47'

    start_driver(caps)
    validate_google
  end

  it 'early firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'OS X 10.10'
    caps[:version] = '32'

    start_driver(caps)
    validate_google
  end

  it 'safari' do
    caps = Selenium::WebDriver::Remote::Capabilities.safari
    caps[:platform] = 'OS X 10.10'
    caps[:version] = '8'

    start_driver(caps)
    validate_google
  end
end
