package cucumberJava2;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json"}
//features={"src/test/java/cucumberJava2/cucumberJava2.feature"}
) 
public class TestRunner {
}
