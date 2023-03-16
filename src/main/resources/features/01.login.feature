Feature: User Login Web Demoqa Shop

  Scenario: User valid login web demoqa shop
    Given User open browser and url
    When User click popup dismiss
    And User click link my account and scroll
    And User enter valid username
    And User enter valid password
    And User click checkbox remember me
    And User click button login
    And User go to page my account and scroll
    Then User get account name

  Scenario: User invalid login web demoqa shop
    Given User logout web demoqa shop
    When User scroll and enter invalid username
    And User enter invalid password
    And User click checkbox remember me
    And User click button login
    Then User get message error message
