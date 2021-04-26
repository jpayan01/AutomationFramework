@ApplicationLogin
Feature: Application Login

  Background: Setup browser
    Given User navigates to Green cart landing page

  @LoginSuccess
  Scenario: Search for a cucumber in product page
    Given User searches "cucumber" in vegetables section
    When User adds item to the cart
    Then User sees shopping cart updated accordingly

  @LoginFailed
  Scenario: Search for carrots in product page
    Given User navigates to Green cart landing page
    When User searches "carrots" in vegetables section
    Then User sees "carrots" on screen