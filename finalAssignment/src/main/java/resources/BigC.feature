
Feature: test app BigC
  Background:Open app BigC
    Given user clicks next and star shopping

  Scenario: Verify Home Screen
    Then verify menu items and cart should be displayed

 Scenario: Verify Categories Screen
    Given access to Categories Screen
    And Click to milk
    And Click frist Item
    Then verify add to cart ,img, title, price, details should be displayed

  Scenario:Verify Band Screen
    Given access to Brand Screen
    And Click to Milo
    And verify Nescafe, Milo, Maggi, Nestea should be displayed
    Then Click Milo
    Then verify add to cart ,img, title, price, promotion should be displayed

  Scenario: Verify Add to cart
    Given click search box in main screen
    And Input "sữa" to search box click Enter
    And Click to frist product
    Then verify add to cart ,img, title, price, details should be displayed
    And add to cart
    Then verify some Item should be displayed

  Scenario: Verify cart
    Given click search box in main screen
    And Input "sữa" to search box click Enter
    And Click to frist product
    And add to cart
    And click to "giỏ hàng"
    Then verify items in "giỏ hàng"
