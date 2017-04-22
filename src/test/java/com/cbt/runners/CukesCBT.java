package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features="./src/test/resources/features",
		glue="com/cbt/step_defs"		
		)
public class CukesCBT {
	
}
