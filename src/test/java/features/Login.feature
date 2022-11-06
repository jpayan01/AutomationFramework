@ApplicationLogin
Feature: Application Login

#  Background: Setup browser
#    Given User navigates to Green cart landing page

#  @LoginSuccess
#  Scenario: Search for a cucumber in product page
#    Given User searches "cucumber" in vegetables section
#    When User adds item to the cart
#    Then User sees shopping cart updated accordingly
#
#  @LoginFailed
#  Scenario: Search for carrots in product page
#    Given User navigates to Green cart landing page
#    When User searches "carrots" in vegetables section
#    Then User sees "carrots" on screen

  Scenario: Suggesting Class Example Demo
    Given I navigate to "https://rahulshettyacademy.com/AutomationPractice/" demo page
    When I Search for "ME" in input box
    Then I should be able to select "Mexico" from the auto suggestion list
#
#  Scenario: Dropdown Example dropbox demo
#    Given I navigate to "https://rahulshettyacademy.com/AutomationPractice/" demo page
#    Then I should be able to select "Option1" from dropdown button
#    And I should be able to select "Option1" from dropdown button

#  Scenario: Switch window Demo
#    Given I navigate to "https://rahulshettyacademy.com/AutomationPractice/"
#    When I click on the Open Window Button
#    Then I should see "30 day Money Back Guarantee" displayed on page
#
#  Scenario: Switch Tab Demo
#    Given I navigate to "https://rahulshettyacademy.com/AutomationPractice/"
#    When I click on the Open Tab Button
#    Then I should see "30 day Money Back Guarantee" displayed on page