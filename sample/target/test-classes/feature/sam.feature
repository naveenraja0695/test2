Feature: Magento sign up function

  Scenario: User signs up with valid details
    Given user open the Magento website
    When user click on the "Create an Account" link
    And user enter valid details for "firstname", "lastname", "email84147@gmail.com", "Password@123" and "Password@123"
    And user click on the "Create an Account" button
    Then user should see a success message after account creation
 