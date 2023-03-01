Feature: Cydeo login functionality
  Agile Story: User should login and see “orders” at the end of the URL
@this
  Scenario: Url verification
    Given user is on the cydeo table page
    When user enter Test in username box
    And user enter Tester in password box
    Then user should see URL ends with “orders”