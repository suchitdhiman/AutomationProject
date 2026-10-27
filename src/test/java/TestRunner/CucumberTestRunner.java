package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		tags="",
		features="src/test/resources/Features",
		plugin= {"pretty","html:target/cucumber-reports.html"},
		glue="StepDefinations" 
		)


public class CucumberTestRunner extends AbstractTestNGCucumberTests{
 
}
