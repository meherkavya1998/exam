
Feature: Testme App

  @Login
  Scenario Outline: Login functionality
    Given Admin navigated to login page
    When Admin enters username and password
    Then Admin logged in successfully 
   
    Examples:
   
      | username  | password    |
      | admin   | Password456 | 
    
  @Sports
  Scenario Outline: Adding Sports category
  Given admin adds  category
  When  admin is able to add category
  Then admin adds subcategory
  
  Examples:
  
  |category| subcategory|
  | Sports | Basketball |
  |        | Volleyball |
  