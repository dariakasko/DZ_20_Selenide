Feature: Login test with examples
  As a common user
  I want to be logged in
  So tha I send my credentials

  Background: I set up my env
    Given I open Login page

@run
  Scenario Outline: Login test positive scenario with examples
    When I enter '<username>' my username on the Login page
    And I enter 'secret_sauce' my password
    And I click Login button on the Login page
    Then The main page is displayed
      Examples:
      |         username        |
      |      standard_user      |
      |       problem_user      |
      | performance_glitch_user |