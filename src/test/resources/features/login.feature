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
      | dhivas@gmail.com | dhivas321  | redirectHomepage     |
      | dhivas@gmail.com | dhivas     | alertButton          |
      | dhivas@mhs.com   | dhivas321  | alertButton          |
      | dhivas@gmail.com |            | passwordCanNotEmpty  |
      |                  | dhivas321  | emailCanNotEmpty     |

#  Login with valid data
#  Login with valid email & invalid password
#  Login with invalid email (belum terdaftar) & valid password
#  Login with input email & null password
#  Login with input password & null email
