Feature: As a user I want to be able to navigate to different pages on the website

  Background: Starting from the homepage
    Given I am on the homepage

  Scenario: Going to the Pokedex hub page from the homepage
    When I click on the Pokedex hub link
    Then I will go to the Pokedex hub page

  Scenario: Going to the Pokearth page from the homepage
    When I click on the Pokearth link
    Then I will go to the Pokearth page

  Scenario: Going to the Sword & Shield pokedex from the homepage
    When I click on the Sword & Shield pokedex link
    Then I will go to the SwShPokedex