require 'spec_helper'

describe 'Firefox' do
  include Utils

  it 'latest Windows 10' do
    capabilities = {
      browser_name: 'firefox',
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
      browser_name: 'firefox',
      browser_version: '91',
      platform_name: 'Windows 10',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'early Windows 10' do
    capabilities = {
      browser_name: 'firefox',
      browser_version: '60',
      platform_name: 'Windows 10',
      "sauce:options" => {
      }
    }
    start_driver(capabilities)
    validate_google
  end

  it 'latest Windows 7' do
    capabilities = {
      browser_name: 'firefox',
      browser_version: 'latest',
      platform_name: 'Windows 7',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'late Windows 7' do
    capabilities = {
      browser_name: 'firefox',
      browser_version: '91',
      platform_name: 'Windows 7',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'early Windows 7' do
    capabilities = {
      browser_name: 'firefox',
      browser_version: '60',
      platform_name: 'Windows 7',
      "sauce:options" => {
      }
    }
    
    start_driver(capabilities)
    validate_google
  end
  
  it 'latest Big Sur' do
    capabilities = {
      browser_name: 'firefox',
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
      browser_name: 'firefox',
      browser_version: '91',
      platform_name: 'macOS 11.00',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end

  it 'early Big Sur' do
    capabilities = {
      browser_name: 'firefox',
      browser_version: '60',
      platform_name: 'macOS 11.00',
      "sauce:options" => {
      }
    }

    start_driver(capabilities)
    validate_google
  end
end
