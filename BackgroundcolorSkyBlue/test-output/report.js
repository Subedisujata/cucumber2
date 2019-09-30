$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Techfios/Spring2019/Driver/BackgroundcolorSkyBlue/src/test/java/features/colorcheck.feature");
formatter.feature({
  "line": 1,
  "name": "As a user i want to click on set skyblue background button so that i can change the backgound color",
  "description": "",
  "id": "as-a-user-i-want-to-click-on-set-skyblue-background-button-so-that-i-can-change-the-backgound-color",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sky Blue Background",
  "description": "",
  "id": "as-a-user-i-want-to-click-on-set-skyblue-background-button-so-that-i-can-change-the-backgound-color;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 9240494000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_button()"
});
formatter.result({
  "duration": 234675100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 121307600,
  "status": "passed"
});
});