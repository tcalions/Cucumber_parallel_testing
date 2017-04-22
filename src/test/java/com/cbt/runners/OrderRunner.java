package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"html:target/cucumber-report/order","json:target/cucumber-report/order/cucumber.json"},
		features="./src/test/resources/features/order",
		glue="com/cbt/step_defs"		
		)
public class OrderRunner {
	
}
