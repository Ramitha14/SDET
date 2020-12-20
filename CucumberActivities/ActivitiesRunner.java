package CucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@Activity2_5",
    plugin = {"html:src/test/java/test-reports/test-reports.html"},
    monochrome = true
)

public class ActivitiesRunner {
  //empty
}
