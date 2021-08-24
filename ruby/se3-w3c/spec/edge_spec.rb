require 'spec_helper'

describe 'Edge' do
  include Utils

  it 'latest Windows 10' do
    capabilities = {
      browser_name: 'MicrosoftEdge',
      browser_version: 'latest',
      platform_name: 'Windows 10',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'late Windows 10' do
    capabilities = {
      browser_name: 'MicrosoftEdge',
      browser_version: '92',
      platform_name: 'Windows 10',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'early Windows 10' do
    capabilities = {
      browser_name: 'MicrosoftEdge',
      browser_version: '79',
      platform_name: 'Windows 10',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'late Yosemite' do
    capabilities = {
      browser_name: 'MicrosoftEdge',
      browser_version: '81',
      platform_name: 'OS X 10.10',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'early Yosemite' do
    capabilities = {
      browser_name: 'MicrosoftEdge',
      browser_version: '79',
      platform_name: 'OS X 10.10',
      "sauce:options" => {
      }
    }
    start_driver(capabilities)
    validate_google
  end

  it 'latest Big Sur' do
    capabilities = {
      browser_name: 'MicrosoftEdge',
      browser_version: 'latest',
      platform_name: 'macOS 11.00',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'late Big Sur' do
    capabilities = {
      browser_name: 'MicrosoftEdge',
      browser_version: '92',
      platform_name: 'macOS 11.00',
      "sauce:options" => {
      }
    }
    start_driver(capabilities)
    validate_google
  end

  it 'early Big Sur' do
    capabilities = {
      browser_name: 'MicrosoftEdge',
      browser_version: '79',
      platform_name: 'macOS 11.00',
      "sauce:options" => {
      }
    }
    start_driver(capabilities)
    validate_google
  end
end
