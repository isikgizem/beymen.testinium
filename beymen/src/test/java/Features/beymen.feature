@Test
Feature: Check at "Beymen"
  Scenario: "Beymen" website control

    Given I open the "Beymen" website
    And Enter the word "shorts" in the search box
    And The word “shorts” entered in the search box is deleted
    And Enter the word "shirt" in the search box
    When I click "Ara" button
    And A random product is selected from the products
    And The selected product is added to the cart.
    And I increase the number of products and make two
    And I delete the items in the cart
    Then I check that the basket is empty