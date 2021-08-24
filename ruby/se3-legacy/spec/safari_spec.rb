require 'spec_helper'

describe 'Chrome' do
  include Utils

  let(:caps) { Selenium::WebDriver::Remote::Capabilities.safari }

  it 'Yosemite' do
    caps['platform'] = 'OS X 10.10'
    caps['version'] = '8'

    start_driver(caps)
    validate_google
  end

  it 'Big Sur' do
    caps['platform'] = 'macOS 11.00'
    caps['version'] = '14'

    start_driver(caps)
    validate_google
  end
end
