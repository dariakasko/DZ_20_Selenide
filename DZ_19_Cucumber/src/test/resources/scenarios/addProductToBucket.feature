Feature: Add product to product bucket

  Background: I set up my env
    When I open Login page

  @run
  Scenario: Add product to bucket
    When I login to web site
    And I press on add to cart button
    Then Product gets into product bucket
