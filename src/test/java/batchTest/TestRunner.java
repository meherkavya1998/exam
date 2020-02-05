package batchTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="demoJan29.feature",glue= {"batchTest"},tags= {"@Login"},plugin= {"json:target/cucumber-report.json"})
public class TestRunner {

	
	
	
}
