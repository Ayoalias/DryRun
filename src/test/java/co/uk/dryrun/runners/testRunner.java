package co.uk.dryrun.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/dryrun/features"},
        glue = {"co/uk/dryrun/hooks", "co/uk/dryrun/stepDefinitions"},
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json",
                "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
                "junit:target/cucumber-result.xml"},
        tags =  "~@ignore"
)
public class testRunner {
}
