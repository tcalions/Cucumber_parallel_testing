package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"html:target/cucumber-report/registration","json:target/cucumber-report/registration/cucumber.json"},
		features="./src/test/resources/features/registration",
		glue="com/cbt/step_defs"		
		)
public class RegistrationRunner {
	
}
