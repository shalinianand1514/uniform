package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/feature",
		glue ={"stepdefinition","hooks"}
		//tags={"@add,@run"}
		//tags={"@add,@run"}
		)
		

public class runner {

}
