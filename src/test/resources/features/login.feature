Feature: Login
  As a user
  I want to login
  So that i can access homepage


  Scenario Outline: Login
    Given I am on the product list
    When I click button sign in
    And I input field email "<email>" in login
    And I input field password "<password>" in login
    And I click button login
    Then I get the "<result>"
    Examples:
      | email | password | result |
      | a                | a                | redirectHomepage |
      | emailInvalid     | a                | alertButton  |
      | a                | passwordInvalid  | alertButton |
      | a                |                  | passwordCanNotEmpty           |
      |                  | a                | emailCanNotEmpty              |