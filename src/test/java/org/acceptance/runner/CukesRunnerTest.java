package org.acceptance.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = { "pretty", "html:target/cucumber-html-report" },
		glue = "org.acceptance.steps",
		features = "classpath:features/tutorial.feature"
		,tags = "@test1")
public class CukesRunnerTest  {

}
