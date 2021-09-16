Feature: Add products to cart and perform Payment.

Scenario Outline: User should select required products and perform payment.
Given Load Test Data from "<Test_ID>"
When User navigates to Flink test URL
Then User should select the required product category according to temperature
When User adds the cheapest moisturizers product in "<prod1>" and "<prod2>" to cart
When User adds the cheapest sunscreens product in "<prod3>" and "<prod4>" to cart
When User clicks the cart and navigates to payment page.
When User clicks on Pay With Card and observes pop-up to enter payment details
Then User enters valid credentials and clicks Pay
Then User should observe PAYMENT SUCCESS text
And Opened browsers should quit

Examples:
		|Test_ID||prod1||prod2||prod3||prod4|
		|TC_01||Aloe||Almond||SPF-50||SPF-30|