Feature: Add Product to Cart Demoqa Shop

  Scenario: User choose product in demoqa shop
    Given User open browser and url
    When User click link my account and scroll
    And User login
    And User click link text checkout
    And User scroll and click button return to shop
    And User scroll and click product one
    And User click exit for quit product one
    And User scroll and click product two
    And User click button select product
    Then User go to page and get name product

  Scenario: User process product to cart
    When User scroll and select color
    And User select size
    And User click button increament
    And User click button decreament
    And User click button add to cart
    Then User get to confirm product

  Scenario: User view product in cart
    When User click button view cart
    And User scroll clear product
    Then User go to page cart
