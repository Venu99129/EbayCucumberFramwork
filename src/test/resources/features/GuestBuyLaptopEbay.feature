Feature: testing purchasing

Scenario: Purchase a laptop on eBay as a guest
  Given I am on the eBay homepage
  When I search for "laptop" in the search bar
  And I click on the Buy it now button in search page
  And I choose the first product listed
  And I click on the buy it now button in item page
  And I choose to check out as guest
  Then I should see the details of the item and shipping and tax prices

  And the sum of all prices should equal the Order Total

Scenario: perches two items
  Given I am on the eBay homepage
  When I search for "laptop" in the search bar
  And I click on the Buy it now button in search page
  And I choose the first product listed
  And I click on the add to cart button in item page
#  When close cart popup
  Then go to main page
  When I search for "iphone" in the search bar
  And I click on the Buy it now button in search page
  And I choose the first product listed
  And select color of phone
  And I click on the add to cart button in item page
#  When close cart popup
  Then go to main page
  When click on cart icon
  Then get the cart item prices
  And verify the prices of total
