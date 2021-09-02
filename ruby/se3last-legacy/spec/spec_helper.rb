# frozen_string_literal: true
require 'rspec'
require 'selenium-webdriver'

RSpec.configure do |config|
  # Enable flags like --only-failures and --next-failure
  config.example_status_persistence_file_path = ".rspec_status"

  config.expect_with :rspec do |c|
    c.syntax = :expect
  end

  config.before do |example|
    @name = example.full_description
    @build_name = "Ruby Se3 Last Legacy - #{ENV['BUILD_TIME']}"
  end

  config.after do |example|
    unless @driver.nil?
      result = example.exception ? "failed" : "passed"
      @driver.execute_script("sauce:job-result=#{result}")
      @driver.quit
    end
  end
end

module Utils
  def start_driver(caps)
    username = ENV['SAUCE_USERNAME']
    access_key = ENV['SAUCE_ACCESS_KEY']
    sauce_url = "https://#{username}:#{access_key}@ondemand.us-west-1.saucelabs.com/wd/hub"

    caps[:name] = @name
    caps[:build] = @build_name

    @driver = Selenium::WebDriver.for(:remote,
                                      url: sauce_url,
                                      desired_capabilities: caps)
  end

  def validate_google
    @driver.get("http://google.com")

    expect(@driver.title).to eq("Google")
  end
end
