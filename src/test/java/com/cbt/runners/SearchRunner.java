package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"html:target/cucumber-report/search","json:target/cucumber-report/search/cucumber.json"},
		features="./src/test/resources/features/search",
		glue="com/cbt/step_defs"		
		)
public class SearchRunner {
	
}
