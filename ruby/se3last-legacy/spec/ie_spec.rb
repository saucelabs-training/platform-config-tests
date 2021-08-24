require 'spec_helper'

describe 'Chrome' do
  include Utils

  let(:caps) { Selenium::WebDriver::Remote::Capabilities.internet_explorer }

  it 'late Windows 10' do
    caps['platform'] = 'Windows 10'
    caps['version'] = '11'

    start_driver(caps)
    validate_google
  end

  it 'late Windows 7' do
    caps['platform'] = 'Windows 7'
    caps['version'] = '11'

    start_driver(caps)
    validate_google
  end

  it 'early Windows 7' do
    caps['platform'] = 'Windows 7'
    caps['version'] = '9'

    start_driver(caps)
    validate_google
  end
end
