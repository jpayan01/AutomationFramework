@ApplicationLogin
Feature: Application Login

  Background: Setup browser
    Given User validates the browser
    When Browser is triggered
    Then Check browser is displayed

  @LoginSuccess
  Scenario: Login to homepage successfully
    Given User navigates to homepage
    When User provides "jpayan01" credentials
    Then User sees "message" on screen

  @LoginFailed
  Scenario: Login to homepage incorrectly
    Given User navigates to homepage
    When User provides "marcela" credentials
    Then User sees "message" on screen