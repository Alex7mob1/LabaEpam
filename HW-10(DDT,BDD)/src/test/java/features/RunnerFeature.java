package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/rozetka.feature",
        glue = {"rozetka.defenitions"

        })
public class RunnerFeature {
}
