package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features//GuoJiBusinessSystems.feature",
        glue= {"stepDefs"},
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json","html:target/cucumber-reports"},
        monochrome = true)

public class TestRunner {


}
