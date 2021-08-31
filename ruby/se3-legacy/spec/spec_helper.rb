# frozen_string_literal: true
require 'rspec'
require 'selenium-webdriver'
require 'appium_lib'

RSpec.configure do |config|
  # Enable flags like --only-failures and --next-failure
  config.example_status_persistence_file_path = ".rspec_status"

  config.expect_with :rspec do |c|
    c.syntax = :expect
  end

  config.before do |example|
    @name = example.full_description
  end

  config.after do
    @driver.quit unless @driver.nil?
  end
end

module Utils
  def start_driver(caps)
    username = ENV['SAUCE_USERNAME']
    access_key = ENV['SAUCE_ACCESS_KEY']
    sauce_url = "https://#{username}:#{access_key}@ondemand.us-west-1.saucelabs.com/wd/hub"

    caps['name'] = @name
    caps['build'] = "Ruby Se3 Legacy - #{ENV['BUILD_TIME']}"

    @driver = Selenium::WebDriver.for(:remote,
                                      url: sauce_url,
                                      desired_capabilities: caps)
  end

  # This is only necessary because the Sauce caps are different for legacy Selenium with Appium
  def start_mobile_driver(caps)
    username = ENV['SAUCE_USERNAME']
    access_key = ENV['SAUCE_ACCESS_KEY']
    sauce_url = "https://#{username}:#{access_key}@ondemand.us-west-1.saucelabs.com/wd/hub"

    caps['sauce:name'] = @name
    caps['sauce:build'] = "Ruby Se3 Legacy - #{ENV['BUILD_TIME']}"

    @driver = Selenium::WebDriver.for(:remote,
                                      url: sauce_url,
                                      desired_capabilities: caps)
  end

  def validate_google
    @driver.get("http://google.com")
    sleep 1

    result = @driver.title == "Google" ? "passed" : "failed"
    @driver.execute_script("sauce:job-result=#{result}")
  end

  def start_appium_driver(caps)
    caps['sauce:name'] = @name
    caps['sauce:build'] = "Se3Legacy - #{ENV['BUILD_TIME']}"

    @driver = Appium::Driver.new({caps: caps.as_json }, false).start_driver
  end

  def validate_app
    sleep 1
    found = @driver.find_elements(:accessibility_id, "test-Username").size

    result = found > 0 ? 'passed' : 'failed'
    @driver.execute_script("sauce:job-result=#{result}")
  end
end
