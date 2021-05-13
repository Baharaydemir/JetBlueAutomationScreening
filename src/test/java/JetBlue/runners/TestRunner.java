package JetBlue.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "JetBlue/steps",
        dryRun = false,
        tags = "@TC1"
)

public class TestRunner {




}
