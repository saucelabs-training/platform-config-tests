require 'spec_helper'

describe 'Safari' do
  include Utils

  it 'Big Sur' do
    capabilities = {
      browser_name: 'safari',
      browser_version: '14',
      platform_name: 'macOS 11.00',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end
end
