Feature: Register
  As a user
  I want to register account
  So that i can success register account

  Scenario Outline: As a user i want to register account
    Given I am on the product list
    When I click button login
    And I click text register
    And I input field fullname
    And I input field "<email>"
    And I input field "<password>"
    And I click register button
    Then I get "<result>"
    Examples:
      | email | password | result |




#  Input valid register
#  Input valid fullname,password & null email
#  Input valid fullname,email & null password
#  Input register with same data
