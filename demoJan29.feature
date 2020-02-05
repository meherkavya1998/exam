
Feature: Pixel store Pos
 Background:
 Given Team executive login
 @Login
 Scenario: Login functionality
 Given User navigated to login page
 When user enters username and password
 Then user logged in successfully

@RegressionTest1
  Scenario: Registration for Testme App
    Given Team is at signup for testmeApp
   When Team provides username
    And if username is available
    Then Team provides firstname,lastname,password,confirmpassword
    And Team continues to provide gender,email,mobileno,dob,address,secque,answer
    Then registration is successful
    
   @RegressionTest
  Scenario: Login
    Given Team executive provides username and password
    When items price is calculated
    Then bill is generated with final amount
 @FunctionalTest
  Scenario Outline:Sales executive signIn
  When Sales executive provides "<user>" and "<password>" as credentials
  Then Login is successful
 

    Examples: 
      | user    | password | 
      | Lalitha |password123 | 
     
 @datadriven
  Scenario: Search for product
  Given Team has registered in the Testme App
 When Team search
    Then Larry verifies the product available
  