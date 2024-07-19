package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/Feature"},
		glue="StepDefination",
		monochrome=true,
		dryRun=true
		)
public class RunnerTest {

}

