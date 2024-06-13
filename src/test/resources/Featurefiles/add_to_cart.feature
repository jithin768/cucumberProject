Feature: Add to cart

  Rule: Add from store

    @scenario1
    Scenario Outline: Add one quantity to the cart
      Given I'm on the Store page
      When I add a "<product_name>" to the cart
      Then I see 1 "<product_name>" to the cart
      Examples:
        | product_name |
        | Blue Shoes   |
        | Red Shoes    |

