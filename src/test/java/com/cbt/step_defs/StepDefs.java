package com.cbt.step_defs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.SharedDriver;

public class StepDefs {
	
	private WebDriver driver;
	public StepDefs(SharedDriver sharedDriver){
		driver=sharedDriver;
	}
	
	@Given("^I am on home page$")
	public void I_am_on_home_page() throws Throwable {
	    driver.get("http://google.com");
	}

	@Then("^I should be able to (.*)$")
	public void I_should_be_able_to_login_one(String opt) throws Throwable {
	    driver.findElement(By.name("q")).sendKeys(opt);
	    Thread.sleep(2000);
	}
}
