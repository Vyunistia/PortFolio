Feature: Adding product in CircleBi application

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application


Scenario: Adding product
  When user clicks on products button
  And user clicks on Services product
  And user enter 6 digit code product
  And user enter product name
  Then user click on add new data button

  Scenario: search product
    When user clicks on products button
    And user clicks on Services product
    And user enter 6 digit code product
    And user enter product name
    Then user click on search button

    Scenario: adding product bundle
      When user clicks on products button
      And user clicks on product bundle
      And user enter product bundle name
      And user enter 6 digit code product bundle
      And user click on search button of product bundle
      Then user click on addNewBundleButton

      Scenario: adding bundle detail
        When user clicks on products button
        And user clicks on product bundle
        Then user clicks on AddNewBundleItem






