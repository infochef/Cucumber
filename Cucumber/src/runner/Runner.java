package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="Feature", glue = "stepdef",format = "pretty")
public class Runner extends  AbstractTestNGCucumberTests{

}
