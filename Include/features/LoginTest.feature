Feature: Login feature

  Scenario Outline: Verfiy the username after logging into the applicaion
    Given User navigates to login page
    When User enters <username> and <password>
    And Clicks on Login button
    Then Logged user is <user>

    Examples: 
      | username | password                 | user   |
      | Admin    | hUKwJTbofgPU9eVlw/CnDQ== | Bezabh |
      
      
#The user changes everyday , you might need to change the user to new user for today (Ex. Bezabh to Paul)
