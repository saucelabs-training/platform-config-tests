require 'spec_helper'

describe 'Chrome' do
  include Utils

  let(:caps) { Selenium::WebDriver::Remote::Capabilities.chrome }

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
    caps['version'] = '26'

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
    caps['version'] = '92'

    start_driver(caps)
    validate_google
  end

  it 'early Windows 7' do
    caps['platform'] = 'Windows 7'
    caps['version'] = '26'

    start_driver(caps)
    validate_google
  end

  it 'late Linux' do
    caps['platform'] = 'Linux'
    caps['version'] = '48'

    start_driver(caps)
    validate_google
  end

  it 'early Linux' do
    caps['platform'] = 'Linux'
    caps['version'] = '26'

    start_driver(caps)
    validate_google
  end

  it 'late Yosemite' do
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '87'

    start_driver(caps)
    validate_google
  end

  it 'early Yosemite' do
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '37'

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
    caps['version'] = '69'

    start_driver(caps)
    validate_google
  end
end
