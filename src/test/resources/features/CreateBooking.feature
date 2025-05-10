Feature: Verify Create Booking API Call

  @api
  Scenario: Verify user can create new booking
    Given user wants to call "/booking" api call
    And user set header "Content-Type" to "application/json"
    And user set body from the file "create_booking.json"
    When user performs post request
    Then verify status code is 200

  @api
  Scenario: Verify user can fetch list of booking
    Given user wants to call "/booking" api call
    And user set header "Accept" to "application/json"
    When user performs get request
    Then verify status code is 200

  @api
  Scenario: Verify user can create a token
    Given user wants to call "/auth" api call
    And user set header "Content-Type" to "application/json"
    And user set body from the file "create_token.json"
    When user performs post request
    Then verify status code is 200
    And verify response body field "token" is not empty