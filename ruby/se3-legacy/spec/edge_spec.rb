require 'spec_helper'

describe 'Chrome' do
  include Utils

  let(:caps) { Selenium::WebDriver::Remote::Capabilities.edge }

  it 'latest Windows 10' do
    caps['platform'] = 'Windows 10'
    caps['version'] = 'latest'

    start_driver(caps)
    validate_google
  end

  it 'late Windows 10' do
    caps['platform'] = 'Windows 10'
    caps['version'] = '92'

    start_driver(caps)
    validate_google
  end

  it 'early Windows 10' do
    caps['platform'] = 'Windows 10'
    caps['version'] = '13'

    start_driver(caps)
    validate_google
  end

  it 'late Yosemite' do
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '81'

    start_driver(caps)
    validate_google
  end

  it 'early Yosemite' do
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '79'

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
    caps['version'] = '92'

    start_driver(caps)
    validate_google
  end

  it 'early Big Sur' do
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '79'

    start_driver(caps)
    validate_google
  end
end
