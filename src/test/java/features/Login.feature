@ApplicationLogin
Feature: Application Login

#  Background: Setup browser
#    Given User validates the browser
#    When Browser is triggered
#    Then Check browser is displayed

  @LoginSuccess
  Scenario: Login to homepage successfully
    Given User navigates to Green cart landing page
    When User searches "cucumber" in vegetables section
    Then User sees "cucumber" on screen

#  @LoginFailed
#  Scenario: Login to homepage incorrectly
#    Given User navigates to Green cart landing page
#    When User provides "marcela" credentials
#    Then User sees "message" on screen