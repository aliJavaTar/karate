Feature: Test HiController



  Scenario: Get the current state of the hi endpoint
    Given url 'http://localhost:8080/search/hi'
    And header Content-Type = 'application/json'
    When method GET
    Then status code should be 200
    And match response contains "Hello, Traveler! Welcome to the Karate World!"
