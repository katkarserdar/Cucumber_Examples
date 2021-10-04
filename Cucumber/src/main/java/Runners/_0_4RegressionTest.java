package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(


        tags = "@RegressionTest",
        features = {"src/test/java"},
        glue = {"stepDefination"},
        plugin = {
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml"
        },
        dryRun = false

)

public class _0_4RegressionTest extends AbstractTestNGCucumberTests {
}
