Feature: Login related scenarios

  Background: Given user is navigated to CircleBI application

    @login
  Scenario: Valid admin login
    When user enters valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application

      @invalid
    Scenario: Invalid admin login
        When user enters invalid admin user and password
        And user clicks on login button
        Then error message displayed






