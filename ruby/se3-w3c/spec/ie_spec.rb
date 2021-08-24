require 'spec_helper'

describe 'IE' do
  include Utils

  it 'Windows 10' do
    capabilities = {
      browser_name: 'internet explorer',
      browser_version: '11',
      platform_name: 'Windows 10',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'late Windows 7' do
    capabilities = {
      browser_name: 'internet explorer',
      browser_version: '11',
      platform_name: 'Windows 7',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'early Windows 7' do
    capabilities = {
      browser_name: 'internet explorer',
      browser_version: '10',
      platform_name: 'Windows 7',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end
end
