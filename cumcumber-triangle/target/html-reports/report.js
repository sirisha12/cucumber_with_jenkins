$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Myfile.feature");
formatter.feature({
  "line": 1,
  "name": "Test Triangle App",
  "description": "",
  "id": "test-triangle-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Signup and book a flight ticket.",
  "description": "",
  "id": "test-triangle-app;signup-and-book-a-flight-ticket.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigating to Test Triangle App",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user tick on the check Box",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should be taken to singUp page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters all the details in signup page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should be taken to filght booking page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user book the fight ticket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on confirm button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should be taken to payment gateway",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user provide all the details in payment page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "use click on paynow button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Message displayed payment was Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Testapp.user_navigating_to_Test_Triangle_App()"
});
formatter.result({
  "duration": 19424405912,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_tick_on_the_check_Box()"
});
formatter.result({
  "duration": 4134606839,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_click_on_next_button()"
});
formatter.result({
  "duration": 1575363457,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_should_be_taken_to_singUp_page()"
});
formatter.result({
  "duration": 124976,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_enters_all_the_details_in_signup_page()"
});
formatter.result({
  "duration": 14598254564,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_click_on_submit_button()"
});
formatter.result({
  "duration": 150680424,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_should_be_taken_to_filght_booking_page()"
});
formatter.result({
  "duration": 148522,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_book_the_fight_ticket()"
});
formatter.result({
  "duration": 10511631810,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_click_on_confirm_button()"
});
formatter.result({
  "duration": 164512896,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_should_be_taken_to_payment_gateway()"
});
formatter.result({
  "duration": 89355,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.user_provide_all_the_details_in_payment_page()"
});
formatter.result({
  "duration": 1075085732,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.use_click_on_paynow_button()"
});
formatter.result({
  "duration": 162071943,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.message_displayed_payment_was_Successfully()"
});
formatter.result({
  "duration": 1463875942,
  "status": "passed"
});
});