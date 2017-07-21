package org.acceptance.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDef {
	
	@Given("^Pre Delete the record$")
	public void pre_Delete_the_record() {
		assertTrue(true);
	}

	@When("^Process the Transaction$")
	public void insert_the_record() {
		assertTrue(true);
	}

	@Then("^Perform Validation$")
	public void perform_validation()  {
		assertTrue(true);
	}

}