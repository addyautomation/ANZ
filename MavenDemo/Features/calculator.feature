Feature: Borrowing Calculator validation

Scenario: Validate Borrowing Calculator Test

Given User launches given URL
When  User enters all the details
And   User clicks on workout button
Then  User is displayed with valid message
Then user clicks on Start Over menu
And User enters details
Then user validates the displayed message
 