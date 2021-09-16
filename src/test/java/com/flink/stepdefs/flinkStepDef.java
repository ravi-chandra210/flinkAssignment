package com.flink.stepdefs;

import com.flink.pages.flinkPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flinkStepDef {
	
flinkPages flinkOb = new flinkPages();
	
	@Given("Load Test Data from {string}")
	public void load_Test_Data_from_and(String testCaseID) {
	    flinkOb.getSheetData(testCaseID);
	}
	
	@When("User navigates to Flink test URL")
	public void user_navigates_to_Flink_test_URL() {
	    flinkOb.launchflinkWebsite();
	}

	@Then("User should select the required product category according to temperature")
	public void user_should_select_the_required_product_category_according_to_temperature() {
	    flinkOb.selectProductCategory();
	}

	@When("User adds the cheapest moisturizers product in {string} and {string} to cart")
	public void user_adds_the_cheapest_moisturizers_product_in_and_to_cart(String prod1, String prod2) {
	    flinkOb.getCheapestProduct(prod1);
	    flinkOb.getCheapestProduct(prod2);
	}

	@When("User adds the cheapest sunscreens product in {string} and {string} to cart")
	public void user_adds_the_cheapest_sunscreens_product_in_and_to_cart(String prod3, String prod4) {
		flinkOb.getCheapestProduct(prod3);
	    flinkOb.getCheapestProduct(prod4);
	}

	@When("User clicks the cart and navigates to payment page.")
	public void user_clicks_the_cart_and_navigates_to_payment_page() {
	    flinkOb.clickCart();
	}

	@When("User clicks on Pay With Card and observes pop-up to enter payment details")
	public void user_clicks_on_Pay_With_Card_and_observes_pop_up_to_enter_payment_details() {
	    flinkOb.clickCard();
	}

	@Then("User enters valid credentials and clicks Pay")
	public void user_enters_valid_credentials_and_clicks_Pay() throws InterruptedException {
	    flinkOb.clickPay();
	}

	@Then("User should observe PAYMENT SUCCESS text")
	public void user_should_observe_PAYMENT_SUCCESS_text() {
	    flinkOb.successfulPayment();
	}

	@Then("Opened browsers should quit")
	public void opened_browsers_should_quit() {
	    flinkOb.closeBrowser();
	}

}

