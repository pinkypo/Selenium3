package stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = {"FeatureFiles"},
		glue={"stepdef"},
		//plugin = {"html:target/Report.html" }
		//dryRun = true,
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" },
		plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber", "json:target/cucumber.json" },
		
	    tags= "@Sainty and not @Regression"
	    // tags= "@Regression"

		)
 
public class TestRunner 
{
	
 
}


