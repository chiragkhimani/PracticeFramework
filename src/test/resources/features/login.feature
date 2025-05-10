Feature: Validate Login Function
  Developer - Vold
  Tester - Kenneth

 Scenario: Verify user can login with valid credential
   Given user open website
   When user login with valid credential
   Then verify user on homepage
