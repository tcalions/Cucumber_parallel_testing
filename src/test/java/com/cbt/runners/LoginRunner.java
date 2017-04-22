package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"html:target/cucumber-report/login","json:target/cucumber-report/login/cucumber.json"},
		features="./src/test/resources/features/login",
		glue="com/cbt/step_defs"		
		)
public class LoginRunner {
	
}
