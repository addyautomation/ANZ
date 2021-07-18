$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/calculator.feature");
formatter.feature({
  "name": "Borrowing Calculator validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Borrowing Calculator Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launches given URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launches_given_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters all the details",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_all_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on workout button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_workout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is displayed with valid message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_is_displayed_with_valid_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Start Over menu",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_Start_Over_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters details",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the displayed message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_validates_the_displayed_message()"
});
formatter.result({
  "status": "passed"
});
});