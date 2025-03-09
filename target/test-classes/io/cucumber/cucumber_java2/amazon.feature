@tag
Feature: Product search feature
  I want to use this template for my feature file

  @positive
  Scenario: Search for the product
    Given I am on the Amazon homepage
    When I search for "Apple iphone"
    And I select the first serach result
    Then I should see the product details page

