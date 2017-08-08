package stepDefinitions;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {"@SmokeTest"},
		glue = { "classpath:stepDefinitions" }
		)

public class RunCukeTest {

}
