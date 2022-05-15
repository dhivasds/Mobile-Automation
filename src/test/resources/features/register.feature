Feature: Register
  As a user
  I want to register account
  So that i can success register account

  Scenario Outline: As a user i want to register account
    Given I am on the product list
    When I click button sign in
    And I click text register
    And I input field fullname
    And I input field "<email>" email
    And I input field "<password>" password
    And I click register button
    Then I get "<result>" in register
    Examples:
      | email | password | result |
      | dhivasDS2@gmail.com | dhivas321  | redirectLogin    |
      |                     | dhivas321  | emailCantEmpty   |
      | dhivas@gmail.com    |            | passwordCantEmpty|
      | dhivasDS2@gmail.com | dhivas321  | registerSameData |


#  Input valid register
#  Input valid fullname,password & null email
#  Input valid fullname,email & null password
#  Input register with same data
