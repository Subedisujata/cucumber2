package runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\Techfios\\Spring2019\\Driver\\BackgroundcolorSkyBlue\\src\\test\\java\\features\\colorcheck.feature"
		+ "", 
glue={"steps"},
dryRun=false,
plugin = {"pretty", "html:test-output"},
monochrome=true)
public class Runner {

}
