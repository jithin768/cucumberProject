package awesomecucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        plugin = {"pretty","html:target/cucumber.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        //dryRun = true,
        monochrome = true,
        tags="@scenario",
        glue={"awesomecucumber.stepdef","awesomecucumber.hooks","awesomecucumber.types"},
        features="src/test/resources/Featurefiles"

)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void beforeClass(){
        System.out.println("\nIn Before Class\n");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("\nIn after Class\n");
    }
}