package com.tt.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
       features = {"Features"},
       glue = {"com.tt.stepdef"}
       
		
		)

public class Testrunner extends AbstractTestNGCucumberTests {

}
