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
    @build_name = "Ruby Se3 Legacy - #{ENV['BUILD_TIME']}"
  end

  config.after do |example|
    return if @driver.nil?

    result = example.exception ? "failed" : "passed"
    @driver.execute_script("sauce:job-result=#{result}")
    @driver.quit
  end
end

module Utils
  def start_desktop_driver(caps)
    caps['name'] = @name
    caps['build'] = @build_name

    start_driver(caps)
  end

  def start_mobile_driver(caps)
    caps['sauce:options']['name'] = @name
    caps['sauce:options']['build'] = @build_name

    start_driver(caps)
  end

  def start_driver(caps)
    sauce_url = "https://#{ENV['SAUCE_USERNAME']}:#{ENV['SAUCE_ACCESS_KEY']}@ondemand.us-west-1.saucelabs.com/wd/hub"

    @driver = Selenium::WebDriver.for(:remote,
                                      url: sauce_url,
                                      desired_capabilities: caps)
  end

  def validate_google
    @driver.get("http://google.com")

    expect(@driver.title).to eq("Google")
  end

  def start_appium_driver(caps)
    caps['sauce:options']['name'] = @name
    caps['sauce:options']['build'] = @build_name
    caps['appium:appWaitActivity'] = 'com.swaglabsmobileapp.MainActivity' if caps[:platform_name] == 'Android'

    # Appium defaults to Sauce when ENV is detected
    @driver = Appium::Driver.new({caps: caps.as_json }, false).start_driver
  end

  def validate_app
    expect(@driver.find_elements(:accessibility_id, "test-Username").size).to eq(1)
  end
end
