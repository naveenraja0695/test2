Feature: Magneto login funtion

  Background: 
    Given user open the Magento website

  Scenario: Successful login with valid credentials
    When user click on the signin button
    And user enter valid login credentials "email84147@gmail.com" and "Password@123"
    And user sigin to the website 
    Then user should be redirected to the account dashboard
