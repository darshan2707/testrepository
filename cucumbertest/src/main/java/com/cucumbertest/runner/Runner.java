package com.cucumbertest.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", 
		plugin = {"html:reports/HTML/",
		"json:reports/JASON/cucumber.json", 
		"pretty:reports/TEXT/cucumber-pretty.txt",
	},
		dryRun=false,
		strict=true,
		glue= {"com.test.stepdef","com.test.locators"},
		tags= {"@first"}
			
		
		
		)
public class Runner {

}
