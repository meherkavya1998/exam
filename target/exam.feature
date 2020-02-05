
Feature: Testme App

  @Login
  Scenario Outline: Login functionality
    Given User navigated to login page
    When User enters username and password
    Then User logged in successfully 
   
    Examples:
   
      | username  | password    |
      | Lalitha   | password123 | 
    
