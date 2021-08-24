require 'spec_helper'

describe 'Firefox' do
  include Utils

  let(:caps) { Selenium::WebDriver::Remote::Capabilities.firefox }

  it 'latest Windows 10' do
    caps['platform'] = 'Windows 10'
    caps['version'] = 'latest'

    start_driver(caps)
    validate_google
  end

  it 'late Windows 10' do
    caps['platform'] = 'Windows 10'
    caps['version'] = '91'

    start_driver(caps)
    validate_google
  end

  it 'early Windows 10' do
    caps['platform'] = 'Windows 10'
    caps['version'] = '60'

    start_driver(caps)
    validate_google
  end

  it 'latest Windows 7' do
    caps['platform'] = 'Windows 7'
    caps['version'] = 'latest'

    start_driver(caps)
    validate_google
  end

  it 'late Windows 7' do
    caps['platform'] = 'Windows 7'
    caps['version'] = '91'

    start_driver(caps)
    validate_google
  end

  it 'early Windows 7' do
    caps['platform'] = 'Windows 7'
    caps['version'] = '4'

    start_driver(caps)
    validate_google
  end

  it 'late Yosemite' do
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '47'

    start_driver(caps)
    validate_google
  end

  it 'early Yosemite' do
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '32'

    start_driver(caps)
    validate_google
  end

  it 'latest Big Sur' do
    caps['platform'] = 'macOS 11.00'
    caps['version'] = 'latest'

    start_driver(caps)
    validate_google
  end

  it 'late Big Sur' do
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '91'

    start_driver(caps)
    validate_google
  end

  it 'early Big Sur' do
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '60'

    start_driver(caps)
    validate_google
  end
end
