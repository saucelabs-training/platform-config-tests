require 'spec_helper'

describe 'Linux' do
  include Utils

  it 'late Chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'Linux'
    caps[:version] = '48'

    start_driver(caps)
    validate_google
  end

  it 'early chrome version' do
    caps = Selenium::WebDriver::Remote::Capabilities.chrome
    caps[:platform] = 'Linux'
    caps[:version] = '26'

    start_driver(caps)
    validate_google
  end

  it 'late firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'Linux'
    caps[:version] = '45'

    start_driver(caps)
    validate_google
  end

  it 'early firefox version' do
    caps = Selenium::WebDriver::Remote::Capabilities.firefox
    caps[:platform] = 'Linux'
    caps[:version] = '4'

    start_driver(caps)
    validate_google
  end
end
