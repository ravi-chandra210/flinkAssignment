$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/flinkFeatures/flinkTaskChrome.feature");
formatter.feature({
  "name": "Add products to cart and perform Payment.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should select required products and perform payment.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Load Test Data from \"\u003cTest_ID\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User navigates to Flink test URL",
  "keyword": "When "
});
formatter.step({
  "name": "User should select the required product category according to temperature",
  "keyword": "Then "
});
formatter.step({
  "name": "User adds the cheapest moisturizers product in \"\u003cprod1\u003e\" and \"\u003cprod2\u003e\" to cart",
  "keyword": "When "
});
formatter.step({
  "name": "User adds the cheapest sunscreens product in \"\u003cprod3\u003e\" and \"\u003cprod4\u003e\" to cart",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks the cart and navigates to payment page.",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on Pay With Card and observes pop-up to enter payment details",
  "keyword": "When "
});
formatter.step({
  "name": "User enters valid credentials and clicks Pay",
  "keyword": "Then "
});
formatter.step({
  "name": "User should observe PAYMENT SUCCESS text",
  "keyword": "Then "
});
formatter.step({
  "name": "Opened browsers should quit",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Test_ID",
        "",
        "prod1",
        "",
        "prod2",
        "",
        "prod3",
        "",
        "prod4"
      ]
    },
    {
      "cells": [
        "TC_01",
        "",
        "Aloe",
        "",
        "Almond",
        "",
        "SPF-50",
        "",
        "SPF-30"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should select required products and perform payment.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Load Test Data from \"TC_01\"",
  "keyword": "Given "
});
formatter.match({
  "location": "flinkStepDef.load_Test_Data_from_and(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Flink test URL",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_navigates_to_Flink_test_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the required product category according to temperature",
  "keyword": "Then "
});
formatter.match({
  "location": "flinkStepDef.user_should_select_the_required_product_category_according_to_temperature()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds the cheapest moisturizers product in \"Aloe\" and \"Almond\" to cart",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_adds_the_cheapest_moisturizers_product_in_and_to_cart(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds the cheapest sunscreens product in \"SPF-50\" and \"SPF-30\" to cart",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_adds_the_cheapest_sunscreens_product_in_and_to_cart(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the cart and navigates to payment page.",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_clicks_the_cart_and_navigates_to_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Pay With Card and observes pop-up to enter payment details",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_clicks_on_Pay_With_Card_and_observes_pop_up_to_enter_payment_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid credentials and clicks Pay",
  "keyword": "Then "
});
formatter.match({
  "location": "flinkStepDef.user_enters_valid_credentials_and_clicks_Pay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should observe PAYMENT SUCCESS text",
  "keyword": "Then "
});
formatter.match({
  "location": "flinkStepDef.user_should_observe_PAYMENT_SUCCESS_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Opened browsers should quit",
  "keyword": "And "
});
formatter.match({
  "location": "flinkStepDef.opened_browsers_should_quit()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/flinkFeatures/flinkTaskFirefox.feature");
formatter.feature({
  "name": "Add products to cart and perform Payment.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should select required products and perform payment.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Load Test Data from \"\u003cTest_ID\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User navigates to Flink test URL",
  "keyword": "When "
});
formatter.step({
  "name": "User should select the required product category according to temperature",
  "keyword": "Then "
});
formatter.step({
  "name": "User adds the cheapest moisturizers product in \"\u003cprod1\u003e\" and \"\u003cprod2\u003e\" to cart",
  "keyword": "When "
});
formatter.step({
  "name": "User adds the cheapest sunscreens product in \"\u003cprod3\u003e\" and \"\u003cprod4\u003e\" to cart",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks the cart and navigates to payment page.",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on Pay With Card and observes pop-up to enter payment details",
  "keyword": "When "
});
formatter.step({
  "name": "User enters valid credentials and clicks Pay",
  "keyword": "Then "
});
formatter.step({
  "name": "User should observe PAYMENT SUCCESS text",
  "keyword": "Then "
});
formatter.step({
  "name": "Opened browsers should quit",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Test_ID",
        "",
        "prod1",
        "",
        "prod2",
        "",
        "prod3",
        "",
        "prod4"
      ]
    },
    {
      "cells": [
        "TC_02",
        "",
        "Aloe",
        "",
        "Almond",
        "",
        "SPF-50",
        "",
        "SPF-30"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should select required products and perform payment.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Load Test Data from \"TC_02\"",
  "keyword": "Given "
});
formatter.match({
  "location": "flinkStepDef.load_Test_Data_from_and(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Flink test URL",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_navigates_to_Flink_test_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the required product category according to temperature",
  "keyword": "Then "
});
formatter.match({
  "location": "flinkStepDef.user_should_select_the_required_product_category_according_to_temperature()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds the cheapest moisturizers product in \"Aloe\" and \"Almond\" to cart",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_adds_the_cheapest_moisturizers_product_in_and_to_cart(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds the cheapest sunscreens product in \"SPF-50\" and \"SPF-30\" to cart",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_adds_the_cheapest_sunscreens_product_in_and_to_cart(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the cart and navigates to payment page.",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_clicks_the_cart_and_navigates_to_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Pay With Card and observes pop-up to enter payment details",
  "keyword": "When "
});
formatter.match({
  "location": "flinkStepDef.user_clicks_on_Pay_With_Card_and_observes_pop_up_to_enter_payment_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid credentials and clicks Pay",
  "keyword": "Then "
});
formatter.match({
  "location": "flinkStepDef.user_enters_valid_credentials_and_clicks_Pay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should observe PAYMENT SUCCESS text",
  "keyword": "Then "
});
formatter.match({
  "location": "flinkStepDef.user_should_observe_PAYMENT_SUCCESS_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Opened browsers should quit",
  "keyword": "And "
});
formatter.match({
  "location": "flinkStepDef.opened_browsers_should_quit()"
});
formatter.result({
  "status": "passed"
});
});