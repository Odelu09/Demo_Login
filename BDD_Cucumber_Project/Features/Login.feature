Feature: Login

  Scenario Outline: Successful Login with Valid Credentials
    Given User lunch Chrome browser
    When User Open URL "<Url>"
    And User enters UserName as "<UserName>"
    And User enters Password as "<Passeord>"
    And Click on Login
    #Then 	Page Title should be "<title>"
    When User Click on Log Out link
    #	Then 	Page Title Shoulb be <Title>
    And Close Browser

    Examples: 
      | Url                                      		| UserName               | Password 		| 
      | https://opensource-demo.orangehrmlive.com/	| Admin								| admin123    | 